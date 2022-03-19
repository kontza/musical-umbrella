package org.kontza.musicalumbrellaback

import org.springframework.stereotype.Service

@Service
class MessageService(val db: MessageRepository) {

    fun getMessages(): List<Message> = db.getMessages()

    fun addMessage(message: Message) {
        db.save(message)
    }
}
