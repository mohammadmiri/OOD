package springproject.Model;



import springproject.Service.ProductCatalogue;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class ProductOrder extends OrderEntity {

    @ManyToMany
    private List<Product> products;

    private String requirements;

    @ManyToOne
    private Customer customer;

    public ProductOrder(Integer totalCost, Date date) {
        super(totalCost, date);
    }

    public ProductOrder() {
    }

    public List<Product> getProducts() {
        if(this.products == null){
            this.products = new ArrayList<>();
        }
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        customer.getProductOrders().add(this);
        this.customer = customer;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public void addProducts(int[] indexes, ProductCatalogue p){
        if(indexes!=null){
            for(int i:indexes){
                this.getProducts().add(p.findOne(i));
            }
        }
    }
}
