package com.company.architecture.business.concretes;

import com.company.architecture.business.abstracts.ProductService;
import com.company.architecture.core.abstracts.LoggerService;
import com.company.architecture.dataAccess.abstracts.ProductDao;
import com.company.architecture.entities.concretes.Product;


import java.util.List;

public class ProductManager implements ProductService {

    private ProductDao productDao;
    private LoggerService loggerService;


    public ProductManager(ProductDao productDao,LoggerService loggerService) {
        super();
        this.productDao = productDao;
        this.loggerService=loggerService;
    }

    @Override
    public void add(Product product) {
        if(product.getCategoryId()==1){

            System.out.println("This category not accept product");
            return;
        }
        this.productDao.add(product);
        this.loggerService.logToSystem("Product added and logged : "+" "+product.getName());


    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
