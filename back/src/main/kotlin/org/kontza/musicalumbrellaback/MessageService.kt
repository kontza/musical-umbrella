package org.kontza.musicalumbrellaback
import org.springframework.stereotype.Service

@Service
class MessageService(val db: MessageRepository) {

    fun getMessages(): List<Message> = db.getMessages()

    fun addPost(message: Message){
        db.save(message)
    }
}
