package springproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springproject.Model.Product;
import springproject.Repository.ProductRepository;

/**
 * Created by mohammad on 6/28/2017.
 */

@Service
public class ProductCatalogue {

    @Autowired
    ProductRepository productRepository;

    public Iterable<Product> findAll(){
        return productRepository.findAll();
    }

    public void save(Product product){
        productRepository.save(product);
    }

    public Product findOne(Integer id){
        return productRepository.findOne(id);
    }

}
