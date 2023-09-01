package weapons.epic.epic.weapons.Epic.abilityListeners;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.meta.ItemMeta;
import weapons.epic.epic.weapons.Epic.EpicWeapons;

import java.util.ArrayList;
import java.util.List;

public class ScytheAbility implements Listener {
    EpicWeapons plugin;

    public ScytheAbility(EpicWeapons plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onHit(EntityDamageByEntityEvent event) {
        Player player = (Player) event.getDamager();
        ItemMeta im = player.getInventory().getItemInMainHand().getItemMeta();
        if (im != null) {
            if (im.getLocalizedName().contains("scythe")) {
                Location location = player.getLocation();
                player.playSound(location, Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1, 1);
                player.spawnParticle(Particle.SWEEP_ATTACK, location, 1);
                for (Entity entity : event.getDamager().getNearbyEntities(2.5, 1.5, 2.5)){
                    if (entity instanceof LivingEntity){
                        LivingEntity livingEntity = (LivingEntity) entity;

                        livingEntity.damage(2);
                    }
                }
            }
        }
    }
}
