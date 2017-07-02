package Model.Persistent;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by mohammad on 6/29/2017.
 */

@Entity
public class Employee extends User{

    @Column
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
