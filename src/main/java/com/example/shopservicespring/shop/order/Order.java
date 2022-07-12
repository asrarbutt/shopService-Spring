package com.example.shopservicespring.shop.order;



import com.example.shopservicespring.shop.product.Product;

import java.util.List;

public record Order(
        int id,
        List<Product> products
) {
}
