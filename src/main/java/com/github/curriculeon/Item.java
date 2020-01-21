package com.github.curriculeon;

/**
 * @author leon on 30/01/2019.
 */
public class Item {
    private String name;
    private Long id;
    private Double price;

    public Item(Long id, String name, Double price) {
        setId(id);
        setName(name);
        setPrice(price);
    }
    public Item() {
        this.id = 0L;
        this.name = "";
        this.price = 0.01;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
