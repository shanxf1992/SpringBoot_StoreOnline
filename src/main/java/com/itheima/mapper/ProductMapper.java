package com.itheima.mapper;

import com.itheima.pojo.Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("productMapper")
public interface ProductMapper {
    //查询商品总记录数
    public int queryProductTotalNum();

    //查询指定页码的商品列表
    public List<Product> queryProductList(@Param("pageStart") int startPage, @Param("rows") Integer rows);
}
