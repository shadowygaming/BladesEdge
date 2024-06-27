package com.shadowygamer.bladesedge.items.Artifacts;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
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

public class ShadowArtifact extends ArtifactItem{
    public ShadowArtifact(Properties pProperties) {
        super(pProperties);
    }
    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(new TranslatableComponent("tooltip.bladesedge.shadow_altar.tooltip"));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        if (pPlayer.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 800, 3, true, false))) {
            if (pPlayer.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2000, 1, true, false))) {
                if (pPlayer.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 1000, 0, true, false))) {
                    hurtItem(pPlayer.getItemInHand(pUsedHand));
                }
            }
        }
        return InteractionResultHolder.success(pPlayer.getItemInHand(pUsedHand));
    }
}
