package ninja.shadowfox.shadowfox_botany.common.core.proxy

import cpw.mods.fml.common.event.FMLInitializationEvent
import cpw.mods.fml.common.event.FMLPostInitializationEvent
import cpw.mods.fml.common.event.FMLPreInitializationEvent
import ninja.shadowfox.shadowfox_botany.common.blocks.ShadowFoxBlocks
import ninja.shadowfox.shadowfox_botany.common.brew.ShadowFoxPotions
import ninja.shadowfox.shadowfox_botany.common.core.handler.ConfigHandler
import ninja.shadowfox.shadowfox_botany.common.crafting.ModRecipes
import ninja.shadowfox.shadowfox_botany.common.entity.ShadowFoxEntity
import ninja.shadowfox.shadowfox_botany.common.item.ShadowFoxItems
import ninja.shadowfox.shadowfox_botany.common.lexicon.LexiconRegistry

public open class CommonProxy
{
    open fun preInit(event: FMLPreInitializationEvent){

        ConfigHandler.loadConfig(event.suggestedConfigurationFile)

        ShadowFoxBlocks
        ShadowFoxItems
        ModRecipes
        ShadowFoxEntity
        ShadowFoxPotions
        LexiconRegistry
    }

    open fun init(event: FMLInitializationEvent) {
    }

    open fun postInit(event: FMLPostInitializationEvent){
        ConfigHandler.loadPostInit()
//        ShadowFoxBlocks.registerMultiparts()
    }
}