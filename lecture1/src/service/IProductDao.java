package service;

import product.Product;

public interface IProductDao {
    void add(Product product);
    Product findById(int id);
}
