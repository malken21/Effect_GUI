package marumasa.effect_gui;

import marumasa.effect_gui.commands.settingInventory;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.chat.TranslatableComponent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Objects;
import java.util.Set;

public class eventListener implements Listener {
    private final minecraft minecraft;
    private final Config config;

    final int time = 2147483647;//int型の最大値
    final int level = 5;

    public eventListener(minecraft data, Config con) {
        minecraft = data;
        config = con;
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        Set<String> UserTags = player.getScoreboardTags();
        if (UserTags.contains("Marumasa.EffectMenuOpen")) {
            event.setCancelled(true);
            if (event.getClickedInventory() == null) return;
            if (event.getClickedInventory().getType() != InventoryType.CHEST) return;

            switch (event.getSlot()) {
                case 0:
                    addEffect(PotionEffectType.SPEED, player);
                    break;
                case 1:
                    addEffect(PotionEffectType.SLOW, player);
                    break;
                case 2:
                    addEffect(PotionEffectType.FAST_DIGGING, player);
                    break;
                case 3:
                    addEffect(PotionEffectType.SLOW_DIGGING, player);
                    break;
                case 4:
                    addEffect(PotionEffectType.INCREASE_DAMAGE, player);
                    break;
                case 5:
                    addEffect(PotionEffectType.HEAL, player);
                    break;
                case 6:
                    addEffect(PotionEffectType.HARM, player);
                    break;
                case 7:
                    addEffect(PotionEffectType.JUMP, player);
                    break;
                case 8:
                    addEffect(PotionEffectType.CONFUSION, player);
                    break;
                case 9:
                    addEffect(PotionEffectType.REGENERATION, player);
                    break;
                case 10:
                    addEffect(PotionEffectType.DAMAGE_RESISTANCE, player);
                    break;
                case 11:
                    addEffect(PotionEffectType.FIRE_RESISTANCE, player);
                    break;
                case 12:
                    addEffect(PotionEffectType.WATER_BREATHING, player);
                    break;
                case 13:
                    addEffect(PotionEffectType.INVISIBILITY, player);
                    break;
                case 14:
                    addEffect(PotionEffectType.BLINDNESS, player);
                    break;
                case 15:
                    addEffect(PotionEffectType.NIGHT_VISION, player);
                    break;
                case 16:
                    addEffect(PotionEffectType.HUNGER, player);
                    break;
                case 17:
                    addEffect(PotionEffectType.WEAKNESS, player);
                    break;
                case 18:
                    addEffect(PotionEffectType.POISON, player);
                    break;
                case 19:
                    addEffect(PotionEffectType.WITHER, player);
                    break;
                case 20:
                    addEffect(PotionEffectType.HEALTH_BOOST, player);
                    break;
                case 21:
                    addEffect(PotionEffectType.ABSORPTION, player);
                    break;
                case 22:
                    addEffect(PotionEffectType.SATURATION, player);
                    break;
                case 23:
                    addEffect(PotionEffectType.GLOWING, player);
                    break;
                case 24:
                    addEffect(PotionEffectType.LEVITATION, player);
                    break;
                case 25:
                    addEffect(PotionEffectType.LUCK, player);
                    break;
                case 26:
                    addEffect(PotionEffectType.UNLUCK, player);
                    break;
                case 27:
                    addEffect(PotionEffectType.SLOW_FALLING, player);
                    break;
                case 28:
                    addEffect(PotionEffectType.CONDUIT_POWER, player);
                    break;
                case 29:
                    addEffect(PotionEffectType.DOLPHINS_GRACE, player);
                    break;
                case 30:
                    addEffect(PotionEffectType.BAD_OMEN, player);
                    break;
                case 31:
                    addEffect(PotionEffectType.HERO_OF_THE_VILLAGE, player);
                    break;

                case 45:
                    ambient(event.getInventory(), player);
                    break;
                case 46:
                    particles(event.getInventory(),player);
                    break;

                case 49://リセット
                    removeAllEffect(player);
                    break;
            }
        }
    }

    @EventHandler
    public void onInventoryClose(InventoryCloseEvent event) {
        Set<String> UserTags = event.getPlayer().getScoreboardTags();
        if (UserTags.contains("Marumasa.EffectMenuOpen")) {
            event.getPlayer().removeScoreboardTag("Marumasa.EffectMenuOpen");
        }
    }

    private void addEffect(PotionEffectType type, Player player) {
        Set<String> UserTags = player.getScoreboardTags();
        player.addPotionEffect(new PotionEffect(type, time, level, UserTags.contains("Marumasa.EffectMenuOpen.ambient"), UserTags.contains("Marumasa.EffectMenuOpen.particles")));

        String translate = config.langText.get(config.langData.indexOf(type.getName()));

        BaseComponent baseComponent = new TranslatableComponent(translate);
        baseComponent.setColor(ChatColor.GOLD);
        TextComponent text = new TextComponent(config.addText);
        text.setColor(ChatColor.YELLOW);
        baseComponent.addExtra(text);
        player.spigot().sendMessage(baseComponent);
    }

    private void removeAllEffect(Player player) {
        for (PotionEffect effect : player.getActivePotionEffects()) {
            player.removePotionEffect(effect.getType());
        }

        BaseComponent baseComponent = new TextComponent(config.removeText);
        baseComponent.setColor(ChatColor.YELLOW);
        player.spigot().sendMessage(baseComponent);

        player.closeInventory();
    }

    private void ambient(Inventory inventory, Player player) {
        Set<String> UserTags = player.getScoreboardTags();
        if (UserTags.contains("Marumasa.EffectMenuOpen.ambient")) {
            new settingInventory(inventory).falseAmbient();
            player.removeScoreboardTag("Marumasa.EffectMenuOpen.ambient");
        } else {
            new settingInventory(inventory).trueAmbient();
            player.addScoreboardTag("Marumasa.EffectMenuOpen.ambient");
        }
    }

    private void particles(Inventory inventory, Player player) {
        Set<String> UserTags = player.getScoreboardTags();
        if (UserTags.contains("Marumasa.EffectMenuOpen.particles")) {
            new settingInventory(inventory).falseParticles();
            player.removeScoreboardTag("Marumasa.EffectMenuOpen.particles");
        } else {
            new settingInventory(inventory).trueParticles();
            player.addScoreboardTag("Marumasa.EffectMenuOpen.particles");
        }
    }
}