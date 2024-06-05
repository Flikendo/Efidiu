package com.flikendo.efidiu

import com.flikendo.efidiu.database.ConnectionManager
import com.flikendo.efidiu.items.Drink
import com.flikendo.efidiu.items.Food
import com.flikendo.efidiu.operations.DrinkService
import com.flikendo.efidiu.pub.Table
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

class EfidiuApplicationTests {
	@Test
	fun addDrink() {
		val table = Table()
		val drink1 = Drink("1", "Coke", 3.8)
		val drink2 = Drink("1", "Coke", 3.8)

		table.addDrink(drink1)
		table.addDrink(drink2)

		assertEquals(2, table.drinks.size)
	}

	@Test
	fun addFood() {
		val table = Table()
		val food1 = Food("1", "Spaguetti", 7.5)
		val food2 = Food("1", "Meatballs", 8.0)

		table.addFood(food1)
		table.addFood(food2)

		assertEquals(2, table.foods.size)
	}

	@Test
	fun calculateTotalPrice() {
		val table = Table()
		val drink1 = Drink("1", "Coke", 3.8)
		val drink2 = Drink("2", "Coke", 3.8)
		val food1 = Food("1", "Spaghetti", 7.5)
		val food2 = Food("2", "Meatballs", 8.0)

		table.addDrink(drink1)
		table.addDrink(drink2)
		table.addFood(food1)
		table.addFood(food2)

		assertEquals(drink1.price + drink2.price + food1.price + food2.price, table.calculateTotalPrice())
	}

	@Test
	fun connectToMongo() {
		val connectionManager = ConnectionManager()

		connectionManager.connect()
	}
}
