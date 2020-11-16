package com.erivalaxl.rabits.converters;

import com.erivalaxl.rabits.commands.ProductForm;
import com.erivalaxl.rabits.domain.Product;
import org.springframework.core.convert.converter.Converter;

public class ProductToFormProduct implements Converter<Product, ProductForm> {

    @Override
    public ProductForm convert(Product product) {
        ProductForm productForm = new ProductForm();
        productForm.setId(product.getId());
        productForm.setDescription(product.getDescription());
        productForm.setPrice(product.getPrice());
        productForm.setImageUrl(product.getImageUrl());
        return productForm;
    }
}
