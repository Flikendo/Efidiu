package com.flikendo.efidiu.items

import ItemBase
import org.springframework.stereotype.Component

/**
 * This class is used for those items which are dishes
 */
@Component
class Dish(val id: String, val name: String, val price: Double): ItemBase(id, name, price)