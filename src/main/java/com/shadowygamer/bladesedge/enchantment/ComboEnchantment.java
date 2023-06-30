package com.shadowygamer.bladesedge.enchantment;

import com.shadowygamer.bladesedge.effects.ModEffects;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class ComboEnchantment extends Enchantment {
    protected ComboEnchantment(Rarity p_44676_, EnchantmentCategory p_44677_, EquipmentSlot... p_44678_) {
        super(p_44676_, p_44677_, p_44678_);
    }
    @Override
    public boolean isTreasureOnly() {
        return true;
    }

    public boolean isCurse() {
        return false;
    }

    public boolean isTradeable() {
        return true;
    }

    public boolean isDiscoverable() {
        return false;
    }
    @Override
    public void doPostAttack(LivingEntity pAttacker, Entity pTarget, int pLevel) {
        if (!pAttacker.level.isClientSide()) {
            ServerLevel world = (ServerLevel) pAttacker.level;
            ServerPlayer player = ((ServerPlayer) pAttacker);
            BlockPos position = pTarget.blockPosition();

            int amplifier = 0;

            if (pLevel == 1) {
                if (pAttacker.hasEffect(ModEffects.COMBO.get())) {
                    amplifier = pAttacker.getEffect(ModEffects.COMBO.get()).getAmplifier();
                    amplifier += 1;
                    pAttacker.removeEffect(ModEffects.COMBO.get());
                }
                pAttacker.addEffect(new MobEffectInstance(ModEffects.COMBO.get(), amplifier*40+20, amplifier), pAttacker);
                if (amplifier >= 3 && amplifier <= 32) {
                    pAttacker.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, amplifier * 25 + 30, amplifier-2));
                } else if (amplifier > 32) {
                    amplifier --;
                }
            }
            if (pLevel == 2) {
                if (pAttacker.hasEffect(ModEffects.COMBO.get())) {
                    amplifier = pAttacker.getEffect(ModEffects.COMBO.get()).getAmplifier();
                    amplifier += 1;
                    pAttacker.removeEffect(ModEffects.COMBO.get());
                }
                if (amplifier >= 3 && amplifier <= 32) {
                    pAttacker.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, amplifier * 60, amplifier+0));
                } else if (amplifier > 32) {
                    amplifier --;
                }
            }
            if (pLevel == 3) {
                if (pAttacker.hasEffect(ModEffects.COMBO.get())) {
                    amplifier =  pAttacker.getEffect(ModEffects.COMBO.get()).getAmplifier();
                    amplifier += 1;
                    pAttacker.removeEffect(ModEffects.COMBO.get());
                }
                if (amplifier >= 3 && amplifier <= 32) {
                    pAttacker.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, amplifier * 60, amplifier+0));
                } else if (amplifier > 32) {
                    amplifier --;
                }
            }
        }
    }
    @Override
    public int getMaxLevel() {
        return 3;
    }
}
