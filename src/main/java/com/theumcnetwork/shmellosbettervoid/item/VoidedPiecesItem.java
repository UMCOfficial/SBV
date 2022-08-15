
package com.theumcnetwork.shmellosbettervoid.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import com.theumcnetwork.shmellosbettervoid.init.SbvModTabs;
import com.theumcnetwork.shmellosbettervoid.init.SbvModSounds;

public class VoidedPiecesItem extends RecordItem {
	public VoidedPiecesItem() {
		super(0, SbvModSounds.REGISTRY.get(new ResourceLocation("sbv:voidedpieces")),
				new Item.Properties().tab(SbvModTabs.TAB_SBV_DISCS).stacksTo(1).rarity(Rarity.RARE));
	}
}
