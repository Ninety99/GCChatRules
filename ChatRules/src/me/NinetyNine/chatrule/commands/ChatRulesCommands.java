package me.NinetyNine.chatrule.commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import me.NinetyNine.chatrule.ChatRules;
import me.NinetyNine.chatrule.utils.StringUtils;

public class ChatRulesCommands implements Listener, CommandExecutor {

	/*
	 * Created and edited. 3/20/18.
	 * 
	 * Fixed bugs, added more command arguments, etc. etc. 3/21/18.
	 * 
	 * Fixed, removed some commands that aren't needed. 3/23/18.
	 * 
	 * Finished. 3/23/18.
	 * 
	 * Cleaned up some things, added StringUtils class. Made it tab-able! 3/24/18.
	 * 
	 * Added color codes in the config :^) 5/1/2018
	 * 
	 * Last edited: 5/1/18
	 * 
	 */

	// public static String rule = "";
	public static List<Player> players = new ArrayList<Player>();

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;

			List<String> rules = new ArrayList<String>(Arrays.asList("flood", "spam", "caps", "hackusating", "arguing",
					"chattrolling", "askingstaffforthings", "advertisement", "swearing1", "swearing2", "swearing3",
					"serverdis", "staffdis", "bypassingfilter", "ddos", "threathack", "inappb"));

			String a = "\n";
			String playername = "Player";
			String prefix = ChatColor.DARK_GRAY + "[" + ChatColor.YELLOW + "Member" + ChatColor.DARK_GRAY + "] "
					+ ChatColor.GRAY + playername;
			String example = prefix + ":" + ChatColor.WHITE + " ";
			String exampleflood = example + "heyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy";
			String examplerandomcs = example + "jtbalsbtaldsjaaastnjntsadtast231hi2";
			String examplespam = example + "Hey!" + a + example + "Hey!" + a + example + "Hey!" + a + example + "HEY!";
			String examplecountspam = example + "5" + a + example + "4" + a + example + "3" + a + example + "2" + a
					+ example + "1" + a + example + "GO!";
			String examplecaps = example + "I AM SO BORED RIGHT NOW";
			String exampleaccuse = example + "Omfg " + ChatColor.GOLD + "hacker" + ChatColor.WHITE + " hacks!!" + a
					+ example + "Ban this " + ChatColor.GOLD + "hacker" + ChatColor.WHITE + " he hacks";
			String exampleargue = example + "Why was " + ChatColor.DARK_GREEN + "player123" + ChatColor.WHITE
					+ " banned? He didn't do anything wrong!!" + a + example + "Unban " + ChatColor.DARK_GREEN
					+ "player123" + ChatColor.WHITE + " he didn't do anything!" + a + example
					+ "Please unban him he will never hack again!!";
			String examplechatt = example + "Press Alt+F4 for gamemode creative!";
			String examplechattstaff = example + "I'm a " + ChatColor.RED + "Staff" + ChatColor.WHITE
					+ " and I'm going to ban you!";
			String exampleaskstaff = example + "Hey! " + ChatColor.RED + "Admin" + ChatColor.WHITE
					+ " can you give me diamonds please!" + a + example + ChatColor.RED + "Admin" + ChatColor.WHITE
					+ " I will pay you if you give me the 'item'!";
			String exampleadv = ChatColor.DARK_GRAY + "[" + ChatColor.GRAY + playername + ChatColor.GOLD + " > "
					+ ChatColor.RED + "me" + ChatColor.DARK_GRAY + "] " + ChatColor.WHITE + " Come play my."
					+ playername + ".com it has awesome games!";
			String exampleytadv = example + "Come watch my video at youtube.com/" + playername + " and subscribe!";
			String exampleswear = example + "Fuck you! Go fuck yourself!!";
			String exampleswear2 = example + "Retard idiot! You're a fucking piece of shit!";
			String exampleswear3 = example + "I hope you fucking die of cancer!" + a + example
					+ "Do you have autism or something jeez." + a + example + "Fuck you nigger!" + a + example
					+ "Burn all the jews!!";
			String examplestaff = example + "Guys, the staff member " + ChatColor.RED + "(Staff)" + ChatColor.WHITE
					+ " sucks and is so bad!";
			String exampleserver = example + "Guys why do you even play this server, it sucks so hard!" + a + example
					+ "This server is so badddd. Shit server.";
			String examplebypass = example + "Come suck on my nuts!" + a + ChatColor.DARK_GRAY + "[" + ChatColor.GRAY
					+ playername + ChatColor.GOLD + " > " + ChatColor.RED + "me" + ChatColor.DARK_GRAY + "] "
					+ ChatColor.WHITE + "You are such a prostitute.";
			String exampleddos = example + "This server is going down, bye bye!" + a + example
					+ "I'm gonna ddos this server!" + a + example
					+ "Bye to your internet! You're going to need to buy a new router soon.";
			String examplehack = example + "I'm going to hack you and your account!";
			String exampleinapp = example + "B=====D" + a + example + "( . Y . )" + a + example
					+ "Any dirty boys wanna skype and be naughty?" + a + example + "I want to rub your humps!!";

			if (cmd.getName().equalsIgnoreCase("chatrules")) {
				if (player.hasPermission("chatrules.chatrules")) {
					if (args.length == 0) {// 20 '-'
						player.sendMessage(ChatColor.GRAY + "--------------------" + a + ChatColor.DARK_GREEN
								+ "Welcome to the server!" + a + ChatColor.GRAY + "--------------------" + a
								+ ChatColor.DARK_AQUA + "Alias: " + ChatColor.YELLOW + "/cr" + a + ChatColor.RED
								+ "Commands: " + a + ChatColor.AQUA + "/chatrules 1" + ChatColor.GOLD + ">"
								+ ChatColor.GRAY + " Shows the chat rules (Page 1)" + a + ChatColor.AQUA
								+ "/chatrules 2" + ChatColor.GOLD + ">" + ChatColor.GRAY
								+ " Shows the chat rules (Page 2)" + a + ChatColor.AQUA + "/chatrules 3"
								+ ChatColor.GOLD + ">" + ChatColor.GRAY + " Shows the chat rules (Page 3)" + a
								+ ChatColor.AQUA + "/chatrules 4" + ChatColor.GOLD + ">" + ChatColor.GRAY
								+ " Shows the chat rules (Page 4)" + a + ChatColor.AQUA + "/chatrules example"
								+ ChatColor.GOLD + ">" + ChatColor.GRAY
								+ " Shows example(s) of a rule type if haven't understood yet." + a + ChatColor.GRAY
								+ "--------------------" + " [Home page] " + "--------------------");
						return true;
					}

					if (args[0].equalsIgnoreCase("1")) {
						if (args.length == 1) {
							player.sendMessage(ChatColor.GRAY + "--------------------\n" + ChatColor.RED + "Chat Rules"
									+ a + ChatColor.GRAY + "--------------------" + a + ChatColor.YELLOW
									+ "Flood//Random Character Spam: "
									+ ChatColor.translateAlternateColorCodes('&',
											ChatRules.plugin.getConfig().getString("flood"))
									+ a + ChatColor.YELLOW + "Spam//Countdown spam: "
									+ ChatColor.translateAlternateColorCodes('&',
											ChatRules.plugin.getConfig().getString("spam"))
									+ a + ChatColor.YELLOW + "Caps: "
									+ ChatColor.translateAlternateColorCodes('&',
											ChatRules.plugin.getConfig().getString("caps"))
									+ a + ChatColor.YELLOW + "Hackusating (Accusing someone of hacking): "
									+ ChatColor.translateAlternateColorCodes('&',
											ChatRules.plugin.getConfig().getString("hackusating"))
									+ a + ChatColor.GRAY + "--------------------" + " [Page 1/4] "
									+ "--------------------");
							return true;
						}
					}

					if (args[0].equalsIgnoreCase("2")) {
						if (args.length == 1) {
							player.sendMessage(ChatColor.GRAY + "-------------------" + " [Page 2/4] "
									+ "--------------------" + a + ChatColor.YELLOW + "Arguing: "
									+ ChatColor.translateAlternateColorCodes('&',
											ChatRules.plugin.getConfig().getString("arguing"))
									+ a + ChatColor.YELLOW + "Chat Trolling: "
									+ ChatColor.translateAlternateColorCodes('&',
											ChatRules.plugin.getConfig().getString("chattroll"))
									+ a + ChatColor.YELLOW + "Asking Staff for items, money, etc.: "
									+ ChatColor.translateAlternateColorCodes('&',
											ChatRules.plugin.getConfig().getString("askingstaffforthings"))
									+ a + ChatColor.YELLOW + "Advertising servers: "
									+ ChatColor.translateAlternateColorCodes('&',
											ChatRules.plugin.getConfig().getString("advertisement"))
									+ a + ChatColor.GRAY + "-------------------" + " [Page 2/4] "
									+ "--------------------");
							return true;
						}
					}

					if (args[0].equalsIgnoreCase("3")) {
						if (args.length == 1) {
							player.sendMessage(ChatColor.GRAY + "--------------------" + " [Page 4/4] "
									+ "--------------------" + a + ChatColor.YELLOW
									+ "Advertising any YouTube/Twitch content: "
									+ ChatColor.translateAlternateColorCodes('&',
											ChatRules.plugin.getConfig().getString("yttwitchadv"))
									+ a + ChatColor.YELLOW + "Swearing: "
									+ ChatColor.translateAlternateColorCodes('&',
											ChatRules.plugin.getConfig().getString("swearing"))
									+ a + ChatColor.YELLOW + "Harassment: "
									+ ChatColor.translateAlternateColorCodes('&',
											ChatRules.plugin.getConfig().getString("harassment"))
									+ a + ChatColor.YELLOW + "Server Disrespect: "
									+ ChatColor.translateAlternateColorCodes('&',
											ChatRules.plugin.getConfig().getString("serverdis"))
									+ a + ChatColor.GRAY + "--------------------" + " [Page 3/4] "
									+ "--------------------");
							return true;
						}
					}

					if (args[0].equalsIgnoreCase("4")) {
						if (args.length == 1) {
							player.sendMessage(ChatColor.GRAY + "--------------------" + " [Page 3/3] "
									+ "--------------------" + a + ChatColor.YELLOW + "Staff Disrespect: "
									+ ChatColor.translateAlternateColorCodes('&',
											ChatRules.plugin.getConfig().getString("staffdis"))
									+ a + ChatColor.YELLOW + "Bypassing the chat filter: "
									+ ChatColor.translateAlternateColorCodes('&',
											ChatRules.plugin.getConfig().getString("bypassingfilter"))
									+ a + ChatColor.YELLOW + "Threatening to DDOS: "
									+ ChatColor.translateAlternateColorCodes('&',
											ChatRules.plugin.getConfig().getString("ddosthreats"))
									+ a + ChatColor.YELLOW + "Threatening to hack someone: "
									+ ChatColor.translateAlternateColorCodes('&',
											ChatRules.plugin.getConfig().getString("threathack"))
									+ a + ChatColor.YELLOW + "Inappropriate Behaviour: "
									+ ChatColor.translateAlternateColorCodes('&',
											ChatRules.plugin.getConfig().getString("inappb"))
									+ a + ChatColor.GRAY + "--------------------" + " [Page 4/4] "
									+ "--------------------");
							return true;
						}
					}

					if (!args[0].equalsIgnoreCase("example") && !args[0].equalsIgnoreCase("1")
							&& !args[0].equalsIgnoreCase("2") && !args[0].equalsIgnoreCase("3")
							&& !args[0].equalsIgnoreCase("4")) {
						if (args.length == 1) {
							player.sendMessage(ChatColor.BLACK + "[" + ChatColor.GREEN + "ChatRules" + ChatColor.BLACK
									+ "]" + ChatColor.RED + " Usage: " + a + "/chatrules 1 " + a + ChatColor.RED
									+ "/chatrules 2" + a + ChatColor.RED + "/chatrules 3" + a + ChatColor.RED
									+ "/chatrules example <rule type>");
							return true;
						}
					}

					if (args[0].equalsIgnoreCase("example")) {
						if (args.length == 1) {
							player.sendMessage(ChatColor.BLACK + "[" + ChatColor.GREEN + "ChatRules" + ChatColor.BLACK
									+ "]" + ChatColor.GRAY + " Please provide more information!\n" + ChatColor.RED
									+ "Usage: /chatrules example <rule type>" + a + ChatColor.DARK_PURPLE + "Types: "
									+ ChatColor.GOLD
									+ "flood, spam, caps, hackusating, arguing, chattrolling, askingstaffforthings, advertisement, swearing1, swearing2, swearing3,\n"
									+ "serverdis, staffdis" + a + "bypassingfilter, ddos, threathack, and inappb" + a
									+ ChatColor.GRAY + "(Only you can see the example(s), don't worry)" + a
									+ ChatColor.RED + ChatColor.BOLD
									+ "NOTE: The example command will show explicit/not appropriate words. Please do not continue if you don't want to see bad words. Otherwise, continue...");
							return true;
						}
					}

					if (args[1].equalsIgnoreCase("flood")) {
						if (args.length == 2) {
							StringUtils.sendExample(player, "flooding", exampleflood);
							StringUtils.sendExample(player, "random character spam", examplerandomcs);
							return true;
						}
					}

					if (args[1].equalsIgnoreCase("spam")) {
						if (args.length == 2) {
							StringUtils.sendExample(player, "spamming", examplespam);
							StringUtils.sendExample(player, "countdown spamming", examplecountspam);
							return true;
						}
					}

					if (args[1].equalsIgnoreCase("caps")) {
						if (args.length == 2) {
							StringUtils.sendExample(player, "using excessive capitalized words", examplecaps);
							return true;
						}
					}

					if (args[1].equalsIgnoreCase("hackusating")) {
						if (args.length == 2) {
							StringUtils.sendExample(player, "accusing someone of hacking", exampleaccuse);
							return true;
						}
					}

					if (args[1].equalsIgnoreCase("arguing")) {
						if (args.length == 2) {
							StringUtils.sendExample(player, "arguing", exampleargue);
							return true;
						}
					}

					if (args[1].equalsIgnoreCase("chattrolling")) {
						if (args.length == 2) {
							StringUtils.sendExample(player, "chat trolling", examplechatt);
							StringUtils.sendExample(player, "chat trolling(staff version)", examplechattstaff);
							return true;
						}
					}

					if (args[1].equalsIgnoreCase("askingstaffforthings")) {
						if (args.length == 2) {
							StringUtils.sendExample(player, "asking staff that can spawn in items", exampleaskstaff);
							return true;
						}
					}

					if (args[1].equalsIgnoreCase("advertisement")) {
						if (args.length == 2) {
							StringUtils.sendExample(player, "advertisement", exampleadv);
							StringUtils.sendExample(player, "YouTube advertising", exampleytadv);
							return true;
						}
					}

					if (args[1].equalsIgnoreCase("swearing1")) {
						if (args.length == 2) {
							StringUtils.sendExample(player, "swearing (SEVERITY 1)", exampleswear);
							return true;
						}
					}

					if (args[1].equalsIgnoreCase("swearing2")) {
						if (args.length == 2) {
							StringUtils.sendExample(player, "swearing (SEVERITY 2)", exampleswear2);
							return true;
						}
					}

					if (args[1].equalsIgnoreCase("swearing3")) {
						if (args.length == 2) {
							StringUtils.sendExample(player, "swearing (SEVERITY 3)", exampleswear3);
							return true;
						}
					}

					if (args[1].equalsIgnoreCase("serverdis")) {
						if (args.length == 2) {
							StringUtils.sendExample(player, "server disrespect", exampleserver);
							return true;
						}
					}

					if (args[1].equalsIgnoreCase("staffdis")) {
						if (args.length == 2) {
							StringUtils.sendExample(player, "staff disrespect", examplestaff);
							return true;
						}
					}

					if (args[1].equalsIgnoreCase("bypassingfilter")) {
						if (args.length == 2) {
							StringUtils.sendExample(player, "bypassing the chat filter", examplebypass);
							return true;
						}
					}

					if (args[1].equalsIgnoreCase("ddos")) {
						if (args.length == 2) {
							StringUtils.sendExample(player, "threatening to ddos someone/the server", exampleddos);
							return true;
						}
					}

					if (args[1].equalsIgnoreCase("threathack")) {
						if (args.length == 2) {
							StringUtils.sendExample(player, "threatening to hack someone", examplehack);
							return true;
						}
					}

					if (args[1].equalsIgnoreCase("inappb")) {
						if (args.length == 2) {
							StringUtils.sendExample(player, "inappropriate behaviour", exampleinapp);
							return true;
						}
					}

					// for (String ruless : rules) {
					if (!args[1].equalsIgnoreCase(rules.toString().replace("[", " ").replace("]", " ").trim())) {
						if (args.length == 2) {
							player.sendMessage(ChatColor.BLACK + "[" + ChatColor.GREEN + "ChatRules" + ChatColor.BLACK
									+ "]" + ChatColor.GOLD + " Rule types: " + a + ChatColor.GREEN
									+ rules.toString().replace("[", " ").replace("]", " ").trim());
							return true;
						}
					}
					// }
				} else {
					StringUtils.sendPlayerMessage(player, "&cYou do not have permissions!");
					return true;
				}
			}

			if (cmd.getName().equalsIgnoreCase("gcchatrules")) {
				if (player.hasPermission("chatrules.admin")) {
					if (args.length == 0) {
						player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7--------------------\n"
								+ "&5[] &6ChatRules &5[]\n" + "&7--------------------\n" + "&9Alias: &b/gccr\n"
								+ "&cCommands:\n"
								+ "&b/gcchatrules save&6> &7Saves the config file after editing something from the config file.\n"
								+ "&b/gcchatrules setmsg <rule type>&6> &7Sets the rule message for a rule. (In development)"));
						return true;
					}

					if (args[0].equalsIgnoreCase("save")) {
						if (args.length == 1) {
							ChatRules.plugin.saveDefaultConfig();
							ChatRules.plugin.reloadConfig();
							StringUtils.sendPlayerMessage(player, "&2Saved!");
							return true;
						}
					}

					// IN DEVELOPMENT

					/*
					 * if (args[0].equalsIgnoreCase("setmsg")) { if (args.length == 1) {
					 * StringUtils.sendPlayerMessage(player,
					 * "&cUsage: /gcchatrules setmsg <rule type>\n" + "&5Rule types: &6" + rules);
					 * return true; } rule = args[1]; if
					 * (ChatRules.plugin.getConfig().contains(args[1]) &&
					 * args[0].equalsIgnoreCase("setmsg")) { players.add(player);
					 * StringUtils.sendPlayerMessage(player,
					 * "&aYou are in &6editing &amode! Please type the message you want to edit.");
					 * return true; } else { StringUtils.sendPlayerMessage(player,
					 * "&cInvalid rule//Not implemented."); return true; } }
					 */
				} else {
					StringUtils.sendPlayerMessage(player, "&7You do not have permissions");
					return true;
				}
			}
		} else {
			sender.sendMessage(ChatColor.RED + "You must be a player!");
			return true;
		}
		return true;
	}
}
