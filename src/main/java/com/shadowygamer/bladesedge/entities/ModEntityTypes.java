package com.shadowygamer.bladesedge.entities;

import com.shadowygamer.bladesedge.BladesEdge;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, BladesEdge.MOD_ID);

    public static final RegistryObject<EntityType<DarkGolemEntity>> DARK_GOLEM = ENTITY_TYPES.register("dark_golem",
            () -> EntityType.Builder.of(DarkGolemEntity::new, MobCategory.MONSTER)
                    .build(new ResourceLocation(BladesEdge.MOD_ID, "dark_golem").toString()));

    public static void register(IEventBus eventbus) {
        ENTITY_TYPES.register(eventbus);
    }
}
