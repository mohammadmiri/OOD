package springproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springproject.Model.Comment;
import springproject.Repository.CommentRepository;
import springproject.Repository.EmployeeRepository;

/**
 * Created by mohammad on 7/3/2017.
 */

@Service
public class CommentCatalogue {

    @Autowired
    CommentRepository commentRepository;

    public Iterable<Comment> findAll(){
        return commentRepository.findAll();
    }

    public void save(Comment comment){
        commentRepository.save(comment);
    }
}
