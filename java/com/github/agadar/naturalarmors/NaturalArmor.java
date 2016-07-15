package com.github.agadar.naturalarmors;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/** Base class for all of NaturalArmors' armors. */
public class NaturalArmor extends ItemArmor
{
	public NaturalArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) 
	{
        super(material, renderIndex, armorType);
        this.setUnlocalizedName(unlocalizedName);
        GameRegistry.registerItem(this, unlocalizedName);
    }
	
	@Override
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
		Item toRepair = par1ItemStack.getItem();
		Item repairWith = par2ItemStack.getItem();
		
		if (toRepair == NaturalArmors.acacia_boots || toRepair == NaturalArmors.acacia_chestplate ||
				toRepair == NaturalArmors.acacia_helmet || toRepair == NaturalArmors.acacia_leggings)
		{
			return repairWith == Item.getItemFromBlock(Blocks.log2) && par2ItemStack.getItemDamage() == 0;
		}
		
		if (toRepair == NaturalArmors.big_oak_boots || toRepair == NaturalArmors.big_oak_chestplate ||
				toRepair == NaturalArmors.big_oak_helmet || toRepair == NaturalArmors.big_oak_leggings)
		{
			return repairWith == Item.getItemFromBlock(Blocks.log2) && par2ItemStack.getItemDamage() == 1;
		}
		
		if (toRepair == NaturalArmors.birch_boots || toRepair == NaturalArmors.birch_chestplate ||
				toRepair == NaturalArmors.birch_helmet || toRepair == NaturalArmors.birch_leggings)
		{
			return repairWith == Item.getItemFromBlock(Blocks.log) && par2ItemStack.getItemDamage() == 2;
		}
		
		if (toRepair == NaturalArmors.cactus_boots || toRepair == NaturalArmors.cactus_chestplate ||
				toRepair == NaturalArmors.cactus_helmet || toRepair == NaturalArmors.cactus_leggings)
		{
			return repairWith == Item.getItemFromBlock(Blocks.cactus);
		}
		
		if (toRepair == NaturalArmors.jungle_boots || toRepair == NaturalArmors.jungle_chestplate ||
				toRepair == NaturalArmors.jungle_helmet || toRepair == NaturalArmors.jungle_leggings)
		{
			return repairWith == Item.getItemFromBlock(Blocks.log) && par2ItemStack.getItemDamage() == 3;
		}
		
		if (toRepair == NaturalArmors.melon_boots || toRepair == NaturalArmors.melon_chestplate ||
				toRepair == NaturalArmors.melon_helmet || toRepair == NaturalArmors.melon_leggings)
		{
			return repairWith == Item.getItemFromBlock(Blocks.melon_block);
		}
		
		if (toRepair == NaturalArmors.oak_boots || toRepair == NaturalArmors.oak_chestplate ||
				toRepair == NaturalArmors.oak_helmet || toRepair == NaturalArmors.oak_leggings)
		{
			return repairWith == Item.getItemFromBlock(Blocks.log) && par2ItemStack.getItemDamage() == 0;
		}
		
		if (toRepair == NaturalArmors.pumpkin_boots || toRepair == NaturalArmors.pumpkin_chestplate ||
				toRepair == NaturalArmors.pumpkin_helmet || toRepair == NaturalArmors.pumpkin_leggings)
		{
			return repairWith == Item.getItemFromBlock(Blocks.pumpkin);
		}
		
		if (toRepair == NaturalArmors.spruce_boots || toRepair == NaturalArmors.spruce_chestplate ||
				toRepair == NaturalArmors.spruce_helmet || toRepair == NaturalArmors.spruce_leggings)
		{
			return repairWith == Item.getItemFromBlock(Blocks.log) && par2ItemStack.getItemDamage() == 1;
		}
		
        return false;
    }
}
