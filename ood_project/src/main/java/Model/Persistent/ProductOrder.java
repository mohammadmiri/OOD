package Model.Persistent;



import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class ProductOrder extends Order {

    @ManyToMany
    private List<Product> products;

    @OneToMany
    private List<Requirement> requirements;

    @ManyToOne
    private List<Customer> customers;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Requirement> getRequirements() {
        return requirements;
    }

    public void setRequirements(List<Requirement> requirements) {
        this.requirements = requirements;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
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
