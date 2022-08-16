
package com.theumcnetwork.shmellosbettervoid.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.theumcnetwork.shmellosbettervoid.entity.KultrEntity;
import com.theumcnetwork.shmellosbettervoid.client.model.Modelentity_kultr;

public class KultrRenderer extends MobRenderer<KultrEntity, Modelentity_kultr<KultrEntity>> {
	public KultrRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelentity_kultr(context.bakeLayer(Modelentity_kultr.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(KultrEntity entity) {
		return new ResourceLocation("sbv:textures/entities/kultrtx.png");
	}
}
