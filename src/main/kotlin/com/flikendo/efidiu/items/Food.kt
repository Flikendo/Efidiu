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
    @Id override val id: String,
    @Field override var name: String,
    override var price: Double): ItemBase(id, name, price)