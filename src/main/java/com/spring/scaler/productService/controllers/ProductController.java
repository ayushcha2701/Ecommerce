package com.spring.scaler.productService.controllers;

import com.spring.scaler.productService.dtos.CreateProductRequestDto;
import com.spring.scaler.productService.dtos.CreateProductResponseDto;
import com.spring.scaler.productService.models.Product;
import com.spring.scaler.productService.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

      private ProductService productService;


      public ProductController(@Qualifier("fakeStoreProductService") ProductService productService){
            this.productService = productService;
      }

      @PostMapping
        public CreateProductResponseDto createProduct(@RequestBody CreateProductRequestDto createProductRequestDto){

            Product product = productService.createProduct(
                    createProductRequestDto.toProduct()
            );

            return CreateProductResponseDto.fromProduct(product);
      }

      @GetMapping
      public void getAllProducts(){

      }

      @GetMapping("{id}")
      public void getSingleProduct(@PathVariable Long id){

      }

      @DeleteMapping("{id}")
      public void deleteProduct(@PathVariable Long id){

      }

      @PatchMapping
      public void updateProduct(){}

      @PutMapping
      public void replaceProduct(){}
}
