package com.flikendo.efidiu.database

import ItemBase
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query
import org.springframework.stereotype.Repository
import java.util.*

/**
 * Repository for items
 */
@Repository
interface ItemRepository: MongoRepository<ItemBase, String>  {
    @Query("{'name': ?0}")
    fun findByName(name: String): Optional<ItemBase>
}