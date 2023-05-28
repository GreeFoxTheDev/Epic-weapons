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

public class Copper extends JavaPlugin {
    public static void init(){
        createCopperDoubleBlade();
    }
    public static ItemStack copperDoubleBlade;
    private static void createCopperDoubleBlade(){
        ItemStack item = new ItemStack(Material.IRON_AXE, 1);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName(ChatColor.WHITE + "Copper Double Blade");
        im.setLocalizedName("copper_dblade");
        im.setCustomModelData(3024001);
        im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GRAY + "When in Main Hand:");
        lore.add(ChatColor.DARK_GREEN + " 6.5 Attack Damage");
        lore.add(ChatColor.DARK_GREEN + " X Attack Speed");
        lore.add("");
        lore.add(ChatColor.YELLOW + "Custom ability: " + ChatColor.GRAY + "Double attack");
        lore.add("");
        im.setLore(lore);

        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(),
                "generic.attackSpeed", -3, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, speed);
        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(),
                "generic.attackDamage", 6.5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);
        item.setItemMeta(im);
        copperDoubleBlade = item;
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("copper_dblade"), item);
        sr.shape("  X", " Y ", "X  ");
        sr.setIngredient('X', Material.COPPER_BLOCK);
        sr.setIngredient('Y', Material.STICK);
        Bukkit.getServer().addRecipe(sr);
    }
}
