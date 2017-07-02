package springproject.Repository;

import springproject.Model.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mohammad on 6/29/2017.
 */
public interface ProductRepository extends CrudRepository<Product, Integer>{
}
