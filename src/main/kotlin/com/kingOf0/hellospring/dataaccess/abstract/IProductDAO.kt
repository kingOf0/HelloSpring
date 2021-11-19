package com.kingOf0.hellospring.dataaccess.abstract

import com.kingOf0.hellospring.entity.concrete.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface IProductDAO : JpaRepository<Product, Int> {
}