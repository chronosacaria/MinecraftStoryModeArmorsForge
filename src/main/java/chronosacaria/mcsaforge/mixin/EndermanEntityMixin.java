package chronosacaria.mcsaforge.mixin;

import chronosacaria.mcsaforge.registry.ArmorRegistry;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EndermanEntity.class)
public class EndermanEntityMixin{

    @Inject(method = "shouldAttackPlayer", at = @At(value = "HEAD"), cancellable = true)
    private void mcsaForge_EndermanCancelAttackMixin(PlayerEntity playerEntity, CallbackInfoReturnable<Boolean> cir){
        ItemStack helmetStack = playerEntity.getItemStackFromSlot(EquipmentSlotType.HEAD);
        ItemStack chestplateStack = playerEntity.getItemStackFromSlot(EquipmentSlotType.CHEST);
        ItemStack leggingsStack = playerEntity.getItemStackFromSlot(EquipmentSlotType.LEGS);
        ItemStack bootsStack = playerEntity.getItemStackFromSlot(EquipmentSlotType.FEET);

        if (helmetStack.getItem() == ArmorRegistry.ENDERMAN_SOREN_ARMOR.getHelmet()
                && chestplateStack.getItem() == ArmorRegistry.ENDERMAN_SOREN_ARMOR.getChestplate()
                && leggingsStack.getItem() == ArmorRegistry.ENDERMAN_SOREN_ARMOR.getLeggings()
                && bootsStack.getItem() == ArmorRegistry.ENDERMAN_SOREN_ARMOR.getBoots()
                || helmetStack.getItem() == ArmorRegistry.ENDER_DEFENDER.getHelmet()
                && chestplateStack.getItem() == ArmorRegistry.ENDER_DEFENDER.getChestplate()
                && leggingsStack.getItem() == ArmorRegistry.ENDER_DEFENDER.getLeggings()
                && bootsStack.getItem() == ArmorRegistry.ENDER_DEFENDER.getBoots()){
            cir.setReturnValue(false);
        }
    }
}
