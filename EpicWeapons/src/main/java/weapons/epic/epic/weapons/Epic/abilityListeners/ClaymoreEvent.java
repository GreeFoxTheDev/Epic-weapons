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

public class ClaymoreEvent implements Listener {
    EpicWeapons plugin;

    public ClaymoreEvent(EpicWeapons plugin) {
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
                        double health = ((LivingEntity) event.getEntity()).getHealth();
                        double damage = event.getDamage();
                        if (item.getType() != Material.AIR) {
                            event.setDamage(0);
                            String claymoreName = player.getInventory().getItemInMainHand().getItemMeta().getDisplayName();
                            String normalItemName = claymoreName.replace("§f", "");
                            String message = ChatColor.RED + normalItemName + ChatColor.DARK_RED + " is double-handed.";
                            player.sendMessage(message);
                            player.sendMessage(ChatColor.GREEN + String.valueOf(damage));
                            if (item.getType().equals(Material.TOTEM_OF_UNDYING) || item.getType().isEdible()) {
                                event.setDamage(damage);
                                message.replace(ChatColor.RED + normalItemName + ChatColor.DARK_RED + " is double-handed.", "");
                                player.sendMessage(message);
                                player.sendMessage("Totem/food in offhand");
                            }
                        }
                    }
                }
            }
        }
    }
}