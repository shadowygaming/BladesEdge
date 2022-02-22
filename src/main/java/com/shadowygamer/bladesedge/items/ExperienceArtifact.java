package com.shadowygamer.bladesedge.items;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ExperienceArtifact extends ArtifactItem {
    public ExperienceArtifact(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        pPlayer.giveExperiencePoints(100);
        hurtItem(pPlayer.getItemInHand(pUsedHand));

        return InteractionResultHolder.success(pPlayer.getItemInHand(pUsedHand));
    }
}