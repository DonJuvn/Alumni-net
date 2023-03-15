package net.javaguides.sms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.awt.*;
import java.math.BigInteger;

@Entity
@Table(name = "blog")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(name = "news_img",  nullable = true, length = 64)
//    private String photos;
    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content")
    private String content;


    public Blog() {

    }

    public Blog(String title, String content) {
//        this.id = id;
//        this.photos = photos;
        this.title = title;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public String getPhotos() {
//        return photos;
//    }

//    public void setPhotos(String photos) {
//        this.photos = photos;
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}



