package chronosacaria.mcsaforge.items.armor;

import chronosacaria.mcsaforge.configs.McsaForgeConfig;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.Rarity;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;

import java.util.function.Supplier;

import static net.minecraft.util.SoundEvents.*;

public enum ArmorSets implements IArmorMaterial {

    ADAMANTIUM("adamantium", "adamantium_impervium",
            40,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> {return Ingredient.fromItems(Items.DIAMOND);}),
    CHAMPION_PETRA("championpetra", "champion_petra",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> {return Ingredient.fromItems(Items.DIAMOND);}),

    DRAGONSBANE("dragonsbane", "dragonsbane",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> {return Ingredient.fromItems(Items.DIAMOND);}),

    ELLEGAARD("ellegaard", "ellegaard",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> {return Ingredient.fromItems(Items.DIAMOND);}),

    ENDER_DEFENDER("ender", "ender_defender",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> {return Ingredient.fromItems(Items.DIAMOND);}),

    ENDERMAN_SOREN("enderman", "enderman_soren",
            35,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> {return Ingredient.fromItems(Items.DIAMOND);}),

    GABRIEL("gabriel", "gabriel",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> {return Ingredient.fromItems(Items.DIAMOND);}),

    GOLDEN_GOLIATH("golden", "golden_goliath",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> {return Ingredient.fromItems(Items.DIAMOND);}),

    GOLDEN_GOLIATH_CIRCUITRY("goldenu", "golden_goliath_circuitry",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> {return Ingredient.fromItems(Items.DIAMOND);}),

    HARPERS_HEADSET("harper", "harpers_headset",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> {return Ingredient.fromItems(Items.DIAMOND);}),

    IVOR("ivor", "ivor",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> {return Ingredient.fromItems(Items.DIAMOND);}),

    LUKAS("lukas", "lukas",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> {return Ingredient.fromItems(Items.DIAMOND);}),

    MAGNUS("magnus", "magnus",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> {return Ingredient.fromItems(Items.DIAMOND);}),

    NINJA_IVOR_ARMOUR("ninja", "ninja_ivor",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> {return Ingredient.fromItems(Items.DIAMOND);}),

    OLIVIA("olivia", "olivia",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> {return Ingredient.fromItems(Items.DIAMOND);}),

    PETRA("petra", "petra",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> {return Ingredient.fromItems(Items.DIAMOND);}),

    PRISMARINE("prismarine", "prismarine_soldier",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> {return Ingredient.fromItems(Items.PRISMARINE_BRICKS);}),

    REDSTONE_RIOT("riot", "redstone_riot",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> {return Ingredient.fromItems(Items.DIAMOND);}),

    SHIELD_OF_INFINITY("infinity", "shield_of_infinity",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> {return Ingredient.fromItems(Items.DIAMOND);}),

    SOREN("soren", "soren",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> {return Ingredient.fromItems(Items.DIAMOND);}),

    STAR_SHIELD("star", "star_shield",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> {return Ingredient.fromItems(Items.DIAMOND);}),

    SWORDBREAKER("swordbreaker", "swordbreaker",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> {return Ingredient.fromItems(Items.DIAMOND);}),

    TIMS_ARMOUR("tim", "tim",
            25,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> {return Ingredient.fromItems(Items.DIAMOND);});
    //WHITE_PUMPKIN("whitepumpkin", "white_pumpkin",
    //        25,
    //        25,
    //        ITEM_ARMOR_EQUIP_DIAMOND,
    //        () -> {return Ingredient.fromItems(Items.PUMPKIN);});

    private static final int[] baseDurability = new int[]{13,15,16,11};
    private final String textureName;
    private final String setName;
    private final int durabilityMultiplier;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final LazyValue<Ingredient> repairIngredient;

    ArmorSets(String textureName, String setName, int durabilityMultiplier, int enchantability, SoundEvent soundEvent
            , Supplier<Ingredient> repairIngredient){
        this.textureName = textureName;
        this.setName = setName;
        this.durabilityMultiplier = durabilityMultiplier;
        this.enchantability = enchantability;
        this.equipSound = soundEvent;
        this.repairIngredient = new LazyValue<>(repairIngredient);
    }

    public String getSetName(){
        return setName;
    }

    public Rarity getRarity(){
        switch (this){
            case ADAMANTIUM:
            case CHAMPION_PETRA:
            case DRAGONSBANE:
            case ELLEGAARD:
            case ENDER_DEFENDER:
            case ENDERMAN_SOREN:
            case GABRIEL:
            case GOLDEN_GOLIATH:
            case GOLDEN_GOLIATH_CIRCUITRY:
            case HARPERS_HEADSET:
            case IVOR:
            case LUKAS:
            case MAGNUS:
            case NINJA_IVOR_ARMOUR:
            case OLIVIA:
            case PETRA:
            case PRISMARINE:
            case REDSTONE_RIOT:
            case SHIELD_OF_INFINITY:
            case SOREN:
            case STAR_SHIELD:
            case SWORDBREAKER:
            case TIMS_ARMOUR:
                return Rarity.RARE;
            default:
                return Rarity.UNCOMMON;
        }
    }


    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return baseDurability[slotIn.getIndex()] * this.durabilityMultiplier;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return McsaForgeConfig.config.armorStats.get(this).protection.get(slotIn);
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairIngredient.getValue();
    }

    @Override
    public String getName() {
        return this.textureName;
    }

    @Override
    public float getToughness() {
        return McsaForgeConfig.config.armorStats.get(this).toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return McsaForgeConfig.config.armorStats.get(this).knockbackRes;
    }
}
