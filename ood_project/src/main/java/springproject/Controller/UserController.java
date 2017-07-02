package springproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springproject.Model.Customer;
import springproject.Model.Employee;
import springproject.Model.UserEntity;
import springproject.Repository.CustomerRepository;
import springproject.Repository.EmployeeRepository;

/**
 * Created by mohammad on 7/2/2017.
 */
@RequestMapping("/user")
public class UserController {

    /*** employee ***/

    @Autowired
    EmployeeRepository employeeRepository;

    @RequestMapping("/add/employee")
    public String addFormEmployee(){
        return "addFormEmployee";
    }

    @RequestMapping("/submit/add/employee")
    public String submitAddFormEmployee(@RequestParam("username") String username,
                                        @RequestParam("password") String password,
                                        @RequestParam("firstName") String firstName,
                                        @RequestParam("lastName") String lastName){
        Employee employee = new Employee(username, password, firstName, lastName);
        employeeRepository.save(employee);
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
        Employee employee = employeeRepository.findOne(id);
        employee.setUsername(username);
        employee.setPassword(password);
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employeeRepository.save(employee);
        return "homepage";
    }




    /*** customer ***/

    @Autowired
    CustomerRepository customerRepository;

    @RequestMapping("/signup")
    public String addFormCustomer(){
        return "signup";
    }

    @RequestMapping("/submit/signup")
    public String submitAddFormCustomer(@RequestParam("username") String username,
                                        @RequestParam("password") String password,
                                        @RequestParam("firstName") String firstName,
                                        @RequestParam("lastName") String lastName){
        Customer customer = new Customer(username, password, firstName, lastName);
        customerRepository.save(customer);
        return "homepage";
    }

    @RequestMapping("/edit/profile/{id}")
    public String updateFormCustomer(){
        return "editProfile";
    }

    @RequestMapping("/edit/profile/{id}")
    public String submitUpdateFormCustomer(@PathVariable("id") Integer id,
                                           @RequestParam("username") String username,
                                           @RequestParam("password") String password,
                                           @RequestParam("firstName") String firstName,
                                           @RequestParam("lastName") String lastName){
        Customer customer = customerRepository.findOne(id);
        customer.setUsername(username);
        customer.setPassword(password);
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customerRepository.save(customer);
        return "homepage";
    }

}
