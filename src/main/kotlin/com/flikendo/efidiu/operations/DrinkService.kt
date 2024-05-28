package com.flikendo.efidiu.operations

import com.flikendo.efidiu.*
import com.flikendo.efidiu.items.Drink
import com.mongodb.kotlin.client.coroutine.MongoDatabase
import org.springframework.stereotype.Service

/**
 * This class is used for Mongo CRUD operations
 */
@Service
class DrinkService(val mongoDatabase: MongoDatabase) {
    /**
     * Store a drink in MongoDB
     */
    suspend fun storeDrink(drink: Drink) {
        mongoDatabase
            .getCollection<Drink>(DRINKS_DOCUMENT)
            .insertOne(drink).also {
                println("$INSERTED_DRINK_LOG ${it.insertedId}")
            }
    }

    /**
     * Store drinks in MongoDB
     */
    suspend fun storeDrinks(drinks: ArrayList<Drink>) {
        mongoDatabase
            .getCollection<Drink>(DRINKS_DOCUMENT)
            .insertMany(drinks).also {
                println("$INSERTED_DRINK_LOG ${it.insertedIds}")
            }

    }
}