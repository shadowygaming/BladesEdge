package com.shadowygamer.bladesedge.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {

    public static final FoodProperties FLESH = (new FoodProperties.Builder())
            .nutrition(5)
            .saturationMod(0.3f)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 500, 0), 0.4F)
            .meat()
            .build();
    public static final FoodProperties CHARRED_CARROT = (new FoodProperties.Builder())
            .nutrition(5)
            .saturationMod(0.85f)
            .fast()
            .build();
    public static final FoodProperties VOID_PEPPER = (new FoodProperties.Builder())
            .nutrition(7)
            .saturationMod(0.9f)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 0), 0.95F)
            .build();
}
