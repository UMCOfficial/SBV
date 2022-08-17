
package com.theumcnetwork.shmellosbettervoid.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class ReinforcedVoiditeIngotItem extends Item {
	public ReinforcedVoiditeIngotItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
	}
}
