
package com.theumcnetwork.shmellosbettervoid.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import com.theumcnetwork.shmellosbettervoid.init.SbvModTabs;

public class ReinforcedVoiditeIngotItem extends Item {
	public ReinforcedVoiditeIngotItem() {
		super(new Item.Properties().tab(SbvModTabs.TAB_SBV_MATERIALS).stacksTo(64).rarity(Rarity.EPIC));
	}
}
