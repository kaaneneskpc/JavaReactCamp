package com.company.oopProject.managers;

import com.company.oopProject.models.Product;

public class ProductManager {

    public void addToCart(Product product){
        System.out.println(product.name+" "+"Added to Cart");
    }
    public void deleteToCart(Product product){
        System.out.println(product.name+" "+"Deleted to Cart");
    }
}
