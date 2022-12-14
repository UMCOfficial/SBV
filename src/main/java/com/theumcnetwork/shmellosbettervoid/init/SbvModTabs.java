
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
	public static CreativeModeTab TAB_SBV_TOOLS;
	public static CreativeModeTab TAB_SBV_WEAPONS;
	public static CreativeModeTab TAB_SBV_MATERIALS;
	public static CreativeModeTab TAB_SBV_ARMOR;

	public static void load() {
		TAB_SHMELLOS_BETTER_VOID = new CreativeModeTab("tabshmellos_better_void") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SbvModItems.SBVLOGO.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_SBV_TOOLS = new CreativeModeTab("tabsbv_tools") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SbvModItems.VOIDITE_AXE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_SBV_WEAPONS = new CreativeModeTab("tabsbv_weapons") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SbvModItems.VOIDITE_SWORD.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_SBV_MATERIALS = new CreativeModeTab("tabsbv_materials") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SbvModBlocks.VOIDITE_BLOCK.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_SBV_ARMOR = new CreativeModeTab("tabsbv_armor") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SbvModItems.REINFORCED_VOIDITE_ARMOR_CHESTPLATE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
