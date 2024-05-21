package com.flikendo.efidiu.operations

import com.flikendo.efidiu.ID_LABEL
import com.flikendo.efidiu.NAME_LABEL
import com.flikendo.efidiu.PRICE_LABEL
import com.flikendo.efidiu.items.Drink
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service

/**
 * This class is used for Mongo CRUD operations
 */
@Service
class DrinkService(val db: JdbcTemplate) {
    /**
     * Look for all drinks
     */
    fun findDrinks(): List<Drink> = db.query("select * from drinks") { response, _ ->
        Drink(response.getString(ID_LABEL),
            response.getString(NAME_LABEL),
            response.getDouble(PRICE_LABEL)
        )
    }

    /**
     * Store a drink in DB
     */
    fun save(drink: Drink) {
        db.update(
            "insert into drinks values ( ?, ?, ? )",
            drink.id, drink.name, drink.price
        )
    }
}