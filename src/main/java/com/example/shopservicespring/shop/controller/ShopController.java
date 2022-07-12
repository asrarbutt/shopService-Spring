package com.example.shopservicespring.shop.controller;

import com.example.shopservicespring.shop.order.Order;
import com.example.shopservicespring.shop.product.Product;
import com.example.shopservicespring.shop.service.ShopService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/")
public class ShopController {

    ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping
    public String mainPage(){
        return shopService.mainPage();
    }

    @GetMapping("products")
    public List<Product> getProducts(){

        return shopService.listProducts();
    }

    @GetMapping(path = "products/{id}")
    public Product getProduct(@PathVariable int id){
        return shopService.getProduct(id);
    }

@GetMapping("orders")
    public List<Order> getOrders(){
        return shopService.listOrders();
    }

    @GetMapping(path = "orders/{id}")
    public Order getOrders(@PathVariable int id){

        return shopService.getOrder(id);
    }

    @PostMapping("orders/{id}")
    public Order postOrder(@RequestBody int id){


        return shopService.getOrder(id);
    }


}
