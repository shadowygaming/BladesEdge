package com.shadowygamer.bladesedge.entities;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import com.shadowygamer.bladesedge.BladesEdge;
import net.minecraft.client.model.IronGolemModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.IronGolemRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.IronGolemCrackinessLayer;
import net.minecraft.client.renderer.entity.layers.IronGolemFlowerLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class DarkGolemRenderer extends MobRenderer<DarkGolemEntity, DarkGolemModel<DarkGolemEntity>> {


    public DarkGolemRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new DarkGolemModel<>(pContext.bakeLayer(DarkGolemModel.LAYER_LOCATION)), 0.7f);
    }

    @Override
    public ResourceLocation getTextureLocation(DarkGolemEntity pEntity) {
        return new ResourceLocation(BladesEdge.MOD_ID, "textures/entity/dark_golem/dark_golem.png");
    }

    protected void setupRotations(DarkGolemEntity pEntityLiving, PoseStack pMatrixStack, float pAgeInTicks, float pRotationYaw, float pPartialTicks) {
        super.setupRotations(pEntityLiving, pMatrixStack, pAgeInTicks, pRotationYaw, pPartialTicks);
        if (!((double)pEntityLiving.animationSpeed < 0.01D)) {
            float f = 13.0F;
            float f1 = pEntityLiving.animationPosition - pEntityLiving.animationSpeed * (1.0F - pPartialTicks) + 6.0F;
            float f2 = (Math.abs(f1 % 13.0F - 6.5F) - 3.25F) / 3.25F;
            pMatrixStack.mulPose(Vector3f.ZP.rotationDegrees(6.5F * f2));
        }
    }
}
