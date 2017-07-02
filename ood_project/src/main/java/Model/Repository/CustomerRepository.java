package Model.Repository;

import Model.Persistent.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mohammad on 6/29/2017.
 */
public interface CustomerRepository extends CrudRepository<Customer, Integer>{
}
