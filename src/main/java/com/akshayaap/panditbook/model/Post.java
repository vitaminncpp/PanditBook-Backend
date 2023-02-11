package com.akshayaap.panditbook.model;

import javax.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;

@Data
@Getter
@Setter
@ToString
@Document(collection = "posts")
public class Post {

    @Id
    @Indexed(unique = true)
    @Field("_id")
    private String _id;
    @Field("uid")
    private String uid;
    @Field("title")
    private String title;
    @Field("content")
    private String content;
    @Field("date")
    private String date;
    @Field("type")
    private Integer type;
    @Field("location")
    private String location;
    @Field("price")
    private Double price;

    public Post(String id,String uid, String title, String content, String date, String location, Double price, Integer type) {
        this._id=id;
        this.uid = uid;
        this.title = title;
        this.content=content;
        this.date = date;

        this.location = location;
        this.price = price;
        this.type = type;
    }


    public Post(String uid, String title, String content, String date, String location, Double price, Integer type) {

        this.uid = uid;
        this.title = title;
        this.content=content;
        this.date = date;

        this.location = location;
        this.price = price;
        this.type = type;
    }

    public Post() {
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void steContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }


    public String getId() {
        return _id;
    }


    public void setId (String _id) {
        this._id = _id;
    }
}
