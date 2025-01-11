package com.shadowygamer.bladesedge.mixin;

import com.shadowygamer.bladesedge.effects.ModEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(LivingEntity.class)
public class DeathmarkMixin {
    @ModifyVariable(method = "hurt", at=@At("HEAD"), ordinal = 0, argsOnly = true)
    public float modifyHurt(float pAmount) {
        if (((LivingEntity) (Object) this).hasEffect(ModEffects.DEATH_MARK.get())) {
            return pAmount + 30 - ((LivingEntity) (Object) this).getEffect(ModEffects.DEATH_MARK.get()).getDuration()/40;
        }
        return pAmount;
    }
}
