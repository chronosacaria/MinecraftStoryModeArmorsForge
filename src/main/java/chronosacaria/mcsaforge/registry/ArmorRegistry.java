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
}
