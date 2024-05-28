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
class FoodService(mongoDatabase: MongoDatabase): BasicItemService(mongoDatabase)