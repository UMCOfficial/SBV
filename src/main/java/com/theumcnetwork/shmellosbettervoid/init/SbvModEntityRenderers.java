
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.theumcnetwork.shmellosbettervoid.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import com.theumcnetwork.shmellosbettervoid.client.renderer.VoiderRenderer;
import com.theumcnetwork.shmellosbettervoid.client.renderer.NullRenderer;
import com.theumcnetwork.shmellosbettervoid.client.renderer.KultrRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SbvModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(SbvModEntities.VOIDER.get(), VoiderRenderer::new);
		event.registerEntityRenderer(SbvModEntities.NULL.get(), NullRenderer::new);
		event.registerEntityRenderer(SbvModEntities.KULTR.get(), KultrRenderer::new);
	}
}
