package com.company.oopProject;


import com.company.oopProject.managers.ProductManager;
import com.company.oopProject.models.Category;
import com.company.oopProject.models.Product;

public class Main {

    public static void main(String[] args) {

        final String category_tag = "-------------CATEGORİES---------";
        final String product_tag = "-------------PRODUCTS---------";
        final String managers_tag = "-------------MANAGERS---------";

        //Classes are reference type..

        Product product1 = new Product(1,"Lenovo",7000,"16 GB Ram");
        Product product2 = new Product(2,"HP",9000,"16 GB Ram");
        Product product3 = new Product(3,"Apple Macbook",15000,"16 GB Ram");
        Product product4 = new Product(4,"Bed",7000,"Comfort");

        Product[] products = {product1,product2,product3,product4};

        System.out.println(product_tag);

        for(Product productDetail:products){
            System.out.println("Product id :"+productDetail.id+" "+"Product Name:"+productDetail.name+" "+
                    "Product Detail:"+productDetail.detail+" "+"Unit Price:"+productDetail.unitPrice);
        }
        //System.out.println(products.length);
        System.out.println(category_tag);

        Category category1= new Category(1,"PC");
        Category category2=new Category(2,"Home/Garden");

        Category[] categories = {category1,category2};

        for(Category categoryDetail:categories){
            System.out.println("Category id :"+categoryDetail.id+" "+"Category Name:"+categoryDetail.name);
        }

        System.out.println(managers_tag);

        ProductManager productManager = new ProductManager();
        productManager.addToCart(product1);
        productManager.addToCart(product2);
        productManager.addToCart(product2);
        productManager.deleteToCart(product2);

    }
}
