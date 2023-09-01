package weapons.epic.epic.weapons.Epic.abilityListeners;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethods;
import weapons.epic.epic.weapons.Epic.EpicWeapons;

import javax.swing.text.PlainDocument;

public class KarambitAbility implements Listener {
    EpicWeapons plugin;

    public KarambitAbility(EpicWeapons plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onDamageIron(EntityDamageByEntityEvent event){
        if (event.getDamager() instanceof Player){
            if (((Player) event.getDamager()).getInventory().getItemInMainHand().hasItemMeta() && ((Player) event.getDamager()).getInventory().getItemInMainHand().getItemMeta().hasLocalizedName() && ((Player) event.getDamager()).getInventory().getItemInMainHand().getItemMeta().getLocalizedName().contains("karambit")) {
                Player player = (Player) event.getDamager();
                Entity victim = event.getEntity();
                Location damagerLoc = player.getLocation();
                Location victimLoc = event.getEntity().getLocation();
                double distance = victimLoc.distance(damagerLoc);
                if (victim instanceof LivingEntity) {
                    if (player.getInventory().getItemInMainHand().getItemMeta().getLocalizedName().equalsIgnoreCase("iron_karambit")) {
                        double damage = 6*(1/distance);
                        ((LivingEntity) victim).damage(damage);
                    }
                    if (player.getInventory().getItemInMainHand().getItemMeta().getLocalizedName().equalsIgnoreCase("diamond_karambit")) {
                        double damage = 7*(1/distance);
                        ((LivingEntity) victim).damage(damage);
                    }
                    if (player.getInventory().getItemInMainHand().getItemMeta().getLocalizedName().equalsIgnoreCase("copper_karambit")) {
                        double damage = 5*(1/distance);
                        ((LivingEntity) victim).damage(damage);
                    }
                    if (player.getInventory().getItemInMainHand().getItemMeta().getLocalizedName().equalsIgnoreCase("gold_karambit")) {
                        double damage = 5*(1/distance);
                        ((LivingEntity) victim).damage(damage);
                    }
                }
            }
        }
    }
}
