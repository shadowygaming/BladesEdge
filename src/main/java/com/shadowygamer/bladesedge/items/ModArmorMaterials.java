package com.shadowygamer.bladesedge.items;

import com.shadowygamer.bladesedge.BladesEdge;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    MAGMA("magma", 32, new int[]{3, 6, 7, 3}, 24, SoundEvents.ARMOR_EQUIP_NETHERITE, 1.5F, 0.05F, () -> {
        return Ingredient.of(ModItems.MAGMA_SHARD.get());
    }),
    VOIDIUM("voidium", 42, new int[]{4, 7, 9, 4}, 14, SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, 0.0F, () -> {
        return Ingredient.of(ModItems.VOIDIUM.get());
    }),
    CRONIUM("cronium", 16, new int[]{2, 5, 7, 3}, 19, SoundEvents.ARMOR_EQUIP_GOLD, 0.75F, 0.0F, () -> {
        return Ingredient.of(ModItems.CRONIUM_BAR.get());
    });

    private static final int[] HEALTH_PER_SLOT = new int[]{15, 20, 18, 12};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    private ModArmorMaterials(String pName, int pDurabilityMultiplier, int[] pSlotProtections, int pEnchantmentValue, SoundEvent pSound, float pToughness, float pKnockbackResistance, Supplier<Ingredient> pRepairIngredient) {
        this.name = pName;
        this.durabilityMultiplier = pDurabilityMultiplier;
        this.slotProtections = pSlotProtections;
        this.enchantmentValue = pEnchantmentValue;
        this.sound = pSound;
        this.toughness = pToughness;
        this.knockbackResistance = pKnockbackResistance;
        this.repairIngredient = new LazyLoadedValue<>(pRepairIngredient);
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return BladesEdge.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
