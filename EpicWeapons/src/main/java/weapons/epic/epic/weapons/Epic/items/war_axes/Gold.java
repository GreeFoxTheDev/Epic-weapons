package weapons.epic.epic.weapons.Epic.items.war_axes;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Gold extends JavaPlugin {
    public static ItemStack goldWarAxe;

    public static void init() {
        createGoldWarAxe();
    }

    private static void createGoldWarAxe() {
        ItemStack item = new ItemStack(Material.GOLDEN_AXE, 1);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName("§fGolden Hand Axe");
        im.setLocalizedName("golden_war_axe");
        im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        im.setCustomModelData(5875100);

        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", -3, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", 9, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);

        im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, speed);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);

        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GRAY + "When in Main Hand:");
        lore.add(ChatColor.DARK_GREEN + " 9 attack damage");
        lore.add(ChatColor.DARK_GREEN + " 1 attack speed");
        lore.add("");
        lore.add(ChatColor.YELLOW + "Custom ability: " + ChatColor.GRAY + "Right click to throw!");
        lore.add("");
        im.setLore(lore);
        item.setItemMeta(im);
        goldWarAxe = item;
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("gold_war_axe"), item);
        sr.shape("XYX", "XZX", " Z ");
        sr.setIngredient('X', Material.GOLD_INGOT);
        sr.setIngredient('Y', Material.GOLD_BLOCK);
        sr.setIngredient('Z', Material.STICK);
        Bukkit.getServer().addRecipe(sr);
    }
}
