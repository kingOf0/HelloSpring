package com.kingOf0.hellospring.business.concrete

import com.kingOf0.hellospring.business.abstract.IProductService
import com.kingOf0.hellospring.dataaccess.abstract.IProductDAO
import com.kingOf0.hellospring.entity.concrete.Product
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProductManager @Autowired constructor(
    private val productDAO: IProductDAO
) : IProductService {

    override fun getProducts(): List<Product> {
        return productDAO.findAll()
    }

    override fun getProducts(name: String): List<Product> {
        return productDAO.findAll().filter { it.name == name }
    }

}