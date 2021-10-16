package chronosacaria.mcsaforge.groups;

import chronosacaria.mcsaforge.collections.ArmorCollection;
import chronosacaria.mcsaforge.registry.ArmorRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class McsaForgeGroup extends ItemGroup {
    ArmorCollection armorRegistry = null;


    public McsaForgeGroup(){
        super("armor");
    }

    @Override
    public ItemStack createIcon(){
        return new ItemStack(ArmorRegistry.ADAMANTIUM_ARMOR.getChestplate());
    }
}
