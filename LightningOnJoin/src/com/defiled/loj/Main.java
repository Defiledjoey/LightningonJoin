package com.defiled.loj;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.bukkit.event.Event;
import org.bukkit.event.Event.Priority;
import org.bukkit.plugin.java.JavaPlugin;

import com.defiled.p2p.Settings;
import com.imdeity.deityapi.records.DeityAPISettings;

public class Main extends JavaPlugin {
	 private static Settings settings = null;
    private static Logger log = Logger.getLogger("PaytoPlace");
	@Override
	public void onDisable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onEnable() {
		
		registerEvents();
		
		
	}
    public void registerEvents() {
    
    	this.getServer()
        .getPluginManager()
        .registerEvent(Event.Type.PLAYER_JOIN,
                new DefiledPlayerListener(this), Priority.Monitor, this);
    }
    public void log(Level level, String msg) {
        log.log(level, "[PaytoPlace] " + msg.replaceAll("§[0-9a-f]", ""));
    }
	
}
