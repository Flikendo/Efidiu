package com.flikendo.efidiu.database

import com.flikendo.efidiu.items.Drink
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Service for drink items
 */
@Service
class DrinkService(@Autowired val drinkRepository: DrinkRepository) {
    /**
     * Adds a drink in MongoDB
     */
    fun addDrink(drink: Drink): Drink = drinkRepository.insert(drink)

    /**
     * Updates a drink in MongoDB
     */
    fun updateDrink(drink: Drink){
        val savedDrink: Drink = drinkRepository
            .findById(drink.id)
            .orElseThrow { throw RuntimeException("Cannot find Drink by ID") }

        savedDrink.name = drink.name
        savedDrink.price = drink.price

        drinkRepository.save(savedDrink)
    }

    /**
     * Gets all drinks
     */
    fun getAllDrinks() : List<Drink> = drinkRepository.findAll()

    /**
     * Gets drinks by name
     */
    fun getDrinkByName(name:String): Drink = drinkRepository
        .findByName(name)
        .orElseThrow{
            throw RuntimeException("Cannot find Drink by Name")
        }

    /**
     * Deletes a drink
     */
    fun deleteDrink(id: String) = drinkRepository.deleteById(id)
}