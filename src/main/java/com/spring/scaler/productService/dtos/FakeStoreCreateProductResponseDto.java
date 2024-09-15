package com.spring.scaler.productService.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreCreateProductResponseDto {

    private Long id;
    private String title;
    private Double price;
    private String image;
    private String description;
    private String category;
}
