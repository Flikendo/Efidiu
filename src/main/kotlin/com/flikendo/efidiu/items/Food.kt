package com.flikendo.efidiu.items

import ItemBase
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import org.springframework.stereotype.Component

/**
 * This class is used for those items which are food
 */
@Component
@Document("foods")
data class Food(
    @Id val id: String,
    @Field var name: String,
    var price: Double): ItemBase(id, name, price)