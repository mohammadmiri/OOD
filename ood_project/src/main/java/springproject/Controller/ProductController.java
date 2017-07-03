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



    @RequestMapping("/add/form/comment/{product_id}")
    public String addFormComment(@PathVariable("product_id") Integer product_id, Model model){
        model.addAttribute("product_id", product_id);
        return "forms/AddFormComment";
    }

    @RequestMapping("/submit/add/form/comment/{product_id}")
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

    @RequestMapping("/update/form/comment/{id}")
    public String updateFormComment(@PathVariable("id") Integer id){
        return "UpdateFormComment";
    }

    @RequestMapping("/submit/form/form/")
    public String submitUpdateFormComment(){
        return "";
    }

    /*** product ***/

    @Autowired
    ProductCatalogue productCatalogue;

    @RequestMapping("/showProducts")
    public String showProducts(Model model){
        List<Product> products = (List<Product>)productCatalogue.findAll();
        model.addAttribute("products", products);
        return "ShowProducts";
    }

    @RequestMapping("/add/form/product")
    public String addFormProduct(){
        return "forms/AddFormProduct";
    }

    @RequestMapping("/submit/add/form/product")
    public String submitAddFormProduct(@RequestParam("name") String name,
                                       @RequestParam("price") Integer price,
                                       @RequestParam("description") String description,
                                       @RequestParam("productionSteps") String productionStepsId){
        Product product = new Product(name, price, description);
        product.getProductionSteps();
        for(String id:productionStepsId.split(" ")){
            if(id!="") {
                product.getProductionSteps().add(productionStepCatalogue.findOne(Integer.parseInt(id)));
            }
        }
        productCatalogue.save(product);
        return "homepage";
    }

    @RequestMapping("/update/form/product")
    public String updateFormProduct(){
        return "";
    }

    @RequestMapping("/submit/update/form/product")
    public String submitUpdateFormProduct(){
        return "";
    }

    @RequestMapping("/advanceSearch/form")
    public String advanceSearchProducts(){
        return "forms/AdvanceSearchProductsForm";
    }

    @RequestMapping("/submit/advanceSearch/form")
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

    @RequestMapping("/add/form/productionStep")
    public String addFormProductionStep(){
        return "forms/AddFormProductionStep";
    }

    @RequestMapping("submit/add/form/productionStep")
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

    @RequestMapping("/update/form/productionStep")
    public String updateFormProductionStep(){
        return "";
    }

    @RequestMapping("/submit/update/form/productionStep")
    public String submitUpdateFormProductionStep(){
        return "";
    }

    /*** component ***/

    @Autowired
    ComponentCatalogue componentCatalogue;

    @RequestMapping("/add/form/component")
    public String addFormComponent(){
        System.out.println("in component method");
        return "forms/AddFormComponent";
    }

    @RequestMapping("/submit/add/form/component")
    public String submitAddFormComponent(@RequestParam("name") String name,
                                         @RequestParam("price") Integer price,
                                         @RequestParam("description") String description){
        System.out.println("in submit component");
        Component component = new Component(name, price, description);
        component.setDescription(description);
        component.setName(name);
        component.setPrice(price);
        componentCatalogue.save(component);
        return "homepage";
    }

    @RequestMapping("/update/form/Component")
    public String updateFormComponent(){
        return "";
    }

    @RequestMapping("/submit/update/form/component")
    public String submitUpdateFormComponent(){
        return "";
    }


    /*** product order ***/

    @Autowired
    ProductOrderCatalogue productOrderCatalogue;

    @RequestMapping("/add/form/productOrder")
    public String addFormProductOrder(){
        return "forms/AddFormProductOrder";
    }


    @RequestMapping("/submit/add/form/productOrder")
    public String submitFormProductOrder(@RequestParam("totalCost") Integer totalCost,
                                         @RequestParam("date") String date,
                                         @RequestParam("products") String productsName,
                                         @RequestParam("requirements") String requirementsName){
        ProductOrder order = new ProductOrder(totalCost, new Date());
        for(Product product:(List<Product>) productCatalogue.findAll()){
            for(String productName:productsName.split(" ")){
                if(productName != "" && productName.equals(product.getName())){
                    order.getProducts().add(product);
                }
            }
        }
        productOrderCatalogue.save(order);
        return "homepage";
    }


    /*** requirement ***/

    @Autowired
    RequirementRepository requirementRepository;

}
