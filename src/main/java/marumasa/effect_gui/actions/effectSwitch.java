package marumasa.effect_gui.actions;

import marumasa.effect_gui.Config;
import marumasa.effect_gui.minecraft;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.potion.PotionEffectType;

public class effectSwitch {

    public static void Switch(Player player, InventoryClickEvent event, Config config, minecraft minecraft, Inventory time, Inventory level) {
        switch (event.getSlot()) {
            case 0:
                action.addEffect(player, PotionEffectType.SPEED, minecraft, config);
                break;
            case 1:
                action.addEffect(player, PotionEffectType.SLOW, minecraft, config);
                break;
            case 2:
                action.addEffect(player, PotionEffectType.FAST_DIGGING, minecraft, config);
                break;
            case 3:
                action.addEffect(player, PotionEffectType.SLOW_DIGGING, minecraft, config);
                break;
            case 4:
                action.addEffect(player, PotionEffectType.INCREASE_DAMAGE, minecraft, config);
                break;
            case 5:
                action.addEffect(player, PotionEffectType.HEAL, minecraft, config);
                break;
            case 6:
                action.addEffect(player, PotionEffectType.HARM, minecraft, config);
                break;
            case 7:
                action.addEffect(player, PotionEffectType.JUMP, minecraft, config);
                break;
            case 8:
                action.addEffect(player, PotionEffectType.CONFUSION, minecraft, config);
                break;
            case 9:
                action.addEffect(player, PotionEffectType.REGENERATION, minecraft, config);
                break;
            case 10:
                action.addEffect(player, PotionEffectType.DAMAGE_RESISTANCE, minecraft, config);
                break;
            case 11:
                action.addEffect(player, PotionEffectType.FIRE_RESISTANCE, minecraft, config);
                break;
            case 12:
                action.addEffect(player, PotionEffectType.WATER_BREATHING, minecraft, config);
                break;
            case 13:
                action.addEffect(player, PotionEffectType.INVISIBILITY, minecraft, config);
                break;
            case 14:
                action.addEffect(player, PotionEffectType.BLINDNESS, minecraft, config);
                break;
            case 15:
                action.addEffect(player, PotionEffectType.NIGHT_VISION, minecraft, config);
                break;
            case 16:
                action.addEffect(player, PotionEffectType.HUNGER, minecraft, config);
                break;
            case 17:
                action.addEffect(player, PotionEffectType.WEAKNESS, minecraft, config);
                break;
            case 18:
                action.addEffect(player, PotionEffectType.POISON, minecraft, config);
                break;
            case 19:
                action.addEffect(player, PotionEffectType.WITHER, minecraft, config);
                break;
            case 20:
                action.addEffect(player, PotionEffectType.HEALTH_BOOST, minecraft, config);
                break;
            case 21:
                action.addEffect(player, PotionEffectType.ABSORPTION, minecraft, config);
                break;
            case 22:
                action.addEffect(player, PotionEffectType.SATURATION, minecraft, config);
                break;
            case 23:
                action.addEffect(player, PotionEffectType.GLOWING, minecraft, config);
                break;
            case 24:
                action.addEffect(player, PotionEffectType.LEVITATION, minecraft, config);
                break;
            case 25:
                action.addEffect(player, PotionEffectType.LUCK, minecraft, config);
                break;
            case 26:
                action.addEffect(player, PotionEffectType.UNLUCK, minecraft, config);
                break;
            case 27:
                action.addEffect(player, PotionEffectType.SLOW_FALLING, minecraft, config);
                break;
            case 28:
                action.addEffect(player, PotionEffectType.CONDUIT_POWER, minecraft, config);
                break;
            case 29:
                action.addEffect(player, PotionEffectType.DOLPHINS_GRACE, minecraft, config);
                break;
            case 30:
                action.addEffect(player, PotionEffectType.BAD_OMEN, minecraft, config);
                break;
            case 31:
                action.addEffect(player, PotionEffectType.HERO_OF_THE_VILLAGE, minecraft, config);
                break;

            case 45:
                action.ambient(player, event.getInventory(), minecraft);
                break;
            case 46:
                action.particles(player, event.getInventory(), minecraft);
                break;

            case 49://リセット
                action.removeAllEffect(player, config);
                break;

            case 52:
                action.time(player, time, minecraft);
                break;
            case 53:
                action.level(player, level, minecraft);
                break;
        }
    }
}