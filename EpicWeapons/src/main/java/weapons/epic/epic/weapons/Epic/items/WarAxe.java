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

public class WarAxe extends JavaPlugin {
    public static ItemStack ironWarAxe;
    public static ItemStack copperWarAxe;
    public static ItemStack diamondWarAxe;
    public static ItemStack goldWarAxe;

    public static void init() {
        createIronWarAxe();
        createCopperWarAxe();
        createDiamondWarAxe();
        createGoldWarAxe();
    }

    private static void createIronWarAxe() {
        ItemStack item = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName("§fCopper War Axe");
        im.setLocalizedName("copperWarAxe");
        im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        im.setCustomModelData(300);

        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", -5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", 11, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);

        im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, speed);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);

        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GRAY + "When in Main Hand:");
        lore.add(ChatColor.DARK_GREEN + " 11 attack damage");
        lore.add(ChatColor.DARK_GREEN + " X attack speed");
        im.setLore(lore);
        item.setItemMeta(im);
        ironWarAxe = item;
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("iron_war_axe"), item);
        sr.shape("XYX", "XZX", " Z ");
        sr.setIngredient('X', new RecipeChoice.MaterialChoice(Material.IRON_INGOT));
        sr.setIngredient('Y', new RecipeChoice.MaterialChoice(Material.IRON_BLOCK));
        sr.setIngredient('Z', new RecipeChoice.ExactChoice(LongStick.longStick));
        Bukkit.getServer().addRecipe(sr);
    }

    private static void createCopperWarAxe() {
        ItemStack item = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName("§fIron War Axe");
        im.setLocalizedName("ironWarAxe");
        im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        im.setCustomModelData(310);

        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", -5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", 10, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);

        im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, speed);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);

        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GRAY + "When in Main Hand:");
        lore.add(ChatColor.DARK_GREEN + " 10 attack damage");
        lore.add(ChatColor.DARK_GREEN + " X attack speed");
        im.setLore(lore);
        item.setItemMeta(im);
        copperWarAxe = item;
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("copper_war_axe"), item);
        sr.shape("XYX", "XZX", " Z ");
        sr.setIngredient('X', new RecipeChoice.MaterialChoice(Material.COPPER_INGOT));
        sr.setIngredient('Y', new RecipeChoice.MaterialChoice(Material.COPPER_BLOCK));
        sr.setIngredient('Z', new RecipeChoice.ExactChoice(LongStick.longStick));
        Bukkit.getServer().addRecipe(sr);
    }

    private static void createDiamondWarAxe() {
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName("§fDiamond War Axe");
        im.setLocalizedName("diamondWarAxe");
        im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        im.setCustomModelData(300);

        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", -5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", 12, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);

        im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, speed);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);

        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GRAY + "When in Main Hand:");
        lore.add(ChatColor.DARK_GREEN + " 12 attack damage");
        lore.add(ChatColor.DARK_GREEN + " X attack speed");
        im.setLore(lore);
        item.setItemMeta(im);
        diamondWarAxe = item;
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("copper_war_axe"), item);
        sr.shape("XYX", "XZX", " Z ");
        sr.setIngredient('X', new RecipeChoice.MaterialChoice(Material.DIAMOND));
        sr.setIngredient('Y', new RecipeChoice.MaterialChoice(Material.DIAMOND_BLOCK));
        sr.setIngredient('Z', new RecipeChoice.ExactChoice(LongStick.longStick));
        Bukkit.getServer().addRecipe(sr);
    }

    private static void createGoldWarAxe() {
        ItemStack item = new ItemStack(Material.GOLDEN_SWORD, 1);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName("§fGolden War Axe");
        im.setLocalizedName("goldWarAxe");
        im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        im.setCustomModelData(300);

        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", -5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", 9, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);

        im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, speed);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);

        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GRAY + "When in Main Hand:");
        lore.add(ChatColor.DARK_GREEN + " 9 attack damage");
        lore.add(ChatColor.DARK_GREEN + " X attack speed");
        im.setLore(lore);
        item.setItemMeta(im);
        goldWarAxe = item;
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("gold_war_axe"), item);
        sr.shape("XYX", "XZX", " Z ");
        sr.setIngredient('X', new RecipeChoice.MaterialChoice(Material.GOLD_INGOT));
        sr.setIngredient('Y', new RecipeChoice.MaterialChoice(Material.GOLD_BLOCK));
        sr.setIngredient('Z', new RecipeChoice.ExactChoice(LongStick.longStick));
        Bukkit.getServer().addRecipe(sr);
    }
}


























