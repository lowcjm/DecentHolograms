package dev.tunnel.sellwand.api;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import java.util.List;

public interface SellWandAPI {
    double sellChestContents(Player player);
    boolean hasSellWand(Player player);
    double sellItems(Player player, List<ItemStack> items);
}

