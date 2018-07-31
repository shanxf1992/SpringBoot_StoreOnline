package com.itheima.service;

import com.itheima.mapper.ProductMapper;
import com.itheima.pojo.PageBean;
import com.itheima.pojo.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service("productService")
public class ProductService {

    @Value("#{productMapper}")
    private ProductMapper productMapper;

    //根据页标签查询商品列表
    public PageBean queryProductList(Integer page, Integer rows) {

        //查询商品总数
        int total = productMapper.queryProductTotalNum();
        //商品的总页数
        int totalPage = (total + rows - 1) / rows;
        //查询起始值
        int startPage = (page - 1) * rows;
        //查询当前页码的商品列表
        List<Product> products = productMapper.queryProductList(startPage, rows);

        //设置PageBean的属性
        PageBean pageBean = new PageBean();
        pageBean.setPage(page);
        pageBean.setRows(rows);
        pageBean.setTotal(total);
        pageBean.setTotalPage(totalPage);
        pageBean.setProducts(products);

        return pageBean;
    }
}
