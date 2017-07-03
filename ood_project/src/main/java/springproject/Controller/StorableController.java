package springproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springproject.Model.Warehouse;
import springproject.Repository.WarehouseRepository;

/**
 * Created by mohammad on 7/2/2017.
 */
@Controller
@RequestMapping("warehouse")
public class StorableController {

    /*** ware house ***/

    @Autowired
    WarehouseRepository warehouseRepository;

    @RequestMapping("/add/form/warehouse")
    public String addFormWarehouse(){
        return "AddFormWareHouse";
    }

    @RequestMapping("/submit/add/form/warehouse")
    public String submitAddFormWarehouse(@RequestParam("code") Integer code,
                                         @RequestParam("name") String name){
        Warehouse warehouse = new Warehouse(code, name);
        warehouseRepository.save(warehouse);
        return "homepage";
    }

    @RequestMapping("/update/form/warehouse/{id}")
    public String updateFormWarehouse(@PathVariable("id") Integer id){
        return "UpdateFormWarehouse";
    }

    @RequestMapping("/submit/add/form/warehouse/{id}")
    public String submitUpdateFormWarehouse(@PathVariable("id") Integer id,
                                            @RequestParam("code") Integer code,
                                            @RequestParam("name") String name){
        Warehouse warehouse = warehouseRepository.findOne(id);
        warehouseRepository.save(warehouse);
        return "homepage";
    }



}
