package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {
	@Id
	@Column (name="serialNumber")
    private String serialNumber;
	
	@Column (name="bookName")
    private String name;
	
	@Column (name="numOfPages")
    private int numOfPages;
	
	@Column (name="genre")
    private Genre genre;
	
	@Column (name="author")
    private String author;
	
	@Column (name="availableCopies")
    private int availableCopies;
	
	@Column (name="totalCopies")
    private int totalCopies;

    public Book() {
        super();
// TODO Auto-generated constructor stub	
    }

    public Book(String serialNumber, String name, int numOfPages, Genre genre, String author, int availableCopies, int totalCopies) {
        super();
        this.serialNumber = serialNumber;
        this.name = name;
        this.numOfPages = numOfPages;
        this.genre = genre;
        this.author = author;
        this.availableCopies = availableCopies;
        this.totalCopies = totalCopies;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

    public int getTotalCopies() {
        return totalCopies;
    }

    public void setTotalCopies(int totalCopies) {
        this.totalCopies = totalCopies;
    }

}