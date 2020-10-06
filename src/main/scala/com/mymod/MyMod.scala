package com.mymod

import net.minecraft.init.Blocks
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.FMLInitializationEvent

@Mod(modid = MyMod.MODID, version = MyMod.VERSION, modLanguage = "scala")
object MyMod {
    final val MODID = "mymod"
    final val VERSION = "1.0"

    @EventHandler
    def init(event: FMLInitializationEvent): Unit = {
        println(s"DIRT BLOCK >> ${Blocks.DIRT.getUnlocalizedName}")
    }
}
