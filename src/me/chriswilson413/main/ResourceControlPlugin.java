package me.chriswilson413.main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class ResourceControlPlugin extends JavaPlugin{

    public void onEnable() {
    	//runs when the plugin is enabled
    	
    	//first, create an object to manage the resource nodes
    	//then set up the timers for them
    	
    	//then create a bunch of objects for the spawn points
    	//set them up and stuff
    	//listeners will be used to change control
    	
    	//create a object to manage the teams and spectators
    	//put everyone in spectator to start
    	//players join teams through commands
    	
    	//just for fun, we're going to log a message
    	//This will print to server console and the server log
    	getLogger().info("Plugin enabled!");
    	
    }

    public void onDisable() {
    	//runs when the plugin is disabled
    }
	
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		//runs when a command is done
    	if(cmd.getName().equalsIgnoreCase("test")){
    		//do something
    		return true;
    	}
    	
    	return false; //returning false will tell the player the command usage in plugin.yml
    }
    
}
