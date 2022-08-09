
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.theumcnetwork.shmellosbettervoid.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class SbvModTabs {
	public static CreativeModeTab TAB_SHMELLOS_BETTER_VOID;

	public static void load() {
		TAB_SHMELLOS_BETTER_VOID = new CreativeModeTab("tabshmellos_better_void") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SbvModItems.SBVLOGO.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
