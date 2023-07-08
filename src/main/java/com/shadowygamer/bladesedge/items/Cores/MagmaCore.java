package com.shadowygamer.bladesedge.items.Cores;

import com.shadowygamer.bladesedge.items.ModItems;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.core.BlockSource;
import net.minecraft.core.Direction;
import net.minecraft.core.dispenser.OptionalDispenseItemBehavior;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.FlintAndSteelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.gameevent.GameEvent;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MagmaCore extends CoreItem {
    public MagmaCore(Properties pProperties) {
        super(pProperties);
        DispenserBlock.registerBehavior(this, new OptionalDispenseItemBehavior()
        {
            protected ItemStack execute(BlockSource p_123412_, ItemStack p_123413_) {
                Level level = p_123412_.getLevel();
                this.setSuccess(true);
                Direction direction = p_123412_.getBlockState().getValue(DispenserBlock.FACING);
                BlockPos blockpos = p_123412_.getPos().relative(direction);
                BlockState blockstate = level.getBlockState(blockpos);
                if (BaseFireBlock.canBePlacedAt(level, blockpos, direction)) {
                    level.setBlockAndUpdate(blockpos, BaseFireBlock.getState(level, blockpos));
                    level.gameEvent((Entity)null, GameEvent.BLOCK_PLACE, blockpos);
                } else if (!CampfireBlock.canLight(blockstate) && !CandleBlock.canLight(blockstate) && !CandleCakeBlock.canLight(blockstate)) {
                    if (blockstate.isFlammable(level, blockpos, p_123412_.getBlockState().getValue(DispenserBlock.FACING).getOpposite())) {
                        blockstate.onCaughtFire(level, blockpos, p_123412_.getBlockState().getValue(DispenserBlock.FACING).getOpposite(), null);
                        if (blockstate.getBlock() instanceof TntBlock)
                            level.removeBlock(blockpos, false);
                    } else {
                        this.setSuccess(false);
                    }
                } else {
                    level.setBlockAndUpdate(blockpos, blockstate.setValue(BlockStateProperties.LIT, Boolean.valueOf(true)));
                    level.gameEvent((Entity)null, GameEvent.BLOCK_CHANGE, blockpos);
                }

                if (this.isSuccess() && p_123413_.hurt(1, level.random, (ServerPlayer)null)) {
                    p_123413_.setCount(0);
                }

                return p_123413_;
            }
        });
    }
    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Player player = pContext.getPlayer();
        Level level = pContext.getLevel();
        BlockPos blockpos = pContext.getClickedPos();
        BlockState blockstate = level.getBlockState(blockpos);
        if (!CampfireBlock.canLight(blockstate) && !CandleBlock.canLight(blockstate) && !CandleCakeBlock.canLight(blockstate)) {
            BlockPos blockpos1 = blockpos.relative(pContext.getClickedFace());
            if (BaseFireBlock.canBePlacedAt(level, blockpos1, pContext.getHorizontalDirection())) {
                level.playSound(player, blockpos1, SoundEvents.FLINTANDSTEEL_USE, SoundSource.BLOCKS, 1.0F, level.getRandom().nextFloat() * 0.4F + 0.8F);
                BlockState blockstate1 = BaseFireBlock.getState(level, blockpos1);
                level.setBlock(blockpos1, blockstate1, 11);
                level.gameEvent(player, GameEvent.BLOCK_PLACE, blockpos);
                ItemStack itemstack = pContext.getItemInHand();
                if (player instanceof ServerPlayer) {
                    CriteriaTriggers.PLACED_BLOCK.trigger((ServerPlayer) player, blockpos1, itemstack);
                    itemstack.hurtAndBreak(0, player, (p_41300_) -> {
                        p_41300_.broadcastBreakEvent(pContext.getHand());
                    });
                }
            }
        }
        return InteractionResult.sidedSuccess(level.isClientSide());
    }
    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if(Screen.hasShiftDown()) {
            pTooltipComponents.add(new TranslatableComponent("tooltip.bladesedge.magma_core.tooltip.shift"));
        }
        else{
            pTooltipComponents.add(new TranslatableComponent("tooltip.bladesedge.magma_core.tooltip"));
        }
    }
}
