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

public class Scythe extends JavaPlugin {
    public static ItemStack ironScythe;
    public static ItemStack diamondScythe;
    public static ItemStack goldScythe;
    public static ItemStack copperScythe;

    public static void init() {
        createDiamondScythe();
        createIronScythe();
        createGoldScythe();
        createCopperScythe();
    }

    private static void createIronScythe() {
        ItemStack item = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta im = item.getItemMeta();
        assert im != null;
        im.setDisplayName("§fIron Scythe");
        im.setLocalizedName("ironScythe");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GRAY + "When in Main Hand:");
        lore.add(ChatColor.DARK_GREEN + " 10 Attack Damage");
        lore.add(ChatColor.DARK_GREEN + " 1.0 Attack Speed");
        im.setLore(lore);
        im.setCustomModelData(200);
        im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", -3, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", 10, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);

        im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, speed);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);

        item.setItemMeta(im);
        ironScythe = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("iron_scythe1"), item);
        sr.shape("XYX", "XZ ", " Z ");
        sr.setIngredient('X', new RecipeChoice.MaterialChoice(Material.IRON_INGOT));
        sr.setIngredient('Y', new RecipeChoice.MaterialChoice(Material.IRON_BLOCK));
        sr.setIngredient('Z', new RecipeChoice.ExactChoice(LongStick.longStick));

        ShapedRecipe sr2 = new ShapedRecipe(NamespacedKey.minecraft("iron_scythe2"), item);
        sr2.shape("XYX", " ZX", " Z ");
        sr2.setIngredient('X', new RecipeChoice.MaterialChoice(Material.IRON_INGOT));
        sr2.setIngredient('Y', new RecipeChoice.MaterialChoice(Material.IRON_BLOCK));
        sr2.setIngredient('Z', new RecipeChoice.ExactChoice(LongStick.longStick));

        Bukkit.getServer().addRecipe(sr);
        Bukkit.getServer().addRecipe(sr2);
    }

    private static void createDiamondScythe() {
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta im = item.getItemMeta();
        assert im != null;
        im.setDisplayName("§fDiamond Scythe");
        im.setLocalizedName("diamondScythe");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GRAY + "When in Main Hand:");
        lore.add(ChatColor.DARK_GREEN + " 11 Attack Damage");
        lore.add(ChatColor.DARK_GREEN + " 1.0 Attack Speed");
        im.setLore(lore);
        im.setCustomModelData(200);
        im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", -3, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", 11, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);

        im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, speed);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);

        item.setItemMeta(im);
        diamondScythe = item;
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("diamond_scythe1"), item);
        sr.shape("XYX", "XZ ", " Z ");
        sr.setIngredient('X', new RecipeChoice.MaterialChoice(Material.DIAMOND));
        sr.setIngredient('Y', new RecipeChoice.MaterialChoice(Material.DIAMOND_BLOCK));
        sr.setIngredient('Z', new RecipeChoice.ExactChoice(LongStick.longStick));

        ShapedRecipe sr2 = new ShapedRecipe(NamespacedKey.minecraft("diamond_scythe2"), item);
        sr2.shape("XYX", " ZX", " Z ");
        sr2.setIngredient('X', new RecipeChoice.MaterialChoice(Material.DIAMOND));
        sr2.setIngredient('Y', new RecipeChoice.MaterialChoice(Material.DIAMOND_BLOCK));
        sr2.setIngredient('Z', new RecipeChoice.ExactChoice(LongStick.longStick));

        SmithingRecipe smr = new SmithingRecipe(NamespacedKey.minecraft("netherite_scythe"), item, new RecipeChoice.ExactChoice(diamondScythe), new RecipeChoice.MaterialChoice(Material.NETHERITE_INGOT));

        Bukkit.getServer().addRecipe(sr);
        Bukkit.getServer().addRecipe(sr2);
        Bukkit.getServer().addRecipe(smr);
    }

    private static void createGoldScythe() {
        ItemStack item = new ItemStack(Material.GOLDEN_SWORD, 1);
        ItemMeta im = item.getItemMeta();
        assert im != null;
        im.setDisplayName("§fGolden Scythe");
        im.setLocalizedName("goldScythe");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GRAY + "When in Main Hand:");
        lore.add(ChatColor.DARK_GREEN + " 8 Attack Damage");
        lore.add(ChatColor.DARK_GREEN + " 1.0 Attack Speed");
        im.setLore(lore);
        im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        im.setCustomModelData(200);

        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", -3, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", 8, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);

        im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, speed);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);

        item.setItemMeta(im);
        goldScythe = item;
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("gold_scythe1"), item);
        sr.shape("XYX", "XZ ", " Z ");
        sr.setIngredient('X', new RecipeChoice.MaterialChoice(Material.GOLD_INGOT));
        sr.setIngredient('Y', new RecipeChoice.MaterialChoice(Material.GOLD_BLOCK));
        sr.setIngredient('Z', new RecipeChoice.ExactChoice(LongStick.longStick));

        ShapedRecipe sr2 = new ShapedRecipe(NamespacedKey.minecraft("gold_scythe2"), item);
        sr2.shape("XYX", " ZX", " Z ");
        sr2.setIngredient('X', new RecipeChoice.MaterialChoice(Material.GOLD_INGOT));
        sr2.setIngredient('Y', new RecipeChoice.MaterialChoice(Material.GOLD_BLOCK));
        sr2.setIngredient('Z', new RecipeChoice.ExactChoice(LongStick.longStick));
        Bukkit.getServer().addRecipe(sr);
        Bukkit.getServer().addRecipe(sr2);
    }

    private static void createCopperScythe() {
        ItemStack item = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta im = item.getItemMeta();
        assert im != null;
        im.setDisplayName("§fCopper Scythe");
        im.setLocalizedName("copperScythe");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GRAY + "When in Main Hand:");
        lore.add(ChatColor.DARK_GREEN + " 9 Attack Damage");
        lore.add(ChatColor.DARK_GREEN + " 1.0 Attack Speed");
        im.setLore(lore);
        im.setCustomModelData(210);
        im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", -3, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", 9, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);

        im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, speed);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);

        item.setItemMeta(im);
        copperScythe = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("copper_scythe1"), item);
        sr.shape("XYX", "XZ ", " Z ");
        sr.setIngredient('X', new RecipeChoice.MaterialChoice(Material.COPPER_INGOT));
        sr.setIngredient('Y', new RecipeChoice.MaterialChoice(Material.COPPER_BLOCK));
        sr.setIngredient('Z', new RecipeChoice.ExactChoice(LongStick.longStick));

        ShapedRecipe sr2 = new ShapedRecipe(NamespacedKey.minecraft("copper_scythe2"), item);
        sr2.shape("XYX", " ZX", " Z ");
        sr2.setIngredient('X', new RecipeChoice.MaterialChoice(Material.COPPER_INGOT));
        sr2.setIngredient('Y', new RecipeChoice.MaterialChoice(Material.COPPER_BLOCK));
        sr2.setIngredient('Z', new RecipeChoice.ExactChoice(LongStick.longStick));

        Bukkit.getServer().addRecipe(sr);
        Bukkit.getServer().addRecipe(sr2);
    }
}