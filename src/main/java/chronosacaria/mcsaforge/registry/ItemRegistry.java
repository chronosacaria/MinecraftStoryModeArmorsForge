package chronosacaria.mcsaforge.registry;

import chronosacaria.mcsaforge.McsaForge;
import chronosacaria.mcsaforge.items.armor.ArmorSetItem;
import chronosacaria.mcsaforge.items.armor.ArmorSets;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.EnumMap;
import java.util.EnumSet;

public class ItemRegistry {

    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS,
            McsaForge.MODID);

    public static final EnumMap<ArmorSets, EnumMap<EquipmentSlotType, Item>> armorItems =
            new EnumMap<>(ArmorSets.class);

    protected static String armorID(ArmorSets set, EquipmentSlotType slotType) {
        String slotID;
        switch (slotType) {
            case HEAD:
                slotID = "helmet";
                break;
            case CHEST:
                slotID = "chestplate";
                break;
            case LEGS:
                slotID = "leggings";
                break;
            case FEET:
                slotID = "boots";
                break;
            default:
                throw new IllegalArgumentException("armor with non-armor equipment slot");
        }
        return set.getSetName() + "_" + slotID;
    }

    protected static void registerArmor(ArmorSets set, EnumSet<EquipmentSlotType> slotTypes) {
        EnumMap<EquipmentSlotType, Item> slotMap = new EnumMap<>(EquipmentSlotType.class);

        for (final EquipmentSlotType slotType : slotTypes)
            ItemRegistry.REGISTRY.register(armorID(set, slotType),
                    () -> new ArmorSetItem(set, slotType));
        armorItems.put(set, slotMap);
    }

    public static void init(){
        for (ArmorSets set : ArmorSets.values()){
            EnumSet<EquipmentSlotType> slotTypes;

            switch (set){
                case HARPERS_HEADSET:
                //case WHITE_PUMPKIN:
                    slotTypes = EnumSet.of(EquipmentSlotType.HEAD);
                    break;
                default:
                    slotTypes = EnumSet.of(EquipmentSlotType.HEAD, EquipmentSlotType.CHEST, EquipmentSlotType.LEGS,
                            EquipmentSlotType.FEET);
            }
            registerArmor(set, slotTypes);
        }
    }
}
