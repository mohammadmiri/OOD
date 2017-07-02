package Service;

import Service.ModelPackage.Component;

import java.util.List;

/**
 * Created by mohammad on 6/28/2017.
 */
public class ComponentCatalogue implements Catalogue<Component>{

    private static ComponentCatalogue instance;

    private ComponentCatalogue(){

    }

    public ComponentCatalogue getInstance(){
        if(ComponentCatalogue.instance == null){
            ComponentCatalogue.instance = new ComponentCatalogue();
        }
        return ComponentCatalogue.instance;
    }

    private List<Component> components;

    @Override
    public void add(Component component) {
        this.components.add(component);
    }

    @Override
    public void delete(Component component) {
        this.components.remove(component);
    }

    @Override
    public List<Component> getAll() {
        return this.components;
    }
}
