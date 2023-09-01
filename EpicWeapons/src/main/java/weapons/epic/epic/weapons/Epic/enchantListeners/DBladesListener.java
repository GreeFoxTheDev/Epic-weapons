package weapons.epic.epic.weapons.Epic.enchantListeners;

import org.bukkit.ChatColor;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import weapons.epic.epic.weapons.Epic.EpicWeapons;

import java.util.List;

public class DBladesListener implements Listener {
    EpicWeapons plugin;

    public DBladesListener(EpicWeapons plugin) {
        this.plugin = plugin;
    }


    @EventHandler
    public void onApplyIron(InventoryClickEvent event) {
        if (event.getCurrentItem() != null) {
            if (event.getCurrentItem().hasItemMeta() && event.getCurrentItem().getItemMeta().hasLocalizedName()) {
                if (event.getCurrentItem().getItemMeta().getLocalizedName().equals("iron_dblade")) {
                    ItemStack item = event.getCurrentItem();
                    ItemMeta im = item.getItemMeta();
                    List<String> lore = im.getLore();
                    if (item.getItemMeta().hasEnchant(Enchantment.DAMAGE_ALL)) {
                        int enchLevel = im.getEnchantLevel(Enchantment.DAMAGE_ALL);
                        double sharpDamage = 0.5 * enchLevel + 0.5;
                        double finalDamage = (7 + sharpDamage);
                        String finalDamageString = String.valueOf(finalDamage);
                        assert lore != null;
                        String lore0 = lore.get(0);
                        String lore1 = lore.get(1);
                        String lore3 = lore.get(3);
                        String lore4 = lore.get(4);
                        String lore5 = lore.get(5);
                        String lore6 = lore.get(6);

                        lore.clear();
                        lore.add(lore0);
                        lore.add(lore1);
                        lore.add(ChatColor.DARK_GREEN + " " + finalDamageString + " Attack Damage");
                        lore.add(lore3);
                        lore.add(lore4);
                        lore.add(lore5);
                        lore.add(lore6);
                        im.setLore(lore);
                        item.setItemMeta(im);
                    }
                }
            }
        }
    }

    @EventHandler
    public void onApplyDiamond(InventoryClickEvent event) {
        if (event.getCurrentItem() != null) {
            if (event.getCurrentItem().hasItemMeta() && event.getCurrentItem().getItemMeta().hasLocalizedName()) {
                if (event.getCurrentItem().getItemMeta() != null) {
                    if (event.getCurrentItem().getItemMeta().getLocalizedName().equals("diamond_dblade")) {
                        ItemStack item = event.getCurrentItem();
                        ItemMeta im = item.getItemMeta();
                        List<String> lore = im.getLore();
                        if (item.getItemMeta().hasEnchant(Enchantment.DAMAGE_ALL)) {
                            int enchLevel = im.getEnchantLevel(Enchantment.DAMAGE_ALL);
                            double sharpDamage = 0.5 * enchLevel + 0.5;
                            double finalDamage = (8 + sharpDamage);
                            String finalDamageString = String.valueOf(finalDamage);
                            assert lore != null;
                            String lore0 = lore.get(0);
                            String lore1 = lore.get(1);
                            String lore3 = lore.get(3);
                            String lore4 = lore.get(4);
                            String lore5 = lore.get(5);
                            String lore6 = lore.get(6);

                            lore.clear();
                            lore.add(lore0);
                            lore.add(lore1);
                            lore.add(ChatColor.DARK_GREEN + " " + finalDamageString + " Attack Damage");
                            lore.add(lore3);
                            lore.add(lore4);
                            lore.add(lore5);
                            lore.add(lore6);
                            im.setLore(lore);
                            item.setItemMeta(im);
                        }
                    }
                }
            }
        }
    }

    @EventHandler
    public void onApplyCopper(InventoryClickEvent event) {
        if (event.getCurrentItem() != null) {
            if (event.getCurrentItem().hasItemMeta() && event.getCurrentItem().getItemMeta().hasLocalizedName()) {
                if (event.getCurrentItem().getItemMeta() != null) {
                    if (event.getCurrentItem().getItemMeta().getLocalizedName().equals("copper_dblade")) {
                        ItemStack item = event.getCurrentItem();
                        ItemMeta im = item.getItemMeta();
                        List<String> lore = im.getLore();
                        if (item.getItemMeta().hasEnchant(Enchantment.DAMAGE_ALL)) {
                            int enchLevel = im.getEnchantLevel(Enchantment.DAMAGE_ALL);
                            double sharpDamage = 0.5 * enchLevel + 0.5;
                            double finalDamage = (6.5 + sharpDamage);
                            String finalDamageString = String.valueOf(finalDamage);
                            assert lore != null;
                            String lore0 = lore.get(0);
                            String lore1 = lore.get(1);
                            String lore3 = lore.get(3);
                            String lore4 = lore.get(4);
                            String lore5 = lore.get(5);
                            String lore6 = lore.get(6);

                            lore.clear();
                            lore.add(lore0);
                            lore.add(lore1);
                            lore.add(ChatColor.DARK_GREEN + " " + finalDamageString + " Attack Damage");
                            lore.add(lore3);
                            lore.add(lore4);
                            lore.add(lore5);
                            lore.add(lore6);
                            im.setLore(lore);
                            item.setItemMeta(im);
                        }
                    }
                }
            }
        }
    }

    @EventHandler
    public void onApplyLightGold(InventoryClickEvent event) {
        if (event.getCurrentItem() != null) {
            if (event.getCurrentItem().hasItemMeta() && event.getCurrentItem().getItemMeta().hasLocalizedName()) {
                if (event.getCurrentItem().getItemMeta() != null) {
                    if (event.getCurrentItem().getItemMeta().getLocalizedName().equals("gold_dblade")) {
                        ItemStack item = event.getCurrentItem();
                        ItemMeta im = item.getItemMeta();
                        List<String> lore = im.getLore();
                        if (item.getItemMeta().hasEnchant(Enchantment.DAMAGE_ALL)) {
                            int enchLevel = im.getEnchantLevel(Enchantment.DAMAGE_ALL);
                            double sharpDamage = 0.5 * enchLevel + 0.5;
                            double finalDamage = (6 + sharpDamage);
                            String finalDamageString = String.valueOf(finalDamage);
                            assert lore != null;
                            String lore0 = lore.get(0);
                            String lore1 = lore.get(1);
                            String lore3 = lore.get(3);
                            String lore4 = lore.get(4);
                            String lore5 = lore.get(5);
                            String lore6 = lore.get(6);

                            lore.clear();
                            lore.add(lore0);
                            lore.add(lore1);
                            lore.add(ChatColor.DARK_GREEN + " " + finalDamageString + " Attack Damage");
                            lore.add(lore3);
                            lore.add(lore4);
                            lore.add(lore5);
                            lore.add(lore6);
                            im.setLore(lore);
                            item.setItemMeta(im);
                        }
                    }
                }
            }
        }
    }
}
