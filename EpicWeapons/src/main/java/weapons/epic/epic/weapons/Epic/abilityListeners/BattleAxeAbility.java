package weapons.epic.epic.weapons.Epic.abilityListeners;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.EulerAngle;
import org.bukkit.util.Vector;
import weapons.epic.epic.weapons.Epic.EpicWeapons;
import weapons.epic.epic.weapons.Epic.items.war_axes.Copper;
import weapons.epic.epic.weapons.Epic.items.war_axes.Diamond;
import weapons.epic.epic.weapons.Epic.items.war_axes.Gold;
import weapons.epic.epic.weapons.Epic.items.war_axes.Iron;

import java.util.HashMap;
import java.util.UUID;

public class BattleAxeAbility implements Listener {
    private final HashMap<UUID, Long> cooldown;
    EpicWeapons plugin;

    public BattleAxeAbility(EpicWeapons plugin) {
        this.plugin = plugin;
        this.cooldown = new HashMap<>();
    }


    @EventHandler
    public void onRightClickDiamond(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (player.getInventory().getItemInMainHand().hasItemMeta() && player.getInventory().getItemInMainHand().getItemMeta().hasLocalizedName() && player.getInventory().getItemInMainHand().getItemMeta().getLocalizedName().equalsIgnoreCase("diamond_war_axe")) {
            if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                player.sendMessage(ChatColor.DARK_RED + "You right-clicked a block!");
            }
            if (event.getAction().equals(Action.RIGHT_CLICK_AIR)) {

                ArmorStand as = (ArmorStand) player.getWorld().spawnEntity(player.getLocation().add(0, 0.5, 0), EntityType.ARMOR_STAND);

                as.setArms(true);
                as.setGravity(false);
                as.setVisible(false);
                as.setSmall(true);
                as.getEquipment().setItemInMainHand(Diamond.diamondWarAxe);
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

                        if (as.getTargetBlockExact(1) != null && as.getTargetBlockExact(1).isPassable()) {
                            if (!as.isDead()) {
                                as.remove();
                                if (player.getInventory().firstEmpty() != -1) {
                                    player.getInventory().addItem(Diamond.diamondWarAxe);
                                } else {
                                    player.getWorld().dropItemNaturally(player.getLocation(), Diamond.diamondWarAxe);
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
                                            livingEntity.damage(7, player);
                                        }
                                    }
                                }
                            }
                        }
                        if (i > distance) {
                            if (!as.isDead()) {
                                as.remove();
                                if (player.getInventory().firstEmpty() != -1) {
                                    player.getInventory().addItem(Diamond.diamondWarAxe);
                                } else {
                                    player.getWorld().dropItemNaturally(player.getLocation(), Diamond.diamondWarAxe);
                                }
                                cancel();
                            }
                        }
                        i++;
                    }
                }.runTaskTimer(plugin, 0L, 1L);
            }
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onRightClickIron(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (player.getInventory().getItemInMainHand().hasItemMeta() && player.getInventory().getItemInMainHand().getItemMeta().hasLocalizedName() && player.getInventory().getItemInMainHand().getItemMeta().getLocalizedName().equalsIgnoreCase("iron_war_axe")) {
            if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                player.sendMessage(ChatColor.DARK_RED + "You right-clicked a block!");
            }
            if (event.getAction().equals(Action.RIGHT_CLICK_AIR)) {
                ArmorStand as = (ArmorStand) player.getWorld().spawnEntity(player.getLocation().add(0, 0.5, 0), EntityType.ARMOR_STAND);

                as.setArms(true);
                as.setGravity(false);
                as.setVisible(false);
                as.setSmall(true);
                as.getEquipment().setItemInMainHand(Iron.ironWarAxe);
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

                        if (as.getTargetBlockExact(1) != null && as.getTargetBlockExact(1).isPassable()) {
                            if (!as.isDead()) {
                                as.remove();
                                if (player.getInventory().firstEmpty() != -1) {
                                    player.getInventory().addItem(Iron.ironWarAxe);
                                } else {
                                    player.getWorld().dropItemNaturally(player.getLocation(), Iron.ironWarAxe);
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
                                            livingEntity.damage(6, player);
                                        }
                                    }
                                }
                            }
                        }
                        if (i > distance) {
                            if (!as.isDead()) {
                                as.remove();
                                if (player.getInventory().firstEmpty() != -1) {
                                    player.getInventory().addItem(Iron.ironWarAxe);
                                } else {
                                    player.getWorld().dropItemNaturally(player.getLocation(), Iron.ironWarAxe);
                                }
                                cancel();
                            }
                        }
                        i++;
                    }
                }.runTaskTimer(plugin, 0L, 1L);
                event.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onRightClickCopper(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (player.getInventory().getItemInMainHand().hasItemMeta() && player.getInventory().getItemInMainHand().getItemMeta().hasLocalizedName() && player.getInventory().getItemInMainHand().getItemMeta().getLocalizedName().equalsIgnoreCase("copper_war_axe")) {
            if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                player.sendMessage(ChatColor.DARK_RED + "You right-clicked a block!");
            }
            if (event.getAction().equals(Action.RIGHT_CLICK_AIR)) {
                ArmorStand as = (ArmorStand) player.getWorld().spawnEntity(player.getLocation().add(0, 0.5, 0), EntityType.ARMOR_STAND);

                as.setArms(true);
                as.setGravity(false);
                as.setVisible(false);
                as.setSmall(true);
                as.getEquipment().setItemInMainHand(Copper.copperWarAxe);
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

                        if (as.getTargetBlockExact(1) != null && as.getTargetBlockExact(1).isPassable()) {
                            if (!as.isDead()) {
                                as.remove();
                                if (player.getInventory().firstEmpty() != -1) {
                                    player.getInventory().addItem(Copper.copperWarAxe);
                                } else {
                                    player.getWorld().dropItemNaturally(player.getLocation(), Copper.copperWarAxe);
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
                                            livingEntity.damage(7, player);
                                        }
                                    }
                                }
                            }
                        }
                        if (i > distance) {
                            if (!as.isDead()) {
                                as.remove();
                                if (player.getInventory().firstEmpty() != -1) {
                                    player.getInventory().addItem(Copper.copperWarAxe);
                                } else {
                                    player.getWorld().dropItemNaturally(player.getLocation(), Copper.copperWarAxe);
                                }
                                cancel();
                            }
                        }
                        i++;
                    }
                }.runTaskTimer(plugin, 0L, 1L);
                event.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onRightClickGold(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (player.getInventory().getItemInMainHand().hasItemMeta() && player.getInventory().getItemInMainHand().getItemMeta().hasLocalizedName() && player.getInventory().getItemInMainHand().getItemMeta().getLocalizedName().equalsIgnoreCase("gold_war_axe")) {
            if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                player.sendMessage(ChatColor.DARK_RED + "You right-clicked a block!");
            }
            if (event.getAction().equals(Action.RIGHT_CLICK_AIR)) {
                ArmorStand as = (ArmorStand) player.getWorld().spawnEntity(player.getLocation().add(0, 0.5, 0), EntityType.ARMOR_STAND);

                as.setArms(true);
                as.setGravity(false);
                as.setVisible(false);
                as.setSmall(true);
                as.getEquipment().setItemInMainHand(Gold.goldWarAxe);
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

                        if (as.getTargetBlockExact(1) != null && as.getTargetBlockExact(1).isPassable()) {
                            if (!as.isDead()) {
                                as.remove();
                                if (player.getInventory().firstEmpty() != -1) {
                                    player.getInventory().addItem(Gold.goldWarAxe);
                                } else {
                                    player.getWorld().dropItemNaturally(player.getLocation(), Gold.goldWarAxe);
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
                                            livingEntity.damage(7, player);
                                        }
                                    }
                                }
                            }
                        }
                        if (i > distance) {
                            if (!as.isDead()) {
                                as.remove();
                                if (player.getInventory().firstEmpty() != -1) {
                                    player.getInventory().addItem(Gold.goldWarAxe);
                                } else {
                                    player.getWorld().dropItemNaturally(player.getLocation(), Gold.goldWarAxe);
                                }
                                cancel();
                            }
                        }
                        i++;
                    }
                }.runTaskTimer(plugin, 0L, 1L);
                event.setCancelled(true);
            }
        }
    }
}