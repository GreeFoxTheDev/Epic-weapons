package weapons.epic.epic.weapons.Epic.items.double_blades;

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

public class Diamond extends JavaPlugin {
    public static ItemStack diamondDoubleBlade;

    public static void init() {
        createDiamondDoubleBlade();
    }

    private static void createDiamondDoubleBlade() {
        ItemStack item = new ItemStack(Material.DIAMOND_AXE, 1);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName(ChatColor.WHITE + "Diamond Double Blade");
        im.setLocalizedName("diamond_dblade");
        im.setCustomModelData(3024000);
        im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GRAY + "When in Main Hand:");
        lore.add(ChatColor.DARK_GREEN + " 8 Attack Damage");
        lore.add(ChatColor.DARK_GREEN + " 1 Attack Speed");
        lore.add("");
        lore.add(ChatColor.YELLOW + "Custom ability: " + ChatColor.GRAY + "Double attack");
        lore.add("");
        im.setLore(lore);

        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", -3, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, speed);
        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", 8, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);
        item.setItemMeta(im);
        diamondDoubleBlade = item;
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("diamond_dblade"), item);
        sr.shape("  X", " Y ", "X  ");
        sr.setIngredient('X', Material.DIAMOND_BLOCK);
        sr.setIngredient('Y', Material.STICK);
        Bukkit.getServer().addRecipe(sr);

    }
}
