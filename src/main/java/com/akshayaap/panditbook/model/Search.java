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
public class Search {
    @Field("searchBy")
    private String searchBy;
    @Field("searchValue")
    private String searchValue;
    @Field("pageno")
    private int pageno;
    @Field("pageSize")
    private int pageSize;
    @Field("sortBy")
    private String sortBy;
    @Field("sortOrder")
    private String sortOrder;

    public Search() {
    }

    public Search(String searchBy,String searchValue, int pageno, int pageSize, String sortBy, String sortOrder) {
        this.searchBy = searchBy;
        this.searchValue = searchValue;
        this.pageno = pageno;
        this.pageSize = pageSize;
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
    }

    public String getSearch() {
        return searchBy;
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
        this.searchBy = search;
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
