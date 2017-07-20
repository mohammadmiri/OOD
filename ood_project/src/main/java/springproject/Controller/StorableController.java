package springproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springproject.Model.Warehouse;
import springproject.Repository.WarehouseRepository;
import springproject.Service.WarehouseCatalogue;

/**
 * Created by mohammad on 7/2/2017.
 */
@Controller
@RequestMapping("warehouse")
public class StorableController {

    /*** ware house ***/

    @Autowired
    WarehouseCatalogue warehouseCatalogue;

    @RequestMapping("/add_warehouse")
    public String addFormWarehouse(){
        return "AddFormWareHouse";
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
        return "UpdateFormWarehouse";
    }

    @RequestMapping("/submit/add_warehouse/{id}")
    public String submitUpdateFormWarehouse(@PathVariable("id") Integer id,
                                            @RequestParam("code") Integer code,
                                            @RequestParam("name") String name){
        Warehouse warehouse = warehouseCatalogue.findOne(id);
        warehouseCatalogue.save(warehouse);
        return "homepage";
    }



}
