package springproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springproject.Model.ComponentOrder;
import springproject.Repository.ComponentOrderRepository;


/**
 * Created by mohammad on 8/1/2017.
 */
@Service
public class ComponentOrderCatalogue {

    @Autowired
    ComponentOrderRepository componentOrderRepository;

    public Iterable<ComponentOrder> findAll(){
        return componentOrderRepository.findAll();
    }

    public void save(ComponentOrder component){
        componentOrderRepository.save(component);
    }

    public ComponentOrder findOne(Integer id){
        return componentOrderRepository.findOne(id);
    }

    public void delete(Integer id){
        componentOrderRepository.delete(id);
    }

}
