package com.flikendo.efidiu.operations

import com.flikendo.efidiu.*
import com.flikendo.efidiu.items.Drink
import com.flikendo.efidiu.items.Food
import com.mongodb.kotlin.client.coroutine.MongoDatabase
import org.springframework.stereotype.Service

/**
 * This class is used for Mongo CRUD operations
 */
@Service
class FoodService(val mongoDatabase: MongoDatabase) {
    /**
     * Store a food in MongoDB
     */
    suspend fun storeFood(food: Food) {
        mongoDatabase
            .getCollection<Food>(FOODS_DOCUMENT)
            .insertOne(food).also {
                println("$INSERTED_FOOD_LOG ${it.insertedId}")
            }
    }

    /**
     * Store foods in MongoDB
     */
    suspend fun storeFoods(foods: ArrayList<Food>) {
        mongoDatabase
            .getCollection<Food>(FOODS_DOCUMENT)
            .insertMany(foods).also {
                println("$INSERTED_FOOD_LOG ${it.insertedIds}")
            }

    }
}