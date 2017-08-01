package springproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springproject.Model.Product;
import springproject.Model.Source;
import springproject.Repository.ProductRepository;
import springproject.Repository.SourceRepository;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * Created by mohammad on 6/28/2017.
 */

@Service
public class SourceCatalogue {

    @Autowired
    SourceRepository sourceRepository;

    public Iterable<Source> findAll(){
        return sourceRepository.findAll();
    }

    public void save(Source source){
        sourceRepository.save(source);
    }

    public Source findOne(Integer id){
        return sourceRepository.findOne(id);
    }

    public void delete(Integer id){sourceRepository.delete(id);}
}
