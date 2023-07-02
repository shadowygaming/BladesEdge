package com.shadowygamer.bladesedge.event;

import com.shadowygamer.bladesedge.BladesEdge;
import com.shadowygamer.bladesedge.items.ModItems;
import com.shadowygamer.bladesedge.util.ModTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.SandBlock;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.entity.living.LivingExperienceDropEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.util.List;

@Mod.EventBusSubscriber(modid = BladesEdge.MOD_ID)
public class ModEvents {
    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if(event.getType() == VillagerProfession.TOOLSMITH) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.TOOL_HANDLE.get(), 3);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 6),
                    stack,3,24,0.12F));
        }

        if(event.getType() == VillagerProfession.CLERIC) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.END_CATALYST.get(), 1);
            int villagerLevel = 5;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 27),
                    stack,2,57,0.9F));
        }
        if(event.getType() == VillagerProfession.CLERIC) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 3);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ModItems.FLESH.get(), 32),
                    stack,17,18,0.05F));
        }
    }

    @SubscribeEvent
    public static void blockBreak(BlockEvent.BreakEvent event) {
        Player player = event.getPlayer();

        int levelThirty;

        if ((player.totalExperience) >= 1395){
            levelThirty = 1;
        } else {
            levelThirty = 2;
        }

        if ((player.getMainHandItem().getItem().getRegistryName() == ModItems.LAPIS_PICKAXE.get().getRegistryName())
                && event.getState().getBlock() instanceof OreBlock)
            event.setExpToDrop(event.getExpToDrop()*(player.getMainHandItem().getDamageValue()/10));

        if ((player.getMainHandItem().getItem().getRegistryName() == ModItems.LAPIS_SHOVEL.get().getRegistryName()))
            if (event.getState().getBlock() == Blocks.SAND ||
                    event.getState().getBlock() == Blocks.GRAVEL ||
                    event.getState().getBlock() == Blocks.RED_SAND ||
                    event.getState().getBlock() == Blocks.SOUL_SAND ||
                    event.getState().getBlock() == Blocks.DIRT ||
                    event.getState().getBlock() == Blocks.GRASS_BLOCK ||
                    event.getState().getBlock() == Blocks.CLAY) {
                event.setExpToDrop(levelThirty*((512-player.getMainHandItem().getDamageValue())/256));
            }
    }

    @SubscribeEvent
    public static void entityKill(LivingExperienceDropEvent event) {
        Player player = event.getAttackingPlayer();

        int levelThirty;

        if ((player.totalExperience) >= 1395){
            levelThirty = 1;
        } else {
            levelThirty = 2;
        }

        if((player.getMainHandItem().getItem().getRegistryName() == ModItems.LAPIS_SWORD.get().getRegistryName())
                || (player.getMainHandItem().getItem().getRegistryName() == ModItems.LAPIS_AXE.get().getRegistryName())) {
            event.setDroppedExperience(levelThirty*((512-player.getMainHandItem().getDamageValue())/64));
        }
    }

}
