package weapons.epic.epic.weapons.Epic.items.karambits;

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
    public static void init(){
        createIronKarambit();
    }
    public static ItemStack ironKarambit;
    private static void createIronKarambit() {
        ItemStack item = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName("§fIron Karambit");
        im.setLocalizedName("iron_karambit");
        im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        im.setCustomModelData(148500);

        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", -2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", 2.5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);

        im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, speed);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);

        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GRAY + "When in Main Hand:");
        lore.add(ChatColor.DARK_GREEN + " 4.5 attack damage");
        lore.add(ChatColor.DARK_GREEN + " 2.5 attack speed");
        lore.add("");
        lore.add(ChatColor.YELLOW + "Custom ability: " + ChatColor.GRAY + "More damage closer to opponent");
        lore.add("");
        im.setLore(lore);
        item.setItemMeta(im);
        ironKarambit = item;
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("iron_karambit"), item);
        sr.shape(" X ", " Y ", "  Z");
        sr.setIngredient('X', Material.IRON_INGOT);
        sr.setIngredient('Y', Material.OBSIDIAN);
        sr.setIngredient('Z', Material.STICK);
        Bukkit.getServer().addRecipe(sr);
    }
}
