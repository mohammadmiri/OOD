package springproject.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mohammad on 6/29/2017.
 */

@Entity
public class Customer extends UserEntity {

    @Column
    private Integer charge;

    @OneToMany
    private List<ProductOrder> productOrders = new ArrayList<>();

    public Customer(String username, String password, String firstName, String lastName) {
        super(username, password, firstName, lastName);
    }

    public List<ProductOrder> getProductOrders() {
        return productOrders;
    }

    public void setProductOrders(List<ProductOrder> productOrders) {
        this.productOrders = productOrders;
    }

    public Integer getCharge() {
        return charge;
    }

    public void setCharge(Integer charge) {
        this.charge = charge;
    }
}
