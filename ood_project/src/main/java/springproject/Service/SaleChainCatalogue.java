package springproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springproject.Model.SaleChain;
import springproject.Model.Warehouse;
import springproject.Repository.WarehouseRepository;

/**
 * Created by mohammad on 7/3/2017.
 */

@Service
public class SaleChainCatalogue {


    @Autowired
    SaleChainCatalogue saleChainCatalogue;

    public Iterable<SaleChain> findAll(){
        return saleChainCatalogue.findAll();
    }

    public void save(SaleChain saleChain){
        saleChainCatalogue.save(saleChain);
    }

    public SaleChain findOne(Integer id){
        return saleChainCatalogue.findOne(id);
    }
}
