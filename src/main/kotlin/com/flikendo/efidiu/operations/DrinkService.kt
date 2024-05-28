package com.flikendo.efidiu.operations

import com.flikendo.efidiu.*
import com.flikendo.efidiu.items.Drink
import com.mongodb.kotlin.client.coroutine.MongoDatabase
import org.springframework.stereotype.Service

/**
 * This class is used for Mongo CRUD operations
 */
@Service
class DrinkService(mongoDatabase: MongoDatabase): BasicItemService(mongoDatabase)