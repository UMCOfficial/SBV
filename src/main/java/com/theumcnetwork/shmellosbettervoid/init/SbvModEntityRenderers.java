
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.theumcnetwork.shmellosbettervoid.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import com.theumcnetwork.shmellosbettervoid.client.renderer.VoiditebowRenderer;
import com.theumcnetwork.shmellosbettervoid.client.renderer.VoiderRenderer;
import com.theumcnetwork.shmellosbettervoid.client.renderer.ReinforcedVoiditeBowRenderer;
import com.theumcnetwork.shmellosbettervoid.client.renderer.NullRenderer;
import com.theumcnetwork.shmellosbettervoid.client.renderer.KultrRenderer;
import com.theumcnetwork.shmellosbettervoid.client.renderer.GrulpRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SbvModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(SbvModEntities.VOIDER.get(), VoiderRenderer::new);
		event.registerEntityRenderer(SbvModEntities.NULL.get(), NullRenderer::new);
		event.registerEntityRenderer(SbvModEntities.KULTR.get(), KultrRenderer::new);
		event.registerEntityRenderer(SbvModEntities.GRULP.get(), GrulpRenderer::new);
		event.registerEntityRenderer(SbvModEntities.GRULP_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SbvModEntities.VOIDITEBOW.get(), VoiditebowRenderer::new);
		event.registerEntityRenderer(SbvModEntities.REINFORCED_VOIDITE_BOW.get(), ReinforcedVoiditeBowRenderer::new);
	}
}
