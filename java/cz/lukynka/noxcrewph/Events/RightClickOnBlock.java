package cz.lukynka.noxcrewph.Events;

import cz.lukynka.noxcrewph.Main;
import cz.lukynka.noxcrewph.Rewards;
import cz.lukynka.noxcrewph.Utils.chat;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class RightClickOnBlock implements Listener {

    Main main;
    public RightClickOnBlock(Main plugin) {
        this.main = plugin;
    }



    public void sendAlreadyFoundActionbar(Player player) {
        String message = chat.translated("&c&lYou have already found this pumpkin!");
        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(message));
        player.playSound(player.getLocation(), Sound.ENTITY_SILVERFISH_AMBIENT, (float) 0.3, 1);
    }

    public void sendFoundActionbar(Player player) {
        String message = chat.translated("&a&lYou have found a pumpkin!");
        new BukkitRunnable() {
            @Override
            public void run() {
                player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(message));
            }
        }.runTaskLaterAsynchronously(main, 1);

    }


    @EventHandler
    public void pumpkinRightClick(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if(event.getClickedBlock() == null) return;
        assert event.getClickedBlock() != null;
        int x = event.getClickedBlock().getX();
        int y = event.getClickedBlock().getY();
        int z = event.getClickedBlock().getZ();
        String xyz = "" +x +" " +y +" " +z;
        if(event.getClickedBlock().getType() == Material.PLAYER_HEAD) {
            //chat.sendTranslated(player, xyz);





            if(xyz.equals("-250 71 128")) {
                if(player.getScoreboardTags().contains("p1")) {
                    sendAlreadyFoundActionbar(player);
                    return;
                }
                if(!Rewards.hasFullInventory(player)) {
                    Rewards.foundPumpkinSoundEffect(player);
                    Rewards.giveReward(player, 1);
                    player.addScoreboardTag("p1");
                    sendFoundActionbar(player);
                    return;
                }
            }





            if(xyz.equals("-220 64 95")) {
                if(player.getScoreboardTags().contains("p2")) {
                    sendAlreadyFoundActionbar(player);
                    return;
                }
                if(!Rewards.hasFullInventory(player)) {
                    Rewards.foundPumpkinSoundEffect(player);
                    Rewards.giveReward(player, 2);
                    player.addScoreboardTag("p2");
                    sendFoundActionbar(player);
                    return;
                }
            }





            if(xyz.equals("-204 64 116")) {
                if(player.getScoreboardTags().contains("p3")) {
                    sendAlreadyFoundActionbar(player);
                    return;
                }
                if(!Rewards.hasFullInventory(player)) {
                    player.addScoreboardTag("p3");
                    Rewards.foundPumpkinSoundEffect(player);
                    Rewards.giveReward(player, 3);
                    sendFoundActionbar(player);
                    return;
                }
            }





            if(xyz.equals("-196 65 143")) {
                if(player.getScoreboardTags().contains("p4")) {
                    sendAlreadyFoundActionbar(player);
                    return;
                }
                if(!Rewards.hasFullInventory(player)) {
                    Rewards.foundPumpkinSoundEffect(player);
                    Rewards.giveReward(player, 4);
                    player.addScoreboardTag("p4");
                    sendFoundActionbar(player);
                    return;
                }
            }





            if(xyz.equals("-199 74 91")) {
                if(player.getScoreboardTags().contains("p5")) {
                    sendAlreadyFoundActionbar(player);
                    return;
                }
                if(!Rewards.hasFullInventory(player)) {
                    Rewards.foundPumpkinSoundEffect(player);
                    Rewards.giveReward(player, 5);
                    player.addScoreboardTag("p5");
                    sendFoundActionbar(player);
                    return;

                }
            }





            if(xyz.equals("-222 93 131")) {
                if(player.getScoreboardTags().contains("p6")) {
                    sendAlreadyFoundActionbar(player);
                    return;
                }
                if(!Rewards.hasFullInventory(player)) {
                    Rewards.foundPumpkinSoundEffect(player);
                    Rewards.giveReward(player, 6);
                    player.addScoreboardTag("p6");
                    sendFoundActionbar(player);
                    return;
                }
            }





            if(xyz.equals("-225 71 149")) {
                if(player.getScoreboardTags().contains("p7")) {
                    sendAlreadyFoundActionbar(player);
                    return;
                }
                if(!Rewards.hasFullInventory(player)) {
                    Rewards.foundPumpkinSoundEffect(player);
                    Rewards.giveReward(player, 7);
                    player.addScoreboardTag("p7");
                    sendFoundActionbar(player);
                    return;

                }
            }





            if(xyz.equals("-249 71 135")) {
                if(player.getScoreboardTags().contains("p8")) {
                    sendAlreadyFoundActionbar(player);
                    return;
                }
                if(!Rewards.hasFullInventory(player)) {
                    Rewards.foundPumpkinSoundEffect(player);
                    Rewards.giveReward(player, 8);
                    player.addScoreboardTag("p8");
                    sendFoundActionbar(player);
                    return;
                }
            }





            if(xyz.equals("-255 64 97")) {
                if(player.getScoreboardTags().contains("p9")) {
                    sendAlreadyFoundActionbar(player);
                    return;
                }
                if(!Rewards.hasFullInventory(player)) {
                    Rewards.foundPumpkinSoundEffect(player);
                    Rewards.giveReward(player, 9);
                    player.addScoreboardTag("p9");
                    sendFoundActionbar(player);
                    return;
                }
            }





            if(xyz.equals("-216 65 126")) {
                if(player.getScoreboardTags().contains("p10")) {
                    sendAlreadyFoundActionbar(player);
                    return;
                }
                if(!Rewards.hasFullInventory(player)) {
                    Rewards.foundPumpkinSoundEffect(player);
                    Rewards.giveReward(player, 10);
                    player.addScoreboardTag("p10");
                    sendFoundActionbar(player);
                    return;
                }
            }





            if(xyz.equals("-255 72 116")) {
                if(player.getScoreboardTags().contains("p11")) {
                    sendAlreadyFoundActionbar(player);
                    return;
                }
                if(!Rewards.hasFullInventory(player)) {
                    Rewards.foundPumpkinSoundEffect(player);
                    Rewards.giveReward(player, 11);
                    player.addScoreboardTag("p11");
                    sendFoundActionbar(player);
                    return;
                }
            }





            if(xyz.equals("-265 54 103")) {
                if(player.getScoreboardTags().contains("p12n")) {
                    sendAlreadyFoundActionbar(player);
                    return;
                }
                if(!Rewards.hasFullInventory(player)) {
                    Rewards.foundPumpkinSoundEffect(player);
                    Rewards.giveReward(player, 12);
                    player.addScoreboardTag("p12n");
                    sendFoundActionbar(player);
                }
            }


        }
    }

}
