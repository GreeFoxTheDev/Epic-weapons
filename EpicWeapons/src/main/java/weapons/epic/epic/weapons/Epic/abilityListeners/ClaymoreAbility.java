package weapons.epic.epic.weapons.Epic.abilityListeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
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
            if (((Player) event.getDamager()).getInventory().getItemInMainHand().getItemMeta() != null) {
                boolean name = ((Player) event.getDamager()).getInventory().getItemInMainHand().getItemMeta().getLocalizedName().contains("claymore");
                if (((Player) event.getDamager()).getInventory().getItemInMainHand().getItemMeta() != null) {
                    if (name) {
                        Player player = ((Player) event.getDamager());
                        ItemStack item = player.getInventory().getItemInOffHand();
                        double damage = event.getDamage();
                        if (item.getType() != Material.AIR) {
                            if (!(item.getType().isEdible() || item.getType() == Material.TOTEM_OF_UNDYING)) {
                                event.setDamage(0);
                                String claymoreName = player.getInventory().getItemInMainHand().getItemMeta().getDisplayName();
                                String normalItemName = claymoreName.replace("§f", "");
                                String message = ChatColor.RED + normalItemName + ChatColor.DARK_RED + " is double-handed.";
                                player.sendMessage(message);
                            }
                        }
                    }
                }
            }
        }
    }
}