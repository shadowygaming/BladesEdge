package com.shadowygamer.bladesedge.effects;

import com.shadowygamer.bladesedge.BladesEdge;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static DeferredRegister<MobEffect> MOD_EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, BladesEdge.MOD_ID);


    public static final RegistryObject<ComboEffect> COMBO = MOD_EFFECTS.register("combo",
            () -> new ComboEffect(MobEffectCategory.HARMFUL, 395248));

    public static void register(IEventBus eventBus) {
        MOD_EFFECTS.register(eventBus);
    }
}
