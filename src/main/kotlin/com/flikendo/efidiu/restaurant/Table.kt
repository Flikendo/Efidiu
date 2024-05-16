package com.flikendo.efidiu.restaurant

import com.flikendo.efidiu.items.Drink
import com.flikendo.efidiu.items.Food
import com.flikendo.efidiu.operations.BasicRestaurantOperations

//import Dish

/**
 * This class is used for those items which are tables
 */
class Table: BasicRestaurantOperations {
    private val drinks: ArrayList<Drink> = arrayListOf()
    private val foods: ArrayList<Food> = arrayListOf()
    private var totalPrice: Double = 0.0

    /**
     * Returns total price. It sums all drinks items
     */
    override fun calculateTotalPrice(): Double {
        TODO("Not yet implemented")
    }

    /**
     * Adds a menu to count
     */
    override fun addMenu() {
        TODO("Not yet implemented")
    }

    /**
     * Removes a menu from count
     */
    override fun removeMenu() {
        TODO("Not yet implemented")
    }

    /**
     * Adds a drink or food to count. This is call when client doesn't want a menu
     */
    override fun addItem() {
        TODO("Not yet implemented")
    }

    /**
     * Removes a drink or food to count. This is call when client doesn't want a menu
     */
    override fun removeItem() {
        TODO("Not yet implemented")
    }

    /**
     * Adds a drink to count
     */
    override fun addDrink(drink: Drink) {
        this.drinks.add(drink)
    }

    /**
     * Removes a drink from count
     */
    override fun removeDrink(drink: Drink) {
        this.drinks.remove(drink)
    }

    /**
     * Adds food to count
     */
    override fun addFood(food: Food) {
        this.foods.add(food)
    }

    /**
     * Removes food from count
     */
    override fun removeFood(food: Food) {
        this.foods.remove(food)
    }

    /**
     * Prints ticket
     */
    override fun printTicket(): String {
        return "Table(drinks = ${drinks}, foods = $foods, totalPrice = $totalPrice)"
    }

    /**
     * Overrides toString() function
     */
    override fun toString(): String {
        return "Table(drinks=$drinks, foods=$foods, totalPrice=$totalPrice)"
    }
}