package com.example.northwind.business.abstracts;

import com.example.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAll();
}
