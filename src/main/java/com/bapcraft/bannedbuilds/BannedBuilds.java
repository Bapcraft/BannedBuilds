package com.bapcraft.bannedbuilds;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Main class for the BannedBuilds plugin.
 *
 * @author Kyle Posluns
 */
public class BannedBuilds extends JavaPlugin {

    private static BannedBuilds instance;

    @Override
    public void onEnable() {
        instance = this;
    }

    @Override
    public void onDisable() {
        instance = null;
    }

    public static BannedBuilds getInstance() {
        return instance;
    }

}
