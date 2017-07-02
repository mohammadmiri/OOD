package springproject.Model;


import javax.persistence.*;

@Entity
public class StoreData {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    private Storable storable;

    @ManyToOne
    private Warehouse warehouse;

    @Column
    private Integer amount;

    @Column
    private Integer min;

    @Column
    private Integer max;


    public Storable getStorable() {
        return storable;
    }

    public void setStorable(Storable storable) {
        this.storable = storable;
    }


    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }
}
