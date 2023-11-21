package weapons.epic.epic.weapons.Epic;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import weapons.epic.epic.weapons.Epic.abilityListeners.*;
import weapons.epic.epic.weapons.Epic.commands.giveCommand;
import weapons.epic.epic.weapons.Epic.enchantListeners.ClaymoreEnchant;
import weapons.epic.epic.weapons.Epic.enchantListeners.ScytheEnchant;

public final class EpicWeapons extends JavaPlugin {
    private static EpicWeapons instance;

    public static EpicWeapons getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
        console.sendMessage(ChatColor.AQUA + "***********************************");
        console.sendMessage(ChatColor.AQUA + "| Epic Weapons have been enabled! |");
        console.sendMessage(ChatColor.AQUA + "***********************************");

        Inits.init();

        getServer().getPluginManager().registerEvents(new ClaymoreAbility(this), this);
        getServer().getPluginManager().registerEvents(new ClaymoreEnchant(this), this);
        getServer().getPluginManager().registerEvents(new ScytheEnchant(this), this);
        // getServer().getPluginManager().registerEvents(new ScytheAbility(this), this);
        getServer().getPluginManager().registerEvents(new DoubleBladesAbility(this), this);
        getServer().getPluginManager().registerEvents(new BattleAxeAbility(this), this);
        getServer().getPluginManager().registerEvents(new KarambitAbility(this), this);
        getServer().getPluginManager().registerEvents(new ResourcePackChecker(this), this);

        this.getCommand("giveweapon").setExecutor(new giveCommand(this));
    }

    @Override
    public void onDisable() {
        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
        console.sendMessage(ChatColor.DARK_RED + "************************************");
        console.sendMessage(ChatColor.DARK_RED + "| Epic Weapons have been disabled! |");
        console.sendMessage(ChatColor.DARK_RED + "************************************");
    }
}
