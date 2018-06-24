package com.kobalt66.TestMod3;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class Main 
{
	@Mod(modid = TestMod.MODID, name = TestMod.MODNAME, version = TestMod.VERSION, dependencies = "required-after:Forge@[11.16.0.1865,)", useMetadata = true)
	public class ModTut {

	    @SidedProxy(clientSide = "mcjty.TestMod.proxy.ClientProxy", serverSide = "mcjty.modtut.proxy.ServerProxy")
	    public static CommonProxy proxy;

	    @Mod.Instance
	    public static ModTut instance;

	    public static Logger logger;

	    @Mod.EventHandler
	    public void preInit(FMLPreInitializationEvent event) {
	        logger = event.getModLog();
	        proxy.preInit(event);
	    }

	    @Mod.EventHandler
	    public void init(FMLInitializationEvent e) {
	        proxy.init(e);
	    }

	    @Mod.EventHandler
	    public void postInit(FMLPostInitializationEvent e) {
	        proxy.postInit(e);
	    }
	}
}
