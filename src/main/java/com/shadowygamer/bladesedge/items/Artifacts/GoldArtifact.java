package com.shadowygamer.bladesedge.items.Artifacts;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GoldArtifact extends ArtifactItem{
    public GoldArtifact(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if(Screen.hasShiftDown()) {
            pTooltipComponents.add(new TranslatableComponent("tooltip.bladesedge.gold_altar.tooltip.shift"));
        }
        else{
            pTooltipComponents.add(new TranslatableComponent("tooltip.bladesedge.artifact.tooltip"));
        }
    }


    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        if (pPlayer.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0))) {
            if (pPlayer.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 1))) {
                if (pPlayer.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 0))) {
                    hurtItem(pPlayer.getItemInHand(pUsedHand));
                    pLevel.playSound(null, pPlayer.getX(), pPlayer.getY(), pPlayer.getZ(), SoundEvents.GENERIC_DRINK, SoundSource.PLAYERS, (float) 0.7, (float) 1);
                    pLevel.playSound(null, pPlayer.getX(), pPlayer.getY(), pPlayer.getZ(), SoundEvents.SPLASH_POTION_BREAK, SoundSource.PLAYERS, (float) 0.5, (float) 1);
                }
            }
        }
        return InteractionResultHolder.success(pPlayer.getItemInHand(pUsedHand));
    }
}
