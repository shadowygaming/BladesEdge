package com.shadowygamer.bladesedge.items;

import com.shadowygamer.bladesedge.BladesEdge;
import com.shadowygamer.bladesedge.block.ModBlocks;
import com.shadowygamer.bladesedge.items.Artifacts.*;
import com.shadowygamer.bladesedge.items.Cores.CoreItem;
import com.shadowygamer.bladesedge.items.Cores.MagmaCore;
import com.shadowygamer.bladesedge.items.Gear.Magma.*;
import com.shadowygamer.bladesedge.items.Sup.Darkness;
import com.shadowygamer.bladesedge.items.Sup.EnderBag;
import com.shadowygamer.bladesedge.items.Modifiers.Shiny;
import com.shadowygamer.bladesedge.items.Gear.KnifeItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BladesEdge.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    //nature

    public static final RegistryObject<Item> VOID_PEPPER_SEEDS = ITEMS.register("void_pepper_seeds",
            () -> new ItemNameBlockItem(ModBlocks.VOID_PEPPER.get(),
                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE)));

    public static final RegistryObject<Item> VOID_PEPPER = ITEMS.register("void_pepper",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).food(ModFoods.VOID_PEPPER)));

    //cores
    public static final RegistryObject<CoreItem> REDSTONE_CORE = ITEMS.register("redstone_core",
            () -> new CoreItem(new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).stacksTo(16).defaultDurability(32).rarity(Rarity.RARE)));

    public static final RegistryObject<CoreItem> LAPIS_CORE = ITEMS.register("lapis_core",
            () -> new CoreItem(new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).stacksTo(16).defaultDurability(32).rarity(Rarity.RARE)));

    public static final RegistryObject<MagmaCore> MAGMA_CORE = ITEMS.register("magma_core",
            () -> new MagmaCore(new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).stacksTo(16).defaultDurability(32).rarity(Rarity.RARE)));


    //catalysts
    public static final RegistryObject<Item> END_CATALYST = ITEMS.register("end_catalyst",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).stacksTo(1).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> HYPER_CATALYST = ITEMS.register("hyper_catalyst",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).stacksTo(1).rarity(Rarity.EPIC)));


    //items
    public static final RegistryObject<Item> TOOL_HANDLE = ITEMS.register("tool_handle",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).stacksTo(16)));

    public static final RegistryObject<Item> FLESH = ITEMS.register("flesh",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).food(ModFoods.FLESH)));

    public static final RegistryObject<Item> FLAMING_COPPER_INGOT = ITEMS.register("flaming_copper_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE)));

    public static final RegistryObject<Item> MAGMA_SHARD = ITEMS.register("magma_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE)));

    public static final RegistryObject<Shiny> SHINY_ROCK = ITEMS.register("shiny_rock",
            () -> new Shiny(new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE)));

    public static final RegistryObject<Item> CHARRED_CARROT = ITEMS.register("charred_carrot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).food(ModFoods.CHARRED_CARROT)));

    public static final RegistryObject<Item> VOID_ATOM = ITEMS.register("void_atom",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE)));

    public static final RegistryObject<Darkness> DARKNESS = ITEMS.register("darkness",
            () -> new Darkness(new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE)));

    //special items
    public static final RegistryObject<EnderBag> ENDER_BAG = ITEMS.register("ender_bag",
            () -> new EnderBag(new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).stacksTo(1).defaultDurability(256).rarity(Rarity.EPIC)));


    //artifacts
    public static final RegistryObject<CharcoalArtifact> CHARCOAL_ARTIFACT = ITEMS.register("charcoal_artifact",
            () -> new CharcoalArtifact(new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).stacksTo(1).defaultDurability(64).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<ExperienceArtifact> EXPERIENCE_ARTIFACT = ITEMS.register("experience_artifact",
            () -> new ExperienceArtifact(new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).stacksTo(1).defaultDurability(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<HasteArtifact> HASTE_ARTIFACT = ITEMS.register("haste_artifact",
            () -> new HasteArtifact(new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).stacksTo(1).defaultDurability(6).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<FireArtifact> FIRE_ARTIFACT = ITEMS.register("fire_artifact",
            () -> new FireArtifact(new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).stacksTo(1).defaultDurability(2).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<BerserkerArtifact> BERSERKER_ARTIFACT = ITEMS.register("berserker_artifact",
            () -> new BerserkerArtifact(new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).stacksTo(1).defaultDurability(1).rarity(Rarity.UNCOMMON)));

    //Artifacts t2

    public static final RegistryObject<GoldArtifact> GOLD_ALTAR = ITEMS.register("gold_altar",
            () -> new GoldArtifact(new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).stacksTo(1).defaultDurability(3).rarity(Rarity.RARE)));

    public static final RegistryObject<ShadowArtifact> SHADOW_ALTAR = ITEMS.register("shadow_altar",
            () -> new ShadowArtifact(new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).stacksTo(1).defaultDurability(1).rarity(Rarity.RARE)));


    //tools
    public static final RegistryObject<Item> REDSTONE_SWORD = ITEMS.register("redstone_sword",
            () -> new SwordItem(ModTiers.REDSTONE, 4,-2f,
                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE)));

    public static final RegistryObject<Item> REDSTONE_AXE = ITEMS.register("redstone_axe",
            () -> new AxeItem(ModTiers.REDSTONE, 5,-2.8f,
                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE)));

    public static final RegistryObject<Item> REDSTONE_PICKAXE = ITEMS.register("redstone_pickaxe",
            () -> new PickaxeItem(ModTiers.REDSTONE, 2,-3f,
                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE)));

    public static final RegistryObject<Item> REDSTONE_SHOVEL = ITEMS.register("redstone_shovel",
            () -> new ShovelItem(ModTiers.REDSTONE, 1, -3f,
                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE)));

    public static final RegistryObject<Item> REDSTONE_HOE = ITEMS.register("redstone_hoe",
            () -> new HoeItem(ModTiers.REDSTONE, -3, 4f,
                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE)));

    public static final RegistryObject<Item> LAPIS_SWORD = ITEMS.register("lapis_sword",
            () -> new SwordItem(ModTiers.LAPIS, 4,-1.8f,
                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE)));

    public static final RegistryObject<Item> LAPIS_AXE = ITEMS.register("lapis_axe",
            () -> new AxeItem(ModTiers.LAPIS, 6,-2.4f,
                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE)));

    public static final RegistryObject<Item> LAPIS_PICKAXE = ITEMS.register("lapis_pickaxe",
            () -> new PickaxeItem(ModTiers.LAPIS, 1,-3f,
                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE)));

    public static final RegistryObject<Item> LAPIS_SHOVEL = ITEMS.register("lapis_shovel",
            () -> new ShovelItem(ModTiers.LAPIS, 4, -3f,
                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE)));

    public static final RegistryObject<Item> LAPIS_HOE = ITEMS.register("lapis_hoe",
            () -> new HoeItem(ModTiers.LAPIS, -3, 5f,
                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE)));
    
    public static final RegistryObject<Item> MAGMA_SWORD = ITEMS.register("magma_sword",
            () -> new MagmaSword(ModTiers.MAGMA, 6,-2.2f,
                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).fireResistant()));

    public static final RegistryObject<Item> MAGMA_AXE = ITEMS.register("magma_axe",
            () -> new MagmaAxe(ModTiers.MAGMA, 11,-2.6f,
                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).fireResistant()));

    public static final RegistryObject<Item> MAGMA_PICKAXE = ITEMS.register("magma_pickaxe",
            () -> new MagmaPickaxe(ModTiers.MAGMA, 2,-3f,
                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).fireResistant()));

    public static final RegistryObject<Item> MAGMA_SHOVEL = ITEMS.register("magma_shovel",
            () -> new MagmaShovel(ModTiers.MAGMA, 4, -3f,
                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).fireResistant()));

    public static final RegistryObject<Item> MAGMA_HOE = ITEMS.register("magma_hoe",
            () -> new MagmaHoe(ModTiers.MAGMA, -2, 6f,
                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).fireResistant()));

    public static final RegistryObject<Item> KNIFE = ITEMS.register("knife",
            () -> new KnifeItem(Tiers.IRON, 1,0f,
                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).defaultDurability(128)));

    public static final RegistryObject<Item> MAGMA_KNIFE = ITEMS.register("magma_knife",
            () -> new MagmaKnife(Tiers.NETHERITE, 0,-2f,
                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).defaultDurability(512).fireResistant()));


    //Armor
    public static final RegistryObject<Item> MAGMA_HELMET = ITEMS.register("magma_helmet",
            () -> new MagmaArmor(ModArmorMaterials.MAGMA, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).fireResistant()));

    public static final RegistryObject<Item> MAGMA_CHESTPLATE = ITEMS.register("magma_chestplate",
            () -> new ArmorItem(ModArmorMaterials.MAGMA, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).fireResistant()));

    public static final RegistryObject<Item> MAGMA_LEGGINGS = ITEMS.register("magma_leggings",
            () -> new ArmorItem(ModArmorMaterials.MAGMA, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).fireResistant()));

    public static final RegistryObject<Item> MAGMA_BOOTS = ITEMS.register("magma_boots",
            () -> new ArmorItem(ModArmorMaterials.MAGMA, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).fireResistant()));



//    public static final RegistryObject<Item> LAPIS_HELMET = ITEMS.register("lapis_helmet",
//            () -> new ArmorItem(ModArmorMaterials.LAPIS, EquipmentSlot.HEAD,
//                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE)));
//
//    public static final RegistryObject<Item> LAPIS_CHESTPLATE = ITEMS.register("lapis_chestplate",
//            () -> new ArmorItem(ModArmorMaterials.LAPIS, EquipmentSlot.CHEST,
//                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE)));
//
//    public static final RegistryObject<Item> LAPIS_LEGGINGS = ITEMS.register("lapis_leggings",
//            () -> new ArmorItem(ModArmorMaterials.LAPIS, EquipmentSlot.LEGS,
//                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE)));
//
//    public static final RegistryObject<Item> LAPIS_BOOTS = ITEMS.register("lapis_boots",
//            () -> new ArmorItem(ModArmorMaterials.LAPIS, EquipmentSlot.FEET,
//                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE)));
}
