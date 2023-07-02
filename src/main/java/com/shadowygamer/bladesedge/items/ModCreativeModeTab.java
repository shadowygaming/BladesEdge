package com.shadowygamer.bladesedge.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab BLADESEDGE = new CreativeModeTab("bladesedge") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MAGMA_CHESTPLATE.get());
        }
    };
}