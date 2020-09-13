package com.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.demo.dao.Product;
import com.demo.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.*;


@RestController
public class ProductController {

    @Autowired
    private ProductMapper productService;

    @GetMapping("/query")
    public List<Product> queryList() {
        return productService.selectList(new QueryWrapper<Product>());
    }

    @GetMapping("/query/{currentPage}")
    public List<Product> queryList1(@PathVariable("currentPage")int currentPage) {

        Page<Product> page = new Page<Product>(currentPage, 10);

        QueryWrapper<Product> qw = new QueryWrapper<Product>();
        qw.orderByAsc("id");
        IPage<Product> iPage = productService.selectPage(page, qw);
        return iPage.getRecords();
    }

    @GetMapping("/getById/{id}")
    public Product getById(@PathVariable("id") int id) {
        System.out.println("getByID id:" + id);
        return productService.selectById(id);
    }

    @GetMapping("/getByName/{name}")
    public List<Product> getByName(@PathVariable("name") String name) {
        System.out.println("getByID id:" + name);
        QueryWrapper<Product> qw = new QueryWrapper<Product>();
        qw.like("product_name", name);
        return productService.selectList(qw);
    }

    @PostMapping("/add")
    public void add(@RequestBody Product product) {
        productService.insert(product);

        System.out.println("product add :" + product.toString());

    }

    @PutMapping("/update")
    public void update(@RequestBody Product product) {
        System.out.println("product update :" + product.toString());
        productService.updateById(product);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        System.out.println("delete id:" + id);
        productService.deleteById(id);
    }

    @PostMapping("/uploadImg")
    public void uploadImg() {

    }
}
