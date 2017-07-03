package springproject.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mohammad on 6/29/2017.
 */

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Storable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="storable_id", updatable = false, nullable = false)
    private int id;

    @Column
    private String name;

    @Column
    private Integer price;

    @Column
    private String description;

    @OneToMany
    private List<StoreData> storeData = new ArrayList<>();

    @ManyToOne
    private SaleChain defaultSaleChain;

    @ManyToMany
    private List<SaleChain> saleChains = new ArrayList<>();

    @ManyToOne
    private SupplyChain defaultSupplyChain;

    @ManyToMany
    private List<SupplyChain> supplyChains = new ArrayList<>();

    public Storable(String name, Integer price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public Storable() {
    }

    public List<StoreData> getStoreData() {
        return storeData;
    }

    public void setStoreData(List<StoreData> storeData) {
        this.storeData = storeData;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
