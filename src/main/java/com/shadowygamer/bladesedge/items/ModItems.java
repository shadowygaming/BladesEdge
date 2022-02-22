package com.shadowygamer.bladesedge.items;

import com.shadowygamer.bladesedge.BladesEdge;
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

    //cores
    public static final RegistryObject<CoreItem> REDSTONE_HEART = ITEMS.register("redstone_heart",
            () -> new CoreItem(new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).stacksTo(16).defaultDurability(32).rarity(Rarity.EPIC)));

    public static final RegistryObject<CoreItem> LAPIS_CRYSTAL = ITEMS.register("lapis_crystal",
            () -> new CoreItem(new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).stacksTo(16).defaultDurability(32).rarity(Rarity.EPIC)));

    public static final RegistryObject<CoreItem> MAGMA_CORE = ITEMS.register("magma_core",
            () -> new CoreItem(new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).stacksTo(16).defaultDurability(32).rarity(Rarity.EPIC)));


    //items
    public static final RegistryObject<Item> TOOL_HANDLE = ITEMS.register("tool_handle",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).stacksTo(16)));

    public static final RegistryObject<Item> FLESH = ITEMS.register("flesh",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).food(ModFoods.FLESH)));

    public static final RegistryObject<Item> FLAMING_COPPER_INGOT = ITEMS.register("flaming_copper_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE)));

    public static final RegistryObject<Item> CHARRED_CARROT = ITEMS.register("charred_carrot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).food(ModFoods.CHARRED_CARROT)));


    //artifacts
    public static final RegistryObject<ArtifactItem> CHARCOAL_ARTIFACT = ITEMS.register("charcoal_artifact",
            () -> new ArtifactItem(new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).stacksTo(1).defaultDurability(32).rarity(Rarity.RARE)));

    public static final RegistryObject<ExperienceArtifact> EXPERIENCE_ARTIFACT = ITEMS.register("experience_artifact",
            () -> new ExperienceArtifact(new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).stacksTo(1).defaultDurability(8).rarity(Rarity.RARE)));

    public static final RegistryObject<HasteArtifact> HASTE_ARTIFACT = ITEMS.register("haste_artifact",
            () -> new HasteArtifact(new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).stacksTo(1).defaultDurability(8).rarity(Rarity.RARE)));

    public static final RegistryObject<FireArtifact> FIRE_ARTIFACT = ITEMS.register("fire_artifact",
            () -> new FireArtifact(new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).stacksTo(1).defaultDurability(16).rarity(Rarity.RARE)));


    //tools
    public static final RegistryObject<Item> REDSTONE_SWORD = ITEMS.register("redstone_sword",
            () -> new SwordItem(ModTiers.REDSTONE, 3,-2f,
                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE)));

    public static final RegistryObject<Item> REDSTONE_AXE = ITEMS.register("redstone_axe",
            () -> new AxeItem(ModTiers.REDSTONE, 5,-2.8f,
                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE)));

    public static final RegistryObject<Item> REDSTONE_PICKAXE = ITEMS.register("redstone_pickaxe",
            () -> new PickaxeItem(ModTiers.REDSTONE, 1,-3f,
                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE)));

    public static final RegistryObject<Item> REDSTONE_SHOVEL = ITEMS.register("redstone_shovel",
            () -> new ShovelItem(ModTiers.REDSTONE, 4, -3f,
                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE)));

    public static final RegistryObject<Item> REDSTONE_HOE = ITEMS.register("redstone_hoe",
            () -> new HoeItem(ModTiers.REDSTONE, -3, 2f,
                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE)));

    public static final RegistryObject<Item> LAPIS_SWORD = ITEMS.register("lapis_sword",
            () -> new SwordItem(ModTiers.LAPIS, 4,-1.8f,
                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).fireResistant()));

    public static final RegistryObject<Item> LAPIS_AXE = ITEMS.register("lapis_axe",
            () -> new AxeItem(ModTiers.LAPIS, 6,-2.4f,
                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).fireResistant()));

    public static final RegistryObject<Item> LAPIS_PICKAXE = ITEMS.register("lapis_pickaxe",
            () -> new PickaxeItem(ModTiers.LAPIS, 1,-3f,
                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).fireResistant()));

    public static final RegistryObject<Item> LAPIS_SHOVEL = ITEMS.register("lapis_shovel",
            () -> new ShovelItem(ModTiers.LAPIS, 4, -3f,
                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).fireResistant()));

    public static final RegistryObject<Item> LAPIS_HOE = ITEMS.register("lapis_hoe",
            () -> new HoeItem(ModTiers.LAPIS, -3, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).fireResistant()));

    public static final RegistryObject<Item> KNIFE = ITEMS.register("knife",
            () -> new KnifeItem(Tiers.IRON, 1,2f,
                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).defaultDurability(128)));

    public static final RegistryObject<Item> MAGMA_KNIFE = ITEMS.register("magma_knife",
            () -> new MagmaKnife(Tiers.NETHERITE, 0,-2f,
                    new Item.Properties().tab(ModCreativeModeTab.BLADESEDGE).defaultDurability(512).fireResistant()));
}
