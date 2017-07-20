package springproject.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springproject.Model.Component;
import springproject.Repository.ComponentRepository;

import java.util.List;

/**
 * Created by mohammad on 6/28/2017.
 */

@Service
public class ComponentCatalogue {

    @Autowired
    ComponentRepository componentRepository;

    public Iterable<Component> findAll(){
        return componentRepository.findAll();
    }

    public void save(Component component){
        componentRepository.save(component);
    }

    public Component findOne(Integer id){
        return componentRepository.findOne(id);
    }

    public void delete(Integer id){
        componentRepository.delete(id);
    }

}
