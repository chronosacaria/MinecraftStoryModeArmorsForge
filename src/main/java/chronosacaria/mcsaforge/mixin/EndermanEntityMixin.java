package chronosacaria.mcsaforge.mixin;

import chronosacaria.mcsaforge.collections.ArmorCollection;
import chronosacaria.mcsaforge.items.armor.ArmorSets;
import chronosacaria.mcsaforge.registry.ArmorRegistry;
//import chronosacaria.mcsaforge.registry.ItemRegistry;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EndermanEntity.class)
public abstract class EndermanEntityMixin{

    @Inject(method = "shouldAttackPlayer", at = @At("HEAD"), cancellable = true, remap = false)
    private void shouldAttackPlayer(PlayerEntity playerEntity, CallbackInfoReturnable<Boolean> cir){
        ItemStack helmetStack = playerEntity.getItemStackFromSlot(EquipmentSlotType.HEAD);

        if (helmetStack.getItem() == ArmorRegistry.ADAMANTIUM_ARMOR.getHelmet()){
            cir.setReturnValue(false);
        }
    }
}
