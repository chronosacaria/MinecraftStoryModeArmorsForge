
package chronosacaria.mcsaforge.events;

import chronosacaria.mcsaforge.McsaForge;
import chronosacaria.mcsaforge.registry.ArmorRegistry;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.event.entity.living.LivingSetAttackTargetEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = McsaForge.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EntityEvents {
    @SubscribeEvent
    public static void onEndermanAttackPlayerEvent(LivingSetAttackTargetEvent event){

        if (event.getEntityLiving() instanceof EndermanEntity){
            LivingEntity target = ((EndermanEntity) event.getEntityLiving()).getAttackTarget();

            if (target instanceof PlayerEntity){
                if (target.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem() == ArmorRegistry.ENDERMAN_SOREN_ARMOR.getHelmet()
                        && target.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem() == ArmorRegistry.ENDERMAN_SOREN_ARMOR.getChestplate()
                        && target.getItemStackFromSlot(EquipmentSlotType.LEGS).getItem() == ArmorRegistry.ENDERMAN_SOREN_ARMOR.getLeggings()
                        && target.getItemStackFromSlot(EquipmentSlotType.FEET).getItem() == ArmorRegistry.ENDERMAN_SOREN_ARMOR.getBoots()
                        || target.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem() == ArmorRegistry.ENDER_DEFENDER.getHelmet()
                        && target.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem() == ArmorRegistry.ENDER_DEFENDER.getChestplate()
                        && target.getItemStackFromSlot(EquipmentSlotType.LEGS).getItem() == ArmorRegistry.ENDER_DEFENDER.getLeggings()
                        && target.getItemStackFromSlot(EquipmentSlotType.FEET).getItem() == ArmorRegistry.ENDER_DEFENDER.getBoots()){
                    ((EndermanEntity)event.getEntityLiving()).setAttackTarget(null);
                }
            }
        }
    }
}

