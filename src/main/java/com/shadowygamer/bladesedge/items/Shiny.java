package com.shadowygamer.bladesedge.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class Shiny extends Item {
    public Shiny(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean isFoil(ItemStack pStack) {
        return true;
    }
}
