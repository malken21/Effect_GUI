package marumasa.effect_gui.actions;

import marumasa.effect_gui.Inventory.timeInventory;
import marumasa.effect_gui.minecraft;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class timeSwitch {
    public static void Switch(Player player, InventoryClickEvent event, minecraft minecraft, Inventory main) {
        int slot = event.getSlot();

        if (slot < 18) {
            timeInventory.replace(event.getInventory(), timeInventory.timeList.indexOf(getMeta.get(player, minecraft, "time", 2147483647)), slot);
            setMeta.set(player, minecraft, "time", timeInventory.timeList.get(slot));
        } else if (slot == 18) {
            setMeta.set(player, minecraft, "opening", true);
            setMeta.set(player, minecraft, "open_time", false);
            player.openInventory(getMeta.get(player, minecraft, "Effect_GUI", main));
        }
    }
}