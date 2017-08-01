package springproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springproject.Model.SupplyChain;
import springproject.Repository.SupplyChainRepository;

/**
 * Created by mohammad on 7/3/2017.
 */

@Service
public class SupplyChainCatalogue {


    @Autowired
    SupplyChainRepository supplyChainRepository;

    public Iterable<SupplyChain> findAll(){
        return supplyChainRepository.findAll();
    }

    public void save(SupplyChain supplyChain){
        supplyChainRepository.save(supplyChain);
    }

    public SupplyChain findOne(Integer id){
        return supplyChainRepository.findOne(id);
    }

    public void delete(Integer id){
        supplyChainRepository.delete(id);
    }
}
