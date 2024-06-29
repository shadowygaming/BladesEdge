package com.shadowygamer.bladesedge.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {

    public static final FoodProperties FLESH = (new FoodProperties.Builder())
            .nutrition(4)
            .saturationMod(0.5f)
            //.effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 500, 0), 0.1F)
            .meat()
            .fast()
            .build();
    public static final FoodProperties CHARRED_CARROT = (new FoodProperties.Builder())
            .nutrition(6)
            .saturationMod(0.7f)
            .fast()
            .build();
    public static final FoodProperties VOID_PEPPER = (new FoodProperties.Builder())
            .nutrition(6)
            .saturationMod(1f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 1), 1F)
            .alwaysEat()
            .build();
    public static final FoodProperties GRASS_FIBER = (new FoodProperties.Builder())
            .nutrition(1)
            .saturationMod(0.15f)
            .fast()
            .build();

    public static final FoodProperties CRONIUM_APPLE = (new FoodProperties.Builder())
            .nutrition(5)
            .saturationMod(1.1f)
            .effect(()-> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 0), 1.0f)
            .effect(()-> new MobEffectInstance(MobEffects.REGENERATION, 40, 2), 1.0f)
            .alwaysEat()
            .build();
}
