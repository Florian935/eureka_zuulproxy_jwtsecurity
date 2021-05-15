package com.florian935.productservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Value("${server.port}")
    private int port;

    @Value("${environment}")
    private String environment;

    @GetMapping("/products")
    public String getAll() {
        return "Produit 1, Produit 2, Produit 3, Port: " + port + ", Environment: " + environment;
    }
}
