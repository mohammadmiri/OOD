package springproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springproject.Model.Product;
import springproject.Model.StoreData;
import springproject.Model.Warehouse;
import springproject.Repository.StoreDataRepository;
import springproject.Repository.WarehouseRepository;
import springproject.Service.ProductCatalogue;
import springproject.Service.WarehouseCatalogue;

import javax.jws.WebParam;
import java.util.List;

/**
 * Created by mohammad on 7/2/2017.
 */
@Controller
@RequestMapping("/warehouse")
public class StorableController {

    /*** ware house ***/

    @Autowired
    WarehouseCatalogue warehouseCatalogue;

    @RequestMapping("/show_warehouses")
    public String showWarehouses(Model model){
        List<Warehouse> warehouses = (List<Warehouse>)warehouseCatalogue.findAll();
        model.addAttribute("warehouses", warehouses);
        return "shows/show_warehouses";
    }

    @RequestMapping("/delete_warehouse/{id}")
    public String deleteWarehouse(@PathVariable("id") Integer id){
        warehouseCatalogue.delete(id);
        return "redirect:/home/";
    }

    @RequestMapping("/add_warehouse")
    public String addFormWarehouse(){
        return "adds/add_warehouse";
    }

    @RequestMapping("/submit/add_warehouse")
    public String submitAddFormWarehouse(@RequestParam("code") Integer code,
                                         @RequestParam("name") String name){
        Warehouse warehouse = new Warehouse(code, name);
        warehouseCatalogue.save(warehouse);
        return "homepage";
    }

    @RequestMapping("/update_warehouse/{id}")
    public String updateFormWarehouse(@PathVariable("id") Integer id){
        return "updates/update_warehouse";
    }

    @RequestMapping("/submit/add_warehouse/{id}")
    public String submitUpdateFormWarehouse(@PathVariable("id") Integer id,
                                            @RequestParam("code") Integer code,
                                            @RequestParam("name") String name){
        Warehouse warehouse = warehouseCatalogue.findOne(id);
        warehouseCatalogue.save(warehouse);
        return "homepage";
    }



    /***  store data  ***/

    @Autowired
    StoreDataRepository storeDataRepository;

    @Autowired
    ProductCatalogue productCatalogue;

    @RequestMapping("/add_store_data/{warehouse_id}")
    public String addStoreData(@PathVariable("warehouse_id") Integer id){
        return "adds/add_storedata";
    }

    @RequestMapping("/submit/add_store_data/{warehouse_id}")
    public String submitAddStoreData(@PathVariable("warehouse_id") Integer id,
                                     @RequestParam("product") String product_name,
                                     @RequestParam("amount") Integer amount,
                                     @RequestParam("minAmount") Integer minAmount,
                                     @RequestParam("maxAmount") Integer maxAmount){
        StoreData storeData = new StoreData();
        storeData.setAmount(amount);
        storeData.setMax(maxAmount);
        storeData.setMin(minAmount);
        Warehouse w = warehouseCatalogue.findOne(id);
        storeData.setWarehouse(w);
        List<Product> products = (List<Product>)productCatalogue.findAll();
        for(Product p:products) {
            if(p.getName() == product_name) {
                storeData.setStorable(p);
            }
        }
        storeDataRepository.save(storeData);
        return "redirect:/home/";
    }

    @RequestMapping("/update_store_data/{storedata_id")
    public String updateStoreData(Model model,
                                  @PathVariable("storedata_id") Integer id){
        
        return "update/update_storedata";
    }

    @RequestMapping("/submit/update_store_data/{warehouse_id}")
    public String submitUpdateStoreData(@PathVariable("warehouse_id") Integer id,
                                        @RequestParam("product") String product_name,
                                        @RequestParam("amount") Integer amount,
                                        @RequestParam("minAmount") Integer minAmount,
                                        @RequestParam("maxAmount") Integer maxAmount){
        StoreData storeData = storeDataRepository.findOne(id);
        storeData.setAmount(amount);
        storeData.setMax(maxAmount);
        storeData.setMin(minAmount);
        Warehouse w = warehouseCatalogue.findOne(id);
        storeData.setWarehouse(w);
        List<Product> products = (List<Product>)productCatalogue.findAll();
        for(Product p:products) {
            if(p.getName() == product_name) {
                storeData.setStorable(p);
            }
        }
        storeDataRepository.save(storeData);
        return "redirect:/home/";
    }

}
