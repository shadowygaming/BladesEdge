package com.shadowygamer.bladesedge.enchantment;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
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

            if (pLevel == 1) {
                if (pAttacker instanceof LivingEntity) {
                    ((LivingEntity) pAttacker).addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 320, 0));
                }
            }
            if (pLevel == 2) {
                if (pAttacker instanceof LivingEntity) {
                    ((LivingEntity) pAttacker).addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 400, 0));
                }
                if (pAttacker instanceof LivingEntity) {
                    ((LivingEntity) pAttacker).addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 400, 0));
                }
            }
            if (pLevel == 3) {
                if (pAttacker instanceof LivingEntity) {
                    ((LivingEntity) pAttacker).addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 400, 0));
                }
                if (pAttacker instanceof LivingEntity) {
                    ((LivingEntity) pAttacker).addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 400, 1));
                }
            }
            if (pLevel == 4) {
                if (pAttacker instanceof LivingEntity) {
                    ((LivingEntity) pAttacker).addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 480, 1));
                }
                if (pAttacker instanceof LivingEntity) {
                    ((LivingEntity) pAttacker).addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 480, 1));
                }
            }
            if (pLevel == 5) {
                if (pAttacker instanceof LivingEntity) {
                    ((LivingEntity) pAttacker).addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 500, 1));
                }
                if (pAttacker instanceof LivingEntity) {
                    ((LivingEntity) pAttacker).addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 500, 1));
                }
                if (pAttacker instanceof LivingEntity) {
                    ((LivingEntity) pAttacker).addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 0));
                }
            }
        }
    }
    @Override
    public int getMaxLevel() {
        return 5;
    }
}
