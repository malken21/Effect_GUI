package marumasa.effect_gui;

import marumasa.effect_gui.Inventory.levelInventory;
import marumasa.effect_gui.Inventory.timeInventory;
import marumasa.effect_gui.commands.effectGUI;
import marumasa.effect_gui.Inventory.effectInventory;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;

public final class minecraft extends JavaPlugin {

    @Override
    public void onEnable() {
        Config config = new Config(this);

        Inventory main = effectInventory.set();
        Inventory time = timeInventory.set();
        Inventory level = levelInventory.set();

        getCommand("effectgui").setExecutor(new effectGUI(this, main));
        getServer().getPluginManager().registerEvents(new eventListener(this, config, main, time, level), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}