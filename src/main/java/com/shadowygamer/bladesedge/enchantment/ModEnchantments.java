package com.shadowygamer.bladesedge.enchantment;

import com.shadowygamer.bladesedge.BladesEdge;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEnchantments {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS
            = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, BladesEdge.MOD_ID);

    static EnchantmentCategory BOWS = EnchantmentCategory.create("bladesedge_ranged_category", (item -> item instanceof BowItem || item instanceof CrossbowItem));

    public static RegistryObject<Enchantment> BLAZING =
            ENCHANTMENTS.register("blazing", () -> new BlazingEnchantment(
                Enchantment.Rarity.COMMON, EnchantmentCategory.ARMOR_CHEST));

    public static RegistryObject<Enchantment> WITHER_ASPECT =
            ENCHANTMENTS.register("wither_aspect", () -> new WitherAspectEnchantment(
                    Enchantment.Rarity.UNCOMMON, EnchantmentCategory.WEAPON));

    public static RegistryObject<Enchantment> DEATH_MARK =
            ENCHANTMENTS.register("death_mark", () -> new DeathMarkEnchantment(
                    Enchantment.Rarity.UNCOMMON, EnchantmentCategory.WEAPON));

    public static RegistryObject<Enchantment> LAST_STAND =
            ENCHANTMENTS.register("last_stand", () -> new LastStandEnchantment(
                    Enchantment.Rarity.VERY_RARE, EnchantmentCategory.ARMOR_LEGS));

    public static RegistryObject<Enchantment> STORM =
            ENCHANTMENTS.register("storm", () -> new StormEnchantment(
                    Enchantment.Rarity.UNCOMMON, BOWS));

//    public static RegistryObject<Enchantment> STORM_CROSSBOW =
//            ENCHANTMENTS.register("storm_crossbow", () -> new StormEnchantment(
//                    Enchantment.Rarity.UNCOMMON, EnchantmentCategory.CROSSBOW));



        public static void register(IEventBus eventBus) {
        ENCHANTMENTS.register(eventBus);
    }
}
