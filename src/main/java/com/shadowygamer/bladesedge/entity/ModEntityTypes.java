package com.shadowygamer.bladesedge.entity;

import com.shadowygamer.bladesedge.BladesEdge;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModEntityTypes {

    private ModEntityTypes() {}

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES
            = DeferredRegister.create(ForgeRegistries.ENTITIES, BladesEdge.MOD_ID);



//    public static final RegistryObject<EntityType<TarantulaEntity>> TARANTULA =
//            ENTITY_TYPES.register("tarantula", () ->
//                    EntityType.Builder.of(TarantulaEntity::new, MobCategory.MONSTER).sized(1f, 2f).build());



    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
