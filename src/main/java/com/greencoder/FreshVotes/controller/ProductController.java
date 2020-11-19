package com.greencoder.FreshVotes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

    @GetMapping("/products")
    public String getProducts(ModelMap modelMap){

        return "products";
    }

    @PostMapping("/products")
    public String createProduct(){

        return "redirect:/products";
    }
}
