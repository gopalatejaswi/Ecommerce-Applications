package com.ecom.customer_service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/api")
@RestController
@SuppressWarnings("unchecked")
public class abc {
    RestTemplate rest;

    @GetMapping("/customer")
    public List<String> getproducts() {
        String[] names = { "A", "M", "t" };
        List<String> namelist = Arrays.stream(names)
                .collect(Collectors.toList());
        return namelist;
    }

    @SuppressWarnings("unchecked")
    @GetMapping("/products")
    public List<String> getUserData() {
        rest = new RestTemplate();
        return rest.getForObject("http://localhost:5555/api/products", List.class);
    }
}
