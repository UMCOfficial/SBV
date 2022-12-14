package com.theumcnetwork.shmellosbettervoid.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;

import com.theumcnetwork.shmellosbettervoid.init.SbvModEntities;
import com.theumcnetwork.shmellosbettervoid.entity.ReinforcedVoiditeBowEntity;

public class ReinforcedVoiditeBowRangedItemUsedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _shootFrom = entity;
			Level projectileLevel = _shootFrom.level;
			if (!projectileLevel.isClientSide()) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new ReinforcedVoiditeBowEntity(SbvModEntities.REINFORCED_VOIDITE_BOW.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setCritArrow(true);
						entityToSpawn.pickup = AbstractArrow.Pickup.ALLOWED;
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 0, 0);
				_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
				_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) 3.6, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
	}
}
