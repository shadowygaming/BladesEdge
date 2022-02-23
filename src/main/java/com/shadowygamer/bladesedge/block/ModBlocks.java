package com.shadowygamer.bladesedge.block;

import com.shadowygamer.bladesedge.BladesEdge;
import com.shadowygamer.bladesedge.items.ModCreativeModeTab;
import com.shadowygamer.bladesedge.items.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BladesEdge.MOD_ID);

    public static final RegistryObject<Block> CHARCOAL_BLOCK = registerBlock("charcoal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3.5f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLADESEDGE);

    public static final RegistryObject<Block> FLAMING_COPPER_BLOCK = registerBlock("flaming_copper_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(3.0F).requiresCorrectToolForDrops().sound(SoundType.COPPER)), ModCreativeModeTab.BLADESEDGE);

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    public static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                          CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register((eventBus));
    }
}
