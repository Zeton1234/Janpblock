package zeton1942.gmai.com.janpblock;

import org.bukkit.event.HandlerList;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;


public final class JanpBlock extends JavaPlugin{

    public void onEnable() {
        new OnBlock(this);
    }

    public void onDisable() {
        HandlerList.unregisterAll((Plugin)this);
    }



}




