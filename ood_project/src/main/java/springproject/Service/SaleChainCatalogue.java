package springproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springproject.Model.Product;
import springproject.Model.SaleChain;
import springproject.Model.Storable;
import springproject.Model.Warehouse;
import springproject.Repository.SaleChainRepository;
import springproject.Repository.WarehouseRepository;

import java.util.List;

/**
 * Created by mohammad on 7/3/2017.
 */

@Service
public class SaleChainCatalogue {


    @Autowired
    SaleChainRepository saleChainRepository;

    @Autowired
    ProductCatalogue productCatalogue;

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
        List<Product> list = (List<Product>) productCatalogue.findAll();
        for(Product p:list){
            p.deleteSaleChain(this.findOne(id), this, productCatalogue);
        }
        saleChainRepository.delete(id);
    }
}
