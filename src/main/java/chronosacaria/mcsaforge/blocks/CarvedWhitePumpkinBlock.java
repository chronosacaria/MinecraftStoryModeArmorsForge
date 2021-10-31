package chronosacaria.mcsaforge.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.enchantment.IArmorVanishable;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.util.Direction;

public class CarvedWhitePumpkinBlock extends HorizontalBlock implements IArmorVanishable {
    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    public CarvedWhitePumpkinBlock(AbstractBlock.Properties properties) {
        super(properties);
        this.setDefaultState(this.getStateContainer().getBaseState().with(FACING, Direction.NORTH));
    }

    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }
}
