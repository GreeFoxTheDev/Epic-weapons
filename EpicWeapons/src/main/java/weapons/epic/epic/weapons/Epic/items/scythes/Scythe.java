package weapons.epic.epic.weapons.Epic.items.scythes;

import org.bukkit.plugin.java.JavaPlugin;

public class Scythe extends JavaPlugin {

    public static void init() {
        Copper.init();
        Diamond.init();
        Gold.init();
        Iron.init();
    }
}