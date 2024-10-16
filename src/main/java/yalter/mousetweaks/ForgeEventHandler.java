package yalter.mousetweaks;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import yalter.mousetweaks.AddLoreCommand;

public class ForgeEventHandler {

    // This method will register the command when the server starts
    @SubscribeEvent
    public static void onServerStarting(FMLServerStartingEvent event) {
        // Register the custom command
        event.registerServerCommand(new AddLoreCommand());
    }
}