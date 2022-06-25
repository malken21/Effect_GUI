package marumasa.effect_gui;

import org.bukkit.configuration.file.FileConfiguration;

import java.io.File;
import java.util.Map;
import java.util.Set;

public class lang {

    public lang(minecraft plugin) {
        String file = "lang.yml";
        File configFile = new File(plugin.getDataFolder(), file);
        FileConfiguration config = plugin.getConfig();
    }
}