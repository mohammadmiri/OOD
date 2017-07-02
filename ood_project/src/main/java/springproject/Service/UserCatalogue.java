package springproject.Service;

import springproject.Model.UserEntity;
import springproject.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

/**
 * Created by mohammad on 6/28/2017.
 */
@Service
@ComponentScan({"springproject.Repository", "springproject.Model", "springproject.Service"})
public class UserCatalogue {

    @Autowired
    private UserRepository userRepository;

    public UserEntity getBook(Integer id){
        return userRepository.findOne(id);
    }

    public void addUser(UserEntity user){
        userRepository.save(user);
    }

    public void deleteUser(UserEntity user){
        userRepository.delete(user);
    }




}
