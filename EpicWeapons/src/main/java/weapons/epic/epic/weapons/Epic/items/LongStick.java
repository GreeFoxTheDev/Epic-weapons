package weapons.epic.epic.weapons.Epic.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class LongStick extends JavaPlugin {
    public static ItemStack longStick;

    public static void init() {
        createLongStick();

    }

    private static void createLongStick() {
        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta im = item.getItemMeta();
        assert im != null;
        im.setDisplayName("§fLong Stick");
        im.setCustomModelData(100);
        item.setItemMeta(im);
        longStick = item;
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("long_stick"), item);
        sr.shape(" X ", " X ", " X ");
        sr.setIngredient('X', Material.STICK);
        Bukkit.getServer().addRecipe(sr);
    }
}
