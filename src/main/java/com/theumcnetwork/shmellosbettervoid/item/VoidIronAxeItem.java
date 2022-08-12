
package com.theumcnetwork.shmellosbettervoid.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import com.theumcnetwork.shmellosbettervoid.init.SbvModTabs;
import com.theumcnetwork.shmellosbettervoid.init.SbvModItems;

public class VoidIronAxeItem extends AxeItem {
	public VoidIronAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SbvModItems.VOID_IRON_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties().tab(SbvModTabs.TAB_SBV_TOOLS));
	}
}
