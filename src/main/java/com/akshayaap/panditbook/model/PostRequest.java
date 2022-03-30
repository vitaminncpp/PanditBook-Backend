package com.akshayaap.panditbook.model;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.web.bind.annotation.RequestBody;

@Data
@Getter
@Setter
@ToString
@Document
public class PostRequest {
    @Field("user")
    private  User user;

    @Field("post")
    private Post post;

    public PostRequest() {
    }


    public PostRequest(User user, Post post) {
        this.user = user;
        this.post = post;
    }
}
