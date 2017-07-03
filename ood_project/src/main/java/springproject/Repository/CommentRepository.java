package springproject.Repository;

import org.springframework.data.repository.CrudRepository;
import springproject.Model.Comment;

/**
 * Created by mohammad on 7/3/2017.
 */
public interface CommentRepository extends CrudRepository<Comment, Integer>{
}
