package chronosacaria.mcsaforge.items.blockitems;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import net.minecraftforge.common.extensions.IForgeItem;

import javax.annotation.Nullable;

public class CarvedWhitePumpkinBlockItem extends BlockItem implements IForgeItem {
    public CarvedWhitePumpkinBlockItem(Block blockIn, Properties builder) {
        super(blockIn, builder);
    }

    @Nullable
    @Override
    public EquipmentSlotType getEquipmentSlot(ItemStack stack) {
        return EquipmentSlotType.HEAD;
    }

    @Override
    public boolean isEnderMask(ItemStack stack, PlayerEntity player, EndermanEntity endermanEntity) {
        return true;
    }

    @Override
    public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        if (!worldIn.isRemote()){
            if (entityIn instanceof PlayerEntity){
                PlayerEntity player = (PlayerEntity) entityIn;
                ItemStack headStack = player.getItemStackFromSlot(EquipmentSlotType.HEAD);
                EffectInstance nightVision = new EffectInstance(Effects.NIGHT_VISION, 300, 0, true, false);
                //boolean hasPlayerEffect = player.isPotionActive(nightVision.getPotion());
                if (headStack.getItem() == this /*&& !hasPlayerEffect*/){
                    player.addPotionEffect(nightVision);
                }
            }
        }
    }
}
