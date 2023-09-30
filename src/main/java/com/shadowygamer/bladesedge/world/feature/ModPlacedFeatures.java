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
                    PlacementUtils.countExtra( 0, 0.02f, 2)));

    public static final Holder<PlacedFeature> VOIDIUM_ORE_PLACED = PlacementUtils.register("voidium_ore_placed",
            ModConfiguredFeatures.VOIDIUM_ORE, ModOrePlacement.commonOrePlacement(3, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(-0), VerticalAnchor.absolute(100))));
    //i love negative zero

    public static final Holder<PlacedFeature> CRONIUM_ORE_PLACED = PlacementUtils.register("cronium_ore_placed",
            ModConfiguredFeatures.CRONIUM_ORE, ModOrePlacement.commonOrePlacement(2, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(5), VerticalAnchor.absolute(32))));
    public static final Holder<PlacedFeature> FLARIUM_ORE_PLACED = PlacementUtils.register("flarium_ore_placed",
            ModConfiguredFeatures.FLARIUM_ORE, ModOrePlacement.commonOrePlacement(11, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(32), VerticalAnchor.absolute(72))));
}
