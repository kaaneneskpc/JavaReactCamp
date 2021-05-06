package com.company.architecture.dataAccess.abstracts;

import com.company.architecture.entities.concretes.Product;

import java.util.*;

public interface ProductDao {

    void add(Product product);

    void update(Product product);

    void delete(Product product);

    Product get(int id);

    List<Product> getAll();
}
