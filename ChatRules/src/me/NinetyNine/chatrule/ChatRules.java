package me.NinetyNine.chatrule;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.NinetyNine.chatrule.commands.ChatRulesCommands;
import me.NinetyNine.chatrule.commands.ChatRulesTabCompleter;
import me.NinetyNine.chatrule.eventhandler.ChatRulesHandler;

public class ChatRules extends JavaPlugin {

	public static ChatRules plugin;

	@Override
	public void onEnable() {
		plugin = this;

		getCommand("chatrules").setExecutor(new ChatRulesCommands());
		getCommand("gcchatrules").setExecutor(new ChatRulesCommands());

		getCommand("chatrules").setTabCompleter(new ChatRulesTabCompleter());

		getServer().getLogger().info("[ChatRules] Loading config...");
		saveDefaultConfig();
		getServer().getLogger().info("[ChatRules] Loaded & Enabled!");
	}

	@Override
	public void onDisable() {
		getServer().getLogger().info("[ChatRules] Saving config...");
		getServer().getLogger().info("[ChatRules] Saved & Disabled!");
	}

	public static void registerListeners() {
		PluginManager pm = Bukkit.getServer().getPluginManager();
		pm.registerEvents(new ChatRulesCommands(), new ChatRules());
		pm.registerEvents(new ChatRulesHandler(), new ChatRules());
	}
}