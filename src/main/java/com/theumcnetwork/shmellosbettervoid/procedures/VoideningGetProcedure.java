package com.theumcnetwork.shmellosbettervoid.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import com.theumcnetwork.shmellosbettervoid.init.SbvModMobEffects;

public class VoideningGetProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(SbvModMobEffects.VOIDENING.get(), 1, 1, (false), (true)));
	}
}
