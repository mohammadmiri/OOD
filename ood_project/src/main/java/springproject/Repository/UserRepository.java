package springproject.Repository;

import springproject.Model.UserEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mohammad on 6/29/2017.
 */
public interface UserRepository extends CrudRepository<UserEntity, Integer>{
}
