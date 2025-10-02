package me.rafaelauler.place;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {


/*     */   public void onEnable()
/*     */   {
	//REGISTER
	if(Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null){
		/* 151 */       Bukkit.getConsoleSender().sendMessage("§e[KITBATTLE] §aPlaceHolderAPI is found!");
		/* 151 */       Bukkit.getConsoleSender().sendMessage("§e[KITBATTLE] §aHooking into it!");
	    new PlaceHolderAPIHook(this).register();
		/* 151 */       Bukkit.getConsoleSender().sendMessage("§e[KITBATTLE] §aPlaceHolderAPI has hooked sucefully!");
	}
}
}

	
	
