package com.erivalaxl.rabits.repositories;

import com.erivalaxl.rabits.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
