package com.emma.Ecommerce.api.controller.product;

import com.emma.Ecommerce.model.Product;
import com.emma.Ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    /*This fetches all the products available in our database. no need to login to use this api,
    This api is whitelisted, so anyone can access it when he or she visit our website.
    https://localhost/8080/product
    */
    @GetMapping
    public List<Product> getProducts() {
        return productService.getProducts();
    }
}
