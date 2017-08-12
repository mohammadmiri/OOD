package springproject.Model;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by mohammad on 6/29/2017.
 */

@Entity
public class Employee extends UserEntity {

    @Column
    private Type type;

    public Employee(String username, String password, String firstName, String lastName, Boolean isLoggedIn) {
        super(username, password, firstName, lastName, isLoggedIn);
    }

    public Employee(){
        super();
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String toString(){
        return this.getUsername();
    }
}
