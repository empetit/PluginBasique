package com.test.testplugin;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public final class TestPlugin  extends JavaPlugin {
	 
		Logger log = Logger.getLogger("minecraft");
	 
		public void onEnable(){
			log.info("Votre plugin a ete activé !");
		}
	 
		public void onDisable(){
			log.info("Votre plugin a ete desactivé !");
		}

}
