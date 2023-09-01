package weapons.epic.epic.weapons.Epic.items.war_axes;

import org.bukkit.plugin.java.JavaPlugin;

public class WarAxe extends JavaPlugin {
    public static void init() {
        Iron.init();
        Diamond.init();
        Gold.init();
        Copper.init();
    }
}