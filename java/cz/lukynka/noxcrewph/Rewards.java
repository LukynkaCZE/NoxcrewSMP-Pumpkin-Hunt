package cz.lukynka.noxcrewph;

import cz.lukynka.noxcrewph.Utils.chat;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.Arrays;

public class Rewards {

    Main main;
    public Rewards(Main plugin) {
        this.main = plugin;
    }

    public static void giveReward(Player player, int number) {
        if(hasFullInventory(player)) {
            chat.sendTranslated(player, "&cYou don't have enough space in your inventory!");
        } else {
            if(number == 1) {
                ItemStack item = new ItemStack(Material.DIAMOND, 6);
                player.getInventory().addItem(item);
            } else if (number == 2) {
                    ItemStack item2 = new ItemStack(Material.WOODEN_SWORD, 1);
                    ItemMeta item2meta = item2.getItemMeta();
                    assert item2meta != null;
                    item2meta.setDisplayName(chat.translated("&6&lNetherblade"));
                    item2meta.addEnchant(Enchantment.DAMAGE_ALL, 6, true);
                    item2meta.addEnchant(Enchantment.DURABILITY, 10, true);
                    item2meta.setLore(Arrays.asList(chat.translated("&r"), chat.translated("&cBrought straight from hell"), chat.translated("&cby an unknown adventurer.."), chat.translated("&r "), chat.translated("&6&lHALLOWEEN 2021 REWARD")));
                    item2.setItemMeta(item2meta);
                    player.getInventory().addItem(item2);
            } else if (number == 3) {
                ItemStack item3 = new ItemStack(Material.PLAYER_HEAD);
                SkullMeta item3meta = (SkullMeta) item3.getItemMeta();
                item3meta.setOwner("TheBustyDuck");
                item3meta.setDisplayName(chat.translated("&6&lCute Little Pumpkin >w<"));
                item3meta.setLore(Arrays.asList(chat.translated("&r"), chat.translated("&7Cool item for house decoration!"), chat.translated("&r"), chat.translated("&6&lHALLOWEEN 2021 REWARD")));
                item3.setItemMeta(item3meta);
                player.getInventory().addItem(item3);
            } else if (number == 4) {
                ItemStack item4 = new ItemStack(Material.BOW, 1);
                ItemMeta item4meta = item4.getItemMeta();
                assert item4meta != null;
                item4meta.setDisplayName(chat.translated("&6&lNetherbow"));
                item4meta.addEnchant(Enchantment.MENDING, 1, true);
                item4meta.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
                item4meta.setLore(Arrays.asList(chat.translated("&r"), chat.translated("&cBrought straight from hell"), chat.translated("&cby an unknown adventurer.."), chat.translated("&r "), chat.translated("&6&lHALLOWEEN 2021 REWARD")));
                item4.setItemMeta(item4meta);
                player.getInventory().addItem(item4);

            } else if(number == 5) {
                ItemStack item5 = new ItemStack(Material.ELYTRA, 1);
                player.getInventory().addItem(item5);
            } else if(number == 6) {
                ItemStack item6 = new ItemStack(Material.SHULKER_SHELL, 16);
                player.getInventory().addItem(item6);
            } else if (number == 7) {
                ItemStack item7 = new ItemStack(Material.GOLDEN_APPLE, 3);
                player.getInventory().addItem(item7);
            } else if (number == 8) {
                ItemStack item8 = new ItemStack(Material.NETHERITE_CHESTPLATE, 1);
                ItemMeta item8meta = item8.getItemMeta();
                assert item8meta != null;
                item8meta.setDisplayName(chat.translated("&6&lNetherplate"));
                item8meta.addEnchant(Enchantment.PROTECTION_FIRE, 7, true);
                item8meta.setLore(Arrays.asList(chat.translated("&r"), chat.translated("&cBrought straight from hell"), chat.translated("&cby an unknown adventurer.."), chat.translated("&r "), chat.translated("&6&lHALLOWEEN 2021 REWARD")));
                item8.setItemMeta(item8meta);
                player.getInventory().addItem(item8);
            } else if(number == 9) {
                ItemStack item9 = new ItemStack(Material.NETHERITE_BOOTS, 1);
                ItemMeta item9meta = item9.getItemMeta();
                assert item9meta != null;
                item9meta.setDisplayName(chat.translated("&b&lSoul Boots"));
                item9meta.addEnchant(Enchantment.SOUL_SPEED, 5, true);
                item9meta.setLore(Arrays.asList(chat.translated("&r"), chat.translated("&cA Generous gift from"), chat.translated("&clost wandering soul.."), chat.translated("&r "), chat.translated("&6&lHALLOWEEN 2021 REWARD")));
                item9.setItemMeta(item9meta);
                player.getInventory().addItem(item9);
            } else if(number == 10) {
                ItemStack item10 = new ItemStack(Material.PAPER, 1);
                ItemMeta item10meta = item10.getItemMeta();
                assert item10meta != null;
                item10meta.setDisplayName(chat.translated("&d&lHyper-smooch"));
                item10meta.setLore(Arrays.asList(chat.translated("&r"), chat.translated("&7A smooch on the lips from Hyper"), chat.translated("&7Contact &dHyperDragun#2014 &7to redeem"), chat.translated("&r "), chat.translated("&6&lHALLOWEEN 2021 REWARD")));
                item10.setItemMeta(item10meta);
                player.getInventory().addItem(item10);
            } else if(number == 11) {
                ItemStack item11 = new ItemStack(Material.DIAMOND, 6);
                player.getInventory().addItem(item11);
            } else if (number == 12) {
                ItemStack item12 = new ItemStack(Material.TOTEM_OF_UNDYING, 1);
                player.getInventory().addItem(item12);
            }
        }
    }


    public static void foundPumpkinSoundEffect(Player player) {
        player.playSound(player.getLocation(), Sound.ENTITY_ITEM_PICKUP, 1, 0);
        player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
        player.playSound(player.getLocation(), Sound.BLOCK_ENCHANTMENT_TABLE_USE, 1, 1);
        chat.sendTranslated(player, "&aYou found a pumpkin!");

    }

    public static boolean hasFullInventory(Player player) {
        return false;
    }

}
