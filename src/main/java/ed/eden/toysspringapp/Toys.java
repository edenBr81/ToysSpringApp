package ed.eden.toysspringapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Toys implements Serializable {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id

    private long id;
    private String model;
    private String brand;
    private LocalDate date;
    private boolean instock;

    public Toys() {
        date = LocalDate.now();
        instock = false;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isInstock() {
        return instock;
    }

    public void setInstock(boolean instock) {
        this.instock = instock;
    }
}
