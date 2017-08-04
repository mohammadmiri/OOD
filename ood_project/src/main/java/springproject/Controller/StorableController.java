package springproject.Controller;

import org.apache.catalina.Store;
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

    @RequestMapping("/show_existing_products/{warehouse_id}")
    public String showExistProducts(Model model,
                                    @PathVariable("warehouse_id") Integer id){
        List<StoreData> storeDatas = warehouseCatalogue.findOne(id).getStoreData();
        model.addAttribute("storeDatas", storeDatas);
        return "shows/show_existing_products";
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
        return "redirect:/home/";
    }

    @RequestMapping("/update_warehouse/{id}")
    public String updateFormWarehouse(Model model, @PathVariable("id") Integer id){
        model.addAttribute("warehouse", warehouseCatalogue.findOne(id));
        return "updates/update_warehouse";
    }

    @RequestMapping("/submit/update_warehouse/{id}")
    public String submitUpdateFormWarehouse(@PathVariable("id") Integer id,
                                            @RequestParam("code") Integer code,
                                            @RequestParam("name") String name){
        Warehouse warehouse = warehouseCatalogue.findOne(id);
        warehouse.setCode(code);
        warehouse.setName(name);
        warehouseCatalogue.save(warehouse);
        return "redirect:/warehouse/show_warehouses";
    }



    /***  store data  ***/

    @Autowired
    StoreDataRepository storeDataRepository;

    @Autowired
    ProductCatalogue productCatalogue;

    @RequestMapping("/delete_store_data/{id}")
    public String deleteStoreData(@PathVariable("id") Integer id){
        StoreData s = storeDataRepository.findOne(id);
        Warehouse w = s.getWarehouse();
        w.getStoreData().remove(s);
        warehouseCatalogue.save(w);
        storeDataRepository.delete(id);
        return "redirect:/home/";
    }

    @RequestMapping("/add_store_data/{warehouse_id}")
    public String addStoreData(Model model,
                               @PathVariable("warehouse_id") Integer id){
        model.addAttribute("warehouse_id", id);
        model.addAttribute("products", productCatalogue.findAll());
        return "adds/add_storedata";
    }

    @RequestMapping("/submit/add_store_data/{warehouse_id}")
    public String submitAddStoreData(@PathVariable("warehouse_id") Integer id,
                                     @RequestParam("product") int product_id,
                                     @RequestParam("amount") Integer amount,
                                     @RequestParam("minAmount") Integer minAmount,
                                     @RequestParam("maxAmount") Integer maxAmount){
        StoreData storeData = new StoreData();
        storeData.setAmount(amount);
        storeData.setMax(maxAmount);
        storeData.setMin(minAmount);
        Warehouse w = warehouseCatalogue.findOne(id);
        storeData.setWarehouse(w);
        storeData.setStorable(productCatalogue.findOne(product_id));
        storeDataRepository.save(storeData);
        return "redirect:/home/";
    }

    @RequestMapping("/update_store_data/{store_data_id}")
    public String updateStoreData(Model model,
                                  @PathVariable("store_data_id") Integer id){
        model.addAttribute("store_data", storeDataRepository.findOne(id));
        model.addAttribute("products", productCatalogue.findAll());
        return "updates/update_storedata";
    }

    @RequestMapping("/submit/update_store_data/{store_data_id}")
    public String submitUpdateStoreData(@PathVariable("store_data_id") Integer id,
                                        @RequestParam("product") int product_id,
                                        @RequestParam("amount") Integer amount,
                                        @RequestParam("minAmount") Integer minAmount,
                                        @RequestParam("maxAmount") Integer maxAmount){
        StoreData storeData = storeDataRepository.findOne(id);
        storeData.setAmount(amount);
        storeData.setMax(maxAmount);
        storeData.setMin(minAmount);
        storeData.setStorable(productCatalogue.findOne(product_id));
        storeDataRepository.save(storeData);
        return "redirect:/home/";
    }

}
