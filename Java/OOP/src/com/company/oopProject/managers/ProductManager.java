package com.company.oopProject.managers;

import com.company.oopProject.models.Product;

public class ProductManager {

    public void addToCart(Product product){
        System.out.println(product.getName()+" "+"Added to Cart");
    }
    public void deleteToCart(Product product){

        System.out.println(product.getName()+" "+"Deleted to Cart");
    }
}
