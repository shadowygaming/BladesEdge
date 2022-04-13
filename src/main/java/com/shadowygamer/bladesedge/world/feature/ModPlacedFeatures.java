package com.shadowygamer.bladesedge.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> LIGHT_OAK_PLACED = PlacementUtils.register("light_oak_placed",
            ModConfiguredFeatures.LIGHT_OAK_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2)));
}
