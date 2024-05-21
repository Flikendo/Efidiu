package com.flikendo.efidiu.operations

import com.flikendo.efidiu.items.Drink
import com.flikendo.efidiu.items.Food
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service

/**
 * This class is used for Mongo CRUD operations
 */
@Service
class FoodService(val db: JdbcTemplate) {
    /**
     * Look for all drinks
     */
    fun findFoods(): List<Food> = db.query("select * from drinks") { response, _ ->
        Food(response.getString("id"),
            response.getString("name"),
            response.getDouble("price")
        )
    }

    /**
     * Store a drink in DB
     */
    fun save(food: Food) {
        db.update(
            "insert into drinks values ( ?, ?, ? )",
            food.id, food.name, food.price
        )
    }
}