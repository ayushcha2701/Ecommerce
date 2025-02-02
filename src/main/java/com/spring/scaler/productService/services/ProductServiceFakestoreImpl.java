package com.spring.scaler.productService.services;

import com.spring.scaler.productService.dtos.FakeStoreCreateProductRequestDto;
import com.spring.scaler.productService.dtos.FakeStoreCreateProductResponseDto;
import com.spring.scaler.productService.models.Product;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("fakeStoreProductService")
public class ProductServiceFakestoreImpl implements ProductService{


    private RestTemplate restTemplate;

    public ProductServiceFakestoreImpl(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }


    @Override
    public Product createProduct(Product product) {

        FakeStoreCreateProductRequestDto request = new FakeStoreCreateProductRequestDto();
        request.setCategory(product.getCategoryName());
        request.setTitle(product.getTitle());
        request.setDescription(product.getDescription());
        request.setPrice(product.getPrice());
        request.setImage(product.getImageUrl());

        FakeStoreCreateProductResponseDto response  =restTemplate.postForObject("https://fakestoreapi.com/products", request,
                FakeStoreCreateProductResponseDto.class
                );

        Product product1 = new Product();
        product1.setId(response.getId());
        product1.setImageUrl(response.getImage());
        product1.setTitle(response.getTitle());
        product1.setCategoryName(response.getCategory());
        product1.setPrice(response.getPrice());
        product1.setDescription(response.getDescription());

        return product1;
    }
}
