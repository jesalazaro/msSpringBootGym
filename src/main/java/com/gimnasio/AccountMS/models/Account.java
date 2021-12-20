package com.gimnasio.AccountMS.models;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Account {
    @Id
    private String username;
    private String plan;
    private Date purchaseDate;

    public Account(String username, String plan, Date purchaseDate) {
        this.username = username;
        this.plan = plan;
        this.purchaseDate = purchaseDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}
