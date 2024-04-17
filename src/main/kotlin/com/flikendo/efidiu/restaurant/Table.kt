package flikendo.efidiu

import Dish

/**
 * This class is used for those items which are tables
 */
class Table(var numPeople: Int, var startersDishes = MutableList<Dish>(), var mainCourses = MutableList<Dish>(),
            var desserts = MutableListOf<Dish> = mutableListOf(), var items: Array<AudioItem> = emptyArray()) {

}