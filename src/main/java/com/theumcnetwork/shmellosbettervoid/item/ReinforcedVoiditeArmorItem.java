
package com.theumcnetwork.shmellosbettervoid.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import com.theumcnetwork.shmellosbettervoid.procedures.VoideningGetProcedure;
import com.theumcnetwork.shmellosbettervoid.init.SbvModTabs;

public abstract class ReinforcedVoiditeArmorItem extends ArmorItem {
	public ReinforcedVoiditeArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 102;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{14, 41, 34, 14}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 61;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}

			@Override
			public String getName() {
				return "reinforced_voidite_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends ReinforcedVoiditeArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(SbvModTabs.TAB_SBV_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "sbv:textures/models/armor/reinforcedvoidite_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			VoideningGetProcedure.execute(entity);
		}
	}

	public static class Chestplate extends ReinforcedVoiditeArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(SbvModTabs.TAB_SBV_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "sbv:textures/models/armor/reinforcedvoidite_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			VoideningGetProcedure.execute(entity);
		}
	}

	public static class Leggings extends ReinforcedVoiditeArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(SbvModTabs.TAB_SBV_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "sbv:textures/models/armor/reinforcedvoidite_layer_2.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			VoideningGetProcedure.execute(entity);
		}
	}

	public static class Boots extends ReinforcedVoiditeArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(SbvModTabs.TAB_SBV_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "sbv:textures/models/armor/reinforcedvoidite_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			VoideningGetProcedure.execute(entity);
		}
	}
}
