package marumasa.effect_gui.Inventory;

import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;

public class settingInventory {

    public static Inventory setMain(Inventory inventory) {
        ItemMeta itemMeta;

        itemMeta = new ItemStack(Material.ENDER_PEARL).getItemMeta();
        itemMeta.setDisplayName("§a" + "可視性");
        itemMeta.setLore(Collections.singletonList("§9" + "OFF"));
        inventory.setItem(45, new ItemStack(Material.ENDER_PEARL, 1));
        inventory.getItem(45).setItemMeta(itemMeta);

        itemMeta = new ItemStack(Material.SLIME_BALL).getItemMeta();
        itemMeta.setDisplayName("§a" + "パーティクル表示");
        itemMeta.setLore(Collections.singletonList("§9" + "OFF"));
        inventory.setItem(46, new ItemStack(Material.SLIME_BALL, 1));
        inventory.getItem(46).setItemMeta(itemMeta);

        itemMeta = new ItemStack(Material.MILK_BUCKET).getItemMeta();
        itemMeta.setDisplayName("§a" + "リセット");
        itemMeta.setLore(Collections.singletonList("§a" + "エフェクトをリセットする"));
        inventory.setItem(49, new ItemStack(Material.MILK_BUCKET, 1));
        inventory.getItem(49).setItemMeta(itemMeta);//リセット

        itemMeta = new ItemStack(Material.REDSTONE).getItemMeta();
        itemMeta.setDisplayName("§a" + "時間");
        itemMeta.setLore(Collections.singletonList("§a" + "エフェクトの時間設定"));
        inventory.setItem(52, new ItemStack(Material.REDSTONE, 1));
        inventory.getItem(52).setItemMeta(itemMeta);//リセット

        itemMeta = new ItemStack(Material.GLOWSTONE_DUST).getItemMeta();
        itemMeta.setDisplayName("§a" + "レベル");
        itemMeta.setLore(Collections.singletonList("§a" + "エフェクトのレベル設定"));
        inventory.setItem(53, new ItemStack(Material.GLOWSTONE_DUST, 1));
        inventory.getItem(53).setItemMeta(itemMeta);//リセット

        return inventory;
    }

    public static Inventory trueAmbient(Inventory inventory) {

        ItemMeta itemMeta;
        itemMeta = new ItemStack(Material.ENDER_PEARL).getItemMeta();
        itemMeta.setDisplayName("§a" + "可視性");
        itemMeta.setLore(Collections.singletonList("§9" + "OFF"));
        inventory.setItem(45, new ItemStack(Material.ENDER_PEARL, 1));
        inventory.getItem(45).setItemMeta(itemMeta);

        return inventory;
    }

    public static Inventory falseAmbient(Inventory inventory) {

        ItemMeta itemMeta;
        itemMeta = new ItemStack(Material.ENDER_EYE).getItemMeta();
        itemMeta.setDisplayName("§a" + "可視性");
        itemMeta.setLore(Collections.singletonList("§c" + "ON"));
        inventory.setItem(45, new ItemStack(Material.ENDER_EYE, 1));
        inventory.getItem(45).setItemMeta(itemMeta);

        return inventory;
    }

    public static Inventory trueParticles(Inventory inventory) {

        ItemMeta itemMeta;
        itemMeta = new ItemStack(Material.MAGMA_CREAM).getItemMeta();
        itemMeta.setDisplayName("§a" + "パーティクル表示");
        itemMeta.setLore(Collections.singletonList("§c" + "ON"));
        inventory.setItem(46, new ItemStack(Material.MAGMA_CREAM, 1));
        inventory.getItem(46).setItemMeta(itemMeta);

        return inventory;
    }

    public static Inventory falseParticles(Inventory inventory) {

        ItemMeta itemMeta;
        itemMeta = new ItemStack(Material.SLIME_BALL).getItemMeta();
        itemMeta.setDisplayName("§a" + "パーティクル表示");
        itemMeta.setLore(Collections.singletonList("§9" + "OFF"));
        inventory.setItem(46, new ItemStack(Material.SLIME_BALL, 1));
        inventory.getItem(46).setItemMeta(itemMeta);

        return inventory;
    }
}