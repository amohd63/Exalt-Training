package com.example.demo.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "borrow")
public class Borrow {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name="borrowID")
    private Integer borrowID;
	
	@Column (name="userID")
    private Integer userID;
	
	@Column (name="serialNumber")
    private String serialNumber;
	
	@Column (name="borrowDate")
    private Date startDate;
	
	@Column (name="dueDate")
    private Date endDate;

    public Borrow() {
    }

    public Borrow(Integer borrowID, Integer userID, String serialNumber) {
        this.borrowID = borrowID;
        this.userID = userID;
        this.serialNumber = serialNumber;
    }

    public Integer getBorrowID() {
        return borrowID;
    }

    public void setBorrowID(Integer borrowID) {
        this.borrowID = borrowID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
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
