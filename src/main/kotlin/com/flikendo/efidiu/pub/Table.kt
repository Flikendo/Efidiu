package com.flikendo.efidiu.pub

import com.flikendo.efidiu.items.Drink
import com.flikendo.efidiu.items.Food
import com.flikendo.efidiu.pub.operations.BasicOperations

/**
 * This class is used for tables which are in pubs
 */
class Table: BasicOperations {
    private var drinks: ArrayList<Drink> = arrayListOf()
    private var foods: ArrayList<Food> = arrayListOf()
    private var totalPrice: Double = 0.0

    /**
     * Returns total price. It sums all drinks items
     */
    override fun getTotalPrice(): Double {
        for (drink in drinks) {
            totalPrice += drink.finalPrice
        }

        for (food in foods) {
            totalPrice += food.finalPrice
        }

        return totalPrice
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
}