package weapons.epic.epic.weapons.Epic;

import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;

public class ClaymoreEventOld implements Listener {
    EpicWeapons plugin;
    public ClaymoreEventOld(EpicWeapons plugin){
        this.plugin = plugin;
    }
    @EventHandler
    public void onDamage(EntityDamageByEntityEvent event) {
        if (event.getDamager() instanceof Player) {
            if (((Player) event.getDamager()).getInventory().getItemInMainHand().getItemMeta().getDisplayName()
                    .equalsIgnoreCase("§fIron Claymore") || ((Player) event.getDamager()).getInventory().getItemInMainHand().getItemMeta().getDisplayName()
                    .equalsIgnoreCase("§fDiamond Claymore") || ((Player) event.getDamager()).getInventory().getItemInMainHand().getItemMeta().getDisplayName()
                    .equalsIgnoreCase("§fGold Claymore") || ((Player) event.getDamager()).getInventory().getItemInMainHand().getItemMeta().getDisplayName()
                    .equalsIgnoreCase("§fCopper Claymore")) {
                    Player player = ((Player) event.getDamager());
                    Entity entity = (LivingEntity) event.getEntity();
                    //ItemStack offHand = ((Player) event.getDamager()).getInventory().getItemInOffHand();
                    ItemStack offHand = player.getInventory().getItemInOffHand();
                    /*if (offHand.getItemMeta().getDisplayName().equalsIgnoreCase("§eTotem of Undying")){
                    }
                    if (player.getInventory().getItemInOffHand().getItemMeta() != null){
                    }*/
                    if (offHand.hasItemMeta()){
                        double damage = event.getDamage();
                        double health = ((LivingEntity) event.getEntity()).getHealth();
                        double healed = health + damage;
                        ((LivingEntity) event.getEntity()).setHealth(healed);
                        String itemName = offHand.getItemMeta().getDisplayName();
                        player.sendMessage("You can't use Claymore with");
                        //player.sendMessage(itemName + "in offhand.");

                    }
            }
        }
    }
}