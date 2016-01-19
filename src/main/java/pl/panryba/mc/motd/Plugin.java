/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.panryba.mc.motd;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author PanRyba.pl
 */
public class Plugin extends JavaPlugin implements Listener {

    boolean enabled;
    String motd;
    
    
    @Override
    public void onEnable() {
        FileConfiguration config = getConfig();
        
        this.enabled = config.getBoolean("enabled", false);
        this.motd = ColorUtils.replaceColors(config.getString("motd"));
        
        if(this.enabled) {
            getServer().getPluginManager().registerEvents(this, this);
        }
    }
    @EventHandler(priority = EventPriority.LOWEST)
    public void onPing(ServerListPingEvent event) {
        event.setMotd(this.motd);
    }
}
