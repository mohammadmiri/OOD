package springproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springproject.Model.SupplyChain;

/**
 * Created by mohammad on 7/3/2017.
 */

@Service
public class SupplyChainCatalogue {


    @Autowired
    SupplyChainCatalogue supplyChainCatalogue;

    public Iterable<SupplyChain> findAll(){
        return supplyChainCatalogue.findAll();
    }

    public void save(SupplyChain supplyChain){
        supplyChainCatalogue.save(supplyChain);
    }

    public SupplyChain findOne(Integer id){
        return supplyChainCatalogue.findOne(id);
    }
}
