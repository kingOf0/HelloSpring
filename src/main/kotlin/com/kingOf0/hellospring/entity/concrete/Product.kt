package com.kingOf0.hellospring.entity.concrete

import javax.persistence.*

@Entity
@Table(name="products")
data class Product(

    @Id
    @GeneratedValue
    @Column(name="product_id")
    val id: String,

    @Column(name="category_id")
    val categoryId: Int,

    @Column(name="product_name")
    val name: String,

    @Column(name="unit_price")
    val price: Double,

    @Column(name="units_in_stock")
    val stock: Short,

    @Column(name="quantity_per_unit")
    val quantity: String
)