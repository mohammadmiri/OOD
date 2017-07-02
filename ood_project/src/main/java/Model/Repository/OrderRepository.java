package Model.Repository;

import Model.Persistent.Order;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mohammad on 6/29/2017.
 */
public interface OrderRepository extends CrudRepository<Order, Integer>{
}
