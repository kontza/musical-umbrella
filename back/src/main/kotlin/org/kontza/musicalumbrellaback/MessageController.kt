package org.kontza.musicalumbrellaback

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController(val service: MessageService) {
    @GetMapping("/")
    fun getMessages(): List<Message> = service.getMessages()

    @PostMapping("/")
    fun addPost(@RequestBody message: Message) {
        service.addPost(message)
    }
}
