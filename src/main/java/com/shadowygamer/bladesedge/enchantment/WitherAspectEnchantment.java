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

            if (pLevel == 1) {
                if (pAttacker instanceof LivingEntity) {
                    ((LivingEntity) pTarget).addEffect(new MobEffectInstance(MobEffects.WITHER, 100, 0));
                }
            }
            if (pLevel == 2) {
                if (pAttacker instanceof LivingEntity) {
                    ((LivingEntity) pTarget).addEffect(new MobEffectInstance(MobEffects.WITHER, 100, 1));
                }
            }
            if (pLevel == 3) {
                if (pAttacker instanceof LivingEntity) {
                    ((LivingEntity) pTarget).addEffect(new MobEffectInstance(MobEffects.WITHER, 200, 1));
                }
            }
        }
    }
    @Override
    public int getMaxLevel() {
        return 3;
    }
}
