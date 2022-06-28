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

public class levelInventory {
    public static List<Integer> levelList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 19, 29, 39, 49, 59, 69, 79, 89);

    public static Inventory set() {
        Inventory inventory = Bukkit.createInventory(null, 27, "EffectLevel");
        for (int loop = 0; loop < 18; loop++) {
            Material material = Material.GUNPOWDER;
            int level = levelList.get(loop);
            if (level == 4) {
                material = Material.GLOWSTONE_DUST;
            }
            ItemMeta itemMeta = new ItemStack(material).getItemMeta();
            itemMeta.setDisplayName("§a" + "レベル: " + (level + 1));
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
        itemMeta.setDisplayName("§a" + "レベル: " + (levelList.get(before) + 1));
        inventory.setItem(before, new ItemStack(Material.GUNPOWDER, 1));
        inventory.getItem(before).setItemMeta(itemMeta);

        itemMeta = new ItemStack(Material.GLOWSTONE_DUST).getItemMeta();
        itemMeta.setDisplayName("§a" + "レベル: " + (levelList.get(after) + 1));
        inventory.setItem(after, new ItemStack(Material.GLOWSTONE_DUST, 1));
        inventory.getItem(after).setItemMeta(itemMeta);
    }
}