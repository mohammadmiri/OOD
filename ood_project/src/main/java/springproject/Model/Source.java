package springproject.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by mohammad on 6/29/2017.
 */
@Entity
public class Source {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String name;

    @Column
    private String address;

    @OneToMany
    private List<ComponentOrder> componentOrders;

    @ManyToMany
    private List<Component> components;

    public Source(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addComment(Component component){
        this.components.add(component);
    }

    public void deleteComponent(Component component){
        this.components.remove(component);
    }

    public List<Component> getAllComponents(){
        return this.components;
    }

    public void addComponentOrder(ComponentOrder componentOrder){
        this.componentOrders.add(componentOrder);
    }

    public void deleteComponentOrder(ComponentOrder componentOrder){
        this.componentOrders.remove(componentOrder);
    }

    public List<ComponentOrder> getAllComponentOrder(){
        return this.componentOrders;
    }
}
