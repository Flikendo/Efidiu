package com.flikendo.efidiu.items

import ItemBase
import org.springframework.beans.factory.annotation.Value

/**
 * This class is used for those items which are drinks
 */
class Drink(private var id: String, private var name: String, var price: Double, private var vat: Double,
            private var isAlcoholic: Boolean) : ItemBase(id, name, price, vat) {

    @Value("\${flikendo.efidiu.alcoholic.drink.vat}")
    lateinit var alcoholicDrink: String

    @Value("\${flikendo.efidiu.no.alcoholic.drink.vat}")
    lateinit var noAlcoholicDrink: String

    /**
     * Applies alcoholic vat or no alcoholic vat
     */
    fun applyVat() {
        if (isAlcoholic) {
            vat = alcoholicDrink.toDouble()

        } else {
            vat = noAlcoholicDrink.toDouble()
        }

        this.price *= vat
    }
}