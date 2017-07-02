package springproject.Model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by mohammad on 6/28/2017.
 */
@Entity
public class Comment {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private Date date;

    @Column
    private String message;

    @ManyToOne
    private Customer customer;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
