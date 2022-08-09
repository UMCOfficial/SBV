
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.theumcnetwork.shmellosbettervoid.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import com.theumcnetwork.shmellosbettervoid.block.VoijidBlock;
import com.theumcnetwork.shmellosbettervoid.block.VoiditeOreBlock;
import com.theumcnetwork.shmellosbettervoid.block.VoiditeBlockBlock;
import com.theumcnetwork.shmellosbettervoid.block.VoidStoneOreBlock;
import com.theumcnetwork.shmellosbettervoid.block.VoidStoneBlockBlock;
import com.theumcnetwork.shmellosbettervoid.block.VoidIronOreBlock;
import com.theumcnetwork.shmellosbettervoid.block.VoidIronBlockBlock;
import com.theumcnetwork.shmellosbettervoid.block.VoidGoldOreBlock;
import com.theumcnetwork.shmellosbettervoid.block.VoidGoldBlockBlock;
import com.theumcnetwork.shmellosbettervoid.block.VoidDiamondOreBlock;
import com.theumcnetwork.shmellosbettervoid.block.VoidDiamondBlockBlock;
import com.theumcnetwork.shmellosbettervoid.block.Void1WoodBlock;
import com.theumcnetwork.shmellosbettervoid.block.Void1StairsBlock;
import com.theumcnetwork.shmellosbettervoid.block.Void1SlabBlock;
import com.theumcnetwork.shmellosbettervoid.block.Void1PressurePlateBlock;
import com.theumcnetwork.shmellosbettervoid.block.Void1PlanksBlock;
import com.theumcnetwork.shmellosbettervoid.block.Void1LogBlock;
import com.theumcnetwork.shmellosbettervoid.block.Void1LeavesBlock;
import com.theumcnetwork.shmellosbettervoid.block.Void1FenceGateBlock;
import com.theumcnetwork.shmellosbettervoid.block.Void1FenceBlock;
import com.theumcnetwork.shmellosbettervoid.block.Void1ButtonBlock;
import com.theumcnetwork.shmellosbettervoid.block.GroundBlock;
import com.theumcnetwork.shmellosbettervoid.SbvMod;

public class SbvModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SbvMod.MODID);
	public static final RegistryObject<Block> GROUND = REGISTRY.register("ground", () -> new GroundBlock());
	public static final RegistryObject<Block> VOID_1_WOOD = REGISTRY.register("void_1_wood", () -> new Void1WoodBlock());
	public static final RegistryObject<Block> VOID_1_LOG = REGISTRY.register("void_1_log", () -> new Void1LogBlock());
	public static final RegistryObject<Block> VOID_1_PLANKS = REGISTRY.register("void_1_planks", () -> new Void1PlanksBlock());
	public static final RegistryObject<Block> VOID_1_LEAVES = REGISTRY.register("void_1_leaves", () -> new Void1LeavesBlock());
	public static final RegistryObject<Block> VOID_1_STAIRS = REGISTRY.register("void_1_stairs", () -> new Void1StairsBlock());
	public static final RegistryObject<Block> VOID_1_SLAB = REGISTRY.register("void_1_slab", () -> new Void1SlabBlock());
	public static final RegistryObject<Block> VOID_1_FENCE = REGISTRY.register("void_1_fence", () -> new Void1FenceBlock());
	public static final RegistryObject<Block> VOID_1_FENCE_GATE = REGISTRY.register("void_1_fence_gate", () -> new Void1FenceGateBlock());
	public static final RegistryObject<Block> VOID_1_PRESSURE_PLATE = REGISTRY.register("void_1_pressure_plate", () -> new Void1PressurePlateBlock());
	public static final RegistryObject<Block> VOID_1_BUTTON = REGISTRY.register("void_1_button", () -> new Void1ButtonBlock());
	public static final RegistryObject<Block> VOIJID = REGISTRY.register("voijid", () -> new VoijidBlock());
	public static final RegistryObject<Block> VOID_IRON_ORE = REGISTRY.register("void_iron_ore", () -> new VoidIronOreBlock());
	public static final RegistryObject<Block> VOID_IRON_BLOCK = REGISTRY.register("void_iron_block", () -> new VoidIronBlockBlock());
	public static final RegistryObject<Block> VOID_DIAMOND_ORE = REGISTRY.register("void_diamond_ore", () -> new VoidDiamondOreBlock());
	public static final RegistryObject<Block> VOID_DIAMOND_BLOCK = REGISTRY.register("void_diamond_block", () -> new VoidDiamondBlockBlock());
	public static final RegistryObject<Block> VOID_GOLD_ORE = REGISTRY.register("void_gold_ore", () -> new VoidGoldOreBlock());
	public static final RegistryObject<Block> VOID_GOLD_BLOCK = REGISTRY.register("void_gold_block", () -> new VoidGoldBlockBlock());
	public static final RegistryObject<Block> VOID_STONE_ORE = REGISTRY.register("void_stone_ore", () -> new VoidStoneOreBlock());
	public static final RegistryObject<Block> VOID_STONE_BLOCK = REGISTRY.register("void_stone_block", () -> new VoidStoneBlockBlock());
	public static final RegistryObject<Block> VOIDITE_ORE = REGISTRY.register("voidite_ore", () -> new VoiditeOreBlock());
	public static final RegistryObject<Block> VOIDITE_BLOCK = REGISTRY.register("voidite_block", () -> new VoiditeBlockBlock());
}
