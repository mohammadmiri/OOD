package Model.Persistent;

import javax.persistence.*;

/**
 * Created by mohammad on 6/28/2017.
 */
@Entity
public class SaleChain {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private Integer cost;

    @Column
    private Integer time; // how many days

    @Column
    private String description;

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
