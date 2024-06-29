package com.shadowygamer.bladesedge.enchantment;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class WitherAspectEnchantment extends Enchantment {
    protected WitherAspectEnchantment(Rarity p_44676_, EnchantmentCategory p_44677_, EquipmentSlot... p_44678_) {
        super(p_44676_, p_44677_, p_44678_);
    }
    @Override
    public void doPostAttack(LivingEntity pAttacker, Entity pTarget, int pLevel) {
        if (!pAttacker.level.isClientSide()) {
            ((LivingEntity) pTarget).addEffect(new MobEffectInstance(MobEffects.WITHER, pLevel*80, pLevel-1));
        }
    }
    @Override
    public int getMaxLevel() {
        return 3;
    }
}
