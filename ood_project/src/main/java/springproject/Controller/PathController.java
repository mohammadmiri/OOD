package springproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springproject.Model.SaleChain;
import springproject.Model.Source;
import springproject.Model.SupplyChain;
import springproject.Repository.SaleChainRepository;
import springproject.Repository.SourceRepository;
import springproject.Repository.SupplyChainRepository;
import springproject.Service.SaleChainCatalogue;
import springproject.Service.SourceCatalogue;
import springproject.Service.SupplyChainCatalogue;

import java.util.Date;

/**
 * Created by mohammad on 7/2/2017.
 */
@Controller
@RequestMapping("/path")
public class PathController {

    /*** sale path ***/

    @Autowired
    SaleChainCatalogue saleChainCatalogue;

    @RequestMapping("/add_sale_path")
    public String addFormSalePath(){
        return "addFormSalePath";
    }

    @RequestMapping("/submit/add_sale_path")
    public String submitAddFormSalePath(@RequestParam("cost") Integer cost,
                                        @RequestParam("time") Integer time,
                                        @RequestParam("description") String description){
        SaleChain saleChain = new SaleChain(cost, time, description);
        saleChainCatalogue.save(saleChain);
        return "homepage";
    }

    @RequestMapping("/update_sale_path/{id}")
    public String updateFormSalePath(){
        return "updateFormSalePath";
    }

    @RequestMapping("/submit/update_salepath/")
    public String submitUpdateFormSalePath(@PathVariable("id") Integer id,
                                           @RequestParam("cost") Integer cost,
                                           @RequestParam("time") Integer time,
                                           @RequestParam("description") String description){
        SaleChain saleChain = saleChainCatalogue.findOne(id);
        saleChainCatalogue.save(saleChain);
        return "homepage";
    }

    /*** supply path ***/

    @Autowired
    SupplyChainCatalogue supplyChainCatalogue;

    @RequestMapping("/add_supply_path")
    public String addFormSupplyPath(){
        return "forms/AddFormSupplyPath";
    }

    @RequestMapping("/submit/add_supply_path")
    public String submitAddFormSupplyPath(@RequestParam("cost") Integer cost,
                                        @RequestParam("time") Integer time,
                                        @RequestParam("description") String description){
        SupplyChain supplyChain = new SupplyChain(cost, time, description);
        supplyChainCatalogue.save(supplyChain);
        return "homepage";
    }

    @RequestMapping("/update_supply_path/{id}")
    public String updateFormSupplyPath(){
        return "updateFormSupplyPath";
    }

    @RequestMapping("/submit/update_supply_path")
    public String submitUpdateFormSupplyPath(@PathVariable("id") Integer id,
                                           @RequestParam("cost") Integer cost,
                                           @RequestParam("time") Integer time,
                                           @RequestParam("description") String description){
        SupplyChain supplyChain = supplyChainCatalogue.findOne(id);
        supplyChainCatalogue.save(supplyChain);
        return "homepage";
    }

    /*** source ***/

    @Autowired
    SourceCatalogue sourceCatalogue;

    @RequestMapping("/add_source")
    public String addFormSource(){
        return "AddFormSource";
    }

    @RequestMapping("/submit/add_source")
    public String submitAddFormSource(@RequestParam("name") String name,
                                      @RequestParam("address") String address){
        Source source = new Source(name, address);
        sourceCatalogue.save(source);
        return "homepage";
    }

    @RequestMapping("/update_source/{id}")
    public String updateFormSource(){
        return "UpdateFormSource";
    }

    @RequestMapping("/submit/update_source/{id}")
    public String submitUpdateFormSource(@PathVariable("id") Integer id,
                                         @RequestParam("name") String name,
                                         @RequestParam("address") String address){
        Source source = sourceCatalogue.findOne(id);
        source.setAddress(address);
        source.setName(name);
        sourceCatalogue.save(source);
        return "homepage";
    }

}
