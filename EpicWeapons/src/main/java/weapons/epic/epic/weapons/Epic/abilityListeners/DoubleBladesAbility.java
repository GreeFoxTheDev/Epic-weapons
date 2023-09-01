package weapons.epic.epic.weapons.Epic.abilityListeners;

import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import weapons.epic.epic.weapons.Epic.EpicWeapons;

public class DoubleBladesAbility implements Listener {
    EpicWeapons plugin;

    public DoubleBladesAbility(EpicWeapons plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onDamage(EntityDamageByEntityEvent event) {
        if (event.getDamager() instanceof Player) {
            if (event.getEntity() instanceof LivingEntity) {
                Player player = (Player) event.getDamager();
                Inventory inv = player.getInventory();
                ItemStack itemInMainHand = ((Player) event.getDamager()).getInventory().getItemInMainHand();
                if (itemInMainHand.hasItemMeta() && itemInMainHand.getItemMeta().hasLocalizedName() && itemInMainHand.getItemMeta().getLocalizedName().equals("iron_dblade")) {
                    float cooldown = player.getAttackCooldown();
                    if (cooldown < 1) {
                        if (((LivingEntity) event.getEntity()).getHealth() > 7) {
                            ((LivingEntity) event.getEntity()).setHealth(((LivingEntity) event.getEntity()).getHealth() - 5);
                            player.sendMessage("test1");
                        }
                    }
                }
            }
        }
    }
}
