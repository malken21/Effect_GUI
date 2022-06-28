package marumasa.effect_gui.actions;

import marumasa.effect_gui.Inventory.levelInventory;
import marumasa.effect_gui.minecraft;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class levelSwitch {
    public static void Switch(Player player, InventoryClickEvent event, minecraft minecraft, Inventory main) {
        int slot = event.getSlot();

        if (slot < 18) {
            levelInventory.replace(event.getInventory(), levelInventory.levelList.indexOf(getMeta.get(player, minecraft, "level", 4)), slot);
            setMeta.set(player, minecraft, "level", levelInventory.levelList.get(slot));
        } else if (slot == 18) {
            setMeta.set(player, minecraft, "opening", true);
            setMeta.set(player, minecraft, "open_level", false);
            player.openInventory(getMeta.get(player, minecraft, "Effect_GUI", main));
        }
    }
}