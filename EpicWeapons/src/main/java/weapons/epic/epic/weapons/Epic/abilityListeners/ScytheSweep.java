package weapons.epic.epic.weapons.Epic.abilityListeners;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.meta.ItemMeta;
import weapons.epic.epic.weapons.Epic.EpicWeapons;

public class ScytheSweep implements Listener {
    EpicWeapons plugin;

    public ScytheSweep(EpicWeapons plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onHit(EntityDamageByEntityEvent event) {
        Player player = (Player) event.getDamager();
        ItemMeta im = player.getInventory().getItemInMainHand().getItemMeta();
        if (im != null) {
            if (im.getLocalizedName().contains("Scythe")) {
                Location location = player.getLocation();
                player.playSound(location, Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1, 1);
                player.spawnParticle(Particle.SWEEP_ATTACK, location, 1);
            }
        }
    }
}
