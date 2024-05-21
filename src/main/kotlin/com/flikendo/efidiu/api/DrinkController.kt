package com.flikendo.efidiu.api

import com.flikendo.efidiu.items.Drink
import com.flikendo.efidiu.operations.DrinkService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class DrinkController(val service: DrinkService) {
    @GetMapping("/GetDrinks")
    fun index(): List<Drink> = service.findDrinks()

    @PostMapping("/SaveDrink")
    fun post(@RequestBody drink: Drink) {
        service.save(drink)
    }
}