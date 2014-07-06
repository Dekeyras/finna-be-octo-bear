package com.dekeyras.finna;

import com.dekeyras.finna.handler.ConfigurationHandler;
import com.dekeyras.finna.proxy.IProxy;
import com.dekeyras.finna.reference.Reference;
import com.dekeyras.finna.utility.Logger;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID,
        name=Reference.MOD_NAME,
        version=Reference.MOD_VERSION,
        guiFactory = Reference.GUI_FACTORY_CLASS)
public class Finna
{
    @Mod.Instance(Reference.MOD_ID)
    public static Finna instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS,
                serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());

        Logger.info("PreInit complete.");
    }

    @Mod.EventHandler
    public void init(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
