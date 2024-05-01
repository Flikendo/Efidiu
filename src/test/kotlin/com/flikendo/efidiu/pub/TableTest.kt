package com.flikendo.efidiu.pub

import com.flikendo.efidiu.items.Drink
import org.junit.jupiter.api.Test

class TableTest {
    private var tableTest: Table = Table()
    private var drink: Drink = Drink("8", "Coke", 2.80, false)

    @Test
    fun addDrink() {
        tableTest.addDrink(drink)

        println(tableTest.toString())
    }
}