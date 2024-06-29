package com.shadowygamer.bladesedge.items;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier REDSTONE = new ForgeTier(2, 768, 7f,
            2.0f, 12, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.HARDENED_REDSTONE.get()));

    public static final ForgeTier LAPIS = new ForgeTier(3, 512, 7f,
            2.2f, 48, BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(ModItems.BLUESTONE.get()));

    public static final ForgeTier CRONIUM = new ForgeTier(3, 768, 8.5f,
            2.8f, 12, BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(ModItems.BLUESTONE.get()));

    public static final ForgeTier VOIDIUM = new ForgeTier(4, 4096, 11f,
            5.5f, 20, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.VOIDIUM.get()));

    //TODO: change magma tiered stuff to be flarium
    public static final ForgeTier MAGMA = new ForgeTier(4, 2048, 9.5f,
            4.5f, 18, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.MAGMA_SHARD.get()));
}
