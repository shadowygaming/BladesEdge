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

public class LastStandEnchantment extends Enchantment {
    protected LastStandEnchantment(Rarity p_44676_, EnchantmentCategory p_44677_, EquipmentSlot... p_44678_) {
        super(p_44676_, p_44677_, p_44678_);
    }

    @Override
    public void doPostHurt(LivingEntity pAttacker, Entity pTarget, int pLevel) {
        if (!pAttacker.level.isClientSide()) {
            ServerLevel world = (ServerLevel) pAttacker.level;
            ServerPlayer player = ((ServerPlayer) pAttacker);
            BlockPos position = pTarget.blockPosition();

            boolean effect = (pAttacker.hasEffect(MobEffects.WITHER));
            float hp = (pAttacker.getHealth());

            if (pLevel == 1) {
                if (hp <= 3) {
                    if (effect == false) {
                        pAttacker.setHealth(5);
                        ((LivingEntity) pAttacker).addEffect(new MobEffectInstance(MobEffects.WITHER, 6000, 2));
                        ((LivingEntity) pAttacker).addEffect(new MobEffectInstance(MobEffects.SATURATION, 120, 1));
                        ((LivingEntity) pAttacker).addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 6000, 0));
                        ((LivingEntity) pAttacker).addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 400, 1));
                        ((LivingEntity) pAttacker).addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 400, 0));
                    }
                }
            }
            if (pLevel == 2) {
                if (hp <= 3) {
                    if (effect == false) {
                        pAttacker.setHealth(8);
                        ((LivingEntity) pAttacker).addEffect(new MobEffectInstance(MobEffects.WITHER, 6000, 1));
                        ((LivingEntity) pAttacker).addEffect(new MobEffectInstance(MobEffects.SATURATION, 120, 4));
                        ((LivingEntity) pAttacker).addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 400, 0));
                        ((LivingEntity) pAttacker).addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 400, 2));
                        ((LivingEntity) pAttacker).addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 400, 0));
                    }
                }
            }
        }
    }
            @Override
            public int getMaxLevel () {
                return 2;
            }
        }
