package springproject.Model;

import org.springframework.data.repository.CrudRepository;
import springproject.Service.ProductCatalogue;
import springproject.Service.ProductionStepCatalogue;
import springproject.Service.SaleChainCatalogue;
import springproject.Service.SupplyChainCatalogue;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mohammad on 6/29/2017.
 */
@Entity
public class Product extends Storable{

    @ManyToMany
    private List<ProductionStep> productionSteps = new ArrayList<>();

    @OneToMany
    private List<Comment> comments = new ArrayList<>();

    public List<ProductionStep> getProductionSteps() {
        return productionSteps;
    }

    public Product(String name, Integer price, String description) {
        super(name, price, description);
    }

    public Product() {
    }

    public void setProductionSteps(List<ProductionStep> productionSteps) {
        this.productionSteps = productionSteps;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public void addProductionSteps(int[] indexes, ProductionStepCatalogue ps){
        if(indexes != null) {
            for (int i : indexes) {
                this.getProductionSteps().add(ps.findOne(i));
            }
        }
    }

    public void addSupplyChains(int[] indexes, SupplyChainCatalogue sc){
        if(indexes != null) {
            for (int i : indexes) {
                this.getSupplyChains().add(sc.findOne(i));
            }
        }
    }

    public void addSaleChains(int[] indexes, SaleChainCatalogue sc){
        if(indexes != null) {
            for (int i : indexes) {
                this.getSaleChains().add(sc.findOne(i));
            }
        }
    }

    public String toString(){
        return this.getName();
    }

    public void deleteSaleChain(SaleChain saleChain, SaleChainCatalogue sc, ProductCatalogue pc){
        if(this.getDefaultSaleChain() != null && this.getDefaultSaleChain().getId() == saleChain.getId()){
            this.setDefaultSaleChain(null);
        }
        if(this.getSaleChains().contains(saleChain)){
            this.getSaleChains().remove(saleChain);
        }
        pc.save(this);
    }
}
