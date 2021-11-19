package com.kingOf0.hellospring.business.abstract

import com.kingOf0.hellospring.entity.concrete.Product

interface IProductService {

    fun getProducts() : List<Product>

    fun getProducts(name :String) : List<Product>

}
