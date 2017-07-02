package Service;

import java.util.List;

/**
 * Created by mohammad on 6/28/2017.
 */
public interface Catalogue<T> {

    public void add(T t);
    public void delete(T t);
    public List<T> getAll();

}
