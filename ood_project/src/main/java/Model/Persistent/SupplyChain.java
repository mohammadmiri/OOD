package Model.Persistent;

/**
 * Created by mohammad on 6/28/2017.
 */
public class SupplyChain {

    private Integer cost;
    private Integer time; // how many days
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
