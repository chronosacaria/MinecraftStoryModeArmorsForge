package chronosacaria.mcsaforge.registry;

import chronosacaria.mcsaforge.McsaForge;
import chronosacaria.mcsaforge.collections.ArmorCollection;
import chronosacaria.mcsaforge.items.armor.ArmorSetItem;
import chronosacaria.mcsaforge.items.armor.ArmorSets;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ArmorRegistry {
    public static final DeferredRegister<Item> ARMOR = DeferredRegister.create(ForgeRegistries.ITEMS, McsaForge.MODID);

    public static final ArmorCollection<ArmorSetItem> ADAMANTIUM_ARMOR =
            ArmorCollection.registerArmorCollection(ArmorSets.ADAMANTIUM, ArmorSetItem::new);
}
