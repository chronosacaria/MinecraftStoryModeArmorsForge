package chronosacaria.mcsaforge.registry;

import chronosacaria.mcsaforge.McsaForge;
import chronosacaria.mcsaforge.loot.McsaForgeLootTables;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModLoot {
    public static final DeferredRegister<GlobalLootModifierSerializer<?>> REGISTER =
            DeferredRegister.create(ForgeRegistries.LOOT_MODIFIER_SERIALIZERS, McsaForge.MODID);

    public static final RegistryObject<GlobalLootModifierSerializer<McsaForgeLootTables>> MCSA_FORGE_LOOT_TABLES =
            ModLoot.REGISTER.register("mcsa_forge_loot_tables", McsaForgeLootTables.Serializer::new);
}
