package com.gimnasio.AccountMS.models;
import org.springframework.data.annotation.Id;

public class Product {
    @Id
    private String productName;
    private Float price;
    private Integer Units;

    public Product(String productName, Float price, Integer units) {
        this.productName = productName;
        this.price = price;
        Units = units;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getUnits() {
        return Units;
    }

    public void setUnits(Integer units) {
        Units = units;
    }
}

