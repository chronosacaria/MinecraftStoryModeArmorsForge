package chronosacaria.mcsaforge.configs;

import net.minecraft.inventory.EquipmentSlotType;

import java.util.EnumMap;

public class ArmorStats {
    public EnumMap<EquipmentSlotType, Integer> protection = new EnumMap<>(EquipmentSlotType.class);
    public float toughness;
    public float knockbackRes;

    public ArmorStats setProtection(int head, int chest, int legs, int feet){
        this.protection.put(EquipmentSlotType.HEAD, head);
        this.protection.put(EquipmentSlotType.CHEST, chest);
        this.protection.put(EquipmentSlotType.LEGS, legs);
        this.protection.put(EquipmentSlotType.FEET, feet);
        return this;
    }

    public ArmorStats setToughness(float toughness){
        this.toughness = toughness;
        return this;
    }

    public ArmorStats setKnockbackRes(float knockbackRes){
        this.knockbackRes = knockbackRes;
        return this;
    }
}
