package springproject.Model;

import javax.persistence.*;

/**
 * Created by mohammad on 6/28/2017.
 */
@Entity
public class Requirement {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
