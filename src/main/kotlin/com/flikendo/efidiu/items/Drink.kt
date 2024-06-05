package com.flikendo.efidiu.items

import ItemBase
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import org.springframework.stereotype.Component

/**
 * This class is used for those items which are drinks
 */
@Component
@Document("drinks")
data class Drink(
    @Id val id: String,
    @Field var name: String,
    var price: Double) : ItemBase(id, name, price) {

    /**
     * Overrides toString() function
     */
    override fun toString(): String {
        return "Drink(id='$id', name='$name', price=$price)"
    }
}