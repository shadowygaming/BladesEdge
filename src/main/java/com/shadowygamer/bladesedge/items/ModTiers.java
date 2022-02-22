package com.shadowygamer.bladesedge.items;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier REDSTONE = new ForgeTier(3, 750, 6.5f,
            2f, 50, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.REDSTONE.getDefaultInstance()));

    public static final ForgeTier LAPIS = new ForgeTier(3, 900, 8f,
            2f, 100, BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(Items.LAPIS_LAZULI.getDefaultInstance()));

}
