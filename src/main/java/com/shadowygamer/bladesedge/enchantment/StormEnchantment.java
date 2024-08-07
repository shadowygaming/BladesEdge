package com.shadowygamer.bladesedge.enchantment;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class StormEnchantment extends Enchantment {
    protected StormEnchantment(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot... pApplicableSlots) {
        super(pRarity, pCategory, pApplicableSlots);
    }

    @Override
    public void doPostAttack(LivingEntity pAttacker, Entity pTarget, int pLevel) {
        if(!pAttacker.level.isClientSide()) {
            if (pAttacker instanceof Player) {
                ServerLevel world = (ServerLevel) pAttacker.level;
                ServerPlayer player = ((ServerPlayer) pAttacker);
                BlockPos position = pTarget.blockPosition();

                for (int i = 0; i < pLevel; i++) {
                    EntityType.LIGHTNING_BOLT.spawn(world, null, player, position,
                            MobSpawnType.TRIGGERED, true, true);
                    EntityType.LIGHTNING_BOLT.spawn(world, null, player, position,
                            MobSpawnType.TRIGGERED, true, true);
                }
            }
        }
        super.doPostAttack(pAttacker, pTarget, pLevel);
    }
    @Override
    public int getMaxLevel() {
        return 3;
    }
}