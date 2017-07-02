package springproject.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mohammad on 6/29/2017.
 */
@Entity
public class Warehouse {

    @Id
    @Column(name="warehouse_id", updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private Integer code;

    @Column
    private String name;

    @OneToMany
    private List<StoreData> storeData = new ArrayList<>();

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

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
