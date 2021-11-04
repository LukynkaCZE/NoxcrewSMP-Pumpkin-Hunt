package cz.lukynka.noxcrewph.Events;

import cz.lukynka.noxcrewph.Main;
import cz.lukynka.noxcrewph.Utils.chat;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

public class Join implements Listener {

    Main main;
    public Join(Main plugin) {
        this.main = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        if(player.getScoreboardTags().contains("p12")) {
            if (!(player.getScoreboardTags().contains("sorryrewardp12"))) {
                player.addScoreboardTag("sorryrewardp12");
                sendSorryMessage(player);
                player.removeScoreboardTag("p12");
                player.addScoreboardTag("p12n");
            }
        }
    }


    public void sendSorryMessage(Player player) {
        new BukkitRunnable() {
            @Override
            public void run() {
                chat.sendTranslated(player, "&r ");
                chat.sendTranslated(player, "&aHello! There was bug in our &6Pumpkin Hunt&a event where one of the pumpkins gave players the wrong reward..");
                chat.sendTranslated(player, "&aHere is the proper reward + compensation :D");
                chat.sendTranslated(player, "&r ");
                chat.sendTranslated(player, "&f +1x Totem of Undying &7(Proper reward)");
                chat.sendTranslated(player, "&f +3x Diamond &7(Compensation)");
                chat.sendTranslated(player, "&r ");
                player.playSound(player.getLocation(), Sound.BLOCK_RESPAWN_ANCHOR_CHARGE, 1, 1);
                player.getInventory().addItem(new ItemStack(Material.TOTEM_OF_UNDYING, 1));
                player.getInventory().addItem(new ItemStack(Material.DIAMOND, 3));
            }
        }.runTaskLaterAsynchronously(main, 3 * 20);
    }

}
