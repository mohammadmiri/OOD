package springproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springproject.Model.Customer;
import springproject.Repository.CustomerRepository;

/**
 * Created by mohammad on 6/28/2017.
 */

@Service
public class CustomerCatalogue {

    @Autowired
    CustomerRepository customerRepository;

    public Iterable<Customer> findAll(){
        return customerRepository.findAll();
    }

    public void save(Customer customer){
        customerRepository.save(customer);
    }

    public Customer findOne(Integer id){
        return customerRepository.findOne(id);
    }
}
