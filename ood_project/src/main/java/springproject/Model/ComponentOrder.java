package springproject.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by mohammad on 6/28/2017.
 */
@Entity
public class ComponentOrder extends OrderEntity {

    @Column
    private Integer amount;

    @ManyToOne
    private Source source;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }
}
