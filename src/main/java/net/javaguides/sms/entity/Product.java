package net.javaguides.sms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

//    @Column(name = "product_img",  nullable = true, length = 64)
//    private String photos;

    @Column(name = "location")
    private String location;

    @Column(name = "description")
    private String description;

    @Column(name = "phoneNum")
    private int phoneNum;
    @Column(name = "price")
    private int price;



    public Product(String title, String location, String description, int price) {
        this.id = id;
        this.title = title;
//        this.photos = photos;
        this.location = location;
        this.description = description;
        this.price = price;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    public String getPhotos() {
//        return photos;
//    }
//
//    public void setPhotos(String photos) {
//        this.photos = photos;
//    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Product() {

    }


    }




