package com.mymod

import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.init.Blocks
import net.minecraft.item.Item
import net.minecraft.util.ResourceLocation
import net.minecraftforge.client.model.ModelLoader
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.registry.ForgeRegistries

@Mod(modid = MyMod.MODID, version = MyMod.VERSION, modLanguage = "scala")
object MyMod {
    final val MODID = "mymod"
    final val VERSION = "1.0"
    final val MODNAME = "mymod"

    @EventHandler
    def init(event: FMLInitializationEvent): Unit = {
        println(s"DIRT BLOCK >> ${Blocks.DIRT.getUnlocalizedName}")
    }

    @Mod.EventHandler
    def preInt(event: FMLInitializationEvent):Unit = {
        val ruby = new Item()
            .setCreativeTab(CreativeTabs.MATERIALS)
            .setUnlocalizedName("ruby")
            .setRegistryName("ruby")
            .setMaxStackSize(64);
        ForgeRegistries.ITEMS.register(ruby);
        ModelLoader.setCustomModelResourceLocation(ruby,0,new ModelResourceLocation(new ResourceLocation("mymod", "ruby"), "inventory"));

    }
}
