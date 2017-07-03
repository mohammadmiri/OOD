package springproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springproject.Model.ProductOrder;
import springproject.Model.SupplyChain;
import springproject.Repository.ProductOrderRepository;

/**
 * Created by mohammad on 7/3/2017.
 */

@Service
public class ProductOrderCatalogue {

    @Autowired
    ProductOrderRepository productOrderRepository;

    public Iterable<ProductOrder> findAll(){
        return productOrderRepository.findAll();
    }

    public void save(ProductOrder productOrder){
        productOrderRepository.save(productOrder);
    }
}
