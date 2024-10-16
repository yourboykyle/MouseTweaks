package yalter.mousetweaks;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

public class RemoveLoreCommand extends CommandBase {

    @Override
    public String getCommandName() {
        return "removelore";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/removelore <lore> - Adds a lore line to the whitelist.";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) {
        if (args.length < 1) {
            sender.addChatMessage(new ChatComponentText("Usage: /removelore <lore>"));
            return;
        }

        // Combine arguments into a single string if necessary
        StringBuilder lore = new StringBuilder();
        for (String arg : args) {
            lore.append(arg).append(" ");
        }

        // Add the lore to the whitelist
        Main.loreWhitelistList.remove(lore.toString().trim());

        // Notify the player
        sender.addChatMessage(new ChatComponentText("Removed lore from whitelist: " + lore.toString().trim()));
    }

    @Override
    public int getRequiredPermissionLevel() {
        return 0; // Allows any player to use this command
    }
}