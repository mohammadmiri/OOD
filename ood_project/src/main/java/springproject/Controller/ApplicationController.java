package springproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springproject.Model.Customer;
import springproject.Model.Employee;
import springproject.Service.CustomerCatalogue;
import springproject.Service.EmployeeCatalogue;

import java.util.List;

/**
 * Created by mohammad on 7/3/2017.
 */
@Controller
@RequestMapping("/home")
public class ApplicationController {

    @Autowired
    EmployeeCatalogue employeeCatalogue;

    @Autowired
    CustomerCatalogue customerCatalogue;

    @RequestMapping("/")
    public String homepage(Model model){
        String role = null;
        List<Employee> employees = (List<Employee>) employeeCatalogue.findAll();
        for(Employee employee:employees){
            if(employee.getLoggedIn() == true){
                role = employee.getType().toString();
            }
        }
        for(Customer customer:customerCatalogue.findAll()){
            if(customer.getLoggedIn() == true){
                role = "customer";
            }
        }
        model.addAttribute("role", role);
        return "homepage";
    }

}
