package com.shadowygamer.bladesedge.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {

    public static final FoodProperties FLESH = (new FoodProperties.Builder())
            .nutrition(2)
            .saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 500, 0), 0.1F)
            .meat()
            .build();
    public static final FoodProperties CHARRED_CARROT = (new FoodProperties.Builder())
            .nutrition(6)
            .saturationMod(0.7f)
            .fast()
            .build();
    public static final FoodProperties VOID_PEPPER = (new FoodProperties.Builder())
            .nutrition(8)
            .saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 1), 1F)
            .build();
    public static final FoodProperties GRASS_FIBER = (new FoodProperties.Builder())
            .nutrition(1)
            .saturationMod(0.15f)
            .fast()
            .build();
}
