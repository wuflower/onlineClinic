package com.khbr.onlineclinic.domain.dto;

import java.util.List;

/**
 * Created by Administrator on 2018/8/31 0031.
 */
public class PageInfo <T>{
    private List<T> data;
    private Integer currentPage; //当前页
    private Integer PageSize; //每页行数
    private Integer totalRows; //总数据条数
    private Integer totalPage; //总页数


    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return PageSize;
    }

    public void setPageSize(Integer pageSize) {
        PageSize = pageSize;
    }

    public Integer getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    @Override
    public String toString() {
        return "PageInfo{" +
                "data=" + data +
                ", currentPage=" + currentPage +
                ", PageSize=" + PageSize +
                ", totalRows=" + totalRows +
                ", totalPage=" + totalPage +
                '}';
    }
}
