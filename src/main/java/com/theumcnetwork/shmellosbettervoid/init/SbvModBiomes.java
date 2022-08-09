
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.theumcnetwork.shmellosbettervoid.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.biome.Biome;

import com.theumcnetwork.shmellosbettervoid.world.biome.ShmellosBetterVoidBiomeBiome;
import com.theumcnetwork.shmellosbettervoid.SbvMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SbvModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, SbvMod.MODID);
	public static final RegistryObject<Biome> SHMELLOS_BETTER_VOID_BIOME = REGISTRY.register("shmellos_better_void_biome",
			() -> ShmellosBetterVoidBiomeBiome.createBiome());

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ShmellosBetterVoidBiomeBiome.init();
		});
	}
}
