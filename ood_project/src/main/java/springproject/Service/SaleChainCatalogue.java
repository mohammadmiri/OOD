package springproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springproject.Model.SaleChain;
import springproject.Model.Warehouse;
import springproject.Repository.SaleChainRepository;
import springproject.Repository.WarehouseRepository;

/**
 * Created by mohammad on 7/3/2017.
 */

@Service
public class SaleChainCatalogue {


    @Autowired
    SaleChainRepository saleChainRepository;

    public Iterable<SaleChain> findAll(){
        return saleChainRepository.findAll();
    }

    public void save(SaleChain saleChain){
        saleChainRepository.save(saleChain);
    }

    public SaleChain findOne(Integer id){
        return saleChainRepository.findOne(id);
    }

    public void delete(Integer id){
        saleChainRepository.delete(id);
    }
}
