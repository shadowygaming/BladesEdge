package com.shadowygamer.bladesedge.items.Gear;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class MagmaItem extends Item {
    public MagmaItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        pTarget.setSecondsOnFire(6);
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }
}
