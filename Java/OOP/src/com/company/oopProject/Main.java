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

        Product product1 = new Product();
        product1.setId(1);
        product1.setName("Lenovo");
        product1.setUnitPrice(7000);
        product1.setDetail("16 GB Ram");
        product1.setDiscount(10.0);

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("HP");
        product2.setUnitPrice(9000);
        product2.setDetail("16 GB Ram");
        product2.setDiscount(15.0);

        Product product3 = new Product();
        product3.setId(3);
        product3.setName("Macbook");
        product3.setUnitPrice(15000);
        product3.setDetail("16 GB Ram");
        product3.setDiscount(07.0);



        Product[] products = {product1,product2,product3};

        System.out.println(product_tag);

        for(Product productDetail:products){
            System.out.println("Product id :"+productDetail.getId()+" "+"Product Name:"+productDetail.getName()+" "+
                    "Product Detail:"+productDetail.getDetail()+" "+"Unit Price:"+productDetail.getUnitPrice()
                    +" "+"Discount Rate:"+productDetail.getDiscount()+" "+"After Discount:"+productDetail.getUnitPriceAfterDiscount());
        }

        System.out.println(category_tag);

        Category category1= new Category(1,"PC");
        Category category2=new Category(2,"Home/Garden");

        Category[] categories = {category1,category2};

        for(Category categoryDetail:categories){
            System.out.println("Category id :"+categoryDetail.getId()+" "+"Category Name:"+categoryDetail.getName());
        }

        System.out.println(managers_tag);

        ProductManager productManager = new ProductManager();
        productManager.addToCart(product1);
        productManager.addToCart(product2);
        productManager.addToCart(product3);
        productManager.deleteToCart(product2);

    }
}
