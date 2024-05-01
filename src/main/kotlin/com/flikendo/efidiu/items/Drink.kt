package com.flikendo.efidiu.items

import ItemBase
import org.springframework.beans.factory.annotation.Value

/**
 * This class is used for those items which are drinks
 */
class Drink(private var id: String, private var name: String, var price: Double,
            var isAlcoholic: Boolean) : ItemBase(id, name, price) {

//    @Value("\${flikendo.efidiu.alcoholic.drink.vat}")
//    lateinit var alcoholicDrink: String
//
//    @Value("\${flikendo.efidiu.no.alcoholic.drink.vat}")
//    lateinit var noAlcoholicDrink: String

    /**
     * Applies alcoholic vat or no alcoholic vat
     */
    fun applyVat() {
        this.price *= if (isAlcoholic) 2.0 else 1.0
    }

    /**
     * Overrides toString() function
     */
    override fun toString(): String {
        return "Drink(id='$id', name='$name', price=$price, isAlcoholic=$isAlcoholic,)" //+
//                " alcoholicDrink='$alcoholicDrink', noAlcoholicDrink='$noAlcoholicDrink')"
    }


}