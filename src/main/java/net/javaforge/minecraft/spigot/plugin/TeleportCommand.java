package net.javaforge.minecraft.spigot.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TeleportCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!label.equalsIgnoreCase("tp"))
            return false;

        Player player = (Player) sender;
        player.teleport(player.getWorld().getSpawnLocation());

        return true;
    }
}
