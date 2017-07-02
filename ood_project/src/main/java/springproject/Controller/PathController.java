package springproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springproject.Model.SaleChain;
import springproject.Model.SupplyChain;
import springproject.Repository.SaleChainRepository;
import springproject.Repository.SupplyChainRepository;

import java.util.Date;

/**
 * Created by mohammad on 7/2/2017.
 */
@RequestMapping("/path")
public class PathController {

    /*** sale path ***/

    @Autowired
    SaleChainRepository saleChainRepository;

    @RequestMapping("/add/salePath")
    public String addFormSalePath(){
        return "addFormSalePath";
    }

    @RequestMapping("/submit/add/salePath")
    public String submitAddFormSalePath(@RequestParam("cost") Integer cost,
                                        @RequestParam("time") Integer time,
                                        @RequestParam("description") String description){
        SaleChain saleChain = new SaleChain(cost, time, description);
        saleChainRepository.save(saleChain);
        return "homepage";
    }

    @RequestMapping("/update/salePath/{id}")
    public String updateFormSalePath(){
        return "updateFormSalePath";
    }

    @RequestMapping("")
    public String submitUpdateFormSalePath(@PathVariable("id") Integer id,
                                           @RequestParam("cost") Integer cost,
                                           @RequestParam("time") Integer time,
                                           @RequestParam("description") String description){
        SaleChain saleChain = saleChainRepository.findOne(id);
        saleChainRepository.save(saleChain);
        return "homepage";
    }

    /*** supply path ***/

    @Autowired
    SupplyChainRepository supplyChainRepository;

    @RequestMapping("/add/supplyPath")
    public String addFormSupplyPath(){
        return "addFormSalePath";
    }

    @RequestMapping("/submit/add/supplyPath")
    public String submitAddFormSupplyPath(@RequestParam("cost") Integer cost,
                                        @RequestParam("time") Integer time,
                                        @RequestParam("description") String description){
        SupplyChain supplyChain = new SupplyChain(cost, time, description);
        supplyChainRepository.save(supplyChain);
        return "homepage";
    }

    @RequestMapping("/update/supplyPath/{id}")
    public String updateFormSupplyPath(){
        return "updateFormSupplyPath";
    }

    @RequestMapping("")
    public String submitUpdateFormSupplyPath(@PathVariable("id") Integer id,
                                           @RequestParam("cost") Integer cost,
                                           @RequestParam("time") Integer time,
                                           @RequestParam("description") String description){
        SupplyChain supplyChain = supplyChainRepository.findOne(id);
        supplyChainRepository.save(supplyChain);
        return "homepage";
    }

    /*** source ***/

    @RequestMapping("")
    public String addFormSource(){
        return "";
    }

    @RequestMapping("")
    public String submitAddFormSource(){
        return "";
    }

    @RequestMapping("")
    public String updateFormSource(){
        return "";
    }

    @RequestMapping("")
    public String submitUpdateFormSource(){
        return "";
    }

}
