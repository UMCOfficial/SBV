
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.theumcnetwork.shmellosbettervoid.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import com.theumcnetwork.shmellosbettervoid.entity.VoiditebowEntity;
import com.theumcnetwork.shmellosbettervoid.entity.VoiderEntity;
import com.theumcnetwork.shmellosbettervoid.entity.ReinforcedVoiditeBowEntity;
import com.theumcnetwork.shmellosbettervoid.entity.NullEntity;
import com.theumcnetwork.shmellosbettervoid.entity.KultrEntity;
import com.theumcnetwork.shmellosbettervoid.entity.GrulpEntityProjectile;
import com.theumcnetwork.shmellosbettervoid.entity.GrulpEntity;
import com.theumcnetwork.shmellosbettervoid.SbvMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SbvModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, SbvMod.MODID);
	public static final RegistryObject<EntityType<VoiderEntity>> VOIDER = register("voider",
			EntityType.Builder.<VoiderEntity>of(VoiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128)
					.setUpdateInterval(3).setCustomClientFactory(VoiderEntity::new).fireImmune().sized(0.6f, 4f));
	public static final RegistryObject<EntityType<NullEntity>> NULL = register("null",
			EntityType.Builder.<NullEntity>of(NullEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(NullEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KultrEntity>> KULTR = register("kultr",
			EntityType.Builder.<KultrEntity>of(KultrEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(KultrEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<GrulpEntity>> GRULP = register("grulp",
			EntityType.Builder.<GrulpEntity>of(GrulpEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(GrulpEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GrulpEntityProjectile>> GRULP_PROJECTILE = register("projectile_grulp",
			EntityType.Builder.<GrulpEntityProjectile>of(GrulpEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(GrulpEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<VoiditebowEntity>> VOIDITEBOW = register("projectile_voiditebow",
			EntityType.Builder.<VoiditebowEntity>of(VoiditebowEntity::new, MobCategory.MISC).setCustomClientFactory(VoiditebowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ReinforcedVoiditeBowEntity>> REINFORCED_VOIDITE_BOW = register("projectile_reinforced_voidite_bow",
			EntityType.Builder.<ReinforcedVoiditeBowEntity>of(ReinforcedVoiditeBowEntity::new, MobCategory.MISC)
					.setCustomClientFactory(ReinforcedVoiditeBowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			VoiderEntity.init();
			NullEntity.init();
			KultrEntity.init();
			GrulpEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(VOIDER.get(), VoiderEntity.createAttributes().build());
		event.put(NULL.get(), NullEntity.createAttributes().build());
		event.put(KULTR.get(), KultrEntity.createAttributes().build());
		event.put(GRULP.get(), GrulpEntity.createAttributes().build());
	}
}
