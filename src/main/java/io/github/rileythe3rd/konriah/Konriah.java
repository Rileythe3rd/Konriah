package io.github.rileythe3rd.konriah;

import io.github.rileythe3rd.konriah.power.PowerManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Konriah extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Server is Enabled!!!)");
        getServer().getPluginManager().registerEvents(new PowerManager(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
