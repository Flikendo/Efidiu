package com.flikendo.efidiu.database

import com.mongodb.ConnectionString
import com.mongodb.MongoClientSettings
import com.mongodb.ServerApi
import com.mongodb.ServerApiVersion
import com.mongodb.kotlin.client.coroutine.MongoClient
import kotlinx.coroutines.runBlocking
import org.bson.Document

/**
 * Connection manager class
 */
class ConnectionManager {

    fun connect() {
        val connectionString = "mongodb+srv://Flikendo:Flikendo125@clustera.hbi0mtb.mongodb.net/?retryWrites=true&w=majority&appName=ClusterA"

        val serverApi = ServerApi.builder()
            .version(ServerApiVersion.V1)
            .build()

        val mongoClientSettings = MongoClientSettings.builder()
            .applyConnectionString(ConnectionString(connectionString))
            .serverApi(serverApi)
            .build()

        // Create a new client and connect to the server
        val client = MongoClient.create(mongoClientSettings).use { mongoClient ->
            val database = mongoClient.getDatabase("admin")

            runBlocking {
                database.runCommand(Document("ping", 1))
            }

            println("Pinged your deployment. You successfully connected to MongoDB!")
        }
    }
}