package chronosacaria.mcsaforge.items.armor;

import chronosacaria.mcsaforge.McsaForge;
import chronosacaria.mcsaforge.configs.ArmorStats;
import chronosacaria.mcsaforge.configs.McsaForgeConfig;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;

import java.util.UUID;

public class ArmorSetItem extends ArmorItem {
    private static final UUID[] ARMOR_MODIFIERS = new UUID[]{
            UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"),
            UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"),
            UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"),
            UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")};


    private final int damageReduceAmount;
    private final float toughness;
    protected final Multimap<Attribute, AttributeModifier> attributeModifiers;
    protected final ArmorSets set;
    public ArmorSetItem(ArmorSets set, EquipmentSlotType equipmentSlotType) {
        super(set, equipmentSlotType, new Item.Properties().group(ItemGroup.COMBAT));
        this.set = set;

        this.damageReduceAmount = set.getDamageReductionAmount(equipmentSlotType);
        this.toughness = set.getToughness();

        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        UUID uuid = ARMOR_MODIFIERS[slot.getIndex()];
        builder.put(Attributes.ARMOR, new AttributeModifier(uuid, "Armor modifier", (double)this.damageReduceAmount, AttributeModifier.Operation.ADDITION));
        builder.put(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(uuid, "Armor toughness", (double)this.toughness, AttributeModifier.Operation.ADDITION));
        if (this.knockbackResistance > 0) {
            builder.put(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(uuid, "Armor knockback resistance", (double)this.knockbackResistance, AttributeModifier.Operation.ADDITION));
        }
        ArmorStats armorStats = McsaForgeConfig.config.armorStats.get(set);
        this.attributeModifiers = builder.build();
    }


    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlotType slotType){
        return slotType == this.slot ? this.attributeModifiers : super.getAttributeModifiers(slotType);
    }

    @Override
    public Rarity getRarity(ItemStack itemStack){
        return set.getRarity();
    }
}
