package weapons.epic.epic.weapons.Epic.items.karambits;

import org.bukkit.plugin.java.JavaPlugin;

public class Karambits extends JavaPlugin {
    public static void init(){
        Iron.init();
        Diamond.init();
        Gold.init();
        Copper.init();
    }
}
