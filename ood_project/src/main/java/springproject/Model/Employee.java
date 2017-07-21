package springproject.Model;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by mohammad on 6/29/2017.
 */

@Entity
public class Employee extends UserEntity {

    @Column
    private Role role;

    public Employee(String username, String password, String firstName, String lastName) {
        super(username, password, firstName, lastName);
    }

    public Employee(){
        super();
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
