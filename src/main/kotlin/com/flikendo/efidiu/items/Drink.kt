package com.flikendo.efidiu.items

import ItemBase

/**
 * This class is used for those items which are drinks
 */
class Drink(private var id: String, private var name: String, private var price: Double, private var vat: Double,
            private var isAlcoholic: Boolean) : ItemBase(id, name, price, vat) {

    fun applyVat() {
        if (isAlcoholic) {
            vat
            this.price *= vat
        }
    }
}