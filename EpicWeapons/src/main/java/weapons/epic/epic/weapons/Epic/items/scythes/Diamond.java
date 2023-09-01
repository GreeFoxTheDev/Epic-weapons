package weapons.epic.epic.weapons.Epic.items.scythes;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Diamond extends JavaPlugin {
    public static ItemStack diamondScythe;

    public static void init() {
        createDiamondScythe();
        createOpDiamondScythe();
    }

    private static void createDiamondScythe() {
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta im = item.getItemMeta();
        assert im != null;
        im.setDisplayName("§fDiamond Scythe");
        im.setLocalizedName("diamond_scythe");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GRAY + "When in Main Hand:");
        lore.add(ChatColor.DARK_GREEN + " 6 Attack Damage");
        lore.add(ChatColor.DARK_GREEN + " 1.0 Attack Speed");
        lore.add("");
        lore.add(ChatColor.YELLOW + "Custom ability: " + ChatColor.GRAY + "Sweep attack");
        lore.add("");
        im.setLore(lore);
        im.setCustomModelData(200);
        im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", -3, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", 4, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);

        im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, speed);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);

        item.setItemMeta(im);
        diamondScythe = item;
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("diamond_scythe1"), item);
        sr.shape("XYX", "XZ ", " Z ");
        sr.setIngredient('X', Material.DIAMOND);
        sr.setIngredient('Y', Material.DIAMOND_BLOCK);
        sr.setIngredient('Z', Material.STICK);

        ShapedRecipe sr2 = new ShapedRecipe(NamespacedKey.minecraft("diamond_scythe2"), item);
        sr2.shape("XYX", " ZX", " Z ");
        sr2.setIngredient('X', Material.DIAMOND);
        sr2.setIngredient('Y', Material.DIAMOND_BLOCK);
        sr2.setIngredient('Z', Material.STICK);

        SmithingRecipe smr = new SmithingRecipe(NamespacedKey.minecraft("netherite_scythe"), item, new RecipeChoice.ExactChoice(diamondScythe), new RecipeChoice.MaterialChoice(Material.NETHERITE_INGOT));

        Bukkit.getServer().addRecipe(sr);
        Bukkit.getServer().addRecipe(sr2);
        Bukkit.getServer().addRecipe(smr);
    }
    public static ItemStack opDiamondScythe;
    private static void createOpDiamondScythe() {
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta im = item.getItemMeta();
        assert im != null;
        im.setDisplayName("§fDiamond Scythe");
        im.setLocalizedName("diamond_scythe");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GRAY + "When in Main Hand:");
        lore.add(ChatColor.DARK_GREEN + " 9 Attack Damage");
        lore.add(ChatColor.DARK_GREEN + " 1.0 Attack Speed");
        lore.add("");
        lore.add(ChatColor.YELLOW + "Custom ability: " + ChatColor.GRAY + "Sweep attack");
        lore.add("");
        im.setLore(lore);
        im.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
        im.addEnchant(Enchantment.DURABILITY, 3, true);
        im.setCustomModelData(200);
        im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", -3, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", 4, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);

        im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, speed);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);

        item.setItemMeta(im);
        opDiamondScythe = item;
    }
}
