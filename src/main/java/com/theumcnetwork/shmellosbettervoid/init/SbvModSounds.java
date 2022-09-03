
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.theumcnetwork.shmellosbettervoid.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SbvModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("sbv", "voidedpieces"), new SoundEvent(new ResourceLocation("sbv", "voidedpieces")));
		REGISTRY.put(new ResourceLocation("sbv", "deathbyvoider"), new SoundEvent(new ResourceLocation("sbv", "deathbyvoider")));
		REGISTRY.put(new ResourceLocation("sbv", "null_talk"), new SoundEvent(new ResourceLocation("sbv", "null_talk")));
		REGISTRY.put(new ResourceLocation("sbv", "null_death"), new SoundEvent(new ResourceLocation("sbv", "null_death")));
		REGISTRY.put(new ResourceLocation("sbv", "negative"), new SoundEvent(new ResourceLocation("sbv", "negative")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
