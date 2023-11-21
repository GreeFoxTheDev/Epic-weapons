package weapons.epic.epic.weapons.Epic.abilityListeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;
import weapons.epic.epic.weapons.Epic.EpicWeapons;

public class ClaymoreAbility implements Listener {
    EpicWeapons plugin;

    public ClaymoreAbility(EpicWeapons plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onDamage(EntityDamageByEntityEvent event) {
        if (event.getDamager() instanceof Player) {
            ItemStack mainHand = ((Player) event.getDamager()).getInventory().getItemInMainHand();
            if (mainHand.hasItemMeta() && mainHand.getItemMeta().hasLocalizedName() && mainHand.getItemMeta().getLocalizedName().contains("claymore")) {
                Player damager = ((Player) event.getDamager());
                ItemStack offHand = damager.getInventory().getItemInOffHand();
                if (offHand.getType() == Material.AIR){
                    event.setCancelled(false);
                }
                else {
                    damager.sendMessage(ChatColor.DARK_RED + "Claymores are double-handed!");
                    event.setCancelled(true);
                }
            }
        }
    }
}