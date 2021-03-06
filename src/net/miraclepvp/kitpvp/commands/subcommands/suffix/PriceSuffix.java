package net.miraclepvp.kitpvp.commands.subcommands.suffix;

import net.miraclepvp.kitpvp.bukkit.Text;
import net.miraclepvp.kitpvp.data.Data;
import net.miraclepvp.kitpvp.data.suffix.Suffix;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.NoSuchElementException;

public class PriceSuffix implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(args.length != 3){
            sender.sendMessage(Text.color("&cPlease use /suffix rename <name> <new_price>"));
            return true;
        }
        try {
            try {
                Integer newprice = Integer.parseInt(args[2]);
                if (Data.getSuffix(args[1]) == null) {
                    sender.sendMessage(Text.color("&cThere is no suffix with this name."));
                    return true;
                } else {
                    Suffix suffix = Data.getSuffix(args[1]);
                    sender.sendMessage(Text.color("&aYou have succesfully changed the price of the suffix " + suffix.getName() + "!"));
                    suffix.setCost(newprice);
                    return true;
                }
            }catch (NumberFormatException ex){
                sender.sendMessage(Text.color("&cThe given price is not a valid price."));
                return true;
            }
        } catch(NoSuchElementException ex){
            sender.sendMessage(Text.color("&cThere is no suffix with this name or the given price is not valid."));
            return true;
        }
    }
}
