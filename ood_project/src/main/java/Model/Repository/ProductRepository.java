package Model.Repository;

import Model.Persistent.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mohammad on 6/29/2017.
 */
public interface ProductRepository extends CrudRepository<Product, Integer>{
}
