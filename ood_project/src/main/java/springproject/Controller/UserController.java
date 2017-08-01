package springproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springproject.Model.*;
import springproject.Service.CustomerCatalogue;
import springproject.Service.EmployeeCatalogue;
import springproject.Service.UserCatalogue;

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
        Employee employee = new Employee(username, password, firstName, lastName, false);
        Type typeVar = null;
        switch (role){
            case "Manager":
                typeVar = Type.Manager;break;
            case "OrderAndSupplyManager":
                typeVar = Type.OrderAndSupplyManager;break;
            case "Warehouse":
                typeVar = Type.Warehouse; break;
            case "CustomerRelationshipManager":
                typeVar = Type.Warehouse; break;
        }
        employee.setType(typeVar);
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

    @RequestMapping("/show_profile")
    public String showProfile(Model model){
        System.out.println("in show profile");
        List<Customer> customers = (List<Customer>) customerCatalogue.findAll();
        Customer customer = null;
        for(Customer c:customers){
            if(c.getLoggedIn() == true) {
                customer = c;
            }
        }
        List<ProductOrder> orders = customer.getProductOrders();
        model.addAttribute("customer", customer);
        model.addAttribute("orders", orders);
        return "shows/show_profile";
    }

    @RequestMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable("id") Integer id){
        customerCatalogue.delete(id);
        return "homepage";
    }

    @RequestMapping("/signup")
    public String addFormCustomer(){
        return "adds/signup";
    }

    @RequestMapping("/submit/signup")
    public String submitAddFormCustomer(@RequestParam("username") String username,
                                        @RequestParam("password") String password,
                                        @RequestParam("firstName") String firstName,
                                        @RequestParam("lastName") String lastName){
        Customer customer = new Customer(username, password, firstName, lastName, false);
        customerCatalogue.save(customer);
        return "homepage";
    }

    @RequestMapping("/update_profile/{id}")
    public String edieProfile(Model model,
                                     @PathVariable("id") Integer id){
        Customer customer = customerCatalogue.findOne(id);
        model.addAttribute("customer", customer);
        return "update/change_profile";
    }

    @RequestMapping("/submit/update_profile/{id}")
    public String submitEditProfile(@PathVariable("id") Integer id,
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

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/submit/login")
    public String submitLogin(@RequestParam("username") String username,
                              @RequestParam("password") String password){
        List<Customer> customers = (List<Customer>)customerCatalogue.findAll();
        for(Customer customer:customers){
            if(customer.getUsername().equals(username) && customer.getPassword().equals(password)){
                customer.setLoggedIn(true);
                customerCatalogue.save(customer);
                return "homepage";
            }
        }
        return "login";
    }

    @Autowired
    UserCatalogue userCatalogue;

    @RequestMapping("/logout")
    public String logout(){
        List<UserEntity> userEntities = (List<UserEntity>) userCatalogue.findAll();
        for(UserEntity userEntity:userEntities){
            if(userEntity.getLoggedIn()==true){
                userEntity.setLoggedIn(false);
                userCatalogue.save(userEntity);
            }
        }
        return "login";
    }

}
