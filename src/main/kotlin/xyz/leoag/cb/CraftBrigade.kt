package xyz.leoag.cb

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object CraftBrigade : ModInitializer {
    const val MOD_ID = "craft-brigade"
    private val logger = LoggerFactory.getLogger(MOD_ID)

	override fun onInitialize() {
		logger.info("onInitialize called")
	}
}