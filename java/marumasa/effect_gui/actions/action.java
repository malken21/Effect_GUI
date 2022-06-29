package marumasa.effect_gui.actions;

import marumasa.effect_gui.Config;
import marumasa.effect_gui.Inventory.Cloning;
import marumasa.effect_gui.Inventory.settingInventory;
import marumasa.effect_gui.minecraft;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.chat.TranslatableComponent;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class action {

    public static void addEffect(Player player, PotionEffectType type, minecraft minecraft, Config config) {

        final int time = getMeta.get(player, minecraft, "time", 2147483647);
        final int level = getMeta.get(player, minecraft, "level", 4);
        final boolean ambient = getMeta.get(player, minecraft, "ambient", true);
        final boolean particles = getMeta.get(player, minecraft, "particles", false);

        player.addPotionEffect(new PotionEffect(type, time, level, ambient, particles));

        String translate = config.langText.get(config.langData.indexOf(type.getName()));

        BaseComponent baseComponent = new TranslatableComponent(translate);
        baseComponent.setColor(ChatColor.GOLD);
        TextComponent text = new TextComponent(config.addText);
        text.setColor(ChatColor.YELLOW);
        baseComponent.addExtra(text);
        player.spigot().sendMessage(baseComponent);
    }

    public static void removeAllEffect(Player player, Config config) {
        for (PotionEffect effect : player.getActivePotionEffects()) {
            player.removePotionEffect(effect.getType());
        }

        BaseComponent baseComponent = new TextComponent(config.removeText);
        baseComponent.setColor(ChatColor.YELLOW);
        player.spigot().sendMessage(baseComponent);

        player.closeInventory();
    }

    public static void ambient(Player player, Inventory inventory, minecraft minecraft) {
        if (getMeta.get(player, minecraft, "ambient", true)) {
            settingInventory.falseAmbient(inventory);
            setMeta.set(player, minecraft, "ambient", false);
        } else {
            settingInventory.trueAmbient(inventory);
            setMeta.set(player, minecraft, "ambient", true);
        }
    }

    public static void particles(Player player, Inventory inventory, minecraft minecraft) {
        if (getMeta.get(player, minecraft, "particles", false)) {
            settingInventory.falseParticles(inventory);
            setMeta.set(player, minecraft, "particles", false);
        } else {
            settingInventory.trueParticles(inventory);
            setMeta.set(player, minecraft, "particles", true);
        }
    }

    public static void time(Player player, Inventory time, minecraft minecraft) {
        setMeta.set(player, minecraft, "opening", true);
        setMeta.set(player, minecraft, "open_time", true);
        Inventory PlayerInventory = getMeta.get(player, minecraft, "Time_GUI", Cloning.set(time, "EffectTime"));
        player.openInventory(PlayerInventory);
    }

    public static void level(Player player, Inventory level, minecraft minecraft) {
        setMeta.set(player, minecraft, "opening", true);
        setMeta.set(player, minecraft, "open_level", true);
        Inventory PlayerInventory = getMeta.get(player, minecraft, "Level_GUI", Cloning.set(level, "EffectLevel"));
        player.openInventory(PlayerInventory);
    }
}