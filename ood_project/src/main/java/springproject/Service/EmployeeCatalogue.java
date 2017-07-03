package springproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springproject.Model.Employee;
import springproject.Repository.EmployeeRepository;

/**
 * Created by mohammad on 6/28/2017.
 */

@Service
public class EmployeeCatalogue {

    @Autowired
    EmployeeRepository employeeRepository;

    public Iterable<Employee> findAll(){
        return employeeRepository.findAll();
    }

    public void save(Employee employee){
        employeeRepository.save(employee);
    }

    public Employee findOne(Integer id){
        return employeeRepository.findOne(id);
    }

}
