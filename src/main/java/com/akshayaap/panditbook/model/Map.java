package com.akshayaap.panditbook.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;

@Document(collection = "mappings")
@Getter
@Setter
@ToString
public class Map {

    @Id
    @Indexed(unique = true)
    @Field("_id")
    private String id;

    @Indexed(unique = true)
    @Field("email")
    private String email;

    @Indexed(unique = true)
    @Field("uid")
    private String uid  ;

    public Map() {

    }

    public Map(String email, String uid) {
        this.email = email;
        this.uid = uid;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
