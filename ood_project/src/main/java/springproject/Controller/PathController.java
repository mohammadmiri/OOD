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

import java.util.Date;

/**
 * Created by mohammad on 7/2/2017.
 */
@Controller
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

    @RequestMapping("/submit/update/salepath/")
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

    @RequestMapping("/add/form/supplyPath")
    public String addFormSupplyPath(){
        return "forms/AddFormSupplyPath";
    }

    @RequestMapping("/submit/add/form/supplyPath")
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

    @RequestMapping("/submit/update/supplyPath")
    public String submitUpdateFormSupplyPath(@PathVariable("id") Integer id,
                                           @RequestParam("cost") Integer cost,
                                           @RequestParam("time") Integer time,
                                           @RequestParam("description") String description){
        SupplyChain supplyChain = supplyChainRepository.findOne(id);
        supplyChainRepository.save(supplyChain);
        return "homepage";
    }

    /*** source ***/

    @Autowired
    SourceRepository sourceRepository;

    @RequestMapping("/add/form/source")
    public String addFormSource(){
        return "AddFormSource";
    }

    @RequestMapping("/submit/add/form/source")
    public String submitAddFormSource(@RequestParam("name") String name,
                                      @RequestParam("address") String address){
        Source source = new Source(name, address);
        sourceRepository.save(source);
        return "homepage";
    }

    @RequestMapping("/update/form/source/{id}")
    public String updateFormSource(){
        return "UpdateFormSource";
    }

    @RequestMapping("/submit/update/form/source/{id}")
    public String submitUpdateFormSource(@PathVariable("id") Integer id,
                                         @RequestParam("name") String name,
                                         @RequestParam("address") String address){
        Source source = sourceRepository.findOne(id);
        source.setAddress(address);
        source.setName(name);
        sourceRepository.save(source);
        return "homepage";
    }

}
