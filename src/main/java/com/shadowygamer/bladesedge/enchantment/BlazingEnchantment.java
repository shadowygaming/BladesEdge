package com.shadowygamer.bladesedge.enchantment;

import net.minecraft.world.entity.*;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class BlazingEnchantment extends Enchantment {
    protected BlazingEnchantment(Rarity p_44676_, EnchantmentCategory p_44677_, EquipmentSlot... p_44678_) {
        super(p_44676_, p_44677_, p_44678_);
    }

    @Override
    public void doPostHurt(LivingEntity pAttacker, Entity pTarget, int pLevel) {
        if(!pAttacker.level.isClientSide()) {
            if(pLevel == 1) {
                pTarget.setSecondsOnFire(3);
            }
            if(pLevel == 2) {
                pTarget.setSecondsOnFire(10);
            }
        }
    }



    @Override
    public int getMaxLevel() {
        return 2;
    }

}
