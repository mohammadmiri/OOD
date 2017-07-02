package Model.Persistent;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class StoreData {

    private Storable storable;
    private Warehouse warehouse;
    private Integer amount;
    private Integer min;
    private Integer max;

    @Id
    @ManyToOne
    @JoinColumn(name = "storable_id")
    public Storable getStorable() {
        return storable;
    }

    public void setStorable(Storable storable) {
        this.storable = storable;
    }

    @Id
    @ManyToOne
    @JoinColumn(name = "warehouse_id")
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
