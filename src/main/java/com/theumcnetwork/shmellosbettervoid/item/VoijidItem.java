
package com.theumcnetwork.shmellosbettervoid.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import java.util.List;

import com.theumcnetwork.shmellosbettervoid.init.SbvModTabs;
import com.theumcnetwork.shmellosbettervoid.init.SbvModFluids;

public class VoijidItem extends BucketItem {
	public VoijidItem() {
		super(SbvModFluids.VOIJID,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(SbvModTabs.TAB_SHMELLOS_BETTER_VOID));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Void water"));
	}
}
