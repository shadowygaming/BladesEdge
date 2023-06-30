package com.shadowygamer.bladesedge.block;

import com.shadowygamer.bladesedge.BladesEdge;
import com.shadowygamer.bladesedge.items.ModCreativeModeTab;
import com.shadowygamer.bladesedge.items.ModItems;
import com.shadowygamer.bladesedge.world.feature.tree.LightOakTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
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

    public static final RegistryObject<Block> VOIDIUM_ORE = registerBlock("voidium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLADESEDGE);

    public static final RegistryObject<Block> FLAMING_COPPER_BLOCK = registerBlock("flaming_copper_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(3.0F).requiresCorrectToolForDrops().sound(SoundType.COPPER)), ModCreativeModeTab.BLADESEDGE);

    public static final RegistryObject<Block> VOID_PEPPER = BLOCKS.register("void_pepper",
            () -> new VoidPepperBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission().noOcclusion()));

    public static final RegistryObject<Block> LIGHT_OAK_LOG = registerBlock("light_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.BLADESEDGE);

    public static final RegistryObject<Block> LIGHT_OAK_WOOD = registerBlock("light_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), ModCreativeModeTab.BLADESEDGE);

    public static final RegistryObject<Block> STRIPPED_LIGHT_OAK_LOG = registerBlock("stripped_light_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)), ModCreativeModeTab.BLADESEDGE);

    public static final RegistryObject<Block> STRIPPED_LIGHT_OAK_WOOD = registerBlock("stripped_light_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), ModCreativeModeTab.BLADESEDGE);

    public static final RegistryObject<DoorBlock> LIGHT_OAK_DOOR = registerBlock("light_oak_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion()), ModCreativeModeTab.BLADESEDGE);

    public static final RegistryObject<Block> LIGHT_OAK_SAPLING = registerBlock("light_oak_sapling",
            () -> new SaplingBlock(new LightOakTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTab.BLADESEDGE);


    public static final RegistryObject<Block> LIGHT_OAK_PLANKS = registerBlock("light_oak_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModeTab.BLADESEDGE);

    public static final RegistryObject<Block> LIGHT_OAK_LEAVES = registerBlock("light_oak_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, ModCreativeModeTab.BLADESEDGE);

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
