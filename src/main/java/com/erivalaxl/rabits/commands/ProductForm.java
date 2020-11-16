package com.erivalaxl.rabits.commands;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductForm {
    private Long id;
    private String description;
    private BigDecimal price;
    private String imageUrl;
}
