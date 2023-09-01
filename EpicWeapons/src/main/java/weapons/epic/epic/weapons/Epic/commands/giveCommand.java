package weapons.epic.epic.weapons.Epic.commands;

import org.bukkit.Location;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import weapons.epic.epic.weapons.Epic.EpicWeapons;
import weapons.epic.epic.weapons.Epic.items.claymores.Copper;
import weapons.epic.epic.weapons.Epic.items.claymores.Diamond;
import weapons.epic.epic.weapons.Epic.items.claymores.Gold;
import weapons.epic.epic.weapons.Epic.items.claymores.Iron;

public class giveCommand implements CommandExecutor {
    EpicWeapons plugin;

    public giveCommand(EpicWeapons plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("giveweapon")) {
        }
        if (args.length == 1) {
            if (sender instanceof BlockCommandSender) {
                Location loc = ((BlockCommandSender) sender).getBlock().getLocation();
                Entity closestEntity = null;
                double lowestDistSoFar = Double.MAX_VALUE;
                for (Entity entity : loc.getWorld().getNearbyEntities(loc, 100, 100, 100)) {
                    if (entity instanceof Player) {
                        double distance = entity.getLocation().distance(loc);
                        if (distance < lowestDistSoFar) {
                            lowestDistSoFar = distance;
                            closestEntity = entity;

                        }
                    }
                }
                if (closestEntity != null) {
                    if (args[0].equalsIgnoreCase("copper_claymore")) {
                        ((Player) closestEntity).getInventory().addItem(Copper.copperClaymore);
                    }
                    if (args[0].equalsIgnoreCase("iron_claymore")) {
                        ((Player) closestEntity).getInventory().addItem(Iron.ironClaymore);
                    }
                    if (args[0].equalsIgnoreCase("diamond_claymore")) {
                        ((Player) closestEntity).getInventory().addItem(Diamond.diamondClaymore);
                    }
                    if (args[0].equalsIgnoreCase("golden_claymore")) {
                        ((Player) closestEntity).getInventory().addItem(Gold.goldClaymore);
                    }
                    if (args[0].equalsIgnoreCase("copper_hand_axe")) {
                        ((Player) closestEntity).getInventory().addItem(weapons.epic.epic.weapons.Epic.items.war_axes.Copper.copperWarAxe);
                    }
                    if (args[0].equalsIgnoreCase("iron_hand_axe")) {
                        ((Player) closestEntity).getInventory().addItem(weapons.epic.epic.weapons.Epic.items.war_axes.Iron.ironWarAxe);
                    }
                    if (args[0].equalsIgnoreCase("diamond_hand_axe")) {
                        ((Player) closestEntity).getInventory().addItem(weapons.epic.epic.weapons.Epic.items.war_axes.Diamond.diamondWarAxe);
                    }
                    if (args[0].equalsIgnoreCase("golden_hand_axe")) {
                        ((Player) closestEntity).getInventory().addItem(weapons.epic.epic.weapons.Epic.items.war_axes.Gold.goldWarAxe);
                    }
                    if (args[0].equalsIgnoreCase("copper_scythe")) {
                        ((Player) closestEntity).getInventory().addItem(weapons.epic.epic.weapons.Epic.items.scythes.Copper.copperScythe);
                    }
                    if (args[0].equalsIgnoreCase("iron_scythe")) {
                        ((Player) closestEntity).getInventory().addItem(weapons.epic.epic.weapons.Epic.items.scythes.Iron.ironScythe);
                    }
                    if (args[0].equalsIgnoreCase("diamond_scythe")) {
                        ((Player) closestEntity).getInventory().addItem(weapons.epic.epic.weapons.Epic.items.scythes.Diamond.diamondScythe);
                    }
                    if (args[0].equalsIgnoreCase("gold_scythe")) {
                        ((Player) closestEntity).getInventory().addItem(weapons.epic.epic.weapons.Epic.items.scythes.Gold.goldScythe);
                    }
                    if (args[0].equalsIgnoreCase("copper_double_blade")) {
                        ((Player) closestEntity).getInventory().addItem(weapons.epic.epic.weapons.Epic.items.double_blades.Copper.copperDoubleBlade);
                    }
                    if (args[0].equalsIgnoreCase("iron_double_blade")) {
                        ((Player) closestEntity).getInventory().addItem(weapons.epic.epic.weapons.Epic.items.double_blades.Iron.ironDoubleBlade);
                    }
                    if (args[0].equalsIgnoreCase("diamond_double_blade")) {
                        ((Player) closestEntity).getInventory().addItem(weapons.epic.epic.weapons.Epic.items.double_blades.Diamond.diamondDoubleBlade);
                    }
                    if (args[0].equalsIgnoreCase("golden_double_blade")) {
                        ((Player) closestEntity).getInventory().addItem(weapons.epic.epic.weapons.Epic.items.double_blades.Gold.goldDoubleBlade);
                    }
                    if (args[0].equalsIgnoreCase("iron_karambit")) {
                        ((Player) closestEntity).getInventory().addItem(weapons.epic.epic.weapons.Epic.items.karambits.Iron.ironKarambit);
                    }
                    if (args[0].equalsIgnoreCase("diamond_karambit")) {
                        ((Player) closestEntity).getInventory().addItem(weapons.epic.epic.weapons.Epic.items.karambits.Diamond.diamondKarambit);
                    }
                    if (args[0].equalsIgnoreCase("copper_karambit")) {
                        ((Player) closestEntity).getInventory().addItem(weapons.epic.epic.weapons.Epic.items.karambits.Copper.copperKarambit);
                    }
                    if (args[0].equalsIgnoreCase("gold_karambit")) {
                        ((Player) closestEntity).getInventory().addItem(weapons.epic.epic.weapons.Epic.items.karambits.Gold.goldKarambit);
                    }
                    if (args[0].equalsIgnoreCase("op_scythe")) {
                        ((Player) closestEntity).getInventory().addItem(weapons.epic.epic.weapons.Epic.items.scythes.Diamond.opDiamondScythe);
                    }
                    if (args[0].equalsIgnoreCase("op_claymore")) {
                        ((Player)closestEntity).getInventory().addItem(Diamond.opDiamondClaymore);
                    }

                }
            } else if (sender instanceof Player) {
                Player player = (Player) sender;
                if (player.isOp()){
                    if (args[0].equalsIgnoreCase("copper_claymore")) {
                        player.getInventory().addItem(Copper.copperClaymore);
                    }
                    if (args[0].equalsIgnoreCase("iron_claymore")) {
                        player.getInventory().addItem(Iron.ironClaymore);
                    }
                    if (args[0].equalsIgnoreCase("diamond_claymore")) {
                        player.getInventory().addItem(Diamond.diamondClaymore);
                    }
                    if (args[0].equalsIgnoreCase("golden_claymore")) {
                        player.getInventory().addItem(Gold.goldClaymore);
                    }
                    if (args[0].equalsIgnoreCase("copper_hand_axe")) {
                        player.getInventory().addItem(weapons.epic.epic.weapons.Epic.items.war_axes.Copper.copperWarAxe);
                    }
                    if (args[0].equalsIgnoreCase("iron_hand_axe")) {
                        player.getInventory().addItem(weapons.epic.epic.weapons.Epic.items.war_axes.Iron.ironWarAxe);
                    }
                    if (args[0].equalsIgnoreCase("diamond_hand_axe")) {
                        player.getInventory().addItem(weapons.epic.epic.weapons.Epic.items.war_axes.Diamond.diamondWarAxe);
                    }
                    if (args[0].equalsIgnoreCase("golden_hand_axe")) {
                        player.getInventory().addItem(weapons.epic.epic.weapons.Epic.items.war_axes.Gold.goldWarAxe);
                    }
                    if (args[0].equalsIgnoreCase("copper_scythe")) {
                        player.getInventory().addItem(weapons.epic.epic.weapons.Epic.items.scythes.Copper.copperScythe);
                    }
                    if (args[0].equalsIgnoreCase("iron_scythe")) {
                        player.getInventory().addItem(weapons.epic.epic.weapons.Epic.items.scythes.Iron.ironScythe);
                    }
                    if (args[0].equalsIgnoreCase("diamond_scythe")) {
                        player.getInventory().addItem(weapons.epic.epic.weapons.Epic.items.scythes.Diamond.diamondScythe);
                    }
                    if (args[0].equalsIgnoreCase("gold_scythe")) {
                        player.getInventory().addItem(weapons.epic.epic.weapons.Epic.items.scythes.Gold.goldScythe);
                    }
                    if (args[0].equalsIgnoreCase("copper_double_blade")) {
                        player.getInventory().addItem(weapons.epic.epic.weapons.Epic.items.double_blades.Copper.copperDoubleBlade);
                    }
                    if (args[0].equalsIgnoreCase("iron_double_blade")) {
                        player.getInventory().addItem(weapons.epic.epic.weapons.Epic.items.double_blades.Iron.ironDoubleBlade);
                    }
                    if (args[0].equalsIgnoreCase("diamond_double_blade")) {
                        player.getInventory().addItem(weapons.epic.epic.weapons.Epic.items.double_blades.Diamond.diamondDoubleBlade);
                    }
                    if (args[0].equalsIgnoreCase("golden_double_blade")) {
                        player.getInventory().addItem(weapons.epic.epic.weapons.Epic.items.double_blades.Gold.goldDoubleBlade);
                    }
                    if (args[0].equalsIgnoreCase("iron_karambit")) {
                        player.getInventory().addItem(weapons.epic.epic.weapons.Epic.items.karambits.Iron.ironKarambit);
                    }
                    if (args[0].equalsIgnoreCase("diamond_karambit")) {
                        player.getInventory().addItem(weapons.epic.epic.weapons.Epic.items.karambits.Diamond.diamondKarambit);
                    }
                    if (args[0].equalsIgnoreCase("copper_karambit")) {
                        player.getInventory().addItem(weapons.epic.epic.weapons.Epic.items.karambits.Copper.copperKarambit);
                    }
                    if (args[0].equalsIgnoreCase("gold_karambit")) {
                        player.getInventory().addItem(weapons.epic.epic.weapons.Epic.items.karambits.Gold.goldKarambit);
                    }
                    if (args[0].equalsIgnoreCase("op_scythe")) {
                        player.getInventory().addItem(weapons.epic.epic.weapons.Epic.items.scythes.Diamond.opDiamondScythe);
                    }
                    if (args[0].equalsIgnoreCase("op_claymore")) {
                        player.getInventory().addItem(Diamond.opDiamondClaymore);
                    }
                }
            }
        }
        return true;
    }
}