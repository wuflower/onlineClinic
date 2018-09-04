package com.khbr.onlineclinic.domain.dto;

/**
 * Created by Administrator on 2018/8/31 0031.
 */
public class PatientQueryConditions {
    private String queryCon;
    private Integer currentPage=1;
    private Integer pageSize=3;
    private Integer startIndex=0;

    public String getQueryCon() {
        return queryCon;
    }

    public void setQueryCon(String queryCon) {
        this.queryCon = queryCon;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getStartIndex() {
        if (currentPage!=null&&pageSize!=null){
            startIndex=(currentPage-1)*pageSize;
        }
        return startIndex;

    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    @Override
    public String toString() {
        return "PatientQueryConditions{" +
                "queryCon='" + queryCon + '\'' +
                ", currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", startIndex=" + startIndex +
                '}';
    }
}
