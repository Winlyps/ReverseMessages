package winlyps.reverseMessages

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.AsyncPlayerChatEvent

class MessageListener(private val plugin: ReverseMessages) : Listener {

    @EventHandler
    fun onPlayerChat(event: AsyncPlayerChatEvent) {
        val originalMessage = event.message
        val reversedMessage = originalMessage.reversed()
        event.message = reversedMessage
    }
}