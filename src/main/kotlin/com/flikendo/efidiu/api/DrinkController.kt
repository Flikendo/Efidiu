package com.flikendo.efidiu.api

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/drink")
class DrinkController() {
//    @PostMapping
//    fun addDrink(@RequestBody drink: Drink): ResponseEntity<String> {
//        drinkService.addItem(drink)
//        return ResponseEntity.status(HttpStatus.CREATED).build()
//    }
//    @PatchMapping
//    fun updateExpense(@RequestBody drink: Drink): ResponseEntity<String>{
//        drinkService.updateItem(drink)
//        return ResponseEntity.ok().build()
//    }
//    @GetMapping
//    fun getAllDrink(): ResponseEntity<List<Drink>>
//            = ResponseEntity.ok(drinkService.getAllItems())
//
//    @GetMapping("/{name}")
//    fun getDrinkByName(@PathVariable name:String) : ResponseEntity<Drink>
//            = ResponseEntity.ok(drinkService.getItemByName(name))
//
//    @DeleteMapping("/{id}")
//    fun deleteExpense(@PathVariable id:String):ResponseEntity<String> {
//        drinkService.deleteDrink(id)
//        return ResponseEntity.status(HttpStatus.NO_CONTENT).build()
//    }
}