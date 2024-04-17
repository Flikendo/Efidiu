package com.flikendo.efidiu.restaurant.operations

interface BasicOperations {
    /**
     * Returns total table price. It sums all dishes and menu's of the table
     */
    fun getTotalPrice()

    /**
     * Adds a menu to count
     */
    fun addMenu()

    /**
     * Removes a menu from count
     */
    fun removeMenu()

    /**
     * Adds an item to count
     */
    fun addItem()

    /**
     * Removes an item from count
     */
    fun removeItem()
}