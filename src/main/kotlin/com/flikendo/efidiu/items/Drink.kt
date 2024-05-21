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
data class Drink(val id: String, val name: String, val price: Double) : ItemBase(id, name, price) {
    /**
     * Overrides toString() function
     */
    override fun toString(): String {
        return "Drink(id='$id', name='$name', price=$price)"
    }
}