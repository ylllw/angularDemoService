package com.demo.dao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@TableName("Product")
@KeySequence("product_id_seq")
public class Product {
    @TableId(value="id" ,type= IdType.AUTO)
    private Integer id; //产品id
    private String productName;//产品名称
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date productDate;//生产日期
    private String factory;//工厂
    private String productionType;//产品类型
    private Double price;//价格
    private String remark;//备注
    private String logoImg;//logo

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Date getProductDate() {
        return productDate;
    }

    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String getProductionType() {
        return productionType;
    }

    public void setProductionType(String productionType) {
        this.productionType = productionType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getLogoImg() {
        return logoImg;
    }

    public void setLogoImg(String logoImg) {
        this.logoImg = logoImg;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productDate=" + productDate +
                ", factory='" + factory + '\'' +
                ", productionType='" + productionType + '\'' +
                ", price=" + price +
                ", remark='" + remark + '\'' +
                ", logoImg='" + logoImg + '\'' +
                '}';
    }
}
