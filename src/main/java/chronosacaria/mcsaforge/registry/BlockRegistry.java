package chronosacaria.mcsaforge.registry;

import chronosacaria.mcsaforge.McsaForge;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            McsaForge.MODID);

    public static final RegistryObject<Block> CARVED_WHITE_PUMPKIN = registryObject("carved_white_pumpkin",
            () -> new Block(AbstractBlock.Properties.create(Material.ORGANIC).harvestLevel(0).setRequiresTool()));

    public static final RegistryObject<Block> WHITE_PUMPKIN = registryObject("white_pumpkin",
            () -> new Block(AbstractBlock.Properties.create(Material.ORGANIC).harvestLevel(0).setRequiresTool()));

    private static <T extends Block>RegistryObject<T> registryObject(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return  toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        ItemsRegistry.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(McsaForge.MCSA_FORGE_GROUP)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
