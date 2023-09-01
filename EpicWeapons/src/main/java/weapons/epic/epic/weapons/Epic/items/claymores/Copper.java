package weapons.epic.epic.weapons.Epic.items.claymores;

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

public class Copper extends JavaPlugin {
    public static ItemStack copperClaymore;

    public static void init() {
        createCopperClaymore();
    }

    private static void createCopperClaymore() {
        ItemStack item = new ItemStack(Material.IRON_SWORD);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName("§fCopper Claymore");
        im.setLocalizedName("copper_claymore");
        im.setCustomModelData(3005891);
        im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GRAY + "When in Main Hand:");
        lore.add(ChatColor.DARK_GREEN + " 6.7 attack damage");
        lore.add(ChatColor.DARK_GREEN + " 1.2 attack speed");
        lore.add("");
        lore.add(ChatColor.YELLOW + "Custom ability: " + ChatColor.GRAY + "A lot of");
        lore.add(ChatColor.GRAY + "damage, but can be used when");
        lore.add(ChatColor.GRAY + "nothing or " + ChatColor.YELLOW + "totem" + ChatColor.GRAY + " or " + ChatColor.YELLOW + "food");
        lore.add(ChatColor.GRAY + "in offhand.");
        lore.add("");
        im.setLore(lore);

        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", -2.5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", 6.7, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);

        im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, speed);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);
        item.setItemMeta(im);
        copperClaymore = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("copper_claymore"), item);
        sr.shape(" X ", " Y ", " Z ");
        sr.setIngredient('X', Material.COPPER_INGOT);
        sr.setIngredient('Y', Material.COPPER_BLOCK);
        sr.setIngredient('Z', Material.STICK);
        Bukkit.getServer().addRecipe(sr);
    }
}
