package springproject.Repository;

import springproject.Model.Storable;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mohammad on 6/29/2017.
 */
public interface StorableRepository extends CrudRepository<Storable, Integer> {
}
