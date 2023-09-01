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

public class Iron extends JavaPlugin {
    public static ItemStack ironScythe;

    public static void init() {
        createIronScythe();
    }

    private static void createIronScythe() {
        ItemStack item = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta im = item.getItemMeta();
        assert im != null;
        im.setDisplayName("§fIron Scythe");
        im.setLocalizedName("iron_scythe");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GRAY + "When in Main Hand:");
        lore.add(ChatColor.DARK_GREEN + " 5 Attack Damage");
        lore.add(ChatColor.DARK_GREEN + " 1.0 Attack Speed");
        lore.add("");
        lore.add(ChatColor.YELLOW + "Custom ability: " + ChatColor.GRAY + "Sweep attack");
        lore.add("");
        im.setLore(lore);
        im.setCustomModelData(200);
        im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", -3, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", 3, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);

        im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, speed);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);

        item.setItemMeta(im);
        ironScythe = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("iron_scythe1"), item);
        sr.shape("XYX", "XZ ", " Z ");
        sr.setIngredient('X', Material.IRON_INGOT);
        sr.setIngredient('Y', Material.IRON_BLOCK);
        sr.setIngredient('Z', Material.STICK);

        ShapedRecipe sr2 = new ShapedRecipe(NamespacedKey.minecraft("iron_scythe2"), item);
        sr2.shape("XYX", " ZX", " Z ");
        sr2.setIngredient('X', Material.IRON_INGOT);
        sr2.setIngredient('Y', Material.IRON_BLOCK);
        sr2.setIngredient('Z', Material.STICK);

        Bukkit.getServer().addRecipe(sr);
        Bukkit.getServer().addRecipe(sr2);
    }
}
