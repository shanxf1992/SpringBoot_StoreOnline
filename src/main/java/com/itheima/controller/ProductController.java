package com.itheima.controller;


import com.itheima.pojo.PageBean;
import com.itheima.pojo.Product;
import com.itheima.service.ProductService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

    @Value("#{productService}")
    private ProductService productService;

    @RequestMapping("product_list")
    public ModelAndView getProductListInfo(@RequestParam(value = "page", defaultValue = "1") Integer page,
                                           @RequestParam(value = "rows", defaultValue = "12") Integer rows) {

        PageBean pageBean = productService.queryProductList(page, rows);
        ModelAndView modelAndView = new ModelAndView("product_list");
        modelAndView.addObject("pageBean", pageBean);

        return modelAndView;
    }
}
