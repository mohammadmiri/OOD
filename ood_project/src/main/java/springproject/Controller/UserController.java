package springproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @RequestMapping("/show_employees")
    public String showEmployees(Model model){
        List<Employee> employees = (List<Employee>) employeeCatalogue.findAll();
        model.addAttribute("employees", employees);
        return "shows/show_employees";
    }

    @RequestMapping("/delete_employee")
    public String deleteEmployee(@PathVariable("id") Integer id){
        employeeCatalogue.delete(id);
        return "homepage";
    }

    @RequestMapping("/add_employee")
    public String addEmployee(){
        return "adds/add_employee";
    }

    @RequestMapping("/submit/add_employee")
    public String submitAddEmployee(@RequestParam("username") String username,
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

    @RequestMapping("/update_employee/{id}")
    public String updateEmployee(Model model, @PathVariable("id") Integer id){
        Employee employee = employeeCatalogue.findOne(id);
        model.addAttribute("employee", employee);
        return "updates/update_employee";
    }

    @RequestMapping("/submit/update_employee/{id}")
    public String submitUpdateEmployee(@PathVariable("id") Integer id,
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

    public static Integer loggedInCustomerId;

    @Autowired
    CustomerCatalogue customerCatalogue;

    @RequestMapping("show_profile")
    public String showProfile(Model model){
        Customer customer = customerCatalogue.findOne(loggedInCustomerId);
        return "show_profile";
    }

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

    @RequestMapping("/update_profile/{id}")
    public String updateFormCustomer(){
        return "editProfile";
    }

    @RequestMapping("/submit/update_profile/{id}")
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
