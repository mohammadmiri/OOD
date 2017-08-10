package springproject.Model;

import springproject.Service.ComponentCatalogue;
import springproject.Service.SaleChainCatalogue;

import javax.persistence.Entity;

/**
 * Created by mohammad on 6/29/2017.
 */
@Entity
public class Component extends Storable{

    public Component(String name, Integer price, String description) {
        super(name, price, description);
    }

    public Component() {
    }

    public String toString(){
        return this.getName();
    }

    public void deleteSaleChain(SaleChain saleChain, SaleChainCatalogue sc, ComponentCatalogue cc){
        if(this.getDefaultSaleChain() != null && this.getDefaultSaleChain().getId() == saleChain.getId()){
            this.setDefaultSaleChain(null);
        }
        if(this.getSaleChains().contains(saleChain)){
            this.getSaleChains().remove(saleChain);
        }
        cc.save(this);
    }
}
