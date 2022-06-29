package marumasa.effect_gui;

import marumasa.effect_gui.actions.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

public class eventListener implements Listener {
    private final minecraft minecraft;
    private final Config config;

    private final Inventory main;
    private final Inventory time;
    private final Inventory level;

    public eventListener(minecraft data, Config con, Inventory mai, Inventory tim, Inventory lev) {
        minecraft = data;
        config = con;
        main = mai;
        time = tim;
        level = lev;
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (getMeta.get(player, minecraft, "open", false)) {
            event.setCancelled(true);
            if (event.getClickedInventory() == null) return;
            if (event.getClickedInventory().getType() != InventoryType.CHEST) return;
            if (getMeta.get(player, minecraft, "open_time", false)) {
                timeSwitch.Switch(player, event, minecraft, main);
            } else if (getMeta.get(player, minecraft, "open_level", false)) {
                levelSwitch.Switch(player, event, minecraft, main);
            } else {
                effectSwitch.Switch(player, event, config, minecraft, time, level);
            }
        }
    }

    @EventHandler
    public void onInventoryClose(InventoryCloseEvent event) {
        Player player = (Player) event.getPlayer();
        if (getMeta.get(player, minecraft, "open", false)) {
            if (getMeta.get(player, minecraft, "opening", false)) {
                setMeta.set(player, minecraft, "opening", false);
                return;
            }
            setMeta.set(player, minecraft, "open_time", false);
            setMeta.set(player, minecraft, "open_level", false);
            setMeta.set(player, minecraft, "open", false);
        }
    }
}