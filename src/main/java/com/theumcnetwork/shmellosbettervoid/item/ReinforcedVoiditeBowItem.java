
package com.theumcnetwork.shmellosbettervoid.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.ProjectileWeaponItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;

import com.theumcnetwork.shmellosbettervoid.procedures.ReinforcedVoiditeBowRangedItemUsedProcedure;
import com.theumcnetwork.shmellosbettervoid.init.SbvModTabs;
import com.theumcnetwork.shmellosbettervoid.init.SbvModItems;
import com.theumcnetwork.shmellosbettervoid.entity.ReinforcedVoiditeBowEntity;

public class ReinforcedVoiditeBowItem extends Item {
	public ReinforcedVoiditeBowItem() {
		super(new Item.Properties().tab(SbvModTabs.TAB_SBV_WEAPONS).durability(4062));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		entity.startUsingItem(hand);
		return new InteractionResultHolder(InteractionResult.SUCCESS, entity.getItemInHand(hand));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.BOW;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 72000;
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
		if (!world.isClientSide() && entityLiving instanceof ServerPlayer entity) {
			double x = entity.getX();
			double y = entity.getY();
			double z = entity.getZ();
			if (true) {
				ItemStack stack = ProjectileWeaponItem.getHeldProjectile(entity, e -> e.getItem() == SbvModItems.REINFORCED_VOIDITE_ARROW.get());
				if (stack == ItemStack.EMPTY) {
					for (int i = 0; i < entity.getInventory().items.size(); i++) {
						ItemStack teststack = entity.getInventory().items.get(i);
						if (teststack != null && teststack.getItem() == SbvModItems.REINFORCED_VOIDITE_ARROW.get()) {
							stack = teststack;
							break;
						}
					}
				}
				if (entity.getAbilities().instabuild || stack != ItemStack.EMPTY) {
					ReinforcedVoiditeBowEntity entityarrow = ReinforcedVoiditeBowEntity.shoot(world, entity, world.getRandom(), 3.6f, 6.6, 5);
					itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
					if (entity.getAbilities().instabuild) {
						entityarrow.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
					} else {
						if (new ItemStack(SbvModItems.REINFORCED_VOIDITE_ARROW.get()).isDamageableItem()) {
							if (stack.hurt(1, world.getRandom(), entity)) {
								stack.shrink(1);
								stack.setDamageValue(0);
								if (stack.isEmpty())
									entity.getInventory().removeItem(stack);
							}
						} else {
							stack.shrink(1);
							if (stack.isEmpty())
								entity.getInventory().removeItem(stack);
						}
					}

					ReinforcedVoiditeBowRangedItemUsedProcedure.execute(entity);
				}
			}
		}
	}
}
