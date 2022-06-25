package marumasa.effect_gui.commands;

import marumasa.effect_gui.Config;
import marumasa.effect_gui.minecraft;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.metadata.MetadataValue;

import java.util.List;

public class effectGUI implements CommandExecutor {
    private final minecraft minecraft;
    private final Config config;
    private final Inventory inventory;

    public effectGUI(minecraft data, Config con, Inventory inv) {
        minecraft = data;
        config = con;
        inventory = inv;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;


        if (player.hasMetadata("Effect_GUI")) {

            List<MetadataValue> values = player.getMetadata("Effect_GUI");
            for (MetadataValue v : values) {
                if (v.getOwningPlugin().getName().equals(minecraft.getName())) {
                    Inventory inventory = (Inventory) v.value();
                    player.openInventory(inventory);
                    break;
                }
            }

        } else {
            Inventory inventory = new effectInventory().setMain();
            player.setMetadata("Effect_GUI", new FixedMetadataValue(
                    minecraft,
                    inventory
            ));
            player.openInventory(inventory);
        }


        player.addScoreboardTag("Marumasa.EffectMenuOpen");
        return true;
    }
}