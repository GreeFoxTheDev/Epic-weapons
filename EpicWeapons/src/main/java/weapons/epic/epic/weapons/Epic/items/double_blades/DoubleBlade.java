package weapons.epic.epic.weapons.Epic.items.double_blades;

import org.bukkit.plugin.java.JavaPlugin;

public class DoubleBlade extends JavaPlugin {
    public static void init(){
        Copper.init();
        Diamond.init();
        Gold.init();
        Iron.init();
    }
}
