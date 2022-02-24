package com.shadowygamer.bladesedge.items;

import com.google.common.collect.ImmutableMap;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;

import java.util.Map;

public class LapisArmor extends ArmorItem {
    private static final Map<ArmorMaterial, EnchantmentInstance> MATERIAL_TO_EFFECT_MAP =
            (Map<ArmorMaterial, EnchantmentInstance>) (new ImmutableMap.Builder<ArmorMaterial, EnchantmentInstance>())
                    .put(ModArmorMaterials.LAPIS,
                            new EnchantmentInstance(Enchantments.MENDING, 1));

    public LapisArmor(ArmorMaterial material, EquipmentSlot slot, Properties settings) {
        super(material, slot, settings);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if(!world.isClientSide()) {
            if(hasFullSuitOfArmorOn(player)) {
                evaluateArmorEnchants(player);
            }
        }
    }

    private void evaluateArmorEnchants(Player player) {
        for (Map.Entry<ArmorMaterial, EnchantmentInstance> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            EnchantmentInstance mapEnchant = entry.getValue();

            if(hasCorrectArmorOn(mapArmorMaterial, player)) {
                addEnchantForMaterial(player, mapArmorMaterial, mapEnchant);
            }
        }
    }

    private void addEnchantForMaterial(Player player, ArmorMaterial mapArmorMaterial,
                                            EnchantmentInstance mapEnchant) {
        boolean hasPlayerEnchant = getDefaultInstance().isEnchanted();

        if(hasCorrectArmorOn(mapArmorMaterial, player) && !hasPlayerEnchant) {
            new EnchantmentInstance(mapEnchant.enchantment, mapEnchant.level);

            //if(new Random().nextFloat() > 0.6f) { // 40% of damaging the armor! Possibly!
            //    player.getInventory().hurtArmor(DamageSource.MAGIC, 1f, new int[]{0, 1, 2, 3});
            //}
        }
    }

    private boolean hasFullSuitOfArmorOn(Player player) {
        ItemStack boots = player.getInventory().getArmor(0);
        ItemStack leggings = player.getInventory().getArmor(1);
        ItemStack chestplate = player.getInventory().getArmor(2);
        ItemStack helmet = player.getInventory().getArmor(3);

        return !helmet.isEmpty() && !chestplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, Player player) {
        for (ItemStack armorStack: player.getInventory().armor) {
            if(!(armorStack.getItem() instanceof ArmorItem)) {
                return false;
            }
        }

        ArmorItem boots = ((ArmorItem)player.getInventory().getArmor(0).getItem());
        ArmorItem leggings = ((ArmorItem)player.getInventory().getArmor(1).getItem());
        ArmorItem chestplate = ((ArmorItem)player.getInventory().getArmor(2).getItem());
        ArmorItem helmet = ((ArmorItem)player.getInventory().getArmor(3).getItem());

        return helmet.getMaterial() == material && chestplate.getMaterial() == material &&
                leggings.getMaterial() == material && boots.getMaterial() == material;
    }
}
