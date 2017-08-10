package springproject.Controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springproject.Model.*;
import springproject.Repository.*;
import springproject.Service.*;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by mohammad on 7/2/2017.
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    /*** comment ***/

    @Autowired
    CommentCatalogue commentCatalogue;

    @RequestMapping("/submit/add_comment/{product_id}")
    public String submitAddFormComment(@PathVariable("product_id") Integer product_id,
                                       @RequestParam("message") String message){
        Product product = productCatalogue.findOne(product_id);
        Comment comment = new Comment(new Date(), message);
        commentCatalogue.save(comment);
        product.getComments().add(comment);
        productCatalogue.save(product);
        return "redirect:/product/show_one_product/"+product.getId();
    }

    @RequestMapping("/update_comment/{id}")
    public String updateFormComment(@PathVariable("id") Integer id){
        return "UpdateFormComment";
    }

    @RequestMapping("/submit/update_comment{id}")
    public String submitUpdateFormComment(){
        return "";
    }

    /*** product ***/

    @Autowired
    ProductCatalogue productCatalogue;

    @Autowired
    SaleChainCatalogue saleChainCatalogue;

    @Autowired
    SupplyChainCatalogue supplyChainCatalogue;

    @RequestMapping("/show_products")
    public String showProducts(Model model){
        List<Product> products = (List<Product>)productCatalogue.findAll();
        model.addAttribute("products", products);
        return "shows/show_products";
    }

    @RequestMapping("/show_one_product/{id}")
    public String showOneProduct(Model model, @PathVariable("id") Integer id){
        Product product = productCatalogue.findOne(id);
        model.addAttribute("product", product);
        List<Comment> comments = product.getComments();
        model.addAttribute("comments", comments);
        return "shows/show_one_product";
    }

    @RequestMapping("/delete_product/{id}")
    public String deleteProduct(@PathVariable("id") Integer id){
        productCatalogue.delete(id);
        return "redirect:/product/show_products";
    }

    @RequestMapping("/add_product")
    public String addProduct(Model model){
        model.addAttribute("supplyChains", supplyChainCatalogue.findAll());
        model.addAttribute("saleChains", saleChainCatalogue.findAll());
        model.addAttribute("productionSteps", productionStepCatalogue.findAll());
        return "adds/add_product";
    }

    @RequestMapping("/submit/add_product")
    public String submitAddProduct(@RequestParam("name") String name,
                                   @RequestParam("price") Integer price,
                                   @RequestParam("description") String description,
                                   @RequestParam("default_supplyChain") int defaultSupplyChain,
                                   @RequestParam(value="supplyChains", required = false) int[] supplyChains,
                                   @RequestParam("default_saleChain") int default_saleChain,
                                   @RequestParam(value = "saleChains", required = false) int[] saleChains,
                                   @RequestParam(value = "productionSteps", required = false) int[] productionSteps){
        System.out.println("in function");
        Product product = new Product(name, price, description);
        SupplyChain supplyChain = supplyChainCatalogue.findOne(defaultSupplyChain);
        product.setDefaultSupplyChain(supplyChain);
        SaleChain saleChain = saleChainCatalogue.findOne(default_saleChain);
        product.setDefaultSaleChain(saleChain);
        product.addProductionSteps(productionSteps, productionStepCatalogue);
        product.addSaleChains(saleChains, saleChainCatalogue);
        product.addSupplyChains(supplyChains, supplyChainCatalogue);
        productCatalogue.save(product);
        return "redirect:/product/show_products";
    }

    @RequestMapping("/update_product/{id}")
    public String updateProduct(Model model, @PathVariable("id") Integer id){
        model.addAttribute("supplyChains", supplyChainCatalogue.findAll());
        model.addAttribute("saleChains", saleChainCatalogue.findAll());
        model.addAttribute("productionSteps", productionStepCatalogue.findAll());
        model.addAttribute("product", productCatalogue.findOne(id));
        return "updates/update_product";
    }

    @RequestMapping("/submit/update_product/{id}")
    public String submitUpdateProduct(@PathVariable("id") Integer id,
                                      @RequestParam("name") String name,
                                      @RequestParam("price") Integer price,
                                      @RequestParam("description") String description,
                                      @RequestParam("default_supplyChain") int defaultSupplyChain,
                                      @RequestParam(value="supplyChains", required = false) int[] supplyChains,
                                      @RequestParam("default_saleChain") int default_saleChain,
                                      @RequestParam(value = "saleChains", required = false) int[] saleChains,
                                      @RequestParam(value = "productionSteps", required = false) int[] productionSteps){
        Product product = productCatalogue.findOne(id);
        product.setName(name);
        product.setPrice(price);
        product.setDescription(description);
        SupplyChain supplyChain = supplyChainCatalogue.findOne(defaultSupplyChain);
        product.setDefaultSupplyChain(supplyChain);
        SaleChain saleChain = saleChainCatalogue.findOne(default_saleChain);
        product.setDefaultSaleChain(saleChain);
        product.getProductionSteps().clear();
        product.addProductionSteps(productionSteps, productionStepCatalogue);
        product.getSaleChains().clear();
        product.addSaleChains(saleChains, saleChainCatalogue);
        product.getSupplyChains().clear();
        product.addSupplyChains(supplyChains, supplyChainCatalogue);
        productCatalogue.save(product);
        return "redirect:/product/show_products";
    }

    @RequestMapping("/advance_search")
    public String advanceSearchProducts(Model model){
        model.addAttribute("products", new ArrayList<Product>());
        return "search_advance_products";
    }

    @RequestMapping("/submit/advance_search")
    public String submitAdvanceSearchProduct(@RequestParam("productName") String productName, Model model){
        List<Product> products = (List<Product>) productCatalogue.findAll();
        List<Product> relatedProducts = new ArrayList<>();
        Product searchedProduct = null;
        for(Product product:products){
            if(product.getName().equals(productName)){
                searchedProduct = product;
                break;
            }
        }
        System.out.println("searched product:"+searchedProduct);
        for(Product product:products){
            if(searchedProduct != null && Math.abs(product.getPrice() - searchedProduct.getPrice()) <= 10){
                relatedProducts.add(product);
            }
        }
        model.addAttribute("products", relatedProducts);
        return "search_advance_products";
    }


    /*** production step ***/

    @Autowired
    ProductionStepCatalogue productionStepCatalogue;

    @RequestMapping("/show_production_steps")
    public String showProductionSteps(Model model){
        model.addAttribute("productionSteps", productionStepCatalogue.findAll());
        return "shows/show_production_steps";
    }

    @RequestMapping("/add_production_step")
    public String addFormProductionStep(){
        return "adds/add_production_step";
    }

    @RequestMapping("submit/add_production_step")
    public String submitAddFormProductionStep(@RequestParam("cost") Integer cost,
                                              @RequestParam("preCondition") String preCondition,
                                              @RequestParam("postCondition") String postCondition){
        ProductionStep productionStep = new ProductionStep(cost, preCondition, postCondition);
        productionStepCatalogue.save(productionStep);
        return "redirect:/product/show_products";
    }

    @RequestMapping("/update_production_step/{id}")
    public String updateFormProductionStep(Model model, @PathVariable("id") Integer id){
        model.addAttribute("productionStep", productionStepCatalogue.findOne(id));
        return "updates/update_production_step";
    }

    @RequestMapping("/submit/update_production_step/{id}")
    public String submitUpdateFormProductionStep(@PathVariable("id") Integer id ,
                                                 @RequestParam("cost") Integer cost,
                                                 @RequestParam("preCondition") String preCondition,
                                                 @RequestParam("postCondition") String postCondition){
        ProductionStep productionStep = productionStepCatalogue.findOne(id);
        productionStep.setCost(cost);
        productionStep.setPreCondition(preCondition);
        productionStep.setPostCondition(postCondition);
        productionStepCatalogue.save(productionStep);
        return "redirect:/product/show_products/";
    }

    /*** component ***/

    @Autowired
    ComponentCatalogue componentCatalogue;


    @RequestMapping("/show_components")
    public String showComponents(Model model){
        List<Component> components = (List<Component>) componentCatalogue.findAll();
        model.addAttribute("components", components);
        return "shows/show_components";
    }

    @RequestMapping("/delete_component/{id}")
    public String deleteComponent(@PathVariable("id") Integer id){
        componentCatalogue.delete(id);
        return "redirect:/product/show_components";
    }

    @RequestMapping("/add_component")
    public String addComponent(Model model){
        return "adds/add_component";
    }

    @RequestMapping("/submit/add_component")
    public String submitAddFormComponent(@RequestParam("name") String name,
                                         @RequestParam("price") Integer price,
                                         @RequestParam("description") String description){
        Component component = new Component(name, price, description);
        componentCatalogue.save(component);
        return "redirect:/product/show_components";
    }

    @RequestMapping("/update_component/{id}")
    public String updateFormComponent(Model model, @PathVariable("id") Integer id){
        model.addAttribute("component", componentCatalogue.findOne(id));
        return "updates/update_component";
    }

    @RequestMapping("/submit/update_component/{id}")
    public String submitUpdateFormComponent( @PathVariable("id") Integer id,
                                             @RequestParam("name") String name,
                                             @RequestParam("price") Integer price,
                                             @RequestParam("description") String description){
        Component component = componentCatalogue.findOne(id);
        component.setName(name);
        component.setPrice(price);
        component.setDescription(description);
        componentCatalogue.save(component);
        return "redirect:/product/show_components";
    }


    /*** product order ***/

    @Autowired
    ProductOrderCatalogue productOrderCatalogue;

    @Autowired
    CustomerCatalogue customerCatalogue;

    @RequestMapping("/show_product_order")
    public String showProductOrders(Model model){
        List<ProductOrder> productOrders = (List<ProductOrder>) productOrderCatalogue.findAll();
        model.addAttribute("orders", productOrders);
        return "shows/show_product_order";
    }

    @RequestMapping("/delete_product_order")
    public String deleteProductOrders(@PathVariable("id") Integer id){
        productOrderCatalogue.delete(id);
        return "redirect:/home/";
    }

    @RequestMapping("/add_product_order")
    public String addFormProductOrder(Model model){
        model.addAttribute("products", productCatalogue.findAll());
        return "adds/add_product_order";
    }


    @RequestMapping("/submit/add_product_order")
    public String submitAddFormProductOrder(@RequestParam("date") String date,
                                         @RequestParam("products") int[] products,
                                         @RequestParam("requirements") String requirement){
        int totalCost = 0;
        for(int i:products){
            totalCost += productCatalogue.findOne(i).getPrice();
        }
        ProductOrder order = new ProductOrder(totalCost, new Date());
        order.addProducts(products, productCatalogue);
        order.setRequirements(requirement);
        Customer customer = ((List<Customer>)customerCatalogue.findAll()).get(0);
        order.setCustomer(customer);
        productOrderCatalogue.save(order);
        return "redirect:/user/show_profile";
    }

    @RequestMapping("/update_product_order/{id}")
    public String updateProductOrder(Model model,
                                     @PathVariable("id") Integer id){
        model.addAttribute("order", productOrderCatalogue.findOne(id));
        model.addAttribute("products", productCatalogue.findAll());
        return "updates/update_product_order";
    }


    @RequestMapping("/submit/update_product_order/{id}")
    public String submitUpdateProductOrder(@PathVariable("id") Integer id,
                                           @RequestParam("date") String date,
                                           @RequestParam("products") int[] products,
                                           @RequestParam("requirements") String requirement){
        ProductOrder order = productOrderCatalogue.findOne(id);
        order.addProducts(products, productCatalogue);
        order.setRequirements(requirement);
        productOrderCatalogue.save(order);
        return "redirect:/user/show_profile";
    }

    /*** requirement ***/

    @Autowired
    RequirementRepository requirementRepository;

    /***  component order  ***/

    @Autowired
    ComponentOrderCatalogue componentOrderCatalogue;

    @Autowired
    SourceCatalogue sourceCatalogue;

    @RequestMapping("/show_component_orders")
    public String showComponentOrders(Model model){
        model.addAttribute( "componentOrders", (List<ComponentOrder>)componentOrderCatalogue.findAll());
        return "shows/show_component_orders";
    }

    @RequestMapping("delete_component_order/{id}")
    public String deleteComponentOrders(@PathVariable("id") Integer id){
        componentOrderCatalogue.delete(id);
        return "redirect:/product/show_component_orders";
    }

    @RequestMapping("/add_component_order")
    public String addFormComponentOrder(Model model){
        model.addAttribute("components", componentCatalogue.findAll());
        model.addAttribute("sources", sourceCatalogue.findAll());
        return "adds/add_component_order";
    }

    @RequestMapping("/submit/add_component_order")
    public String submitAddFormComponentOrder(@RequestParam("date") String date,
                                              @RequestParam("amount") Integer amount ,
                                              @RequestParam(value = "components", required = false) int[] components,
                                              @RequestParam(value = "source", required = false) int source_id
                                              ){
        ComponentOrder order = new ComponentOrder();
        Source source = sourceCatalogue.findOne(source_id);
        order.setSource(source);
        order.addComponents(components, componentCatalogue);
        order.setAmount(amount);
        order.setDate(new Date());
        componentOrderCatalogue.save(order);
        return "redirect:/product/show_component_orders";
    }

    @RequestMapping("/update_component_order/{id}")
    public String updateComponentOrder(Model model,
                                       @PathVariable("id") Integer id){
        model.addAttribute("order", componentOrderCatalogue.findOne(id));
        model.addAttribute("components", componentCatalogue.findAll());
        model.addAttribute("sources", sourceCatalogue.findAll());
        return "updates/update_component_order";
    }

    @RequestMapping("/submit/update_component_order/{id}")
    public String submitComponentOrder(@PathVariable("id") Integer id,
                                       @RequestParam("date") String date,
                                       @RequestParam("amount") Integer amount ,
                                       @RequestParam(value = "components", required = false) int[] components,
                                       @RequestParam(value = "source", required = false) int source_id
                                       ){
        ComponentOrder order = componentOrderCatalogue.findOne(id);
        Source source = sourceCatalogue.findOne(source_id);
        order.setSource(source);
        order.addComponents(components, componentCatalogue);
        order.setAmount(amount);
        order.setDate(new Date());
        componentOrderCatalogue.save(order);
        return "redirect:/product/show_component_orders";
    }


}
