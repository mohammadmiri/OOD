package Model.Repository;

import Model.Persistent.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mohammad on 6/29/2017.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
}
