package springproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springproject.Model.ProductOrder;
import springproject.Model.ProductionStep;
import springproject.Repository.ProductOrderRepository;
import springproject.Repository.ProductionStepRepository;

/**
 * Created by mohammad on 7/3/2017.
 */

@Service
public class ProductionStepCatalogue {

    @Autowired
    ProductionStepRepository productionStepRepository;

    public Iterable<ProductionStep> findAll(){
        return productionStepRepository.findAll();
    }

    public void save(ProductionStep productionStep){
        productionStepRepository.save(productionStep);
    }

    public ProductionStep findOne(Integer id){
        return productionStepRepository.findOne(id);
    }
}
