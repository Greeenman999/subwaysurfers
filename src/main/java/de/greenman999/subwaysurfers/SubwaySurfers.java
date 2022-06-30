package de.greenman999.subwaysurfers;

import dev.jorel.commandapi.CommandAPI;
import dev.jorel.commandapi.CommandAPIConfig;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class SubwaySurfers extends JavaPlugin {

    PluginManager pluginManager = Bukkit.getPluginManager();

    public static final String PREFIX = "§7[§eSubwaySurfers§7]";

    @Override
    public void onEnable() {
        // Plugin startup logic


        CommandAPI.onEnable(this);
        registerAllCommands();
        //pluginManager.registerEvents(new ExampleListener(), this);

        //saveDefaultConfig();
        log("Plugin successfully enabled and loaded!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        log("Plugin successfully disabled and unloaded!");
    }

    private void registerAllCommands() {

    }

    @Override
    public void onLoad() {
        CommandAPI.onLoad(new CommandAPIConfig().verboseOutput(false).silentLogs(true));
    }

    public static void log(String string) {
        Logger.getLogger("SubwaySurfers").info(string);
    }

}
