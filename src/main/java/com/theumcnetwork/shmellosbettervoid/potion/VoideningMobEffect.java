
package com.theumcnetwork.shmellosbettervoid.potion;

import net.minecraftforge.client.EffectRenderer;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.client.gui.screens.inventory.EffectRenderingInventoryScreen;
import net.minecraft.client.gui.GuiComponent;

import com.theumcnetwork.shmellosbettervoid.procedures.VoideningOnEffectActiveTickProcedure;

import com.mojang.blaze3d.vertex.PoseStack;

public class VoideningMobEffect extends MobEffect {
	public VoideningMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16711885);
	}

	@Override
	public String getDescriptionId() {
		return "effect.sbv.voidening";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		VoideningOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public void initializeClient(java.util.function.Consumer<net.minecraftforge.client.EffectRenderer> consumer) {
		consumer.accept(new EffectRenderer() {
			@Override
			public boolean shouldRenderHUD(MobEffectInstance effect) {
				return false;
			}

			@Override
			public void renderInventoryEffect(MobEffectInstance effect, EffectRenderingInventoryScreen<?> gui, PoseStack mStack, int x, int y,
					float z) {
			}

			@Override
			public void renderHUDEffect(MobEffectInstance effect, GuiComponent gui, PoseStack mStack, int x, int y, float z, float alpha) {
			}
		});
	}
}
