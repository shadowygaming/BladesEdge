package com.shadowygamer.bladesedge.event;


import com.shadowygamer.bladesedge.BladesEdge;
import com.shadowygamer.bladesedge.event.loot.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = BladesEdge.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>
                                                   event) {
        event.getRegistry().registerAll(
                new GrassFiberFromGrassAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(BladesEdge.MOD_ID, "grass_fiber"))
        );
        event.getRegistry().registerAll(
                new EndCatalystFromEndermenAdditionsModifier.Serializer().setRegistryName
                        (new ResourceLocation(BladesEdge.MOD_ID, "end_catalyst"))
        );
        event.getRegistry().registerAll(
                new MagmaShardFromMagmaCubeAdditionsModifier.Serializer().setRegistryName
                        (new ResourceLocation(BladesEdge.MOD_ID, "magma_shard"))
        );
        event.getRegistry().registerAll(
                new RedstoneCoreFromBarterAdditionsModifier.Serializer().setRegistryName
                        (new ResourceLocation(BladesEdge.MOD_ID, "redstone_core_barter"))
        );
        event.getRegistry().registerAll(
                new RedstoneCoreFromPigmanAdditionsModifier.Serializer().setRegistryName
                        (new ResourceLocation(BladesEdge.MOD_ID, "redstone_core"))
        );
        event.getRegistry().registerAll(
                new ShinyRockFromEndstoneAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(BladesEdge.MOD_ID, "shiny_rock"))
        );
        event.getRegistry().registerAll(
                new VoidAtomFromEndermiteAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(BladesEdge.MOD_ID, "void_atom"))
        );
    }
}
