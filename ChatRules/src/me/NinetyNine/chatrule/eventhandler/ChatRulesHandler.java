package me.NinetyNine.chatrule.eventhandler;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import me.NinetyNine.chatrule.commands.ChatRulesCommands;
import me.NinetyNine.chatrule.utils.StringUtils;

public class ChatRulesHandler implements Listener {

	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent e) {
		Player player = e.getPlayer();
		String message = e.getMessage();

		if (ChatRulesCommands.players.contains(player)) {
			e.setCancelled(true);
			StringUtils.setRuleMessage(message);
			StringUtils.sendPlayerMessage(player, "&aSuccesfully set message to &r'" + message
					+ "&r'&a!");
			ChatRulesCommands.players.remove(player);
		}
	}
}