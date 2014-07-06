package com.dekeyras.finna.handler;

import com.dekeyras.finna.reference.Reference;
import com.dekeyras.finna.utility.Logger;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Keith on 06/07/2014.
 */
public class ConfigurationHandler {
    public static Configuration configuration;

    public static Boolean configValue;

    public static void init(File configFile) {
        if (configuration == null) {
            configuration = new Configuration(configFile);
            LoadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
            // Resync Config
            LoadConfiguration();
        }
    }

    private static void LoadConfiguration() {
        try {
            configuration.load();

            // Load config values
            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true).getBoolean();

        } catch (Exception e) {
            Logger.error(e);
        } finally {
            if (configuration.hasChanged()) {
                configuration.save();
            }
        }
    }
}
