package springproject.Model;



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

    @OneToMany
    private List<Requirement> requirements;

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

    public List<Requirement> getRequirements() {
        if(this.requirements == null){
            this.requirements = new ArrayList<>();
        }
        return requirements;
    }

    public void setRequirements(List<Requirement> requirements) {
        this.requirements = requirements;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        customer.getProductOrders().add(this);
        this.customer = customer;
    }

//    public void addProduct(Product product){
//        this.products.add(product);
//    }
//
//    public void deleteProduct(Product product){
//        this.products.remove(product);
//    }
//
//    public List<Product> getAllProducts(){
//        return this.products;
//    }
//
//    public void addRequirement(Requirement requirement){
//        this.requirements.add(requirement);
//    }
//
//    public void deleteRequirement(Requirement requirement){
//        this.requirements.remove(requirement);
//    }
//
//    public List<Requirement> getAllRequirements(){
//        return this.requirements;
//    }

}
