/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.panryba.mc.motd;

import org.bukkit.ChatColor;

public class ColorUtils {
    public static String replaceColors(String message) {
        message = message.replaceAll("(?i)&([a-f0-9])", "\u00A7$1");
        message = message.replaceAll("(?i)&k", ChatColor.MAGIC.toString());
        message = message.replaceAll("(?i)&l", ChatColor.BOLD.toString());
        message = message.replaceAll("(?i)&m", ChatColor.STRIKETHROUGH.toString());
        message = message.replaceAll("(?i)&n", ChatColor.UNDERLINE.toString());
        message = message.replaceAll("(?i)&o", ChatColor.ITALIC.toString());
        message = message.replaceAll("(?i)&r", ChatColor.RESET.toString());
        
        return message;
    }
    
}