
package com.theumcnetwork.shmellosbettervoid.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.theumcnetwork.shmellosbettervoid.entity.GrulpEntity;
import com.theumcnetwork.shmellosbettervoid.client.model.Modelentity_grulp;

public class GrulpRenderer extends MobRenderer<GrulpEntity, Modelentity_grulp<GrulpEntity>> {
	public GrulpRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelentity_grulp(context.bakeLayer(Modelentity_grulp.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GrulpEntity entity) {
		return new ResourceLocation("sbv:textures/entities/grulptx.png");
	}
}
