package com.flikendo.efidiu

import com.flikendo.efidiu.database.ConnectionManager
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EfidiuApplication

fun main(args: Array<String>) {
	runApplication<EfidiuApplication>(*args)

//	val  connectionManager = ConnectionManager()
//	connectionManager.connect()

}
