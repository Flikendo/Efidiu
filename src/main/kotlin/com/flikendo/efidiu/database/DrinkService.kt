package com.flikendo.efidiu.database

import ItemBase
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
    fun addItem(itemBase: ItemBase): ItemBase = itemRepository.insert(itemBase)

    /**
     * Updates a drink in MongoDB
     */
    fun updateItem(itemBase: ItemBase){
        val savedDrink: ItemBase = itemRepository
            .findById(itemBase.id)
            .orElseThrow { throw RuntimeException("Cannot find Item by ID") }

        savedDrink.name = itemBase.name
        savedDrink.price = itemBase.price

        itemRepository.save(savedDrink)
    }

    /**
     * Gets all drinks
     */
    fun getAllItems() : List<ItemBase> = itemRepository.findAll()

    /**
     * Gets drinks by name
     */
    fun getItemByName(name:String): ItemBase = itemRepository
        .findByName(name)
        .orElseThrow{
            throw RuntimeException("Cannot find Item by Name")
        }

    /**
     * Deletes a drink
     */
    fun deleteDrink(id: String) = itemRepository.deleteById(id)
}