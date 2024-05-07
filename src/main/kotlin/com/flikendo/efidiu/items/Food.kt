package com.flikendo.efidiu.items

import ItemBase
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

/**
 * This class is used for those items which are food
 */
@Component
class Food(private var id: String, private var name: String, var price: Double): ItemBase(id, name, price) {
    @Value("\${food.vat}")
    lateinit var foodVat: String

    /**
     * Applies vat
     */
    fun applyVat() {
        this.price *= foodVat.toDouble()
    }
}