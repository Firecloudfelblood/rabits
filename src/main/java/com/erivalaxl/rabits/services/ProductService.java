package com.erivalaxl.rabits.services;

import com.erivalaxl.rabits.commands.ProductForm;
import com.erivalaxl.rabits.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> listAll();
    Product getById(Long id);
    Product saveOrUpdate(Product product);
    void delete(Long id);
    Product saveOrUpdateForm(ProductForm productForm);
    void sendProductMessage(String id);

}
