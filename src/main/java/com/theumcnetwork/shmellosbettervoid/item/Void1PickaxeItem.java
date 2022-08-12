
package com.theumcnetwork.shmellosbettervoid.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import com.theumcnetwork.shmellosbettervoid.init.SbvModTabs;
import com.theumcnetwork.shmellosbettervoid.init.SbvModBlocks;

public class Void1PickaxeItem extends PickaxeItem {
	public Void1PickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SbvModBlocks.VOID_1_PLANKS.get()));
			}
		}, 1, -3f, new Item.Properties().tab(SbvModTabs.TAB_SBV_TOOLS));
	}
}
