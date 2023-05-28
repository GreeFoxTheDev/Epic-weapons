package weapons.epic.epic.weapons.Epic.enchantListeners;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import weapons.epic.epic.weapons.Epic.EpicWeapons;

import java.util.List;
import java.util.Objects;

public class ScytheEnchant implements Listener {
    EpicWeapons plugin;

    public ScytheEnchant(EpicWeapons plugin) {
        this.plugin = plugin;
    }
    

    @EventHandler
    public void onApplyIron(InventoryClickEvent event) {
        if (Objects.requireNonNull(event.getCurrentItem()).getItemMeta() != null) {
            if (event.getCurrentItem().getItemMeta().getLocalizedName().equalsIgnoreCase("ironScythe")) {
                event.getWhoClicked().sendMessage("test1");
                ItemStack item = event.getCurrentItem();
                ItemMeta im = item.getItemMeta();
                List<String> lore = im.getLore();
                if (item.getItemMeta().hasEnchant(Enchantment.DAMAGE_ALL)) {
                    int enchLevel = im.getEnchantLevel(Enchantment.DAMAGE_ALL);
                    int finalDamage = 10 + enchLevel;
                    String finalDamageString = String.valueOf(finalDamage);
                    assert lore != null;
                    String lore0 = lore.get(0);
                    String lore1 = lore.get(1);
                    String lore3 = lore.get(3);

                    lore.clear();
                    lore.add(lore0);
                    lore.add(lore1);
                    lore.add(ChatColor.DARK_GREEN + " " + finalDamageString + " attack damage");
                    lore.add(lore3);
                    im.setLore(lore);

                    String name = im.getDisplayName();
                    im.setDisplayName(ChatColor.AQUA + name);
                    item.setItemMeta(im);
                }
            }
        }
    }

    @EventHandler
    public void onApplyGold(InventoryClickEvent event) {
        if (Objects.requireNonNull(event.getCurrentItem()).getItemMeta() != null) {
            if (event.getCurrentItem().getItemMeta().getLocalizedName().equalsIgnoreCase("goldScythe")) {
                event.getWhoClicked().sendMessage("test2");
                ItemStack item = event.getCurrentItem();
                ItemMeta im = item.getItemMeta();
                List<String> lore = im.getLore();
                if (item.getItemMeta().hasEnchant(Enchantment.DAMAGE_ALL)) {
                    int enchLevel = im.getEnchantLevel(Enchantment.DAMAGE_ALL);
                    int finalDamage = 8 + enchLevel;
                    String finalDamageString = String.valueOf(finalDamage);
                    assert lore != null;
                    String lore0 = lore.get(0);
                    String lore1 = lore.get(1);
                    String lore3 = lore.get(3);

                    lore.clear();
                    lore.add(lore0);
                    lore.add(lore1);
                    lore.add(ChatColor.DARK_GREEN + " " + finalDamageString + " attack damage");
                    lore.add(lore3);
                    im.setLore(lore);
                    item.setItemMeta(im);
                }
            }
        }
    }

    @EventHandler
    public void onApplyDiamond(InventoryClickEvent event) {
        if (Objects.requireNonNull(event.getCurrentItem()).getItemMeta() != null) {
            if (event.getCurrentItem().getItemMeta().getLocalizedName().equalsIgnoreCase("diamondScythe")) {
                event.getWhoClicked().sendMessage("test3");
                ItemStack item = event.getCurrentItem();
                ItemMeta im = item.getItemMeta();
                List<String> lore = im.getLore();
                if (item.getItemMeta().hasEnchant(Enchantment.DAMAGE_ALL)) {
                    int enchLevel = im.getEnchantLevel(Enchantment.DAMAGE_ALL);
                    int finalDamage = 11 + enchLevel;
                    String finalDamageString = String.valueOf(finalDamage);
                    assert lore != null;
                    String lore0 = lore.get(0);
                    String lore1 = lore.get(1);
                    String lore3 = lore.get(3);

                    lore.clear();
                    lore.add(lore0);
                    lore.add(lore1);
                    lore.add(ChatColor.DARK_GREEN + " " + finalDamageString + " attack damage");
                    lore.add(lore3);
                    im.setLore(lore);
                    item.setItemMeta(im);
                }
            }
        }
    }

    @EventHandler
    public void onApplyCopper(InventoryClickEvent event) {
        if (Objects.requireNonNull(event.getCurrentItem()).getItemMeta() != null) {
            if (event.getCurrentItem().getItemMeta().getLocalizedName().equals("copperScythe")) {
                event.getWhoClicked().sendMessage("test4");
                ItemStack item = event.getCurrentItem();
                ItemMeta im = item.getItemMeta();
                List<String> lore = im.getLore();
                if (item.getItemMeta().hasEnchant(Enchantment.DAMAGE_ALL)) {
                    int enchLevel = im.getEnchantLevel(Enchantment.DAMAGE_ALL);
                    int finalDamage = 9 + enchLevel;
                    String finalDamageString = String.valueOf(finalDamage);
                    assert lore != null;
                    String lore0 = lore.get(0);
                    String lore1 = lore.get(1);
                    String lore3 = lore.get(3);

                    lore.clear();
                    lore.add(lore0);
                    lore.add(lore1);
                    lore.add(ChatColor.DARK_GREEN + " " + finalDamageString + " attack damage");
                    lore.add(lore3);
                    im.setLore(lore);
                    item.setItemMeta(im);
                }
            }
        }
    }
}
