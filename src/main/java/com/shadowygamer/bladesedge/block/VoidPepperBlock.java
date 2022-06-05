package com.shadowygamer.bladesedge.block;

import com.shadowygamer.bladesedge.items.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.BeetrootBlock;

public class VoidPepperBlock extends BeetrootBlock {
    public VoidPepperBlock(Properties p_49661_) {
        super(p_49661_);
    }
    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.VOID_PEPPER_SEEDS.get();
    }
}
