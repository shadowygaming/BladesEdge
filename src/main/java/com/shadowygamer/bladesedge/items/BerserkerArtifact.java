package com.shadowygamer.bladesedge.items;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class BerserkerArtifact extends ArtifactItem {
    public BerserkerArtifact(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        if (pPlayer.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 1))) {
            if (pPlayer.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1))) {
                if (pPlayer.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 600, 0))) {
                    hurtItem(pPlayer.getItemInHand(pUsedHand));
                }
            }
        }
            return InteractionResultHolder.success(pPlayer.getItemInHand(pUsedHand));
    }
}
