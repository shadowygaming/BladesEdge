package com.shadowygamer.bladesedge.event;


import com.shadowygamer.bladesedge.BladesEdge;
import com.shadowygamer.bladesedge.event.loot.GrassFiberAdditionModifier;
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
                new GrassFiberAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(BladesEdge.MOD_ID, "grass_fiber"))
        );
    }
}
