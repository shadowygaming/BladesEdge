package com.shadowygamer.bladesedge.items.Artifacts;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import javax.annotation.Nonnull;
import java.util.Random;

public class ArtifactItem extends Item {

    //Code made by KirumaCoder/CodescripterSD https://github.com/CodeScripterSD
    public ArtifactItem(Properties pProperties) {
        super(pProperties);
    }

    Random random = new Random();

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    public boolean doesContainerItemLeaveCraftingGrid(ItemStack stack) {
        return false;
    }

    @Override
    public boolean isRepairable(ItemStack stack) {
        return true;
    }

    @Override
    public boolean isEnchantable(ItemStack pStack) {
        return false;
    }

    @Nonnull
    @Override
    public ItemStack getContainerItem(@Nonnull ItemStack itemstack) {
        ItemStack stack = itemstack.copy();
        hurtItem(stack);
        return stack;
    }

    protected void hurtItem(ItemStack stack) {
        if (stack.getMaxDamage() - stack.getDamageValue() <= 1) {
            stack.shrink(1);
        } else {
            stack.hurt(1, random, null);
        }
    }
}