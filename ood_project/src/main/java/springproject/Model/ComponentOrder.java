package springproject.Model;


import springproject.Service.ComponentCatalogue;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by mohammad on 6/28/2017.
 */
@Entity
public class ComponentOrder extends OrderEntity {

    @ManyToMany
    private List<Component> components;

    @Column
    private Integer amount;

    @ManyToOne
    private Source source;

    public ComponentOrder(Integer totalCost, Date date, Integer amount, Source source) {
        super(totalCost, date);
        this.amount = amount;
        this.source = source;
    }

    public ComponentOrder() {
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

    public List<Component> getComponents() {
        if(this.components == null){
            this.components = new ArrayList<>();
        }
        return components;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public void addComponents(int[] indexes, ComponentCatalogue c){
        if(indexes != null){
            for(int i:indexes){
                this.getComponents().add(c.findOne(i));
            }
        }
    }
}
