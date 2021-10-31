package chronosacaria.mcsaforge.registry;

import chronosacaria.mcsaforge.McsaForge;
import chronosacaria.mcsaforge.items.blockitems.CarvedWhitePumpkinBlockItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemsRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, McsaForge.MODID);

    public static final RegistryObject<BlockItem> CARVED_WHITE_PUMPKIN = ITEMS.register("carved_white_pumpkin",
            () -> new CarvedWhitePumpkinBlockItem(BlockRegistry.CARVED_WHITE_PUMPKIN.get(),
                    new Item.Properties().group(McsaForge.MCSA_FORGE_GROUP)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
