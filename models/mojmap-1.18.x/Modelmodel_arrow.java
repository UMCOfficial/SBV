// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmodel_arrow<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "model_arrow"), "main");
	private final ModelPart bb_main;

	public Modelmodel_arrow(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(12, 11)
						.addBox(0.0F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 13)
						.addBox(0.0F, -3.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 6)
						.addBox(0.0F, -5.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 9)
						.addBox(0.0F, -5.0F, 1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(0.0F, -6.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(0.0F, -7.0F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(0.0F, -8.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(0.0F, -11.0F, 5.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(0.0F, -10.0F, 6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.0F, -12.0F, 6.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
						.addBox(0.0F, -10.0F, 7.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(0.0F, -13.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}