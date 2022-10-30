package com.shadowygamer.bladesedge.util;

import com.shadowygamer.bladesedge.BladesEdge;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
        public static class Blocks {

            private static TagKey<Block> tag(String name) {
                return BlockTags.create(new ResourceLocation(BladesEdge.MOD_ID, name));
            }

            private static TagKey<Block> ForgetTag(String name) {
                return BlockTags.create(new ResourceLocation("forge", name));
            }
        }
        public static class Items {
            public static final TagKey<Item> ARTIFACTS = tag("artifacts");
            public static final TagKey<Item> REDSTONE_TOOLS = tag("redstone_tools");
            public static final TagKey<Item> LAPIS_TOOLS = tag("lapis_tools");
            public static final TagKey<Item> UPGRADE_CORES = tag("upgrade_cores");
            public static final TagKey<Item> BURNING = tag("burning");

            private static TagKey<Item> tag(String name) {
                return ItemTags.create(new ResourceLocation(BladesEdge.MOD_ID, name));
            }

            private static TagKey<Item> ForgetTag(String name) {
                return ItemTags.create(new ResourceLocation("forge", name));
            }
        }
    }
