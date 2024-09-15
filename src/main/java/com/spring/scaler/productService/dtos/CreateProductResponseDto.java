package com.spring.scaler.productService.dtos;

import com.spring.scaler.productService.models.Product;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateProductResponseDto {

    private Long id;
    private String title;
    private String description;
    private double price;
    private String imageUrl;

    public static CreateProductResponseDto fromProduct(Product product){

        CreateProductResponseDto responseDto = new CreateProductResponseDto();
        responseDto.setTitle(product.getTitle());
        responseDto.setPrice(product.getPrice());
        responseDto.setDescription(product.getDescription());
        responseDto.setImageUrl(product.getImageUrl());
        responseDto.setId(product.getId());

        return responseDto;
    }
}
