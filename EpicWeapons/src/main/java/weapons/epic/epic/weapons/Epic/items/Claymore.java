package weapons.epic.epic.weapons.Epic.items;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Claymore extends JavaPlugin {
    public static ItemStack ironClaymore;
    public static ItemStack diamondClaymore;
    public static ItemStack copperClaymore;
    public static ItemStack goldClaymore;

    public static void init() {
        createIronClaymore();
        createDiamondClaymore();
        createCopperClaymore();
        createGoldClaymore();
    }

    private static void createIronClaymore() {
        ItemStack item = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName(ChatColor.WHITE + "Iron Claymore");
        im.setLocalizedName("iron_claymore");
        im.setCustomModelData(3005890);
        im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.GRAY + "When in Main Hand:");
        lore.add(ChatColor.DARK_GREEN + " 7.3 attack damage");
        lore.add(ChatColor.DARK_GREEN + " X attack speed");
        im.setLore(lore);

        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", -2.5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", 7.3, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);

        im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, speed);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);
        item.setItemMeta(im);
        ironClaymore = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("iron_claymore"), item);
        sr.shape(" X ", " X ", " Y ");
        sr.setIngredient('X', new RecipeChoice.MaterialChoice(Material.IRON_BLOCK));
        sr.setIngredient('Y', new RecipeChoice.ExactChoice(LongStick.longStick));
        Bukkit.getServer().addRecipe(sr);
    }

    private static void createDiamondClaymore() {
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName(ChatColor.WHITE + "Diamond Claymore");
        im.setLocalizedName("diamond_claymore");
        im.setCustomModelData(3005890);
        im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.GRAY + "When in Main Hand:");
        lore.add(ChatColor.DARK_GREEN + " 8.5 attack damage");
        lore.add(ChatColor.DARK_GREEN + " X attack speed");
        im.setLore(lore);

        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", -2.5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", 8.5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);

        im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, speed);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);
        item.setItemMeta(im);
        diamondClaymore = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("diamond_claymore"), item);
        sr.shape(" X ", " X ", " Y ");
        sr.setIngredient('X', new RecipeChoice.MaterialChoice(Material.DIAMOND_BLOCK));
        sr.setIngredient('Y', new RecipeChoice.ExactChoice(LongStick.longStick));
        Bukkit.getServer().addRecipe(sr);
    }

    private static void createCopperClaymore() {
        ItemStack item = new ItemStack(Material.IRON_SWORD);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName("§fCopper Claymore");
        im.setLocalizedName("copper_claymore");
        im.setCustomModelData(3005891);
        im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.GRAY + "When in Main Hand:");
        lore.add(ChatColor.DARK_GREEN + " 6.7 attack damage");
        lore.add(ChatColor.DARK_GREEN + " X attack speed");
        im.setLore(lore);

        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", -2.5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", 6.7, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);

        im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, speed);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);
        item.setItemMeta(im);
        copperClaymore = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("copper_claymore"), item);
        sr.shape(" X ", " X ", " Y ");
        sr.setIngredient('X', new RecipeChoice.MaterialChoice(Material.COPPER_BLOCK));
        sr.setIngredient('Y', new RecipeChoice.ExactChoice(LongStick.longStick));
        Bukkit.getServer().addRecipe(sr);
    }

    private static void createGoldClaymore() {
        ItemStack item = new ItemStack(Material.GOLDEN_SWORD);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName("§fGolden Claymore");
        im.setLocalizedName("gold_claymore");
        im.setCustomModelData(3005890);
        im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.GRAY + "When in Main Hand:");
        lore.add(ChatColor.DARK_GREEN + " 7 attack damage");
        lore.add(ChatColor.DARK_GREEN + " X attack speed");
        im.setLore(lore);

        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", -2.5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", 7, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);

        im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, speed);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);
        item.setItemMeta(im);
        goldClaymore = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("gold_claymore"), item);
        sr.shape(" X ", " X ", " Y ");
        sr.setIngredient('X', new RecipeChoice.MaterialChoice(Material.GOLD_BLOCK));
        sr.setIngredient('Y', new RecipeChoice.ExactChoice(LongStick.longStick));
        Bukkit.getServer().addRecipe(sr);
    }
}
