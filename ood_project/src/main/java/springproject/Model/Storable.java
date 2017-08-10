package springproject.Model;

import org.springframework.data.repository.CrudRepository;
import springproject.Service.SaleChainCatalogue;

import javax.persistence.*;
import javax.validation.constraints.Null;
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

    public SaleChain getDefaultSaleChain() {
        return defaultSaleChain;
    }

    public void setDefaultSaleChain(SaleChain defaultSaleChain) {
        this.defaultSaleChain = defaultSaleChain;
    }

    public List<SaleChain> getSaleChains() {
        return saleChains;
    }

    public void setSaleChains(List<SaleChain> saleChains) {
        this.saleChains = saleChains;
    }

    public SupplyChain getDefaultSupplyChain() {
        return defaultSupplyChain;
    }

    public void setDefaultSupplyChain(SupplyChain defaultSupplyChain) {
        this.defaultSupplyChain = defaultSupplyChain;
    }

    public List<SupplyChain> getSupplyChains() {
        return supplyChains;
    }

    public void setSupplyChains(List<SupplyChain> supplyChains) {
        this.supplyChains = supplyChains;
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

    public void deleteSaleChain(Integer id, SaleChainCatalogue sc, CrudRepository<Storable, Integer> crudRepository){
        if(this.defaultSaleChain.getId() == id){
            this.setDefaultSaleChain(null);
            this.getSaleChains().remove(sc.findOne(id));
            crudRepository.save(this);
        }
    }
}
