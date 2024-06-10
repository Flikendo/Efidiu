package com.flikendo.efidiu.database

import com.flikendo.efidiu.items.Drink
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Service for drink items
 */
@Service
class DrinkService(@Autowired val itemRepository: ItemRepository) {
    /**
     * Adds a drink in MongoDB
     */
    fun addItem(drink: Drink): Drink = itemRepository.insert(drink)

    /**
     * Updates a drink in MongoDB
     */
    fun updateItem(drink: Drink){
        val savedDrink: Drink = itemRepository
            .findById(drink.id)
            .orElseThrow { throw RuntimeException("Cannot find Item by ID") }

        savedDrink.name = drink.name
        savedDrink.price = drink.price

        itemRepository.save(savedDrink)
    }

    /**
     * Gets all drinks
     */
    fun getAllItems() : List<Drink> = itemRepository.findAll()

    /**
     * Gets drinks by name
     */
    fun getItemByName(name:String): Drink = itemRepository
        .findByName(name)
        .orElseThrow{
            throw RuntimeException("Cannot find Item by Name")
        }

    /**
     * Deletes a drink
     */
    fun deleteDrink(id: String) = itemRepository.deleteById(id)
}