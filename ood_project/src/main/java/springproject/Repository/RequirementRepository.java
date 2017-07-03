package springproject.Repository;

import org.springframework.data.repository.CrudRepository;
import springproject.Model.Requirement;

/**
 * Created by mohammad on 7/3/2017.
 */
public interface RequirementRepository extends CrudRepository<Requirement, Integer>{
}
