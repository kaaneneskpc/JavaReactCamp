package com.company.architecture;

import com.company.architecture.business.abstracts.ProductService;
import com.company.architecture.business.concretes.ProductManager;
import com.company.architecture.core.concretes.jLoggerManagerAdapter;
import com.company.architecture.dataAccess.concretes.HibernateProductDao;
import com.company.architecture.entities.concretes.Product;
import com.company.architecture.jLogger.jLoggerManager;

public class Main {

    public static void main(String[] args) {

        Product pc = new Product();
        pc.setId(1);
        pc.setCategoryId(1);
        pc.setName("HP");
        pc.setUnitPrice(10.000);
        pc.setUnitsInStock(4);

        Product phone = new Product();
        phone.setId(2);
        phone.setCategoryId(2);
        phone.setName("İphone XS");
        phone.setUnitPrice(9.000);
        phone.setUnitsInStock(14);

        //ToDo : To be solved with Spring IOC

        ProductService productService = new ProductManager(new HibernateProductDao(),new jLoggerManagerAdapter());

        productService.add(pc);
        productService.add(phone);

    }
}
