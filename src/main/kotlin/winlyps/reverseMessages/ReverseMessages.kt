package winlyps.reverseMessages

import org.bukkit.plugin.java.JavaPlugin

class ReverseMessages : JavaPlugin() {

    override fun onEnable() {
        // Register the event listener
        server.pluginManager.registerEvents(MessageListener(this), this)
        logger.info("ReverseMessages plugin has been enabled.")
    }

    override fun onDisable() {
        logger.info("ReverseMessages plugin has been disabled.")
    }
}