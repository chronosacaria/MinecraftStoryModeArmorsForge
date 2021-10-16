package chronosacaria.mcsaforge;

import chronosacaria.mcsaforge.groups.McsaForgeGroup;
import chronosacaria.mcsaforge.registry.ArmorRegistry;
import chronosacaria.mcsaforge.registry.ModLoot;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(McsaForge.MODID)
public class McsaForge {

    // Directly reference a log4j logger.
    public static final String MODID = "mcsaforge";
    private static final Logger LOGGER = LogManager.getLogger();
    public static final ItemGroup MCSA_FORGE_GROUP = new McsaForgeGroup();

    public McsaForge() {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        //ArmorCollection.init();
        ModLoot.REGISTER.register(eventBus);
        ArmorRegistry.ARMOR.register(eventBus);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
}