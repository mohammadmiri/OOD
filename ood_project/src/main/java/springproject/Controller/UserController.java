package springproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springproject.Model.*;
import springproject.Repository.CustomerRepository;
import springproject.Repository.EmployeeRepository;
import springproject.Service.CustomerCatalogue;
import springproject.Service.EmployeeCatalogue;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mohammad on 7/2/2017.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /*** employee ***/

    @Autowired
    EmployeeCatalogue employeeCatalogue;

    @RequestMapping("/add/form/employee")
    public String addFormEmployee(){
        System.out.println("in add employee method");
        return "forms/AddFormEmployee";
    }

    @RequestMapping("/submit/add/form/employee")
    public String submitAddFormEmployee(@RequestParam("username") String username,
                                        @RequestParam("password") String password,
                                        @RequestParam("firstName") String firstName,
                                        @RequestParam("lastName") String lastName,
                                        @RequestParam("role") String role){
        Employee employee = new Employee(username, password, firstName, lastName);
        Role roleVar = null;
        switch (role){
            case "Manager":roleVar=Role.Manager;break;
            case "OrderAndSupplyManager":roleVar=Role.OrderAndSupplyManager;break;
            case "Warehouse":roleVar=Role.Warehouse; break;
            case "CustomerRelationshipManager":roleVar=Role.Warehouse; break;
        }
        employee.setRole(roleVar);
        employeeCatalogue.save(employee);
        return "homepage";
    }

    @RequestMapping("/update/employee/{id}")
    public String updateFormEmployee(@PathVariable("id") Integer id){
        return "updateEmployee";
    }

    @RequestMapping("/submit/update/employee/{id}")
    public String submitUpdateFormEmployee(@PathVariable("id") Integer id,
                                           @RequestParam("username") String username,
                                           @RequestParam("password") String password,
                                           @RequestParam("firstName") String firstName,
                                           @RequestParam("lastName") String lastName){
        Employee employee = employeeCatalogue.findOne(id);
        employee.setUsername(username);
        employee.setPassword(password);
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employeeCatalogue.save(employee);
        return "homepage";
    }




    /*** customer ***/

    @Autowired
    CustomerCatalogue customerCatalogue;

    @RequestMapping("/signup")
    public String addFormCustomer(){
        System.out.println("in signup method");
        return "forms/signup";
    }

    @RequestMapping("/submit/signup")
    public String submitAddFormCustomer(@RequestParam("username") String username,
                                        @RequestParam("password") String password,
                                        @RequestParam("firstName") String firstName,
                                        @RequestParam("lastName") String lastName){
        Customer customer = new Customer(username, password, firstName, lastName);
        customerCatalogue.save(customer);
        return "homepage";
    }

    @RequestMapping("/edit/profile/{id}")
    public String updateFormCustomer(){
        return "editProfile";
    }

    @RequestMapping("/submit/edit/profile/{id}")
    public String submitUpdateFormCustomer(@PathVariable("id") Integer id,
                                           @RequestParam("username") String username,
                                           @RequestParam("password") String password,
                                           @RequestParam("firstName") String firstName,
                                           @RequestParam("lastName") String lastName){
        Customer customer = customerCatalogue.findOne(id);
        customer.setUsername(username);
        customer.setPassword(password);
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customerCatalogue.save(customer);
        return "homepage";
    }

}
