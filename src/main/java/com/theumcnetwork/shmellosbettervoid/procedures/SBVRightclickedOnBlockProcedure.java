package com.theumcnetwork.shmellosbettervoid.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class SBVRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == (world.getBlockState(new BlockPos(x, -64, z))).getBlock()) {
			world.destroyBlock(new BlockPos(x, y, z), false);
		}
	}
}
