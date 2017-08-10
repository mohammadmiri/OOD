package springproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springproject.Model.Source;
import springproject.Model.StoreData;
import springproject.Model.Warehouse;
import springproject.Repository.SourceRepository;
import springproject.Repository.StoreDataRepository;
import springproject.Repository.WarehouseRepository;

import java.util.List;

/**
 * Created by mohammad on 6/28/2017.
 */

@Service
public class WarehouseCatalogue {

    @Autowired
    WarehouseRepository warehouseRepository;

    @Autowired
    StoreDataRepository storeDataRepository;

    public Iterable<Warehouse> findAll(){
        return warehouseRepository.findAll();
    }

    public void save(Warehouse warehouse){
        warehouseRepository.save(warehouse);
    }

    public Warehouse findOne(Integer id){
        return warehouseRepository.findOne(id);
    }

    public void delete(Integer id){
        List<StoreData> storeData = (List<StoreData>) storeDataRepository.findAll();
        for(StoreData sd:storeData){
            Warehouse w = sd.getWarehouse();
            if(w.getId() == id){
                w.getStoreData().remove(sd);
                warehouseRepository.save(w);
                storeDataRepository.delete(sd.getId());
            }
        }
        warehouseRepository.delete(id);
    }
}
