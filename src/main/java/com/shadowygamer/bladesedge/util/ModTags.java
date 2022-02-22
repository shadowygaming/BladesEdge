package com.shadowygamer.bladesedge.util;


import com.shadowygamer.bladesedge.BladesEdge;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class ModTags {
        public static class Blocks {

            private static Tags.IOptionalNamedTag<Block> tag(String name) {
                return BlockTags.createOptional(new ResourceLocation(BladesEdge.MOD_ID, name));
            }

            private static Tags.IOptionalNamedTag<Block> ForgetTag(String name) {
                return BlockTags.createOptional(new ResourceLocation("forge", name));
            }
        }
        public static class Items {
            public static final Tags.IOptionalNamedTag<Item> ARTIFACTS = tag("artifacts");
            public static final Tags.IOptionalNamedTag<Item> REDSTONE_TOOLS = tag("redstone_tools");
            public static final Tags.IOptionalNamedTag<Item> LAPIS_TOOLS = tag("lapis_tools");
            public static final Tags.IOptionalNamedTag<Item> UPGRADE_CORES = tag("upgrade_cores");
            public static final Tags.IOptionalNamedTag<Item> BURNING = tag("burning");

            private static Tags.IOptionalNamedTag<Item> tag(String name) {
                return ItemTags.createOptional(new ResourceLocation(BladesEdge.MOD_ID, name));
            }

            private static Tags.IOptionalNamedTag<Item> ForgetTag(String name) {
                return ItemTags.createOptional(new ResourceLocation("forge", name));
            }
        }
    }
