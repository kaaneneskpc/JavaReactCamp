package com.company.architecture.dataAccess.concretes;

import com.company.architecture.dataAccess.abstracts.ProductDao;
import com.company.architecture.entities.concretes.Product;

import java.util.List;

public class HibernateProductDao implements ProductDao {

    @Override
    public void add(Product product) {
        System.out.println("Added with Hibernate"+" "+product.getName());
    }

    @Override
    public void update(Product product) {
        System.out.println("Updated with Hibernate"+" "+product.getName());
    }

    @Override
    public void delete(Product product) {
        System.out.println("Deleted with Hibernate"+" "+product.getName());
    }

    @Override
    public Product get(int id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
