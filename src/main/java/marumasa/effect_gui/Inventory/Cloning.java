package marumasa.effect_gui.Inventory;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class Cloning {
    public static Inventory set(Inventory inv, String title) {
        Inventory inventory = Bukkit.createInventory(null, inv.getSize(), title);
        inventory.setContents(inv.getContents());
        return inventory;
    }
}
