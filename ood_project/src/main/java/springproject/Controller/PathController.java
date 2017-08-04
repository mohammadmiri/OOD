package springproject.Controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;
import java.util.List;

/**
 * Created by mohammad on 7/2/2017.
 */
@Controller
@RequestMapping("/path")
public class PathController {

    /*** sale path ***/

    @Autowired
    SaleChainCatalogue saleChainCatalogue;

    @RequestMapping("/show_sale_paths")
    public String showSalePaths(Model model){
        List<SaleChain> saleChainList = (List<SaleChain>)saleChainCatalogue.findAll();
        model.addAttribute("sale_paths", saleChainList);
        return "/shows/show_sale_paths";
    }

    @RequestMapping("/delete_sale_path/{id}")
    public String deleteSalePath(@PathVariable("id") Integer id){
        saleChainCatalogue.delete(id);
        return "redirect:/home/";
    }

    @RequestMapping("/add_sale_path")
    public String addSalePath(){
        return "adds/add_sale_path";
    }

    @RequestMapping("/submit/add_sale_path")
    public String submitAddSalePath(@RequestParam("cost") Integer cost,
                                        @RequestParam("time") Integer time,
                                        @RequestParam("description") String description){
        SaleChain saleChain = new SaleChain(cost, time, description);
        saleChainCatalogue.save(saleChain);
        return "redirect:/home/";
    }

    @RequestMapping("/update_sale_path/{id}")
    public String updateFormSalePath(Model model, @PathVariable("id") Integer id){
        model.addAttribute("chain", saleChainCatalogue.findOne(id));
        return "updates/update_sale_path";
    }

    @RequestMapping("/submit/update_sale_path/{id}")
    public String submitUpdateFormSalePath(@PathVariable("id") Integer id,
                                           @RequestParam("cost") Integer cost,
                                           @RequestParam("time") Integer time,
                                           @RequestParam("description") String description){
        SaleChain saleChain = saleChainCatalogue.findOne(id);
        saleChain.setCost(cost);
        saleChain.setDescription(description);
        saleChain.setTime(time);
        saleChainCatalogue.save(saleChain);
        return "redirect:/home/";
    }

    /*** supply path ***/

    @Autowired
    SupplyChainCatalogue supplyChainCatalogue;

    @RequestMapping("/show_supply_paths")
    public String showSupplyPaths(Model model){
        List<SupplyChain> supplyChainList = (List<SupplyChain>)supplyChainCatalogue.findAll();
        model.addAttribute("supply_paths", supplyChainList);
        return "/shows/show_supply_paths";
    }

    @RequestMapping("delete_supply_path/{id}")
    public String deleteSupplyPath(@PathVariable("id") Integer id){
        supplyChainCatalogue.delete(id);
        return "redirect:/home/";
    }

    @RequestMapping("/add_supply_path")
    public String addSupplyPath(){
        return "adds/add_supply_path";
    }

    @RequestMapping("/submit/add_supply_path")
    public String submitAddSupplyPath(@RequestParam("cost") Integer cost,
                                        @RequestParam("time") Integer time,
                                        @RequestParam("description") String description){
        SupplyChain supplyChain = new SupplyChain(cost, time, description);
        supplyChainCatalogue.save(supplyChain);
        return "redirect:/home/";
    }

    @RequestMapping("/update_supply_path/{id}")
    public String updateSupplyPath(Model model, @PathVariable("id") Integer id){
        model.addAttribute("chain", supplyChainCatalogue.findOne(id));
        return "updates/update_supply_path";
    }

    @RequestMapping("/submit/update_supply_path/{id}")
    public String submitUpdateSupplyPath(@PathVariable("id") Integer id,
                                           @RequestParam("cost") Integer cost,
                                           @RequestParam("time") Integer time,
                                           @RequestParam("description") String description){
        SupplyChain supplyChain = supplyChainCatalogue.findOne(id);
        supplyChain.setCost(cost);
        supplyChain.setTime(time);
        supplyChain.setDescription(description);
        supplyChainCatalogue.save(supplyChain);
        return "redirect:/home/";
    }

    /*** source ***/

    @Autowired
    SourceCatalogue sourceCatalogue;

    @RequestMapping("/show_sources")
    public String showSources(Model model){
        System.out.println("in show sources");
        List<Source> sources = (List<Source>)sourceCatalogue.findAll();
        model.addAttribute("sources", sources);
        return "shows/show_sources";
    }

    @RequestMapping("/delete_source/{id}")
    public String deleteSource(@PathVariable("id") Integer id){
        sourceCatalogue.delete(id);
        return "redirect:/home/";
    }

    @RequestMapping("/add_source")
    public String addSource(){
        return "adds/add_source";
    }

    @RequestMapping("/submit/add_source")
    public String submitAddSource(@RequestParam("name") String name,
                                  @RequestParam("address") String address){
        Source source = new Source(name, address);
        sourceCatalogue.save(source);
        return "redirect:/home/";
    }

    @RequestMapping("/update_source/{id}")
    public String updateFormSource(Model model,
                                   @PathVariable("id") Integer id){
        model.addAttribute("source", sourceCatalogue.findOne(id));
        return "updates/update_source";
    }

    @RequestMapping("/submit/update_source/{id}")
    public String submitUpdateFormSource(@PathVariable("id") Integer id,
                                         @RequestParam("name") String name,
                                         @RequestParam("address") String address){
        Source source = sourceCatalogue.findOne(id);
        source.setAddress(address);
        source.setName(name);
        sourceCatalogue.save(source);
        return "redirect:/home/";
    }

}
