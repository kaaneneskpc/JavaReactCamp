package com.company.oopProject.models;

public class Product {

    private int id;
    private String name;
    private double unitPrice;
    private String detail;
    private Double discount;
    private Double unitPriceAfterDiscount;

    public Product() {

    }

    public Product(int id, String name, double unitPrice, String detail, double discount, double unitPriceAfterDiscount) {
        super();
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
        this.discount = discount;
        this.unitPriceAfterDiscount=unitPriceAfterDiscount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getUnitPriceAfterDiscount() {
        return this.unitPrice-(this.unitPrice * this.discount/100);
    }















}
