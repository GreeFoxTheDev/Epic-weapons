package weapons.epic.epic.weapons.Epic;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import weapons.epic.epic.weapons.Epic.abilityListeners.ClaymoreEvent;
import weapons.epic.epic.weapons.Epic.abilityListeners.ScytheSweep;
import weapons.epic.epic.weapons.Epic.enchantListeners.ScytheEnchant;
import weapons.epic.epic.weapons.Epic.items.Claymore;
import weapons.epic.epic.weapons.Epic.items.LongStick;
import weapons.epic.epic.weapons.Epic.items.Scythe;
import weapons.epic.epic.weapons.Epic.items.WarAxe;

public final class EpicWeapons extends JavaPlugin {

    @Override
    public void onEnable() {
        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
        console.sendMessage(ChatColor.AQUA + "******************************");
        console.sendMessage(ChatColor.AQUA + "| Scythes have been enabled! |");
        console.sendMessage(ChatColor.AQUA + "******************************");
        LongStick.init();
        Claymore.init();
        Scythe.init();
        //WarAxe.init();
        getServer().getPluginManager().registerEvents(new ScytheEnchant(this), this);
        //getServer().getPluginManager().registerEvents(new ScytheSweep(this), this);
        getServer().getPluginManager().registerEvents(new ClaymoreEvent(this), this);
        //getServer().getPluginManager().registerEvents(new ClaymoreEnchant(this), this);

    }

    @Override
    public void onDisable() {
        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
        console.sendMessage(ChatColor.AQUA + "******************************");
        console.sendMessage(ChatColor.AQUA + "| Scythes have been disabled! |");
        console.sendMessage(ChatColor.AQUA + "******************************");
    }
}
