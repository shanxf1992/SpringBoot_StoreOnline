package com.itheima.pojo;

import java.util.List;

public class PageBean {

    //总记录数
    private Integer total;
    //当前页码
    private Integer page;
    //总页数
    private Integer totalPage;
    //每页显示条数
    private Integer rows;
    //每页商品信息
    private List<Product> products;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "total=" + total +
                ", page=" + page +
                ", totalPage=" + totalPage +
                ", rows=" + rows +
                ", products=" + products +
                '}';
    }
}
