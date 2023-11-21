package weapons.epic.epic.weapons.Epic;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class ResourcePackChecker implements Listener {
    EpicWeapons plugin;

    public ResourcePackChecker(EpicWeapons plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().setResourcePack("https://cdn-raw.modrinth.com/data/TQ5na7TX/versions/tRLkpZCx/EpicWepons-BETA-0.11.zip");
    }
}