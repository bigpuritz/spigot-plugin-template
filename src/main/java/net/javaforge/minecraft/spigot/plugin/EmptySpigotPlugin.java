package net.javaforge.minecraft.spigot.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class EmptySpigotPlugin extends JavaPlugin {

    public void onEnable() {

        getLogger().info("Enabled EmptySpigotPlugin");

        getCommand("hello").setExecutor(new HelloCommand());
        getCommand("tp").setExecutor(new TeleportCommand());

    }

    @Override
    public void onDisable() {

        getLogger().info("Disabled EmptySpigotPlugin");
    }

}
