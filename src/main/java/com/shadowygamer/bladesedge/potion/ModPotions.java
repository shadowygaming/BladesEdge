package com.shadowygamer.bladesedge.potion;

import com.shadowygamer.bladesedge.BladesEdge;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(ForgeRegistries.POTIONS, BladesEdge.MOD_ID);
    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }


    public static final RegistryObject<Potion> GOLDEN_POTION = POTIONS.register("golden_potion", () -> new Potion(
                    new MobEffectInstance(MobEffects.REGENERATION, 100, 1),
                    new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0)));
}
