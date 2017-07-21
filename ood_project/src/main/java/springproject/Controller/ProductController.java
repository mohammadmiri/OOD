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



    @RequestMapping("/add_comment/{product_id}")
    public String addFormComment(@PathVariable("product_id") Integer product_id, Model model){
        model.addAttribute("product_id", product_id);
        return "forms/AddFormComment";
    }

    @RequestMapping("/submit/add_comment/{product_id}")
    public String submitAddFormComment(@PathVariable("product_id") Integer product_id,
                                       @RequestParam("date") String date,
                                       @RequestParam("message") String message){
        System.out.println("product_id:"+product_id);
        Product product = productCatalogue.findOne(product_id);
        Comment comment = new Comment(new Date(), message);
        commentCatalogue.save(comment);
        product.getComments().add(comment);
        productCatalogue.save(product);
        return "homepage";
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
        return "homepage";
    }

    @RequestMapping("/add_product")
    public String addProduct(){
        return "adds/add_product";
    }

    @RequestMapping("/submit/add_product")
    public String submitAddProduct(@RequestParam("name") String name,
                                       @RequestParam("price") Integer price,
                                       @RequestParam("description") String description,
                                       @RequestParam("productionSteps") String productionStepsId){
        Product product = new Product(name, price, description);
        product.getProductionSteps().clear();
        for(String id:productionStepsId.split(" ")){
            if(id!="") {
                product.getProductionSteps().add(productionStepCatalogue.findOne(Integer.parseInt(id)));
            }
        }
        productCatalogue.save(product);
        return "homepage";
    }

    @RequestMapping("/update_product/{id}")
    public String updateProduct(Model model, @PathVariable("id") Integer id){
        model.addAttribute("id", id);
        return "updates/update_product";
    }

    @RequestMapping("/submit/update_product/{id}")
    public String submitUpdateProduct(@PathVariable("id") Integer id,
                                      @RequestParam("name") String name,
                                      @RequestParam("price") Integer price,
                                      @RequestParam("description") String description,
                                      @RequestParam("productionSteps") String productionStepsId){
        Product product = productCatalogue.findOne(id);
        product.getProductionSteps();
        for(String Id:productionStepsId.split(" ")){
            if(Id!="") {
                product.getProductionSteps().add(productionStepCatalogue.findOne(Integer.parseInt(Id)));
            }
        }
        productCatalogue.save(product);
        return "homepage";
    }

    @RequestMapping("/advanceSearch")
    public String advanceSearchProducts(){
        return "forms/AdvanceSearchProductsForm";
    }

    @RequestMapping("/submit/advanceSearch")
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
            if(searchedProduct != null && product.getPrice() == searchedProduct.getPrice()){
                relatedProducts.add(product);
            }
        }
        model.addAttribute("products", relatedProducts);
        System.out.println("length:"+relatedProducts.size());
        return "ShowAdvanceSearchResult";
    }


    /*** production step ***/

    @Autowired
    ProductionStepCatalogue productionStepCatalogue;

    @RequestMapping("/add_productionStep")
    public String addFormProductionStep(){
        return "forms/AddFormProductionStep";
    }

    @RequestMapping("submit/add_productionStep")
    public String submitAddFormProductionStep(@RequestParam("cost") Integer cost,
                                              @RequestParam("preCondition") String preCondition,
                                              @RequestParam("postCondition") String postCondition){
        ProductionStep productionStep = new ProductionStep(cost, preCondition, postCondition);
        productionStep.setCost(cost);
        productionStep.setPreCondition(preCondition);
        productionStep.setPostCondition(postCondition);
        productionStepCatalogue.save(productionStep);
        return "homepage";
    }

    @RequestMapping("/update_productionStep")
    public String updateFormProductionStep(){
        return "";
    }

    @RequestMapping("/submit/update_productionStep")
    public String submitUpdateFormProductionStep(){
        return "";
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
        return "homepage";
    }

    @RequestMapping("/add_component")
    public String addComponent(){
        return "adds/add_component";
    }

    @RequestMapping("/submit/add_component")
    public String submitAddFormComponent(@RequestParam("name") String name,
                                         @RequestParam("price") Integer price,
                                         @RequestParam("description") String description){
        Component component = new Component(name, price, description);
        component.setDescription(description);
        component.setName(name);
        component.setPrice(price);
        componentCatalogue.save(component);
        return "homepage";
    }

    @RequestMapping("/update_component/{id}")
    public String updateFormComponent(Model model, @PathVariable("id") Integer id){
        model.addAttribute("id", id);
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
        System.out.println("in update func"+name+" "+price+" "+description);
        return "homepage";
    }


    /*** product order ***/

    @Autowired
    ProductOrderCatalogue productOrderCatalogue;

    @RequestMapping("/add_product_order")
    public String addProductOrder(){
        return "forms/AddFormProductOrder";
    }


    @RequestMapping("/submit/add_product_order")
    public String submitAddProductOrder(@RequestParam("totalCost") Integer totalCost,
                                         @RequestParam("date") String date,
                                         @RequestParam("products") String productsName,
                                         @RequestParam("requirements") String requirementsName){
        ProductOrder order = new ProductOrder(totalCost, new Date());
        for(Product product:(List<Product>) productCatalogue.findAll()){
            for(String productName:productsName.split(",")){
                if(productName != "" && productName.equals(product.getName())){
                    order.getProducts().add(product);
                }
            }
        }
        Requirement requirement = new Requirement();
        requirement.setDescription(requirementsName);
        requirementRepository.save(requirement);
        order.getRequirements().add(requirement);
        productOrderCatalogue.save(order);
        return "homepage";
    }

    @RequestMapping("/update_product_order")
    public String updateProductOrder(){
        return "updates/ProductOrder";
    }


    @RequestMapping("/submit/update_product_order")
    public String submitUpdateProductOrder(@RequestParam("totalCost") Integer totalCost,
                                         @RequestParam("date") String date,
                                         @RequestParam("products") String productsName,
                                         @RequestParam("requirements") String requirementsName){
        ProductOrder order = new ProductOrder(totalCost, new Date());
        for(Product product:(List<Product>) productCatalogue.findAll()){
            for(String productName:productsName.split(",")){
                if(productName != "" && productName.equals(product.getName())){
                    order.getProducts().add(product);
                }
            }
        }
        Requirement requirement = new Requirement();
        requirement.setDescription(requirementsName);
        requirementRepository.save(requirement);
        order.getRequirements().add(requirement);
        productOrderCatalogue.save(order);
        return "homepage";
    }

    /*** requirement ***/

    @Autowired
    RequirementRepository requirementRepository;

}
