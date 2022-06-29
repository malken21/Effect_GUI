package marumasa.effect_gui.Inventory;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;

import java.util.Arrays;
import java.util.List;

public class timeInventory {
    public static List<Integer> timeList = Arrays.asList(200, 400, 600, 800, 1000, 1200, 2400, 3600, 4800, 6000, 12000, 18000, 24000, 36000, 48000, 60000, 72000, 2147483647);
    public static List<String> textList = Arrays.asList("10秒", "20秒", "30秒", "40秒", "50秒", "1分", "2分", "3分", "4分", "5分", "10分", "15分", "20分", "30分", "40分", "50分", "1時間", "無限");

    public static Inventory set() {
        Inventory inventory = Bukkit.createInventory(null, 27, "EffectTime");

        for (int loop = 0; loop < 18; loop++) {
            Material material = Material.GUNPOWDER;
            int level = timeList.get(loop);
            if (level == 2147483647) {
                material = Material.REDSTONE;
            }
            ItemMeta itemMeta = new ItemStack(material).getItemMeta();
            itemMeta.setDisplayName("§a" + "時間: " + textList.get(loop));
            inventory.setItem(loop, new ItemStack(material, 1));
            inventory.getItem(loop).setItemMeta(itemMeta);
        }

        ItemMeta itemMeta = new ItemStack(Material.POTION).getItemMeta();
        PotionMeta meta = (PotionMeta) itemMeta;
        meta.setColor(Color.fromRGB(43, 128, 255));
        itemMeta.setDisplayName("§a" + "戻る");
        itemMeta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        inventory.setItem(18, new ItemStack(Material.POTION, 1));
        inventory.getItem(18).setItemMeta(itemMeta);

        return inventory;
    }

    public static void replace(Inventory inventory, int before, int after) {
        ItemMeta itemMeta;

        itemMeta = new ItemStack(Material.GUNPOWDER).getItemMeta();
        itemMeta.setDisplayName("§a" + "時間: " + textList.get(before));
        inventory.setItem(before, new ItemStack(Material.GUNPOWDER, 1));
        inventory.getItem(before).setItemMeta(itemMeta);

        itemMeta = new ItemStack(Material.REDSTONE).getItemMeta();
        itemMeta.setDisplayName("§a" + "時間: " + textList.get(after));
        inventory.setItem(after, new ItemStack(Material.REDSTONE, 1));
        inventory.getItem(after).setItemMeta(itemMeta);
    }
}