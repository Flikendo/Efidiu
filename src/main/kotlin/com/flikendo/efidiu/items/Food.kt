package com.flikendo.efidiu.items

import ItemBase
import org.bson.codecs.pojo.annotations.BsonId
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

/**
 * This class is used for those items which are food
 */
@Component
data class Food(@BsonId val id: String, val name: String, val price: Double): ItemBase(id, name, price)