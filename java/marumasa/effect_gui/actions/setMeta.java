package marumasa.effect_gui.actions;

import marumasa.effect_gui.minecraft;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.metadata.FixedMetadataValue;

public class setMeta {
    public static void set(Player player, minecraft minecraft, String key, boolean value) {
        player.setMetadata(key, new FixedMetadataValue(
                minecraft,
                value
        ));
    }

    public static void set(Player player, minecraft minecraft, String key, int value) {
        player.setMetadata(key, new FixedMetadataValue(
                minecraft,
                value
        ));
    }

    public static void set(Player player, minecraft minecraft, String key, Inventory value) {
        player.setMetadata(key, new FixedMetadataValue(
                minecraft,
                value
        ));
    }
}