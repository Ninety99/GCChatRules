package me.NinetyNine.chatrule;

import static org.bukkit.ChatColor.BLACK;
import static org.bukkit.ChatColor.DARK_GRAY;
import static org.bukkit.ChatColor.GREEN;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.NinetyNine.chatrule.commands.ChatRulesCommands;
import me.NinetyNine.chatrule.commands.ChatRulesTabCompleter;
import me.NinetyNine.chatrule.eventhandler.ChatRulesHandler;
import me.NinetyNine.chatrule.utils.StringUtils;

public class ChatRules extends JavaPlugin {

	public static ChatRules plugin;

	@Override
	public void onEnable() {
		plugin = this;
		registerListeners();

		ChatRulesCommands.players = new ArrayList<Player>();
		ChatRulesCommands.rule = "";
		StringUtils.prefix = "&8[&aChatRules&8] &7";
		StringUtils.exof = "";
		StringUtils.prefixe = BLACK + "[" + GREEN + "ChatRules" + BLACK + "]" + DARK_GRAY + " Example of "
				+ StringUtils.exof;
		StringUtils.colon = ":" + "\n";

		getCommand("chatrules").setExecutor(new ChatRulesCommands());
		getCommand("gcchatrules").setExecutor(new ChatRulesCommands());

		getCommand("chatrules").setTabCompleter(new ChatRulesTabCompleter());

		getServer().getLogger().info("[ChatRules] Loading config...");
		saveDefaultConfig();
		reloadConfig();
		getServer().getLogger().info("[ChatRules] Loaded & Enabled!");
	}

	@Override
	public void onDisable() {
		getServer().getLogger().info("[ChatRules] Saving config...");
		saveDefaultConfig();
		getServer().getLogger().info("[ChatRules] Saved & Disabled!");
	}

	public static void registerListeners() {
		PluginManager pm = Bukkit.getServer().getPluginManager();
		pm.registerEvents(new ChatRulesCommands(), plugin);
		pm.registerEvents(new StringUtils(), plugin);
		pm.registerEvents(new ChatRulesHandler(), plugin);
	}
}