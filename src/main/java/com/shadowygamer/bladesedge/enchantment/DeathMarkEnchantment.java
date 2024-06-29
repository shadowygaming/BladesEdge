package com.shadowygamer.bladesedge.enchantment;

import com.shadowygamer.bladesedge.effects.ModEffects;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class DeathMarkEnchantment extends Enchantment {

    protected DeathMarkEnchantment(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot... pApplicableSlots) {
        super(pRarity, pCategory, pApplicableSlots);
    }

    @Override
    public void doPostAttack(LivingEntity pAttacker, Entity pTarget, int pLevel) {
        if (!pAttacker.level.isClientSide()) {
            if(((LivingEntity) pTarget).hasEffect(ModEffects.DEATH_MARK.get())) {
                pTarget.hurt(DamageSource.GENERIC, 30-((LivingEntity) pTarget).getEffect(ModEffects.DEATH_MARK.get()).getDuration()/40);
                //apply damage based on duration of effect remaining
            } else {
                ((LivingEntity) pTarget).addEffect(new MobEffectInstance(ModEffects.DEATH_MARK.get(), 1200, 0, false, false));
            }
        }
    }
    @Override
    public int getMaxLevel() {
        return 1;
    }
}
