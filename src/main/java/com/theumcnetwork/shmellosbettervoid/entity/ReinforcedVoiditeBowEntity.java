
package com.theumcnetwork.shmellosbettervoid.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import java.util.Random;

import com.theumcnetwork.shmellosbettervoid.procedures.RvbProcedure;
import com.theumcnetwork.shmellosbettervoid.procedures.ReinforcedVoiditeBowProjectileHitsBlockProcedure;
import com.theumcnetwork.shmellosbettervoid.init.SbvModItems;
import com.theumcnetwork.shmellosbettervoid.init.SbvModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class ReinforcedVoiditeBowEntity extends AbstractArrow implements ItemSupplier {
	public ReinforcedVoiditeBowEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(SbvModEntities.REINFORCED_VOIDITE_BOW.get(), world);
	}

	public ReinforcedVoiditeBowEntity(EntityType<? extends ReinforcedVoiditeBowEntity> type, Level world) {
		super(type, world);
	}

	public ReinforcedVoiditeBowEntity(EntityType<? extends ReinforcedVoiditeBowEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public ReinforcedVoiditeBowEntity(EntityType<? extends ReinforcedVoiditeBowEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(SbvModItems.REINFORCED_VOIDITE_ARROW.get());
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(SbvModItems.REINFORCED_VOIDITE_ARROW.get());
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void playerTouch(Player entity) {
		super.playerTouch(entity);
		RvbProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		RvbProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
	}

	@Override
	public void onHitBlock(BlockHitResult blockHitResult) {
		super.onHitBlock(blockHitResult);
		ReinforcedVoiditeBowProjectileHitsBlockProcedure.execute(this.level, blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(),
				blockHitResult.getBlockPos().getZ());
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static ReinforcedVoiditeBowEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
		ReinforcedVoiditeBowEntity entityarrow = new ReinforcedVoiditeBowEntity(SbvModEntities.REINFORCED_VOIDITE_BOW.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(true);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		entityarrow.setSecondsOnFire(100);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1,
				1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static ReinforcedVoiditeBowEntity shoot(LivingEntity entity, LivingEntity target) {
		ReinforcedVoiditeBowEntity entityarrow = new ReinforcedVoiditeBowEntity(SbvModEntities.REINFORCED_VOIDITE_BOW.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 3.6f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(6.6);
		entityarrow.setKnockback(5);
		entityarrow.setCritArrow(true);
		entityarrow.setSecondsOnFire(100);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1,
				1f / (new Random().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
