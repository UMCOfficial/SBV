// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart legleft;
	private final ModelPart legright;
	private final ModelPart Body;
	private final ModelPart armleft;
	private final ModelPart armright;
	private final ModelPart Head;

	public Modelcustom_model(ModelPart root) {
		this.legleft = root.getChild("legleft");
		this.legright = root.getChild("legright");
		this.Body = root.getChild("Body");
		this.armleft = root.getChild("armleft");
		this.armright = root.getChild("armright");
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition legleft = partdefinition.addOrReplaceChild("legleft", CubeListBuilder.create(),
				PartPose.offset(3.0F, 24.0F, -1.0F));

		PartDefinition cube_r1 = legleft.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(34, 60).addBox(-8.0F, -15.1F, -1.0F, 2.0F, 15.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, -5.0F, -3.1416F, 0.6545F, 3.1416F));

		PartDefinition cube_r2 = legleft.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(50, 61).addBox(-8.0F, -22.8F, 5.6F, 2.0F, 10.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, -5.0F, -2.6616F, 0.6545F, 3.1416F));

		PartDefinition legright = partdefinition.addOrReplaceChild("legright", CubeListBuilder.create(),
				PartPose.offset(-12.0F, 24.0F, 15.0F));

		PartDefinition cube_r3 = legright.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(26, 60).addBox(-8.0F, -15.0F, -1.0F, 2.0F, 15.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -14.0F, -3.1416F, -0.5236F, -3.1416F));

		PartDefinition cube_r4 = legright.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(42, 61).addBox(-8.0F, -22.8F, 5.6F, 2.0F, 10.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -14.0F, -2.6616F, -0.5236F, -3.1416F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -45.5F, -13.8F, 16.0F, 23.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -9.0F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition armleft = partdefinition.addOrReplaceChild("armleft", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 11.0F));

		PartDefinition cube_r6 = armleft.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, -44.0F, -12.0F, 2.0F, 2.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -15.0F, 2.8759F, -0.1685F, -2.7906F));

		PartDefinition cube_r7 = armleft.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(33, 30).addBox(-15.1F, -42.4F, 1.2F, 2.0F, 2.0F, 19.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -15.0F, -3.1416F, 0.4363F, -2.9671F));

		PartDefinition cube_r8 = armleft.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(34, 45).addBox(-13.0F, -43.0F, -6.0F, 15.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -15.0F, 3.1416F, 0.0F, -2.9234F));

		PartDefinition armright = partdefinition.addOrReplaceChild("armright", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-25.0F, -59.0F, 11.0F, 0.0263F, -0.1454F, -2.9696F));

		PartDefinition cube_r9 = armright.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 0).addBox(-10.4164F, -47.2814F, 2.6308F, 2.0F, 2.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, 0.0F, 0.0F, 2.9787F, -0.1639F, 2.9168F));

		PartDefinition cube_r10 = armright.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(33, 30).addBox(-6.847F, -42.1047F, 13.722F, 2.0F, 2.0F, 19.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, 0.0F, 0.0F, -3.0312F, 0.4555F, 2.8049F));

		PartDefinition cube_r11 = armright.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(34, 45).addBox(-10.8272F, -42.6096F, 8.8367F, 15.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, 0.0F, 0.0F, -3.0416F, 0.0172F, 2.8018F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 6.0F));

		PartDefinition cube_r12 = Head.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(122, 125)
						.addBox(2.0F, -61.0F, -8.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(122, 125)
						.addBox(-2.0F, -61.0F, -8.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 49)
						.addBox(7.0F, -57.0F, -11.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 30)
						.addBox(-6.0F, -57.0F, -11.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 49)
						.addBox(-2.0F, -59.0F, -8.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(0.0F, -61.0F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 53)
						.addBox(-2.0F, -63.0F, -8.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 29)
						.addBox(-5.0F, -63.0F, -8.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(35, 30)
						.addBox(4.0F, -63.0F, -8.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 41)
						.addBox(-5.0F, -63.0F, -11.0F, 12.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(30, 52)
						.addBox(-4.0F, -52.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 52)
						.addBox(-4.0F, -52.0F, -6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 55)
						.addBox(-4.0F, -52.0F, -9.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 50)
						.addBox(4.0F, -50.0F, -11.0F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(16, 52)
						.addBox(5.0F, -52.0F, -9.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 49)
						.addBox(5.0F, -52.0F, -6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 41)
						.addBox(5.0F, -52.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(-5.0F, -50.0F, -11.0F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(44, 0)
						.addBox(-5.0F, -63.0F, -13.0F, 12.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 29)
						.addBox(-5.0F, -57.0F, -11.0F, 12.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(35, 18)
						.addBox(-4.0F, -49.0F, -13.0F, 9.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(16, 52)
						.addBox(-2.0F, -48.0F, -13.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -15.0F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition cube_r13 = Head.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(50, 30)
						.addBox(-5.0F, 55.0F, 1.0F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(24, 49)
						.addBox(4.0F, 55.0F, 1.0F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 41)
						.addBox(5.0F, 53.0F, 9.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 3)
						.addBox(5.0F, 53.0F, 6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 0)
						.addBox(5.0F, 53.0F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 37)
						.addBox(-4.0F, 53.0F, 9.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 37)
						.addBox(-4.0F, 53.0F, 6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(-4.0F, 53.0F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -15.0F, 0.0F, 0.0F, -3.1416F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		legleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}