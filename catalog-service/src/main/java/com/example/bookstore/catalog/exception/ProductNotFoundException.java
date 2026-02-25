package com.example.bookstore.catalog.exception;

public class ProductNotFoundException extends RuntimeException {

    public  ProductNotFoundException (String message){
        super(message);
    }

    public static ProductNotFoundException forCode(String code){
        return new ProductNotFoundException("product with code "+code+ " not found ");
    }
}
