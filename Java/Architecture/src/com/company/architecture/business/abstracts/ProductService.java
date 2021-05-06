package com.company.architecture.business.abstracts;

import com.company.architecture.entities.concretes.Product;

import java.util.*;

public interface ProductService {

    void add(Product product);
    List<Product> getAll();

}
