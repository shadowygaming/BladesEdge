package com.shadowygamer.bladesedge.items.Artifacts;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CharcoalArtifact extends ArtifactItem{
    public CharcoalArtifact(Properties pProperties) {
        super(pProperties);
    }
    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if(Screen.hasShiftDown()) {
            pTooltipComponents.add(new TranslatableComponent("tooltip.bladesedge.char_artifact.tooltip.shift"));
        }
        else{
            pTooltipComponents.add(new TranslatableComponent("tooltip.bladesedge.artifact.tooltip"));
        }
    }
    @Override
    public int getBurnTime(ItemStack itemStack, RecipeType<?> recipeType) {
        // TODO Auto-generated method stub
        return 400;
    }
}
