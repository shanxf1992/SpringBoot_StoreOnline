package com.itheima.service;

import com.itheima.mapper.ProductMapper;
import com.itheima.pojo.Product;
import com.itheima.spring_boot_demo.SpringBootDemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest(classes = SpringBootDemoApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class ProductServiceTest {

    @Value("#{productMapper}")
    private ProductMapper productMapper;

    @Test
    public void test001() throws Exception {

        List<Product> products = productMapper.queryProductList(1, 10);
        for (Product product : products) {
            System.out.println(product);

        }
    }

}