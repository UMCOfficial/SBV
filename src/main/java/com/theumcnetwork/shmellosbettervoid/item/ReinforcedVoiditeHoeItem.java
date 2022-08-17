
package com.theumcnetwork.shmellosbettervoid.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.CreativeModeTab;

import com.theumcnetwork.shmellosbettervoid.init.SbvModItems;

public class ReinforcedVoiditeHoeItem extends HoeItem {
	public ReinforcedVoiditeHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 3660;
			}

			public float getSpeed() {
				return 19f;
			}

			public float getAttackDamageBonus() {
				return 12f;
			}

			public int getLevel() {
				return 14;
			}

			public int getEnchantmentValue() {
				return 95;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SbvModItems.REINFORCED_VOIDITE_INGOT.get()));
			}
		}, 0, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
