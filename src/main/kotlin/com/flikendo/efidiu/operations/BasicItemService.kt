package com.flikendo.efidiu.operations

import ItemBase
import com.flikendo.efidiu.INSERTED_LOG
import com.mongodb.kotlin.client.coroutine.MongoDatabase

/**
 * Basic item service. This class is inherited
 */
open class BasicItemService(val mongoDatabase: MongoDatabase) {
    /**
     * Register a new item in MongoDB when administrator have a new product to be registered
     */
    suspend fun registerItem(item: ItemBase, document: String) {
        mongoDatabase
            .getCollection<ItemBase>(document)
            .insertOne(item)
    }

    /**
     * Store an item in MongoDB when a client orders it
     */
    suspend fun storeItem(item: ItemBase, document: String) {
        mongoDatabase
            .getCollection<ItemBase>(document)
            .insertOne(item).also {
                println("$INSERTED_LOG ${it.javaClass} ${it.insertedId}")
            }
    }

    /**
     * Store items in MongoDB when a client orders it
     */
    suspend fun storeItems(items: ArrayList<ItemBase>, document: String) {
        mongoDatabase
            .getCollection<ItemBase>(document)
            .insertMany(items).also {
                println("$INSERTED_LOG ${it.javaClass} ${it.insertedIds}")
            }
    }
}