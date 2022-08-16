
package com.theumcnetwork.shmellosbettervoid.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.theumcnetwork.shmellosbettervoid.entity.VoiderEntity;
import com.theumcnetwork.shmellosbettervoid.client.model.Modelcustom_model;

public class VoiderRenderer extends MobRenderer<VoiderEntity, Modelcustom_model<VoiderEntity>> {
	public VoiderRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(VoiderEntity entity) {
		return new ResourceLocation("sbv:textures/entities/voidertx.png");
	}
}
