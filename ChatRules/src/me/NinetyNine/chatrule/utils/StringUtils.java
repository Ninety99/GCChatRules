package me.NinetyNine.chatrule.utils;

import static org.bukkit.ChatColor.translateAlternateColorCodes;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import me.NinetyNine.chatrule.ChatRules;
import me.NinetyNine.chatrule.commands.ChatRulesCommands;

public class StringUtils implements Listener {

	public static String prefix;

	public static String exof;
	public static String prefixe;
	public static String colon;

	public static void sendExample(Player player, String exampleof, String string) {
		exof = exampleof;
		player.sendMessage(prefixe + exampleof + colon + string);
	}

	public static void sendPlayerMessage(Player player, String message) {
		player.sendMessage(translateAlternateColorCodes('&', prefix + message));
	}
	
	public static void setRuleMessage(String message) {
		String path = ChatRulesCommands.rule;
		ChatRules.plugin.getConfig().set(path, message);
		ChatRules.plugin.saveConfig();
		ChatRules.plugin.reloadConfig();
	}
	
	public static void save(Player player) {
		ChatRules.plugin.saveConfig();
		ChatRules.plugin.reloadConfig();
		sendPlayerMessage(player, "&2Saved!");
	}
}