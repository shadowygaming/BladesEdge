package com.shadowygamer.bladesedge.items;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier REDSTONE = new ForgeTier(3, 768, 7f,
            2f, 16, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.HARDENED_REDSTONE.get()));

    public static final ForgeTier LAPIS = new ForgeTier(3, 512, 8.2f,
            2f, 72, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.BLUESTONE.get()));

    public static final ForgeTier VOIDIUM = new ForgeTier(4, 4096, 8.0f,
            3f, 18, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.VOIDIUM.get()));

    public static final ForgeTier MAGMA = new ForgeTier(4, 2048, 10f,
            4.5f, 24, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.MAGMA_SHARD.get()));
}
