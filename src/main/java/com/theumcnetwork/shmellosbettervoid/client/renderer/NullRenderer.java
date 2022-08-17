
package com.theumcnetwork.shmellosbettervoid.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.theumcnetwork.shmellosbettervoid.entity.NullEntity;
import com.theumcnetwork.shmellosbettervoid.client.model.Modelentity_null;

public class NullRenderer extends MobRenderer<NullEntity, Modelentity_null<NullEntity>> {
	public NullRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelentity_null(context.bakeLayer(Modelentity_null.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NullEntity entity) {
		return new ResourceLocation("sbv:textures/entities/nulltx.png");
	}
}
