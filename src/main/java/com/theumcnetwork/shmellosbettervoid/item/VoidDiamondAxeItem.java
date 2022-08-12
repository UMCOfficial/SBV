
package com.theumcnetwork.shmellosbettervoid.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import com.theumcnetwork.shmellosbettervoid.init.SbvModTabs;
import com.theumcnetwork.shmellosbettervoid.init.SbvModItems;

public class VoidDiamondAxeItem extends AxeItem {
	public VoidDiamondAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 660;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 16f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 28;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SbvModItems.VOID_DIAMOND.get()));
			}
		}, 1, -3f, new Item.Properties().tab(SbvModTabs.TAB_SBV_TOOLS));
	}
}
