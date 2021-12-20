package com.gimnasio.AccountMS.models;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class PurchaseProductInfo {
    @Id
    private String id;
    private String username;
    private String product;
    private Integer productValue;
    private Date purchaseDate;

    public PurchaseProductInfo(String id, String username, String product, Integer productValue, Date purchaseDate) {
        this.id = id;
        this.username = username;
        this.product = product;
        this.productValue = productValue;
        this.purchaseDate = purchaseDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getProductValue() {
        return productValue;
    }

    public void setProductValue(Integer productValue) {
        this.productValue = productValue;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}

