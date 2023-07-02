package com.shadowygamer.bladesedge.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {

    public static final FoodProperties FLESH = (new FoodProperties.Builder())
            .nutrition(3)
            .saturationMod(0.12f)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 500, 0), 0.4F)
            .meat()
            .build();
    public static final FoodProperties CHARRED_CARROT = (new FoodProperties.Builder())
            .nutrition(5)
            .saturationMod(0.62f)
            .fast()
            .build();
    public static final FoodProperties VOID_PEPPER = (new FoodProperties.Builder())
            .nutrition(8)
            .saturationMod(0.8f)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 1), 0.75F)
            .build();
    public static final FoodProperties GRASS_FIBER = (new FoodProperties.Builder())
            .nutrition(1)
            .saturationMod(0.2f)
            .fast()
            .build();
}
