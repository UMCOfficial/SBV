
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.theumcnetwork.shmellosbettervoid.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import com.theumcnetwork.shmellosbettervoid.item.VoijidItem;
import com.theumcnetwork.shmellosbettervoid.item.VoiditeSwordItem;
import com.theumcnetwork.shmellosbettervoid.item.VoiditeShovelItem;
import com.theumcnetwork.shmellosbettervoid.item.VoiditeScrapItem;
import com.theumcnetwork.shmellosbettervoid.item.VoiditePickaxeItem;
import com.theumcnetwork.shmellosbettervoid.item.VoiditeHoeItem;
import com.theumcnetwork.shmellosbettervoid.item.VoiditeDustItem;
import com.theumcnetwork.shmellosbettervoid.item.VoiditeAxeItem;
import com.theumcnetwork.shmellosbettervoid.item.VoiditeArmorItem;
import com.theumcnetwork.shmellosbettervoid.item.VoidedPiecesItem;
import com.theumcnetwork.shmellosbettervoid.item.VoidIronSwordItem;
import com.theumcnetwork.shmellosbettervoid.item.VoidIronShovelItem;
import com.theumcnetwork.shmellosbettervoid.item.VoidIronPickaxeItem;
import com.theumcnetwork.shmellosbettervoid.item.VoidIronIngotItem;
import com.theumcnetwork.shmellosbettervoid.item.VoidIronHoeItem;
import com.theumcnetwork.shmellosbettervoid.item.VoidIronAxeItem;
import com.theumcnetwork.shmellosbettervoid.item.VoidIronArmorItem;
import com.theumcnetwork.shmellosbettervoid.item.VoidGoldSwordItem;
import com.theumcnetwork.shmellosbettervoid.item.VoidGoldShovelItem;
import com.theumcnetwork.shmellosbettervoid.item.VoidGoldPickaxeItem;
import com.theumcnetwork.shmellosbettervoid.item.VoidGoldIngotItem;
import com.theumcnetwork.shmellosbettervoid.item.VoidGoldHoeItem;
import com.theumcnetwork.shmellosbettervoid.item.VoidGoldAxeItem;
import com.theumcnetwork.shmellosbettervoid.item.VoidGoldArmorItem;
import com.theumcnetwork.shmellosbettervoid.item.VoidDiamondSwordItem;
import com.theumcnetwork.shmellosbettervoid.item.VoidDiamondShovelItem;
import com.theumcnetwork.shmellosbettervoid.item.VoidDiamondPickaxeItem;
import com.theumcnetwork.shmellosbettervoid.item.VoidDiamondItem;
import com.theumcnetwork.shmellosbettervoid.item.VoidDiamondHoeItem;
import com.theumcnetwork.shmellosbettervoid.item.VoidDiamondAxeItem;
import com.theumcnetwork.shmellosbettervoid.item.VoidDiamondArmorItem;
import com.theumcnetwork.shmellosbettervoid.item.Void1SwordItem;
import com.theumcnetwork.shmellosbettervoid.item.Void1ShovelItem;
import com.theumcnetwork.shmellosbettervoid.item.Void1PickaxeItem;
import com.theumcnetwork.shmellosbettervoid.item.Void1HoeItem;
import com.theumcnetwork.shmellosbettervoid.item.Void1AxeItem;
import com.theumcnetwork.shmellosbettervoid.item.SBVLOGOItem;
import com.theumcnetwork.shmellosbettervoid.item.SBVItem;
import com.theumcnetwork.shmellosbettervoid.item.ExcavatorItem;
import com.theumcnetwork.shmellosbettervoid.SbvMod;

public class SbvModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SbvMod.MODID);
	public static final RegistryObject<Item> SBV = REGISTRY.register("sbv", () -> new SBVItem());
	public static final RegistryObject<Item> GROUND = block(SbvModBlocks.GROUND, SbvModTabs.TAB_SHMELLOS_BETTER_VOID);
	public static final RegistryObject<Item> VOID_1_WOOD = block(SbvModBlocks.VOID_1_WOOD, SbvModTabs.TAB_SHMELLOS_BETTER_VOID);
	public static final RegistryObject<Item> VOID_1_LOG = block(SbvModBlocks.VOID_1_LOG, SbvModTabs.TAB_SHMELLOS_BETTER_VOID);
	public static final RegistryObject<Item> VOID_1_PLANKS = block(SbvModBlocks.VOID_1_PLANKS, SbvModTabs.TAB_SHMELLOS_BETTER_VOID);
	public static final RegistryObject<Item> VOID_1_STAIRS = block(SbvModBlocks.VOID_1_STAIRS, SbvModTabs.TAB_SHMELLOS_BETTER_VOID);
	public static final RegistryObject<Item> VOID_1_SLAB = block(SbvModBlocks.VOID_1_SLAB, SbvModTabs.TAB_SHMELLOS_BETTER_VOID);
	public static final RegistryObject<Item> VOID_1_BUTTON = block(SbvModBlocks.VOID_1_BUTTON, SbvModTabs.TAB_SHMELLOS_BETTER_VOID);
	public static final RegistryObject<Item> VOIJID_BUCKET = REGISTRY.register("voijid_bucket", () -> new VoijidItem());
	public static final RegistryObject<Item> VOID_GOLD_INGOT = REGISTRY.register("void_gold_ingot", () -> new VoidGoldIngotItem());
	public static final RegistryObject<Item> VOID_GOLD_ORE = block(SbvModBlocks.VOID_GOLD_ORE, SbvModTabs.TAB_SBV_MATERIALS);
	public static final RegistryObject<Item> VOID_GOLD_BLOCK = block(SbvModBlocks.VOID_GOLD_BLOCK, SbvModTabs.TAB_SBV_MATERIALS);
	public static final RegistryObject<Item> VOID_IRON_INGOT = REGISTRY.register("void_iron_ingot", () -> new VoidIronIngotItem());
	public static final RegistryObject<Item> VOID_IRON_ORE = block(SbvModBlocks.VOID_IRON_ORE, SbvModTabs.TAB_SBV_MATERIALS);
	public static final RegistryObject<Item> VOID_IRON_BLOCK = block(SbvModBlocks.VOID_IRON_BLOCK, SbvModTabs.TAB_SBV_MATERIALS);
	public static final RegistryObject<Item> VOID_DIAMOND = REGISTRY.register("void_diamond", () -> new VoidDiamondItem());
	public static final RegistryObject<Item> VOID_DIAMOND_ORE = block(SbvModBlocks.VOID_DIAMOND_ORE, SbvModTabs.TAB_SBV_MATERIALS);
	public static final RegistryObject<Item> VOID_DIAMOND_BLOCK = block(SbvModBlocks.VOID_DIAMOND_BLOCK, SbvModTabs.TAB_SBV_MATERIALS);
	public static final RegistryObject<Item> VOIDITE_DUST = REGISTRY.register("voidite_dust", () -> new VoiditeDustItem());
	public static final RegistryObject<Item> VOIDITE_ORE = block(SbvModBlocks.VOIDITE_ORE, SbvModTabs.TAB_SBV_MATERIALS);
	public static final RegistryObject<Item> VOIDITE_BLOCK = block(SbvModBlocks.VOIDITE_BLOCK, SbvModTabs.TAB_SBV_MATERIALS);
	public static final RegistryObject<Item> VOID_1_LEAVES = block(SbvModBlocks.VOID_1_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> VOID_1_FENCE = block(SbvModBlocks.VOID_1_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> VOID_1_FENCE_GATE = block(SbvModBlocks.VOID_1_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> VOID_1_PRESSURE_PLATE = block(SbvModBlocks.VOID_1_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> EXCAVATOR = REGISTRY.register("excavator", () -> new ExcavatorItem());
	public static final RegistryObject<Item> VOID_1_PICKAXE = REGISTRY.register("void_1_pickaxe", () -> new Void1PickaxeItem());
	public static final RegistryObject<Item> VOID_1_AXE = REGISTRY.register("void_1_axe", () -> new Void1AxeItem());
	public static final RegistryObject<Item> VOID_1_SHOVEL = REGISTRY.register("void_1_shovel", () -> new Void1ShovelItem());
	public static final RegistryObject<Item> VOID_1_HOE = REGISTRY.register("void_1_hoe", () -> new Void1HoeItem());
	public static final RegistryObject<Item> VOID_GOLD_PICKAXE = REGISTRY.register("void_gold_pickaxe", () -> new VoidGoldPickaxeItem());
	public static final RegistryObject<Item> VOID_GOLD_AXE = REGISTRY.register("void_gold_axe", () -> new VoidGoldAxeItem());
	public static final RegistryObject<Item> VOID_GOLD_SHOVEL = REGISTRY.register("void_gold_shovel", () -> new VoidGoldShovelItem());
	public static final RegistryObject<Item> VOID_GOLD_HOE = REGISTRY.register("void_gold_hoe", () -> new VoidGoldHoeItem());
	public static final RegistryObject<Item> VOID_IRON_PICKAXE = REGISTRY.register("void_iron_pickaxe", () -> new VoidIronPickaxeItem());
	public static final RegistryObject<Item> VOID_IRON_AXE = REGISTRY.register("void_iron_axe", () -> new VoidIronAxeItem());
	public static final RegistryObject<Item> VOID_IRON_SHOVEL = REGISTRY.register("void_iron_shovel", () -> new VoidIronShovelItem());
	public static final RegistryObject<Item> VOID_IRON_HOE = REGISTRY.register("void_iron_hoe", () -> new VoidIronHoeItem());
	public static final RegistryObject<Item> VOID_DIAMOND_PICKAXE = REGISTRY.register("void_diamond_pickaxe", () -> new VoidDiamondPickaxeItem());
	public static final RegistryObject<Item> VOID_DIAMOND_AXE = REGISTRY.register("void_diamond_axe", () -> new VoidDiamondAxeItem());
	public static final RegistryObject<Item> VOID_DIAMOND_SHOVEL = REGISTRY.register("void_diamond_shovel", () -> new VoidDiamondShovelItem());
	public static final RegistryObject<Item> VOID_DIAMOND_HOE = REGISTRY.register("void_diamond_hoe", () -> new VoidDiamondHoeItem());
	public static final RegistryObject<Item> VOIDITE_PICKAXE = REGISTRY.register("voidite_pickaxe", () -> new VoiditePickaxeItem());
	public static final RegistryObject<Item> VOIDITE_AXE = REGISTRY.register("voidite_axe", () -> new VoiditeAxeItem());
	public static final RegistryObject<Item> VOIDITE_SHOVEL = REGISTRY.register("voidite_shovel", () -> new VoiditeShovelItem());
	public static final RegistryObject<Item> VOIDITE_HOE = REGISTRY.register("voidite_hoe", () -> new VoiditeHoeItem());
	public static final RegistryObject<Item> VOID_1_SWORD = REGISTRY.register("void_1_sword", () -> new Void1SwordItem());
	public static final RegistryObject<Item> VOID_IRON_SWORD = REGISTRY.register("void_iron_sword", () -> new VoidIronSwordItem());
	public static final RegistryObject<Item> VOID_GOLD_SWORD = REGISTRY.register("void_gold_sword", () -> new VoidGoldSwordItem());
	public static final RegistryObject<Item> VOID_DIAMOND_SWORD = REGISTRY.register("void_diamond_sword", () -> new VoidDiamondSwordItem());
	public static final RegistryObject<Item> VOIDITE_SWORD = REGISTRY.register("voidite_sword", () -> new VoiditeSwordItem());
	public static final RegistryObject<Item> VOID_IRON_ARMOR_HELMET = REGISTRY.register("void_iron_armor_helmet",
			() -> new VoidIronArmorItem.Helmet());
	public static final RegistryObject<Item> VOID_IRON_ARMOR_CHESTPLATE = REGISTRY.register("void_iron_armor_chestplate",
			() -> new VoidIronArmorItem.Chestplate());
	public static final RegistryObject<Item> VOID_IRON_ARMOR_LEGGINGS = REGISTRY.register("void_iron_armor_leggings",
			() -> new VoidIronArmorItem.Leggings());
	public static final RegistryObject<Item> VOID_IRON_ARMOR_BOOTS = REGISTRY.register("void_iron_armor_boots", () -> new VoidIronArmorItem.Boots());
	public static final RegistryObject<Item> VOID_GOLD_ARMOR_HELMET = REGISTRY.register("void_gold_armor_helmet",
			() -> new VoidGoldArmorItem.Helmet());
	public static final RegistryObject<Item> VOID_GOLD_ARMOR_CHESTPLATE = REGISTRY.register("void_gold_armor_chestplate",
			() -> new VoidGoldArmorItem.Chestplate());
	public static final RegistryObject<Item> VOID_GOLD_ARMOR_LEGGINGS = REGISTRY.register("void_gold_armor_leggings",
			() -> new VoidGoldArmorItem.Leggings());
	public static final RegistryObject<Item> VOID_GOLD_ARMOR_BOOTS = REGISTRY.register("void_gold_armor_boots", () -> new VoidGoldArmorItem.Boots());
	public static final RegistryObject<Item> VOID_DIAMOND_ARMOR_HELMET = REGISTRY.register("void_diamond_armor_helmet",
			() -> new VoidDiamondArmorItem.Helmet());
	public static final RegistryObject<Item> VOID_DIAMOND_ARMOR_CHESTPLATE = REGISTRY.register("void_diamond_armor_chestplate",
			() -> new VoidDiamondArmorItem.Chestplate());
	public static final RegistryObject<Item> VOID_DIAMOND_ARMOR_LEGGINGS = REGISTRY.register("void_diamond_armor_leggings",
			() -> new VoidDiamondArmorItem.Leggings());
	public static final RegistryObject<Item> VOID_DIAMOND_ARMOR_BOOTS = REGISTRY.register("void_diamond_armor_boots",
			() -> new VoidDiamondArmorItem.Boots());
	public static final RegistryObject<Item> VOIDITE_ARMOR_HELMET = REGISTRY.register("voidite_armor_helmet", () -> new VoiditeArmorItem.Helmet());
	public static final RegistryObject<Item> VOIDITE_ARMOR_CHESTPLATE = REGISTRY.register("voidite_armor_chestplate",
			() -> new VoiditeArmorItem.Chestplate());
	public static final RegistryObject<Item> VOIDITE_ARMOR_LEGGINGS = REGISTRY.register("voidite_armor_leggings",
			() -> new VoiditeArmorItem.Leggings());
	public static final RegistryObject<Item> VOIDITE_ARMOR_BOOTS = REGISTRY.register("voidite_armor_boots", () -> new VoiditeArmorItem.Boots());
	public static final RegistryObject<Item> VOIDED_PIECES = REGISTRY.register("voided_pieces", () -> new VoidedPiecesItem());
	public static final RegistryObject<Item> SBVLOGO = REGISTRY.register("sbvlogo", () -> new SBVLOGOItem());
	public static final RegistryObject<Item> VOIDER = REGISTRY.register("voider_spawn_egg",
			() -> new ForgeSpawnEggItem(SbvModEntities.VOIDER, -16777216, -16764109, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> VOIDITE_SCRAP = REGISTRY.register("voidite_scrap", () -> new VoiditeScrapItem());
	public static final RegistryObject<Item> NULL = REGISTRY.register("null_spawn_egg",
			() -> new ForgeSpawnEggItem(SbvModEntities.NULL, -52225, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> NULL_TROPHY = block(SbvModBlocks.NULL_TROPHY, SbvModTabs.TAB_SHMELLOS_BETTER_VOID);
	public static final RegistryObject<Item> KULTR = REGISTRY.register("kultr_spawn_egg",
			() -> new ForgeSpawnEggItem(SbvModEntities.KULTR, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
