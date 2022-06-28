package marumasa.effect_gui;

import org.bukkit.configuration.file.FileConfiguration;

import java.util.ArrayList;
import java.util.List;

public class Config {

    public final List<String> langData;
    public final List<String> langText;
    public final String addText;
    public final String removeText;

    public Config(minecraft plugin) {
        plugin.saveDefaultConfig();
        FileConfiguration config = plugin.getConfig();

        addText = config.getString("addText");
        removeText = config.getString("removeText");

        List<String> data = new ArrayList<>();
        List<String> text = new ArrayList<>();

        for (String key : config.getConfigurationSection("lang").getKeys(false)) {
            data.add(key);
            text.add(config.getString("lang." + key));
        }
        langData = data;
        langText = text;
    }
}