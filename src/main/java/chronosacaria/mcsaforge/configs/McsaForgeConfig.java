package chronosacaria.mcsaforge.configs;

import chronosacaria.mcsaforge.McsaForge;
import chronosacaria.mcsaforge.items.armor.ArmorSets;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.minecraft.inventory.EquipmentSlotType;

import java.util.EnumMap;
import java.util.EnumSet;

import static chronosacaria.mcsaforge.items.armor.ArmorSets.*;

@Config(name = McsaForge.MODID)
public class McsaForgeConfig implements ConfigData {
    public static final McsaForgeConfig config;

    static {
        AutoConfig.register(McsaForgeConfig.class, JanksonConfigSerializer::new);
        config = AutoConfig.getConfigHolder(McsaForgeConfig.class).getConfig();
    }

    // config contents:
    public EnumMap<ArmorSets, ArmorStats> armorStats = new EnumMap<>(ArmorSets.class);

    // convenience methods:
    protected ArmorStats setProtection(int head, int chest, int legs, int feet, ArmorSets set){
        return armorStats.get(set).setProtection(head, chest, legs, feet);
    }

    // set config defaults
    public McsaForgeConfig() {
        for (ArmorSets armorSet : values()){
            armorStats.put(armorSet, new ArmorStats());
        }

        for (ArmorSets armorSet : values()){
            ArmorStats stats = new ArmorStats();
            stats.protection = new EnumMap<>(EquipmentSlotType.class);
            for (EquipmentSlotType slot : EnumSet.of(EquipmentSlotType.HEAD, EquipmentSlotType.CHEST,
                    EquipmentSlotType.LEGS, EquipmentSlotType.FEET)){
                stats.protection.put(slot, 0);
            }

            this.armorStats.put(armorSet, stats);
        }

        setProtection(4, 9, 7, 4, ADAMANTIUM).setToughness(3.0F).setKnockbackRes(0.3F);
        setProtection(4, 9, 7, 4, CHAMPION_PETRA).setToughness(2.0F).setKnockbackRes(0.2F);
        setProtection(4, 9, 7, 4, DRAGONSBANE).setToughness(2.0F).setKnockbackRes(0.5F);
        setProtection(3, 8, 6, 3, ELLEGAARD).setToughness(2.0F);
        setProtection(4, 9, 7, 4, ENDER_DEFENDER).setToughness(2.0F);
        setProtection(3, 8, 6, 3, ENDERMAN_SOREN);
        setProtection(3, 8, 6, 3, GABRIEL).setToughness(2.0F);
        setProtection(4, 9, 7, 4, GOLDEN_GOLIATH).setToughness(2.0F);
        setProtection(4, 9, 7, 4, GOLDEN_GOLIATH_CIRCUITRY).setToughness(2.0F);
        setProtection(4, 9, 7, 4, HARPERS_HEADSET).setToughness(2.0F);
        setProtection(3, 8, 6, 3, IVOR).setToughness(2.0F);
        setProtection(3, 8, 6, 3, LUKAS).setToughness(2.0F);
        setProtection(3, 8, 6, 3, MAGNUS).setToughness(2.0F);
        setProtection(3, 8, 6, 3, NINJA_IVOR_ARMOUR).setToughness(1.0F);
        setProtection(3, 8, 6, 3, OLIVIA).setToughness(2.0F);
        setProtection(3, 8, 6, 3, PETRA).setToughness(2.0F);
        setProtection(3, 8, 6, 3, PRISMARINE).setToughness(2.0F);
        setProtection(4, 9, 7, 4, REDSTONE_RIOT).setToughness(3.0F).setKnockbackRes(0.2F);
        setProtection(4, 9, 7, 4, SHIELD_OF_INFINITY).setToughness(3.0F).setKnockbackRes(0.2F);
        setProtection(3, 8, 6, 3, SOREN).setToughness(2.0F);
        setProtection(4, 9, 7, 4, STAR_SHIELD).setToughness(3.0F).setKnockbackRes(0.2F);
        setProtection(4, 9, 7, 4, SWORDBREAKER).setToughness(2.0F).setKnockbackRes(0.5F);
        setProtection(3, 8, 6, 3, TIMS_ARMOUR).setToughness(2.0F);
        //setProtection(1, 1, 1, 1, WHITE_PUMPKIN);
    }
}
