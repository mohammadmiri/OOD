package springproject.Model;

import javax.persistence.Entity;

/**
 * Created by mohammad on 6/29/2017.
 */
@Entity
public class Component extends Storable{

    public Component(String name, Integer price, String description) {
        super(name, price, description);
    }

    public Component() {
    }

    public String toString(){
        return this.getName();
    }
}
