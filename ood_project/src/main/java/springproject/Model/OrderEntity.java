package springproject.Model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by mohammad on 6/29/2017.
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class OrderEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private Integer totalCost;

    @Column
    private Date date;

    public OrderEntity(Integer totalCost, Date date) {
        this.totalCost = totalCost;
        this.date = date;
    }

    public OrderEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Integer totalCost) {
        this.totalCost = totalCost;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
