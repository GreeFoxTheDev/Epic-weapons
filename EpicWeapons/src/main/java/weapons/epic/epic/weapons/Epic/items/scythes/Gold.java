package weapons.epic.epic.weapons.Epic.items.scythes;

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
    public static ItemStack goldScythe;

    public static void init() {
        createGoldScythe();
    }

    private static void createGoldScythe() {
        ItemStack item = new ItemStack(Material.GOLDEN_SWORD, 1);
        ItemMeta im = item.getItemMeta();
        assert im != null;
        im.setDisplayName("§fGolden Scythe");
        im.setLocalizedName("gold_scythe");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GRAY + "When in Main Hand:");
        lore.add(ChatColor.DARK_GREEN + " 4 Attack Damage");
        lore.add(ChatColor.DARK_GREEN + " 1.0 Attack Speed");
        lore.add("");
        lore.add(ChatColor.YELLOW + "Custom ability: " + ChatColor.GRAY + "Sweep attack");
        lore.add("");
        im.setLore(lore);
        im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        im.setCustomModelData(200);

        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", -3, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", 2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);

        im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, speed);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);

        item.setItemMeta(im);
        goldScythe = item;
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("gold_scythe1"), item);
        sr.shape("XYX", "XZ ", " Z ");
        sr.setIngredient('X', Material.GOLD_INGOT);
        sr.setIngredient('Y', Material.GOLD_BLOCK);
        sr.setIngredient('Z', Material.STICK);

        ShapedRecipe sr2 = new ShapedRecipe(NamespacedKey.minecraft("gold_scythe2"), item);
        sr2.shape("XYX", " ZX", " Z ");
        sr2.setIngredient('X', Material.GOLD_INGOT);
        sr2.setIngredient('Y', Material.GOLD_BLOCK);
        sr2.setIngredient('Z', Material.STICK);
        Bukkit.getServer().addRecipe(sr);
        Bukkit.getServer().addRecipe(sr2);
    }
}
