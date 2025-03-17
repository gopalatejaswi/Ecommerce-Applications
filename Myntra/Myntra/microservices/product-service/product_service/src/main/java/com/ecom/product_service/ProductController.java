package com.ecom.product_service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/api")
@RestController
public class ProductController {
    
    @GetMapping("/products")
    public List<String> getproducts(){
        String[] names = {"Laptop","mobile","tablet"};
        List<String> namelist=Arrays.stream(names)
        .collect(Collectors.toList());
        return namelist;
    }
    
}

