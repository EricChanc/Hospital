package com.example.dto;

import javax.validation.constraints.NotNull;
import java.util.List;

public class PageDto<T> {

    //分页数据
    private List<T> records;
    private long total = 0;
    /**
     * 每页显示条数，默认 10
     */
    @NotNull
    private long size = 10;

    /**
     * 当前页
     */
    @NotNull
    private long current = 1;

    private long pages=0;

    public List<T> getRecords() {
        return records;
    }

    public void setRecords(List<T> records) {
        this.records = records;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public long getCurrent() {
        return current;
    }

    public void setCurrent(long current) {
        this.current = current;
    }

    public long getPages() {
        return pages;
    }

    public void setPages(long pages) {
        this.pages = pages;
    }
}
