package cz.lukynka.noxcrewph.Utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class chat {


    public static String translated(String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }

    public static void sendTranslated(Player player, String msg) {
        msg = ChatColor.translateAlternateColorCodes('&', msg);
        player.sendMessage(msg);
    }

    public static void sendToConsole(String msg) {
        msg = ChatColor.translateAlternateColorCodes('&', msg);
        Bukkit.getConsoleSender().sendMessage(msg);
    }


    public static void broadcast(String msg) {
        msg = ChatColor.translateAlternateColorCodes('&', msg);
        Bukkit.broadcastMessage(msg);
    }
}