package com.flikendo.efidiu.operations

import com.flikendo.efidiu.items.Drink
import com.flikendo.efidiu.items.Food

/**
 * Interface with basic operations
 */
interface BasicOperations {
    /**
     * Returns total price. It sums all consumed items
     */
    fun calculateTotalPrice(): Double

    /**
     * Adds a drink to count
     */
    fun addDrink(drink: Drink)

    /**
     * Removes a drink from count
     */
    fun removeDrink(drink: Drink)

    /**
     * Adds food to count
     */
    fun addFood(food: Food)

    /**
     * Removes food from count
     */
    fun removeFood(food: Food)

    /**
     * Print ticket
     */
    fun printTicket(): String
}