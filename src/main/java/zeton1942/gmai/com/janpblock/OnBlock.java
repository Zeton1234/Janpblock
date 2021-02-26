package zeton1942.gmai.com.janpblock;

import com.destroystokyo.paper.event.player.PlayerJumpEvent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;

public class OnBlock implements Listener{
    private JanpBlock plugin;

    double totp[][] = {         //x y z
            {0.5, 45, -36.5},   //EMERALD_BLOCK
            {-22.5 ,45 ,-43.5}, //PINK_concrete
            {-29.5 ,45 ,-38.5}, //YELLOW_CONCRETE
            {-9.5 ,45 ,-67.5},  //ORANGE_CONCRETE
            {16.5 ,45 ,-80.5},  //LIGHT_BLUE_CONCRETE
            {-27.5 ,45 ,-82.5}, //MAGENTA_CONCRETE
            {-6.5 ,45 ,-83.5}   //BLUE_CONCRETE
    };
    float tppy[][] = {  //yaw pitch
            {180, 0},   //EMERALD_BLOCK
            {180 ,0},   //PINK_CONCRETE
            {225 ,0},   //YELLOW_CONCRETE
            {255 ,1},   //ORANGE_CONCRETE
            {0 ,0},     //LIGHT_BLUE_CONCRETE
            {0 ,0},     //MAGENTA_CONCRETE
            {0 ,0},     //BLUE_CONCRETE
    };

    public OnBlock(JanpBlock plugin) {
        this.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(this, (Plugin)plugin);
    }


    @EventHandler
    public void playerJump_emerald(PlayerJumpEvent e) {
        Location loc = e.getFrom();


        if(loc.getBlock().getRelative(BlockFace.DOWN).getType().equals(Material.EMERALD_BLOCK)){
            e.getPlayer().teleport(new Location(loc.getWorld(), totp[0][0], totp[0][1], totp[0][2],tppy[0][0],tppy[0][1]));
        }//エメラルド

        else if(loc.getBlock().getRelative(BlockFace.DOWN).getType().equals(Material.PINK_CONCRETE)){
            e.getPlayer().teleport(new Location(loc.getWorld(),totp[1][0], totp[1][1], totp[1][2],tppy[1][0],tppy[1][1]));
        }//ピンク

        else if(loc.getBlock().getRelative(BlockFace.DOWN).getType().equals(Material.YELLOW_CONCRETE)){
            e.getPlayer().teleport(new Location(loc.getWorld(),totp[2][0], totp[2][1], totp[2][2],tppy[2][0],tppy[2][1]));
        }//黄色

        else if(loc.getBlock().getRelative(BlockFace.DOWN).getType().equals(Material.ORANGE_CONCRETE)){
            e.getPlayer().teleport(new Location(loc.getWorld(),totp[3][0], totp[3][1], totp[3][2],tppy[3][0],tppy[3][1]));
        }//オレンジ

        else if(loc.getBlock().getRelative(BlockFace.DOWN).getType().equals(Material.LIGHT_BLUE_CONCRETE)){
            e.getPlayer().teleport(new Location(loc.getWorld(),totp[4][0], totp[4][1], totp[4][2],tppy[4][0],tppy[4][1]));
        }//明るい青

        else if(loc.getBlock().getRelative(BlockFace.DOWN).getType().equals(Material.MAGENTA_CONCRETE)){
            e.getPlayer().teleport(new Location(loc.getWorld(),totp[5][0], totp[5][1], totp[5][2],tppy[5][0],tppy[5][1]));
        }//MAGMA

        else if(loc.getBlock().getRelative(BlockFace.DOWN).getType().equals(Material.BLUE_CONCRETE )){
            e.getPlayer().teleport(new Location(loc.getWorld(),totp[6][0], totp[6][1], totp[6][2],tppy[6][0],tppy[6][1]));
        }//青

        else;
    }
}
