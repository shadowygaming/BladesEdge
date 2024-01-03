package com.shadowygamer.bladesedge.enchantment;

import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import java.util.Random;

public class BlazingEnchantment extends Enchantment {
    protected BlazingEnchantment(Rarity p_44676_, EnchantmentCategory p_44677_, EquipmentSlot... p_44678_) {
        super(p_44676_, p_44677_, p_44678_);
    }

    @Override
    public void doPostHurt(LivingEntity pAttacker, Entity pTarget, int pLevel) {
        Random rand = new Random();
        if(!pAttacker.level.isClientSide()) {
            if(pLevel == 1) {
                pTarget.setSecondsOnFire(pTarget instanceof Player ? rand.nextInt(2) + 1 /*Reduced duration on players*/ : rand.nextInt(4) + 3);
            }
            if(pLevel == 2) {
                pTarget.setSecondsOnFire(pTarget instanceof Player ? rand.nextInt(6) + 5 /*Reduced duration on players*/ : rand.nextInt(7) + 8);
            }
        }
    }



    @Override
    public int getMaxLevel() {
        return 2;
    }

}
