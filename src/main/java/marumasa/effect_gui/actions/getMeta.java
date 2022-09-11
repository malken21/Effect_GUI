package marumasa.effect_gui.actions;

import marumasa.effect_gui.minecraft;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.metadata.MetadataValue;

import java.util.List;

public class getMeta {

    public static int get(Player player, minecraft minecraft, String key, int value) {
        if (player.hasMetadata(key)) {
            List<MetadataValue> values = player.getMetadata(key);
            for (MetadataValue v : values) {
                if (v.getOwningPlugin().getName().equals(minecraft.getName())) {
                    return (int) v.value();
                }
            }
        } else {
            setMeta.set(player, minecraft, key, value);
        }
        return value;
    }

    public static boolean get(Player player, minecraft minecraft, String key, boolean value) {
        if (player.hasMetadata(key)) {
            List<MetadataValue> values = player.getMetadata(key);
            for (MetadataValue v : values) {
                if (v.getOwningPlugin().getName().equals(minecraft.getName())) {
                    return (boolean) v.value();
                }
            }
        } else {
            setMeta.set(player, minecraft, key, value);
        }
        return value;
    }

    public static Inventory get(Player player, minecraft minecraft, String key, Inventory value) {
        if (player.hasMetadata(key)) {
            List<MetadataValue> values = player.getMetadata(key);
            for (MetadataValue v : values) {
                if (v.getOwningPlugin().getName().equals(minecraft.getName())) {
                    return (Inventory) v.value();
                }
            }
        } else {
            setMeta.set(player, minecraft, key, value);
        }
        return value;
    }
}