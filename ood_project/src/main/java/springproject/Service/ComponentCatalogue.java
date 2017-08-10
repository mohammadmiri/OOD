package springproject.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springproject.Model.Component;
import springproject.Model.ComponentOrder;
import springproject.Repository.ComponentRepository;

import java.util.ArrayList;

/**
 * Created by mohammad on 6/28/2017.
 */

@Service
public class ComponentCatalogue {

    @Autowired
    ComponentRepository componentRepository;

    @Autowired
    ComponentOrderCatalogue componentOrderCatalogue;

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
        ArrayList<Component> deletedComponents = new ArrayList<>();
        for(ComponentOrder order:componentOrderCatalogue.findAll()){
            deletedComponents.clear();
            if(order.getComponents() != null) {
                for (Component c : order.getComponents()) {
                    if (c!=null && c.getId() == id) {
                        deletedComponents.add(c);
                    }
                }
                for (Component c:deletedComponents){
                    order.getComponents().remove(c);
                }
                componentOrderCatalogue.save(order);
            }
        }
        componentRepository.delete(id);
    }

}
