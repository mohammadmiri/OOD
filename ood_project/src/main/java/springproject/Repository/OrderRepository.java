package springproject.Repository;

import springproject.Model.OrderEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mohammad on 6/29/2017.
 */
public interface OrderRepository extends CrudRepository<OrderEntity, Integer>{
}
