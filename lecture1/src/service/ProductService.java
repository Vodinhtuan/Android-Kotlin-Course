package service;

import product.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductService implements IProductDao{
    private Map<Integer, Product> productMap = new HashMap<Integer, Product>();

    @Override
    public void add(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }
}
