package com.example.carserviceapp.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name= "stuff")
public class Stuff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private BigDecimal price;
    private boolean isDeleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public String toString() {
        return "Stuff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
