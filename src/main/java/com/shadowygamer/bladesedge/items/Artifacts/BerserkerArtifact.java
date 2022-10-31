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

public class BerserkerArtifact extends ArtifactItem {
    public BerserkerArtifact(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if(Screen.hasShiftDown()) {
            pTooltipComponents.add(new TranslatableComponent("tooltip.bladesedge.berserker_artifact.tooltip.shift"));
        }
        else{
            pTooltipComponents.add(new TranslatableComponent("tooltip.bladesedge.artifact.tooltip"));
        }
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
