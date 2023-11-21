package weapons.epic.epic.weapons.Epic.abilityListeners;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerArmorStandManipulateEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.EulerAngle;
import org.bukkit.util.Vector;
import weapons.epic.epic.weapons.Epic.EpicWeapons;
import weapons.epic.epic.weapons.Epic.items.war_axes.Copper;
import weapons.epic.epic.weapons.Epic.items.war_axes.Diamond;
import weapons.epic.epic.weapons.Epic.items.war_axes.Gold;
import weapons.epic.epic.weapons.Epic.items.war_axes.Iron;

public class BattleAxeAbility implements Listener {
    EpicWeapons plugin;

    public BattleAxeAbility(EpicWeapons plugin) {
        this.plugin = plugin;
    }


    @EventHandler
    public void onRightClickDiamond(PlayerInteractEvent event) {
        Player player = event.getPlayer();

        if (player.getInventory().getItemInMainHand().hasItemMeta() && player.getInventory().getItemInMainHand().getItemMeta().hasLocalizedName() && player.getInventory().getItemInMainHand().getItemMeta().getLocalizedName().contains("war_axe")) {

            if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK) && !event.getAction().equals(Action.RIGHT_CLICK_AIR)) {
                player.sendMessage(ChatColor.RED + "You right-clicked a block!");
            }
            if (event.getAction().equals(Action.RIGHT_CLICK_AIR)) {
                String locName = player.getInventory().getItemInMainHand().getItemMeta().getLocalizedName();

                ArmorStand as = (ArmorStand) player.getWorld().spawnEntity(player.getLocation().add(0, 0.5, 0), EntityType.ARMOR_STAND);

                as.setArms(true);
                as.setGravity(false);
                as.setVisible(false);
                as.setSmall(true);
                as.getEquipment().setItemInMainHand(player.getInventory().getItemInMainHand());
                ItemStack itemInAS = as.getEquipment().getItemInMainHand();
                ItemMeta meta = itemInAS.getItemMeta();
                if(meta instanceof org.bukkit.inventory.meta.Damageable){ // Only runs if the item can be damaged (Notice how Spigot identifies between entity and item Damageable here)
                    org.bukkit.inventory.meta.Damageable dMeta = (org.bukkit.inventory.meta.Damageable) meta; // Creates the Damageable meta that you can use .setDamage() on
                    int damage = dMeta.getDamage();
                    int maxdamage = itemInAS.getType().getMaxDurability(); // Gets the maximum durability of the specific tool
                    if(damage+5 <= maxdamage) {
                        dMeta.setDamage(damage + 5); // Will make the durability of the item go down by 5 if it has enough durability to do so
                        itemInAS.setItemMeta(dMeta); // NECESSARY: Updates the item with the new durability
                    }
                    else{ // Tool is broken, or its durability can't go down by 5
                        player.playSound(player.getLocation(), Sound.ENTITY_ITEM_BREAK,1,1);
                        player.sendMessage("§cYour throwing axe broke!");
                        itemInAS.setAmount(0); // Removes item from your inventory
                    }
                }

                as.setRightArmPose(new EulerAngle(Math.toRadians(90), Math.toRadians(0), Math.toRadians(0)));


                player.getInventory().getItemInMainHand().setAmount(-1);

                Location dest = player.getLocation().add(player.getLocation().getDirection().multiply(10));
                Vector vector = dest.subtract(player.getLocation()).toVector();

                new BukkitRunnable() {
                    final int distance = 30;
                    int i = 0;

                    public void run() {
                        EulerAngle rot = as.getRightArmPose();
                        EulerAngle rotNew = rot.add(20, 0, 0);
                        as.setRightArmPose(rotNew);

                        as.teleport(as.getLocation().add(vector.normalize()));

                        if (as.getTargetBlockExact(1) != null && !as.getTargetBlockExact(1).isPassable()) {
                            if (!as.isDead()) {
                                as.remove();
                                if (player.getInventory().firstEmpty() != -1) {
                                    player.getInventory().addItem(itemInAS);
                                } else {
                                    player.getWorld().dropItemNaturally(player.getLocation(), itemInAS);
                                }
                                cancel();
                            }
                        }
                        for (Entity entity : as.getLocation().getChunk().getEntities()) {
                            if (!as.isDead()) {
                                if (as.getLocation().distanceSquared(entity.getLocation()) <= 1) {
                                    if (entity != player && entity != as) {
                                        if (entity instanceof LivingEntity) {
                                            LivingEntity livingEntity = (LivingEntity) entity;
                                            livingEntity.damage(10, player);
                                        }
                                    }
                                }
                            }
                        }
                        if (i > distance) {
                            if (!as.isDead()) {
                                as.remove();
                                if (player.getInventory().firstEmpty() != -1) {
                                    player.getInventory().addItem(itemInAS);
                                } else {
                                    player.getWorld().dropItemNaturally(player.getLocation(), itemInAS);
                                }
                                cancel();
                            }
                        }
                        i++;
                    }
                }.runTaskTimer(plugin, 0L, 1L);
            }
            //event.setCancelled(true);
        }
    }

    @EventHandler
    public void InteractInvisAS(PlayerArmorStandManipulateEvent e) {
        e.getArmorStandItem();
        if (e.getArmorStandItem().getItemMeta().hasLocalizedName() && e.getArmorStandItem().getItemMeta().getLocalizedName().contains("war_axe") && e.getArmorStandItem().hasItemMeta()) {
            e.setCancelled(true);
        }
    }
}