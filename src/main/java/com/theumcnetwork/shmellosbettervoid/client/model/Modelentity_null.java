package com.theumcnetwork.shmellosbettervoid.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelentity_null<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("sbv", "modelentity_null"), "main");
	public final ModelPart bone;

	public Modelentity_null(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 52).addBox(-7.0F, -16.0F, -3.0F, 5.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(42, 50)
						.addBox(2.0F, -16.0F, -3.0F, 5.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(66, 50)
						.addBox(-3.0F, -16.0F, 3.0F, 6.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(59, 16)
						.addBox(-3.0F, -16.0F, -7.0F, 6.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-2.0F, -2.0F, -3.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -21.0F, -8.0F, 16.0F, 5.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(-7.0F, -24.0F, -7.0F, 14.0F, 3.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 38)
						.addBox(-6.0F, -26.0F, -6.0F, 12.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(36, 38)
						.addBox(-5.0F, -27.0F, -5.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
