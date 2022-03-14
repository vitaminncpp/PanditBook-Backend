package com.akshayaap.panditbook.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document
@Getter
@Setter
@ToString
public class SearchUser {
    @Field("search")
    private String search;
    @Field("pageno")
    private int pageno;
    @Field("pageSize")
    private int pageSize;
    @Field("sortBy")
    private String sortBy;
    @Field("sortOrder")
    private String sortOrder;

    public SearchUser() {
    }

    public SearchUser(String search, int pageno, int pageSize, String sortBy, String sortOrder) {
        this.search = search;
        this.pageno = pageno;
        this.pageSize = pageSize;
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
    }

    public String getSearch() {
        return search;
    }

    public int getPageno() {
        return pageno;
    }

    public int getPageSize() {
        return pageSize;
    }

    public String getSortBy() {
        return sortBy;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public void setPageno(int pageno) {
        this.pageno = pageno;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

}
