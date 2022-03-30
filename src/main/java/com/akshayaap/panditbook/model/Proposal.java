package com.akshayaap.panditbook.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Getter
@Setter
@ToString
@Document(collation = "proposals")
public class Proposal {

    @Id
    @Indexed(unique = true)
    @Field("_id")
    private String id;

    @Field("postID")
    private String postID;

    @Field("panditID")
    private String panditID;

    @Field("content")
    private String content;

    @Field("accepted")
    Boolean accepted;

    @Field("rejected")
    Boolean rejected;

    @Field("seen")
    Boolean seen;

    @Field("cancelled")
    Boolean cancelled;


    public Proposal() {
    }

    public Proposal(String postID, String panditID, String content, Boolean accepted, Boolean rejected, Boolean seen, Boolean cancelled) {
        this.postID = postID;
        this.panditID = panditID;
        this.content = content;
        this.accepted = accepted;
        this.rejected = rejected;
        this.seen = seen;
        this.cancelled = cancelled;
    }




    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPostID() {
        return postID;
    }

    public void setPostID(String postID) {
        this.postID = postID;
    }

    public String getPanditID() {
        return panditID;
    }

    public void setPanditID(String panditID) {
        this.panditID = panditID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public Boolean getSeen() {
        return seen;
    }

    public void setSeen(Boolean seen) {
        this.seen = seen;
    }

    public Boolean getCancelled() {
        return cancelled;
    }

    public void setCancelled(Boolean cancelled) {
        this.cancelled = cancelled;
    }
}
