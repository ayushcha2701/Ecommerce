package com.spring.scaler.productService.dtos;


import com.spring.scaler.productService.models.Product;
import com.spring.scaler.productService.services.ProductService;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateProductRequestDto {

    private String title;
    private String description;
    private double price;
    private String imageUrl;
    private String categoryName;


    public Product toProduct(){

        Product product = new Product();
        product.setTitle(this.title);
        product.setPrice(this.price);
        product.setDescription(this.description);
        product.setImageUrl(this.imageUrl);
        product.setCategoryName(this.categoryName);

        return product;
    }
}
