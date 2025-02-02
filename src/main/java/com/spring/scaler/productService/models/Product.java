package com.spring.scaler.productService.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

    private Long id;
    private String title;
    private String description;
    private double price;
    private String imageUrl;
    private String categoryName;
}
