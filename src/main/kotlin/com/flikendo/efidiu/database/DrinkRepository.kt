package com.flikendo.efidiu.database

import com.flikendo.efidiu.items.Drink
import org.springframework.stereotype.Repository
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query
import java.util.*

/**
 * Repository for drink items
 */
@Repository
interface DrinkRepository: MongoRepository<Drink, String>  {
    @Query("{'name': ?0}")
    fun findByName(name: String): Optional<Drink>
}