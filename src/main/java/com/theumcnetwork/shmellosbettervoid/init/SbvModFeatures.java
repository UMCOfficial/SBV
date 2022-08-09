
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.theumcnetwork.shmellosbettervoid.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

import com.theumcnetwork.shmellosbettervoid.world.features.ores.VoiditeOreFeature;
import com.theumcnetwork.shmellosbettervoid.world.features.ores.VoidStoneOreFeature;
import com.theumcnetwork.shmellosbettervoid.world.features.ores.VoidIronOreFeature;
import com.theumcnetwork.shmellosbettervoid.world.features.ores.VoidGoldOreFeature;
import com.theumcnetwork.shmellosbettervoid.world.features.ores.VoidDiamondOreFeature;
import com.theumcnetwork.shmellosbettervoid.world.features.lakes.VoijidFeature;
import com.theumcnetwork.shmellosbettervoid.SbvMod;

@Mod.EventBusSubscriber
public class SbvModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, SbvMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> VOIJID = register("voijid", VoijidFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.LAKES, VoijidFeature.GENERATE_BIOMES, VoijidFeature::placedFeature));
	public static final RegistryObject<Feature<?>> VOID_IRON_ORE = register("void_iron_ore", VoidIronOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, VoidIronOreFeature.GENERATE_BIOMES, VoidIronOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> VOID_DIAMOND_ORE = register("void_diamond_ore", VoidDiamondOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, VoidDiamondOreFeature.GENERATE_BIOMES,
					VoidDiamondOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> VOID_GOLD_ORE = register("void_gold_ore", VoidGoldOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, VoidGoldOreFeature.GENERATE_BIOMES, VoidGoldOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> VOID_STONE_ORE = register("void_stone_ore", VoidStoneOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, VoidStoneOreFeature.GENERATE_BIOMES, VoidStoneOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> VOIDITE_ORE = register("voidite_ore", VoiditeOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, VoiditeOreFeature.GENERATE_BIOMES, VoiditeOreFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
