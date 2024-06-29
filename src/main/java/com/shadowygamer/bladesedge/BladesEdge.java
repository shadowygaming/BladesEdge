package com.shadowygamer.bladesedge;

import com.shadowygamer.bladesedge.block.ModBlocks;
import com.shadowygamer.bladesedge.effects.ModEffects;
import com.shadowygamer.bladesedge.enchantment.ModEnchantments;
import com.shadowygamer.bladesedge.items.ModItems;
import com.shadowygamer.bladesedge.sound.ModSounds;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.BlockSource;
import net.minecraft.core.Direction;
import net.minecraft.core.dispenser.OptionalDispenseItemBehavior;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(BladesEdge.MOD_ID)
public class BladesEdge
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "bladesedge";
    public BladesEdge() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);
        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
//        ModPotions.register(eventBus);
        ModSounds.register(eventBus);
        ModEnchantments.register(eventBus);
        ModEffects.register((eventBus));
        MinecraftForge.EVENT_BUS.register(this);
    }
    private void clientSetup(final FMLClientSetupEvent event) {

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_OAK_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_OAK_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.VOID_PEPPER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_OAK_TRAPDOOR.get(), RenderType.cutout());

    }
    private void setup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(() -> {ComposterBlock.COMPOSTABLES.put(ModItems.VOID_PEPPER.get(), 0.5F);});
        event.enqueueWork(() -> {ComposterBlock.COMPOSTABLES.put(ModItems.VOID_PEPPER_SEEDS.get(), 0.3F);});
        event.enqueueWork(() -> {ComposterBlock.COMPOSTABLES.put(ModItems.GRASS_FIBER.get(), 0.5F);});
        event.enqueueWork(() -> {ComposterBlock.COMPOSTABLES.put(ModBlocks.LIGHT_OAK_LEAVES.get().asItem(), 0.3F);});
        event.enqueueWork(() -> {ComposterBlock.COMPOSTABLES.put(ModBlocks.LIGHT_OAK_SAPLING.get().asItem(), 0.3F);});


    }
}
