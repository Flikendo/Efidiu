package com.flikendo.efidiu.items

import ItemBase
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component

/**
 * This class is used for those items which are drinks
 */
@Component
class Drink(var id: String, var name: String, var price: Double, var isAlcoholic: Boolean,
            @Value("\${drink.alcoholic.vat}") var alcoholic: Double,
            @Value("\${drink.no.alcoholic.vat}") var noAlcoholic: Double) : ItemBase(id, name, price) {

    /**
     * Applies alcoholic vat or no alcoholic vat
     */
    fun applyVat() {
        this.price *= if (isAlcoholic) alcoholic else noAlcoholic
    }

    /**
     * Overrides toString() function
     */
    override fun toString(): String {
        return "Drink(id='$id', name='$name', price=$price, isAlcoholic=$isAlcoholic,)" //+
//                " alcoholicDrink='$alcoholicDrink', noAlcoholicDrink='$noAlcoholicDrink')"
    }
}