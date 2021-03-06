package com.shadowygamer.bladesedge.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> LIGHT_OAK_PLACED = PlacementUtils.register("light_oak_placed",
            ModConfiguredFeatures.LIGHT_OAK_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(1, 0.25f, 1)));

    public static final Holder<PlacedFeature> VOIDIUM_ORE_PLACED = PlacementUtils.register("voidium_ore_placed",
            ModConfiguredFeatures.VOIDIUM_ORE, ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
}
