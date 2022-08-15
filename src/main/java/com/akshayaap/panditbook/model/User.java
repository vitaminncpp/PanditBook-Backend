package com.akshayaap.panditbook.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;
import javax.persistence.Transient;


@Getter
@Setter
@Document(collection = "users")
@ToString
public class User {

    public static final int USER_PANDIT = 0;
    public static final int USER_REGULAR = 1;
    @Transient
    public static final String SEQUENCE_NAME = "user_sequence";

    @Id
    @Indexed(unique = true)
    @Field("_id")
    private String _id;
    @Field("name")
    private String name;
    @Field("email")
    @Indexed(unique = true)
    private String email;
    @Field("address")
    private String address;
    @Field("phone")
    private String phone;
    @Field("uType")
    private Integer uType;
    @Field("pHash")
    private String pHash;
    @Field("bDate")
    private String bDate;
    @Field("description")
    private String description;

    public User(String email, String pHash, String name, int uType, String phone, String address, String bDate, String description) {
        this.email = email;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.uType = uType;
        this.pHash = pHash;
        this.bDate = bDate;
        this.description = description;
    }

    public User(String id,String email, String pHash, String name, int uType, String phone, String address, String bDate, String description) {
        this._id=id;
        this.email = email;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.uType = uType;
        this.pHash = pHash;
        this.bDate = bDate;
        this.description = description;
    }

    public User() {
    }

    public User(String email, String pHash) {
        this.email = email;
        this.pHash = pHash;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getuType() {
        return uType;
    }

    public void setuType(int uType) {
        this.uType = uType;
    }

    public String getpHash() {
        return pHash;
    }

    public void setpHash(String pHash) {
        this.pHash = pHash;
    }

    public String getbDate() {
        return bDate;
    }

    public void setbDate(String bDate) {
        this.bDate = bDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return _id;
    }

    public void setId(String id) {
        this._id = id;
    }
}
