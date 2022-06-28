package marumasa.effect_gui.commands;

import marumasa.effect_gui.actions.getMeta;
import marumasa.effect_gui.actions.setMeta;
import marumasa.effect_gui.minecraft;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class effectGUI implements CommandExecutor {
    private final minecraft minecraft;
    private final Inventory inventory;

    public effectGUI(minecraft data, Inventory inv) {
        minecraft = data;
        inventory = inv;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;

        setMeta.set(player, minecraft, "open", true);

        Inventory PlayerInventory = getMeta.get(player, minecraft, "Effect_GUI", inventory);
        player.openInventory(PlayerInventory);

        return true;
    }
}