package springproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springproject.Model.Source;
import springproject.Model.Warehouse;
import springproject.Repository.SourceRepository;
import springproject.Repository.WarehouseRepository;

/**
 * Created by mohammad on 6/28/2017.
 */

@Service
public class WarehouseCatalogue {

    @Autowired
    WarehouseRepository warehouseRepository;

    public Iterable<Warehouse> findAll(){
        return warehouseRepository.findAll();
    }

    public void save(Warehouse warehouse){
        warehouseRepository.save(warehouse);
    }

    public Warehouse findOne(Integer id){
        return warehouseRepository.findOne(id);
    }

    public void delete(Integer id){ warehouseRepository.delete(id); }
}
