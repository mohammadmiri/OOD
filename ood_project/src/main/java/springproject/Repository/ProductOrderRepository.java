package springproject.Repository;

import org.springframework.data.repository.CrudRepository;
import springproject.Model.ProductOrder;

/**
 * Created by mohammad on 7/3/2017.
 */
public interface ProductOrderRepository extends CrudRepository<ProductOrder, Integer>{
}
