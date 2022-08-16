
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.theumcnetwork.shmellosbettervoid.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import com.theumcnetwork.shmellosbettervoid.client.model.Modelentity_null;
import com.theumcnetwork.shmellosbettervoid.client.model.Modelentity_kultr;
import com.theumcnetwork.shmellosbettervoid.client.model.Modelcustom_model;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class SbvModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelentity_kultr.LAYER_LOCATION, Modelentity_kultr::createBodyLayer);
		event.registerLayerDefinition(Modelentity_null.LAYER_LOCATION, Modelentity_null::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
	}
}
