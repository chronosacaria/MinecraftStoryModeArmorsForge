package chronosacaria.mcsaforge.collections;

import chronosacaria.mcsaforge.factories.ArmorItemFactory;
import chronosacaria.mcsaforge.items.armor.ArmorSetItem;
import chronosacaria.mcsaforge.items.armor.ArmorSets;
import chronosacaria.mcsaforge.registry.ArmorRegistry;
import com.google.common.collect.ImmutableList;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.fml.RegistryObject;

import java.util.EnumSet;
import java.util.List;

public class ArmorCollection<T extends ArmorSetItem> {

    private final RegistryObject<T> helmet;
    private final RegistryObject<T> chestplate;
    private final RegistryObject<T> leggings;
    private final RegistryObject<T> boots;

    public ArmorCollection(RegistryObject<T> helmet, RegistryObject<T> chestplate, RegistryObject<T> leggings, RegistryObject<T> boots) {
        this.helmet = helmet;
        this.chestplate = chestplate;
        this.leggings = leggings;
        this.boots = boots;
    }

    public static ArmorCollection<ArmorSetItem> registerArmorCollection(ArmorSets sets, EnumSet<EquipmentSlotType> slotTypes) {
        return registerArmorCollection(sets, ArmorItemFactory.DEFAULT);
    }

    public static <T extends ArmorSetItem> ArmorCollection<T> registerArmorCollection(ArmorSets sets,ArmorItemFactory<T> factory) {
        return new ArmorCollection<>(
                ArmorRegistry.ARMOR.register(sets.getSetName() + "_helmet", () -> factory.create(sets,EquipmentSlotType.HEAD)),
                ArmorRegistry.ARMOR.register(sets.getSetName() + "_chestplate", () -> factory.create(sets,EquipmentSlotType.CHEST)),
                ArmorRegistry.ARMOR.register(sets.getSetName() + "_leggings", () -> factory.create(sets,EquipmentSlotType.LEGS)),
                ArmorRegistry.ARMOR.register(sets.getSetName() + "_boots", () -> factory.create(sets,EquipmentSlotType.FEET))
        );
    }

    public T getHelmet() {
        return helmet.get();
    }

    public T getChestplate() {
        return chestplate.get();
    }

    public T getLeggings() {
        return leggings.get();
    }

    public T getBoots() {
        return boots.get();
    }

    public List<T> getArmor() {
        return ImmutableList.of(getHelmet(), getChestplate(), getLeggings(), getBoots());
    }

   //public static void init(){
   //    for (ArmorSets set : ArmorSets.values()){
   //        EnumSet<EquipmentSlotType> slotTypes;

   //        switch (set){
   //            case HARPERS_HEADSET:
   //                //case WHITE_PUMPKIN:
   //                slotTypes = EnumSet.of(EquipmentSlotType.HEAD);
   //                break;
   //            default:
   //                slotTypes = EnumSet.of(EquipmentSlotType.HEAD, EquipmentSlotType.CHEST, EquipmentSlotType.LEGS,
   //                        EquipmentSlotType.FEET);
   //        }
   //        registerArmorCollection(set, slotTypes);
   //    }
   //}
}
