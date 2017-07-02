package Model.Repository;

import Model.Persistent.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mohammad on 6/29/2017.
 */
public interface UserRepository extends CrudRepository<User, Integer>{
}
