
package com.theumcnetwork.shmellosbettervoid.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import com.theumcnetwork.shmellosbettervoid.init.SbvModTabs;

public class VoidIronIngotItem extends Item {
	public VoidIronIngotItem() {
		super(new Item.Properties().tab(SbvModTabs.TAB_SBV_MATERIALS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}
