package weapons.epic.epic.weapons.Epic.items.claymores;

import org.bukkit.plugin.java.JavaPlugin;

public class Claymore extends JavaPlugin {
    public static void init() {
        Copper.init();
        Diamond.init();
        Gold.init();
        Iron.init();
    }
}
