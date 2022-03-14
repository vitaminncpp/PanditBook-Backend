package com.akshayaap.panditbook.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;

@Getter
@Setter
@ToString
@Document(collation = "directRequests")
public class Request {
    @Id
    @Indexed(unique = true)
    @Field("_id")
    private String id;

    @Field("uid")
    private String uid;

    @Field("panditRequested")
    private String panditRequested;

    @Field("title")
    private String title;

    @Field("content")
    private String content;

    @Field("date")
    private String date;

    @Field("location")
    private String location;

    @Field("type")
    private Integer type;

    @Field("price")
    private Double price;

    @Field("accepted")
    private Boolean accepted;

    @Field("rejected")
    private Boolean rejected;

    @Field("cancelled")
    private Boolean cancelled;

    @Field("seen")
    private boolean seen;


    public Request() {
    }

    public Request( String uid, String panditRequested, String title, String content, String date, String location, Integer type, Double price, Boolean accepted, Boolean seen, Boolean rejected, Boolean cancelled) {

        this.uid = uid;
        this.panditRequested = panditRequested;
        this.title = title;
        this.content = content;
        this.date = date;
        this.location = location;
        this.type = type;
        this.price = price;
        this.accepted = accepted;
        this.seen = seen;
        this.rejected = rejected;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getAccepted() {
        return accepted;
    }

    public void setAccepted(Boolean accepted) {
        this.accepted = accepted;
    }

    public Boolean getRejected() {
        return rejected;
    }

    public void setRejected(Boolean rejected) {
        this.rejected = rejected;
    }

    public Boolean getCancelled() {
        return cancelled;
    }

    public void setCancelled(Boolean cancelled) {
        this.cancelled = cancelled;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPanditRequested() {
        return panditRequested;
    }

    public void setPanditRequested(String panditRequested) {
        this.panditRequested = panditRequested;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return content;
    }

    public void setDescription(String content) {
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public boolean isSeen() {
        return seen;
    }

    public void setSeen(boolean seen) {
        this.seen = seen;
    }

    public boolean isRejected() {
        return rejected;
    }

    public void setRejected(boolean rejected) {
        this.rejected = rejected;
    }
}
