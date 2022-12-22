package net.celestia.celestialspheres.fluid;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager.Builder;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public abstract class MoltenCheeseFluid extends FlowableFluid {

    @Override
    public Fluid getStill() {
        return ModFluids.STILL_MOLTEN_CHEESE;
    }

    @Override
    public Fluid getFlowing() {
        return ModFluids.FLOWING_MOLTEN_CHEESE;
    }

    @Override
    public Item getBucketItem() {
        return ModFluids.MOLTEN_CHEESE_BUCKET;
    }
    
    @Override
    protected boolean isInfinite(World world) {
        return false;
    }

    @Override
    protected void beforeBreakingBlock(WorldAccess world, BlockPos pos, BlockState state) {
        final BlockEntity blockEntity = state.hasBlockEntity() ? world.getBlockEntity(pos) : null;
        Block.dropStacks(state, world, pos, blockEntity);
    }

    @Override
    protected int getFlowSpeed(WorldView world) {
        return 2;
    }

    @Override
    protected BlockState toBlockState(FluidState state) {
        return ModFluids.MOLTEN_CHEESE_BLOCK.getDefaultState().with(FluidBlock.LEVEL, MoltenCheeseFluid.getBlockStateLevel(state));
    }

    @Override
    public boolean matchesType(Fluid fluid) {
        return fluid == ModFluids.STILL_MOLTEN_CHEESE || fluid == ModFluids.FLOWING_MOLTEN_CHEESE;
    }

    @Override
    protected int getLevelDecreasePerBlock(WorldView world) {
        return 2;
    }

    @Override
    public int getLevel(FluidState state) {
        return 0;
    }
    
    @Override
    public int getTickRate(WorldView world) {
        return 30;
    }

    @Override
    protected boolean canBeReplacedWith(FluidState state, BlockView world, BlockPos pos, Fluid fluid, Direction direction) {
        return false;
    }

    @Override
    protected float getBlastResistance() {
        return 100.0f;
    }

    @Override
    public boolean isStill(FluidState state) {
        return false;
    }
    
    public static class Flowing extends MoltenCheeseFluid {
        @Override
        protected void appendProperties(Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);
        }

        @Override
        public int getLevel(FluidState state) {
            return state.get(LEVEL);
        }

        @Override
        public boolean isStill(FluidState state) {
            return false;
        }
    }
    
    public static class Still extends MoltenCheeseFluid {
        @Override
        public int getLevel(FluidState state) {
            return 8;
        }

        @Override
        public boolean isStill(FluidState state) {
            return true;
        }
    }
}
