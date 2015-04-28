package com.amshulman.nametag;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class NametagPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new NametagListener(), this);
    }
}
