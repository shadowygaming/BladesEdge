package com.shadowygamer.bladesedge.block;

import com.shadowygamer.bladesedge.BladesEdge;
import com.shadowygamer.bladesedge.items.ModCreativeModeTab;
import com.shadowygamer.bladesedge.items.ModItems;
import com.shadowygamer.bladesedge.world.feature.tree.LightOakTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BladesEdge.MOD_ID);


    //ores
    public static final RegistryObject<Block> VOIDIUM_ORE = registerBlock("voidium_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3.5f, 9f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLADESEDGE);

    public static final RegistryObject<Block> CRONIUM_ORE = registerBlock("cronium_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3f, 12f).requiresCorrectToolForDrops(), UniformInt.of(2,5)), ModCreativeModeTab.BLADESEDGE);

    public static final RegistryObject<Block> FLARIUM_ORE = registerBlock("flarium_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2.8f, 1.8f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)), ModCreativeModeTab.BLADESEDGE);

    //ore blocks
    public static final RegistryObject<Block> FLARIUM_BLOCK = registerBlock("flarium_block",
            () -> new MagmaBlock(BlockBehaviour.Properties.of(Material.METAL).strength(3.0F, 6.0f).requiresCorrectToolForDrops().sound(SoundType.COPPER)), ModCreativeModeTab.BLADESEDGE);

    public static final RegistryObject<Block> CRONIUM_BLOCK = registerBlock("cronium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(3.0F, 6.0f).requiresCorrectToolForDrops().sound(SoundType.METAL)), ModCreativeModeTab.BLADESEDGE);

    public static final RegistryObject<Block> VOIDIUM_BLOCK = registerBlock("voidium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(3.0F, 6.0f).requiresCorrectToolForDrops().sound(SoundType.METAL)), ModCreativeModeTab.BLADESEDGE);

    public static final RegistryObject<Block> CHARCOAL_BLOCK = registerBlockFuel("charcoal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5.0f, 6.5f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLADESEDGE, 16000);

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

    public static final RegistryObject<Block> LIGHT_OAK_SAPLING = registerBlock("light_oak_sapling",
            () -> new SaplingBlock(new LightOakTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTab.BLADESEDGE);

    public static final RegistryObject<Block> LIGHT_OAK_STAIRS = registerBlock("light_oak_stairs",
            () -> new StairBlock(()->ModBlocks.LIGHT_OAK_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)), ModCreativeModeTab.BLADESEDGE);

    public static final RegistryObject<Block> LIGHT_OAK_SLAB = registerBlock("light_oak_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), ModCreativeModeTab.BLADESEDGE);

    public static final RegistryObject<Block> LIGHT_OAK_FENCE = registerBlock("light_oak_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)), ModCreativeModeTab.BLADESEDGE);

    public static final RegistryObject<Block> LIGHT_OAK_FENCE_GATE = registerBlock("light_oak_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)), ModCreativeModeTab.BLADESEDGE);

    public static final RegistryObject<Block> LIGHT_OAK_TRAPDOOR = registerBlock("light_oak_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR)), ModCreativeModeTab.BLADESEDGE);

    public static final RegistryObject<Block> LIGHT_OAK_BUTTON = registerBlock("light_oak_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON)), ModCreativeModeTab.BLADESEDGE);

    public static final RegistryObject<Block> LIGHT_OAK_PRESSURE_PLATE = registerBlock("light_oak_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)), ModCreativeModeTab.BLADESEDGE);

    public static final RegistryObject<Block> LIGHT_OAK_DOOR = registerBlock("light_oak_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)), ModCreativeModeTab.BLADESEDGE);


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
    private static <T extends Block> RegistryObject<T> registerBlockFuel(String name, Supplier<T> block, CreativeModeTab tab, int burnTime) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockFuelItem(name, toReturn, tab, burnTime);
        return toReturn;
    }

    public static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                          CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }
    private static <T extends Block>RegistryObject<Item> registerBlockFuelItem(String name, RegistryObject<T> block, CreativeModeTab tab, int burnTime) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)) {
            @Override
            public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
                return burnTime;
            }
        });
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register((eventBus));
    }
}
