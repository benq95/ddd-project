package pl.messaging.domain

import java.util.*

class Conversation (val id: UUID,
                    val messages: Array<Message>,
                    val members: Array<UUID>,
                    val version: Long) {

    

}