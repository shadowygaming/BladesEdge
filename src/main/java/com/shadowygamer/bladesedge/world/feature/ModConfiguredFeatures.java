package com.shadowygamer.bladesedge.world.feature;

import com.shadowygamer.bladesedge.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.*;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.*;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;

import java.util.List;


public class ModConfiguredFeatures {
        public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> LIGHT_OAK_TREE =
                FeatureUtils.register("light_oak", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                        BlockStateProvider.simple(ModBlocks.LIGHT_OAK_LOG.get()),
                        new StraightTrunkPlacer(4, 5, 3) {
                        },
                        BlockStateProvider.simple(ModBlocks.LIGHT_OAK_LEAVES.get()),
                        new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3) {
                        },
                        new TwoLayersFeatureSize(1, 0, 2)).build());

        public static final Holder<PlacedFeature> LIGHT_OAK_CHECKED =
                PlacementUtils.register("light_oak_checked", LIGHT_OAK_TREE,
                        PlacementUtils.filteredByBlockSurvival(ModBlocks.LIGHT_OAK_SAPLING.get()));

        public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> LIGHT_OAK_SPAWN =
                FeatureUtils.register("light_oak_spawn", Feature.RANDOM_SELECTOR,
                        new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(LIGHT_OAK_CHECKED,
                                0.01F)), LIGHT_OAK_CHECKED));

    public static final List<OreConfiguration.TargetBlockState> END_VOIDIUM_ORES = List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.VOIDIUM_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> VOIDIUM_ORE = FeatureUtils.register("voidium_ore",
            Feature.ORE, new OreConfiguration(END_VOIDIUM_ORES, 4));

    public static final List<OreConfiguration.TargetBlockState> CRONIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CRONIUM_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> CRONIUM_ORE = FeatureUtils.register("cronium_ore",
            Feature.ORE, new OreConfiguration(CRONIUM_ORES, 8));

    public static final List<OreConfiguration.TargetBlockState> FLARIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.FLARIUM_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> FLARIUM_ORE = FeatureUtils.register("flarium_ore",
            Feature.ORE, new OreConfiguration(FLARIUM_ORES, 8));



}
