package com.defiled.loj;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerListener;

public class DefiledPlayerListener extends PlayerListener{
	private Main plugin;
	public DefiledPlayerListener(Main instance) {
		this.plugin = instance;
	}
public void onPlayerJoin(PlayerJoinEvent event) {
	Player[] players = plugin.getServer().getOnlinePlayers();
	for (Player player : players)
	if (event.getPlayer().hasPermission("defiled.lightningonjoin")) {
		player.getWorld().strikeLightningEffect(player.getLocation());
		event.setJoinMessage(ChatColor.RED + event.getPlayer().getName() + " has logged in!");
	}
}
}
