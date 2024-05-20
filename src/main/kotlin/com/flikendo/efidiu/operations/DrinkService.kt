package com.flikendo.efidiu.operations

import org.springframework.stereotype.Service

/**
 * This class is used for Mongo CRUD operations
 */
@Service
class MongoService {
    fun findMessages(): List<Message> = db.query("select * from messages") { response, _ ->
        Message(response.getString("id"), response.getString("text"))
    }

    fun save(message: Message) {
        db.update(
            "insert into messages values ( ?, ? )",
            message.id, message.text
        )
    }
}