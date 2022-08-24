
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.theumcnetwork.shmellosbettervoid.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import com.theumcnetwork.shmellosbettervoid.potion.VoideningMobEffect;
import com.theumcnetwork.shmellosbettervoid.SbvMod;

public class SbvModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, SbvMod.MODID);
	public static final RegistryObject<MobEffect> VOIDENING = REGISTRY.register("voidening", () -> new VoideningMobEffect());
}
