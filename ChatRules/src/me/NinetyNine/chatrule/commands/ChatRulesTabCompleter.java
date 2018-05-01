package me.NinetyNine.chatrule.commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import me.NinetyNine.chatrule.ChatRules;

public class ChatRulesTabCompleter implements TabCompleter {

	public static ChatRules plugin;

	private static String[] startsWithA = { "arguing", "askingstaffforthings", "advertisement" };
	private static String[] startsWithB = { "bypassingfilter" };
	private static String[] startsWithC = { "chattrolling", "caps" };
	private static String[] startsWithD = { "ddos" };
	private static String[] startsWithF = { "flood" };
	private static String[] startsWithH = { "hackusating" };
	private static String[] startsWithI = { "inappb" };
	private static String[] startsWithS = { "spam", "swearing1", "swearing2", "swearing3", "serverdis", "staffdis" };
	private static String[] startsWithT = { "threathack" };
	private static String[] startsWithY = { "yttwitchadv" };

	@Override
	public List<String> onTabComplete(CommandSender sender, Command cmd, String alias, String[] args) {

		List<String> startsA = new ArrayList<String>(Arrays.asList(startsWithA));
		List<String> startsB = new ArrayList<String>(Arrays.asList(startsWithB));
		List<String> startsC = new ArrayList<String>(Arrays.asList(startsWithC));
		List<String> startsD = new ArrayList<String>(Arrays.asList(startsWithD));
		List<String> startsF = new ArrayList<String>(Arrays.asList(startsWithF));
		List<String> startsH = new ArrayList<String>(Arrays.asList(startsWithH));
		List<String> startsI = new ArrayList<String>(Arrays.asList(startsWithI));
		List<String> startsS = new ArrayList<String>(Arrays.asList(startsWithS));
		List<String> startsT = new ArrayList<String>(Arrays.asList(startsWithT));
		List<String> startsY = new ArrayList<String>(Arrays.asList(startsWithY));

		if (cmd.getName().equalsIgnoreCase("chatrules") && args.length == 2 && args[0].equalsIgnoreCase("example")
				&& args[1].startsWith("a")) {
			return startsA;
		}

		else if (cmd.getName().equalsIgnoreCase("chatrules") && args.length == 2 && args[0].equalsIgnoreCase("example")
				&& args[1].startsWith("b")) {
			return startsB;
		}

		else if (cmd.getName().equalsIgnoreCase("chatrules") && args.length == 2 && args[0].equalsIgnoreCase("example")
				&& args[1].startsWith("c")) {
			return startsC;
		}

		else if (cmd.getName().equalsIgnoreCase("chatrules") && args.length == 2 && args[0].equalsIgnoreCase("example")
				&& args[1].startsWith("d")) {
			return startsD;
		}

		else if (cmd.getName().equalsIgnoreCase("chatrules") && args.length == 2 && args[0].equalsIgnoreCase("example")
				&& args[1].startsWith("f")) {
			return startsF;
		}

		else if (cmd.getName().equalsIgnoreCase("chatrules") && args.length == 2 && args[0].equalsIgnoreCase("example")
				&& args[1].startsWith("h")) {
			return startsH;
		}

		else if (cmd.getName().equalsIgnoreCase("chatrules") && args.length == 2 && args[0].equalsIgnoreCase("example")
				&& args[1].startsWith("i")) {
			return startsI;

		} 
		
		else if (cmd.getName().equalsIgnoreCase("chatrules") && args.length == 2
				&& args[0].equalsIgnoreCase("example") && args[1].startsWith("s")) {
			return startsS;
		}

		else if (cmd.getName().equalsIgnoreCase("chatrules") && args.length == 2 && args[0].equalsIgnoreCase("example")
				&& args[1].startsWith("t")) {
			return startsT;
		}

		else if (cmd.getName().equalsIgnoreCase("chatrules") && args.length == 2 && args[0].equalsIgnoreCase("example")
				&& args[1].startsWith("y")) {
			return startsY;
		}
		return null;
	}
}