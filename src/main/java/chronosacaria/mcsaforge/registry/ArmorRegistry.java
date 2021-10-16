package chronosacaria.mcsaforge.registry;

import chronosacaria.mcsaforge.McsaForge;
import chronosacaria.mcsaforge.collections.ArmorCollection;
import chronosacaria.mcsaforge.items.armor.ArmorSetItem;
import chronosacaria.mcsaforge.items.armor.ArmorSets;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.EnumSet;

public class ArmorRegistry {
    public static final DeferredRegister<Item> ARMOR = DeferredRegister.create(ForgeRegistries.ITEMS, McsaForge.MODID);

    public static final ArmorCollection<ArmorSetItem> ADAMANTIUM_ARMOR =
            ArmorCollection.registerArmorCollection(ArmorSets.ADAMANTIUM, EnumSet.allOf(EquipmentSlotType.class));
    public static final ArmorCollection<ArmorSetItem> CHAMPION_PETRA_ARMOR =
            ArmorCollection.registerArmorCollection(ArmorSets.CHAMPION_PETRA, EnumSet.allOf(EquipmentSlotType.class));
    public static final ArmorCollection<ArmorSetItem> DRAGONSBANE =
            ArmorCollection.registerArmorCollection(ArmorSets.DRAGONSBANE, EnumSet.allOf(EquipmentSlotType.class));
    public static final ArmorCollection<ArmorSetItem> ELLEGAARD_ARMOR =
            ArmorCollection.registerArmorCollection(ArmorSets.ELLEGAARD, EnumSet.allOf(EquipmentSlotType.class));
    public static final ArmorCollection<ArmorSetItem> ENDER_DEFENDER =
            ArmorCollection.registerArmorCollection(ArmorSets.ENDER_DEFENDER, EnumSet.allOf(EquipmentSlotType.class));
    public static final ArmorCollection<ArmorSetItem> ENDERMAN_SOREN_ARMOR =
            ArmorCollection.registerArmorCollection(ArmorSets.ENDERMAN_SOREN, EnumSet.allOf(EquipmentSlotType.class));
    public static final ArmorCollection<ArmorSetItem> GABRIEL_ARMOR =
            ArmorCollection.registerArmorCollection(ArmorSets.GABRIEL, EnumSet.allOf(EquipmentSlotType.class));
    public static final ArmorCollection<ArmorSetItem> GOLDEN_GOLIATH_ARMOR =
            ArmorCollection.registerArmorCollection(ArmorSets.GOLDEN_GOLIATH, EnumSet.allOf(EquipmentSlotType.class));
    public static final ArmorCollection<ArmorSetItem> GOLDEN_GOLIATH_CIRCUITRY_ARMOR =
            ArmorCollection.registerArmorCollection(ArmorSets.GOLDEN_GOLIATH_CIRCUITRY, EnumSet.allOf(EquipmentSlotType.class));
    public static final ArmorCollection<ArmorSetItem> HARPERS_HEADSET =
            ArmorCollection.registerArmorCollection(ArmorSets.HARPERS_HEADSET, EnumSet.of(EquipmentSlotType.HEAD));
    public static final ArmorCollection<ArmorSetItem> IVOR_ARMOR =
            ArmorCollection.registerArmorCollection(ArmorSets.IVOR, EnumSet.allOf(EquipmentSlotType.class));
    public static final ArmorCollection<ArmorSetItem> LUKAS_ARMOR =
            ArmorCollection.registerArmorCollection(ArmorSets.LUKAS, EnumSet.allOf(EquipmentSlotType.class));
    public static final ArmorCollection<ArmorSetItem> MAGNUS_ARMOR =
            ArmorCollection.registerArmorCollection(ArmorSets.MAGNUS, EnumSet.allOf(EquipmentSlotType.class));
    public static final ArmorCollection<ArmorSetItem> NINJA_IVOR_ARMOR =
            ArmorCollection.registerArmorCollection(ArmorSets.NINJA_IVOR_ARMOUR, EnumSet.allOf(EquipmentSlotType.class));
    public static final ArmorCollection<ArmorSetItem> OLIVIA_ARMOR =
            ArmorCollection.registerArmorCollection(ArmorSets.OLIVIA, EnumSet.allOf(EquipmentSlotType.class));
    public static final ArmorCollection<ArmorSetItem> PETRA_ARMOR =
            ArmorCollection.registerArmorCollection(ArmorSets.PETRA, EnumSet.allOf(EquipmentSlotType.class));
    public static final ArmorCollection<ArmorSetItem> PRISMARINE_SOLDIER_ARMOR =
            ArmorCollection.registerArmorCollection(ArmorSets.PRISMARINE, EnumSet.allOf(EquipmentSlotType.class));
    public static final ArmorCollection<ArmorSetItem> REDSTONE_RIOT =
            ArmorCollection.registerArmorCollection(ArmorSets.REDSTONE_RIOT, EnumSet.allOf(EquipmentSlotType.class));
    public static final ArmorCollection<ArmorSetItem> SHIELD_OF_INFINITY =
            ArmorCollection.registerArmorCollection(ArmorSets.SHIELD_OF_INFINITY, EnumSet.allOf(EquipmentSlotType.class));
    public static final ArmorCollection<ArmorSetItem> SOREN_ARMOR =
            ArmorCollection.registerArmorCollection(ArmorSets.SOREN, EnumSet.allOf(EquipmentSlotType.class));
    public static final ArmorCollection<ArmorSetItem> STAR_SHIELD =
            ArmorCollection.registerArmorCollection(ArmorSets.STAR_SHIELD, EnumSet.allOf(EquipmentSlotType.class));
    public static final ArmorCollection<ArmorSetItem> SWORDBREAKER =
            ArmorCollection.registerArmorCollection(ArmorSets.SWORDBREAKER, EnumSet.allOf(EquipmentSlotType.class));
    public static final ArmorCollection<ArmorSetItem> TIM_ARMOR =
            ArmorCollection.registerArmorCollection(ArmorSets.TIMS_ARMOUR, EnumSet.allOf(EquipmentSlotType.class));
}
