package cz.lukynka.noxcrewph;

import cz.lukynka.noxcrewph.Events.Join;
import cz.lukynka.noxcrewph.Events.RightClickOnBlock;
import cz.lukynka.noxcrewph.Utils.chat;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public final String pluginVer = this.getDescription().getVersion();
    public final String system = Bukkit.getServer().getName();
    public final String author = "LukynkaCZE";
    public final String prefix = chat.translated("&8[&6Pumpkin Hunt&8] ");
    public final boolean isDev = false;

    @Override
    public void onEnable() {
        chat.sendToConsole("&r ");
        chat.sendToConsole(prefix +"&aPlugin Loaded!");
        chat.sendToConsole(prefix +"&7Running version &b " +pluginVer +"&7 on &e" +system);
        chat.sendToConsole(prefix +"&7Author: &dLukynkaCZE &7| &bwww.lukynka.cz");
        chat.sendToConsole("&r ");
        if(isDev) {
            chat.sendToConsole(prefix +"&7You are running &4Developer Version&7!");
            chat.sendToConsole(prefix +"&7Please switch to &bStable Release&7 as soon as possible!");
            chat.sendToConsole("&r ");
        }


        new Rewards(this);

        Bukkit.getServer().getPluginManager().registerEvents(new Join(this), this);
        Bukkit.getServer().getPluginManager().registerEvents(new RightClickOnBlock(this), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        chat.sendToConsole("&r ");
        chat.sendToConsole(prefix +"&7See you next time!");
        chat.sendToConsole("&r ");
    }
}
