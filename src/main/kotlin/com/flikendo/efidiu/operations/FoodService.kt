package com.flikendo.efidiu.operations

import com.flikendo.efidiu.ID_LABEL
import com.flikendo.efidiu.NAME_LABEL
import com.flikendo.efidiu.PRICE_LABEL
import com.flikendo.efidiu.items.Food
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service

/**
 * This class is used for Mongo CRUD operations
 */
@Service
class FoodService(val db: JdbcTemplate) {
    /**
     * Look for all foods
     */
    fun findFoods(): List<Food> = db.query("select * from foods") { response, _ ->
        Food(response.getString(ID_LABEL),
            response.getString(NAME_LABEL),
            response.getDouble(PRICE_LABEL)
        )
    }

    /**
     * Stores a food in database
     */
    fun save(food: Food) {
        db.update(
            "insert into foods values ( ?, ?, ? )",
            food.id, food.name, food.price
        )
    }

    /**
     * Removes food from database
     */
    fun remove(food: Food) = db.query("delete * from foods") { response, _ ->
        Food(response.getString(ID_LABEL),
            response.getString(NAME_LABEL),
            response.getDouble(PRICE_LABEL)
        )
    }
}