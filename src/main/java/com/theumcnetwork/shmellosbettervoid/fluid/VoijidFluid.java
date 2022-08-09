
package com.theumcnetwork.shmellosbettervoid.fluid;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

import com.theumcnetwork.shmellosbettervoid.init.SbvModItems;
import com.theumcnetwork.shmellosbettervoid.init.SbvModFluids;
import com.theumcnetwork.shmellosbettervoid.init.SbvModBlocks;

public abstract class VoijidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(SbvModFluids.VOIJID, SbvModFluids.FLOWING_VOIJID,
			FluidAttributes.builder(new ResourceLocation("sbv:blocks/voijid1"), new ResourceLocation("sbv:blocks/voijid1"))

					.sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty"))))
			.explosionResistance(100f).canMultiply()

			.bucket(SbvModItems.VOIJID_BUCKET).block(() -> (LiquidBlock) SbvModBlocks.VOIJID.get());

	private VoijidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends VoijidFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends VoijidFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
