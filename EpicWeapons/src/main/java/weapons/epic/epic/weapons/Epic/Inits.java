package weapons.epic.epic.weapons.Epic;

import org.bukkit.plugin.java.JavaPlugin;
import weapons.epic.epic.weapons.Epic.items.claymores.Claymore;
import weapons.epic.epic.weapons.Epic.items.double_blades.DoubleBlade;
import weapons.epic.epic.weapons.Epic.items.karambits.Karambits;
import weapons.epic.epic.weapons.Epic.items.scythes.Scythe;
import weapons.epic.epic.weapons.Epic.items.war_axes.WarAxe;

public class Inits extends JavaPlugin {
    public static void init(){
        Claymore.init();
        DoubleBlade.init();
        Scythe.init();
        WarAxe.init();
        Karambits.init();
    }
}
