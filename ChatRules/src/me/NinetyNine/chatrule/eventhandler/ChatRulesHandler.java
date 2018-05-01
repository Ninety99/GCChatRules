package me.NinetyNine.chatrule.eventhandler;

import org.bukkit.event.Listener;

public class ChatRulesHandler implements Listener {

	// IN DEVELOPMENT
	
	/*
	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent e) {
		Player player = e.getPlayer();
		String message = e.getMessage();

		if (message != null && ChatRulesCommands.players.contains(player)) {
			StringUtils.setRuleMessage(ChatRulesCommands.rule, message);
			StringUtils.sendPlayerMessage(player, "&aSuccesfully set message to &r'" + message
					+ "'&a! &9Please use /gcchatrules save to save the changes made.");
			ChatRulesCommands.players.remove(player);
			e.setCancelled(true);
		}
	}
	*/
}