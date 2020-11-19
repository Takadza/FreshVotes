package com.greencoder.FreshVotes.controller;

import com.greencoder.FreshVotes.domain.Product;
import com.greencoder.FreshVotes.domain.User;
import com.greencoder.FreshVotes.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public String getProducts(ModelMap modelMap){

        return "products";
    }

    @GetMapping("/products/{productId}")
    public String getProduct(@PathVariable Long productId){
        return "products";
    }

    @PostMapping("/products")
    public String createProduct(@AuthenticationPrincipal User user){

        Product product = new Product();

        product.setPublished(false);
        product.setUser(user);

        product = productRepository.save(product);

        return "redirect:/products" + product.getId();
    }
}
