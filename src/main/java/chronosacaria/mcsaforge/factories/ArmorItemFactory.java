package chronosacaria.mcsaforge.factories;

import chronosacaria.mcsaforge.items.armor.ArmorSetItem;
import chronosacaria.mcsaforge.items.armor.ArmorSets;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

@FunctionalInterface
public interface ArmorItemFactory <T extends ArmorSetItem> {
    ArmorItemFactory<ArmorSetItem> DEFAULT = ArmorSetItem::new;

    T create(ArmorSets set, EquipmentSlotType equipmentSlotType);
}
