package com.kingOf0.hellospring.api.controller

import com.kingOf0.hellospring.business.abstract.IProductService
import com.kingOf0.hellospring.entity.concrete.Product
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/products")
class ProductsController @Autowired constructor(
    private val productService: IProductService
){

    @GetMapping("getProducts")
    fun getProducts() : List<Product> {
        return productService.getProducts()
    }

    @GetMapping("getProductsByName")
    fun getProducts(@RequestParam name: String) : List<Product> {
        return productService.getProducts(name)
    }

}