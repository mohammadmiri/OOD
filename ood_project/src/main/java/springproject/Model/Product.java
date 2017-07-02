package springproject.Model;

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

    public void setProductionSteps(List<ProductionStep> productionSteps) {
        this.productionSteps = productionSteps;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
