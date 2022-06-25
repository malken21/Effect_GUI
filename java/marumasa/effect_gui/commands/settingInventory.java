package marumasa.effect_gui.commands;

import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class settingInventory {
    final Inventory inventory;

    public settingInventory(Inventory inv) {
        inventory = inv;
    }

    public Inventory setMain() {
        List<Material> material = new ArrayList<>();

        ItemMeta itemMeta;

        // material.add(Material.RED_STAINED_GLASS);
        // material.add(Material.LIME_STAINED_GLASS);
        itemMeta = new ItemStack(Material.LIME_STAINED_GLASS_PANE).getItemMeta();
        itemMeta.setDisplayName("§a" + "ビーコンからのエフェクト");
        itemMeta.setLore(Collections.singletonList("§c" + "YES"));
        inventory.setItem(45, new ItemStack(Material.LIME_STAINED_GLASS_PANE, 1));
        inventory.getItem(45).setItemMeta(itemMeta);


        itemMeta = new ItemStack(Material.RED_STAINED_GLASS_PANE).getItemMeta();
        itemMeta.setDisplayName("§a" + "パーティクル表示");
        itemMeta.setLore(Collections.singletonList("§9" + "OFF"));
        inventory.setItem(46, new ItemStack(Material.RED_STAINED_GLASS_PANE, 1));
        inventory.getItem(46).setItemMeta(itemMeta);

        return inventory;
    }

    public Inventory trueAmbient() {

        ItemMeta itemMeta;
        itemMeta = new ItemStack(Material.LIME_STAINED_GLASS_PANE).getItemMeta();
        itemMeta.setDisplayName("§a" + "ビーコンからのエフェクト");
        itemMeta.setLore(Collections.singletonList("§c" + "YES"));
        inventory.setItem(45, new ItemStack(Material.LIME_STAINED_GLASS_PANE, 1));
        inventory.getItem(45).setItemMeta(itemMeta);

        return inventory;
    }

    public Inventory falseAmbient() {

        ItemMeta itemMeta;
        itemMeta = new ItemStack(Material.RED_STAINED_GLASS_PANE).getItemMeta();
        itemMeta.setDisplayName("§a" + "ビーコンからのエフェクト");
        itemMeta.setLore(Collections.singletonList("§9" + "NO"));
        inventory.setItem(45, new ItemStack(Material.RED_STAINED_GLASS_PANE, 1));
        inventory.getItem(45).setItemMeta(itemMeta);

        return inventory;
    }

    public Inventory trueParticles() {

        ItemMeta itemMeta;
        itemMeta = new ItemStack(Material.LIME_STAINED_GLASS_PANE).getItemMeta();
        itemMeta.setDisplayName("§a" + "パーティクル表示");
        itemMeta.setLore(Collections.singletonList("§c" + "ON"));
        inventory.setItem(46, new ItemStack(Material.LIME_STAINED_GLASS_PANE, 1));
        inventory.getItem(46).setItemMeta(itemMeta);

        return inventory;
    }

    public Inventory falseParticles() {

        ItemMeta itemMeta;
        itemMeta = new ItemStack(Material.RED_STAINED_GLASS_PANE).getItemMeta();
        itemMeta.setDisplayName("§a" + "パーティクル表示");
        itemMeta.setLore(Collections.singletonList("§9" + "OFF"));
        inventory.setItem(46, new ItemStack(Material.RED_STAINED_GLASS_PANE, 1));
        inventory.getItem(46).setItemMeta(itemMeta);

        return inventory;
    }
}