//package com.shadowygamer.bladesedge.items;
//
//import net.minecraft.server.level.ServerPlayer;
//import net.minecraft.world.InteractionHand;
//import net.minecraft.world.InteractionResultHolder;
//import net.minecraft.world.effect.MobEffectInstance;
//import net.minecraft.world.effect.MobEffects;
//import net.minecraft.world.entity.LivingEntity;
//import net.minecraft.world.entity.player.Player;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.level.Level;
//
//
//public class NullingArtifact extends ArtifactItem {
//
//    public NullingArtifact(Properties pProperties) {
//        super(pProperties);
//    }
//
//    @Override
//    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pInHand) {
//        int lastHurt = (pPlayer.getLastHurtByMobTimestamp());
//        boolean Hurt = (pPlayer.isHurt());
//        if (lastHurt <= 50) {
//            if (pPlayer.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 15, 20))) {
//                hurtItem(pPlayer.getItemInHand(pInHand));
//            }
//        }
//        if (Hurt = true) {
//            ((LivingEntity) pPlayer).removeEffect(MobEffects.DAMAGE_RESISTANCE);
//        }
//        return InteractionResultHolder.success(pPlayer.getItemInHand(pInHand));
//    }
//}