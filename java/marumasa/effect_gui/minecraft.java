package marumasa.effect_gui;

import marumasa.effect_gui.commands.effectGUI;
import marumasa.effect_gui.commands.effectInventory;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;

public final class minecraft extends JavaPlugin {

    @Override
    public void onEnable() {
        Config config = new Config(this);

        Inventory effectInventory = new effectInventory().setMain();

        getCommand("effectgui").setExecutor(new effectGUI(this,config,effectInventory));
        getServer().getPluginManager().registerEvents(new eventListener(this,config), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}