package me.NinetyNine.chatrule.utils;

import static org.bukkit.ChatColor.BLACK;
import static org.bukkit.ChatColor.DARK_GRAY;
import static org.bukkit.ChatColor.GREEN;
import static org.bukkit.ChatColor.translateAlternateColorCodes;

import org.bukkit.entity.Player;

import me.NinetyNine.chatrule.ChatRules;

public class StringUtils {

	public static String prefix = "&8[&1ChatRules&8] &7";

	public static String exof = "";
	public static String prefixe = BLACK + "[" + GREEN + "ChatRules" + BLACK + "]" + DARK_GRAY + " Example of " + exof;
	public static String colon = ":" + "\n";

	public static void sendExample(Player player, String exampleof, String string) {
		exof = exampleof;
		player.sendMessage(prefixe + exampleof + colon + string);
	}

	public static void sendPlayerMessage(Player player, String message) {
		player.sendMessage(translateAlternateColorCodes('&', prefix + message));
	}

	public static void setRuleMessage(String path, String message) {
		ChatRules.plugin.getConfig().set(path, message);
	}
}