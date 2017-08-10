package springproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springproject.Model.Product;
import springproject.Model.ProductOrder;
import springproject.Repository.ProductRepository;

import java.util.ArrayList;

/**
 * Created by mohammad on 6/28/2017.
 */

@Service
public class ProductCatalogue {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductOrderCatalogue productOrderCatalogue;

    public Iterable<Product> findAll(){
        return productRepository.findAll();
    }

    public void save(Product product){
        productRepository.save(product);
    }

    public Product findOne(Integer id){
        return productRepository.findOne(id);
    }

    public void delete(Integer id){
        ArrayList<Product> deletedProducts = new ArrayList<>();
        for(ProductOrder order:productOrderCatalogue.findAll()){
            deletedProducts.clear();
            if(order.getProducts() != null) {
                for (Product p : order.getProducts()) {
                    if (p!=null && p.getId() == id) {
                        deletedProducts.add(p);
                    }
                }
                for (Product p:deletedProducts){
                    order.getProducts().remove(p);
                }
                productOrderCatalogue.save(order);
            }
        }
        productRepository.delete(id);
    }

}
