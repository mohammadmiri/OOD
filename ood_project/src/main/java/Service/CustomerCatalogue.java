package Service;

import org.springframework.data.repository.CrudRepository;


import java.util.List;

/**
 * Created by mohammad on 6/28/2017.
 */
public class CustomerCatalogue implements CrudRepository<Customer, Integer> {

    private static CustomerCatalogue instance;

    private CustomerCatalogue(){

    }

    public CustomerCatalogue getInstance(){
        if(CustomerCatalogue.instance == null){
            CustomerCatalogue.instance = new CustomerCatalogue();
        }
        return CustomerCatalogue.instance;
    }

    private List<Customer> customers;


}
