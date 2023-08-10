package com.example.demo.models;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subscription")
public class Subscription {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name="subscriptionID")
    private Integer subscriptionID;
	
	@Column (name="userID")
    private Integer userID;
	
	@Column (name="start_date")
    private Date startDate;
	
	@Column (name="end_date")
    private Date endDate;

    public Subscription(Integer subscriptionID, Integer userID, Date endDate) {
        this.subscriptionID = subscriptionID;
        this.userID = userID;
        this.startDate = Date.valueOf(LocalDate.now());
        this.endDate = endDate;
    }
    
    public Subscription() {
        this.startDate = Date.valueOf(LocalDate.now());
    }

    public Integer getSubscriptionID() {
        return subscriptionID;
    }

    public void setSubscriptionID(Integer subscriptionID) {
        this.subscriptionID = subscriptionID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
