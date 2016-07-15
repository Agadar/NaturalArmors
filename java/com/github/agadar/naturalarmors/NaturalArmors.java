package com.github.agadar.naturalarmors;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = NaturalArmors.MODID, version = NaturalArmors.VERSION, name = NaturalArmors.NAME)
public class NaturalArmors
{
	@Instance(value = NaturalArmors.MODID)
	public static NaturalArmors instance;

	@SidedProxy(clientSide = NaturalArmors.CLIENTSIDE, serverSide = NaturalArmors.SERVERSIDE)
	public static CommonProxy proxy;

	// These are the references we use. These values are the same for our entire mod, so we only have 
	// to make them once here, and we can always access them.
	public static final String MODID = "naturalarmors";
	public static final String VERSION = "1.0.0";
	public static final String NAME = "NaturalArmors";
	public static final String CLIENTSIDE = "com.github.agadar.naturalarmors.ClientProxy";
	public static final String SERVERSIDE = "com.github.agadar.naturalarmors.CommonProxy";

	// Armor Materials
	public static final ArmorMaterial OAK = addArmorMaterial("oak"); 
	public static final ArmorMaterial SPRUCE = addArmorMaterial("spruce");
	public static final ArmorMaterial BIRCH = addArmorMaterial("birch"); 
	public static final ArmorMaterial JUNGLE = addArmorMaterial("jungle");
	public static final ArmorMaterial ACACIA = addArmorMaterial("acacia"); 
	public static final ArmorMaterial BIG_OAK = addArmorMaterial("big_oak"); 
	public static final ArmorMaterial PUMPKIN = addArmorMaterial("pumpkin"); 
	public static final ArmorMaterial CACTUS = addArmorMaterial("cactus"); 
	public static final ArmorMaterial MELON = addArmorMaterial("melon");
		
	// Collection of all this mod's armors.
	public static final List<Item> NaturalArmorList = new ArrayList<Item>();
	
	// Oak armor set
	public static final Item oak_helmet = newHelmet(OAK);
	public static final Item oak_chestplate = newChestplate(OAK);
	public static final Item oak_leggings = newLeggings(OAK);
	public static final Item oak_boots = newBoots(OAK);
	
	// Spruce armor set
	public static final Item spruce_helmet = newHelmet(SPRUCE);
	public static final Item spruce_chestplate = newChestplate(SPRUCE);
	public static final Item spruce_leggings = newLeggings(SPRUCE);
	public static final Item spruce_boots = newBoots(SPRUCE);
	
	// Birch armor set
	public static final Item birch_helmet = newHelmet(BIRCH);
	public static final Item birch_chestplate = newChestplate(BIRCH);
	public static final Item birch_leggings = newLeggings(BIRCH);
	public static final Item birch_boots = newBoots(BIRCH);
	
	// Jungle armor set
	public static final Item jungle_helmet = newHelmet(JUNGLE);
	public static final Item jungle_chestplate = newChestplate(JUNGLE);
	public static final Item jungle_leggings = newLeggings(JUNGLE);
	public static final Item jungle_boots = newBoots(JUNGLE);
	
	// Pumpkin armor set
	public static final Item pumpkin_helmet = newHelmet(PUMPKIN);
	public static final Item pumpkin_chestplate = newChestplate(PUMPKIN);
	public static final Item pumpkin_leggings = newLeggings(PUMPKIN);
	public static final Item pumpkin_boots = newBoots(PUMPKIN);
	
	// Cactus armor set
	public static final Item cactus_helmet = newHelmet(CACTUS);
	public static final Item cactus_chestplate = newChestplate(CACTUS);
	public static final Item cactus_leggings = newLeggings(CACTUS);
	public static final Item cactus_boots = newBoots(CACTUS);
	
	// Melon armor set
	public static final Item melon_helmet = newHelmet(MELON);
	public static final Item melon_chestplate = newChestplate(MELON);
	public static final Item melon_leggings = newLeggings(MELON);
	public static final Item melon_boots = newBoots(MELON);
	
	// Acacia armor set
	public static final Item acacia_helmet = newHelmet(ACACIA);
	public static final Item acacia_chestplate = newChestplate(ACACIA);
	public static final Item acacia_leggings = newLeggings(ACACIA);
	public static final Item acacia_boots = newBoots(ACACIA);
	
	// Big oak armor set
	public static final Item big_oak_helmet = newHelmet(BIG_OAK);
	public static final Item big_oak_chestplate = newChestplate(BIG_OAK);
	public static final Item big_oak_leggings = newLeggings(BIG_OAK);
	public static final Item big_oak_boots = newBoots(BIG_OAK);
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		// Add the crafting recipes for the armors.
		GameRegistry.addRecipe(new ItemStack(oak_helmet), "xxx", "x x", 'x', new ItemStack(Blocks.log, 1, 0));
		GameRegistry.addRecipe(new ItemStack(oak_chestplate), "x x", "xxx", "xxx", 'x', new ItemStack(Blocks.log, 1, 0));
		GameRegistry.addRecipe(new ItemStack(oak_leggings), "xxx", "x x", "x x", 'x', new ItemStack(Blocks.log, 1, 0));
		GameRegistry.addRecipe(new ItemStack(oak_boots), "x x", "x x", 'x', new ItemStack(Blocks.log, 1, 0));
		
		GameRegistry.addRecipe(new ItemStack(spruce_helmet), "xxx", "x x", 'x', new ItemStack(Blocks.log, 1, 1));
		GameRegistry.addRecipe(new ItemStack(spruce_chestplate), "x x", "xxx", "xxx", 'x', new ItemStack(Blocks.log, 1, 1));
		GameRegistry.addRecipe(new ItemStack(spruce_leggings), "xxx", "x x", "x x", 'x', new ItemStack(Blocks.log, 1, 1));
		GameRegistry.addRecipe(new ItemStack(spruce_boots), "x x", "x x", 'x', new ItemStack(Blocks.log, 1, 1));
		
		GameRegistry.addRecipe(new ItemStack(birch_helmet), "xxx", "x x", 'x', new ItemStack(Blocks.log, 1, 2));
		GameRegistry.addRecipe(new ItemStack(birch_chestplate), "x x", "xxx", "xxx", 'x', new ItemStack(Blocks.log, 1, 2));
		GameRegistry.addRecipe(new ItemStack(birch_leggings), "xxx", "x x", "x x", 'x', new ItemStack(Blocks.log, 1, 2));
		GameRegistry.addRecipe(new ItemStack(birch_boots), "x x", "x x", 'x', new ItemStack(Blocks.log, 1, 2));
		
		GameRegistry.addRecipe(new ItemStack(jungle_helmet), "xxx", "x x", 'x', new ItemStack(Blocks.log, 1, 3));
		GameRegistry.addRecipe(new ItemStack(jungle_chestplate), "x x", "xxx", "xxx", 'x', new ItemStack(Blocks.log, 1, 3));
		GameRegistry.addRecipe(new ItemStack(jungle_leggings), "xxx", "x x", "x x", 'x', new ItemStack(Blocks.log, 1, 3));
		GameRegistry.addRecipe(new ItemStack(jungle_boots), "x x", "x x", 'x', new ItemStack(Blocks.log, 1, 3));
		
		GameRegistry.addRecipe(new ItemStack(pumpkin_helmet), "xxx", "x x", 'x', new ItemStack(Blocks.pumpkin));
		GameRegistry.addRecipe(new ItemStack(pumpkin_chestplate), "x x", "xxx", "xxx", 'x', new ItemStack(Blocks.pumpkin));
		GameRegistry.addRecipe(new ItemStack(pumpkin_leggings), "xxx", "x x", "x x", 'x', new ItemStack(Blocks.pumpkin));
		GameRegistry.addRecipe(new ItemStack(pumpkin_boots), "x x", "x x", 'x', new ItemStack(Blocks.pumpkin));
		
		GameRegistry.addRecipe(new ItemStack(melon_helmet), "xxx", "x x", 'x', new ItemStack(Blocks.melon_block));
		GameRegistry.addRecipe(new ItemStack(melon_chestplate), "x x", "xxx", "xxx", 'x', new ItemStack(Blocks.melon_block));
		GameRegistry.addRecipe(new ItemStack(melon_leggings), "xxx", "x x", "x x", 'x', new ItemStack(Blocks.melon_block));
		GameRegistry.addRecipe(new ItemStack(melon_boots), "x x", "x x", 'x', new ItemStack(Blocks.melon_block));

		GameRegistry.addRecipe(new ItemStack(acacia_helmet), "xxx", "x x", 'x', new ItemStack(Blocks.log2, 1, 0));
		GameRegistry.addRecipe(new ItemStack(acacia_chestplate), "x x", "xxx", "xxx", 'x', new ItemStack(Blocks.log2, 1, 0));
		GameRegistry.addRecipe(new ItemStack(acacia_leggings), "xxx", "x x", "x x", 'x', new ItemStack(Blocks.log2, 1, 0));
		GameRegistry.addRecipe(new ItemStack(acacia_boots), "x x", "x x", 'x', new ItemStack(Blocks.log2, 1, 0));
		
		GameRegistry.addRecipe(new ItemStack(big_oak_helmet), "xxx", "x x", 'x', new ItemStack(Blocks.log2, 1, 1));
		GameRegistry.addRecipe(new ItemStack(big_oak_chestplate), "x x", "xxx", "xxx", 'x', new ItemStack(Blocks.log2, 1, 1));
		GameRegistry.addRecipe(new ItemStack(big_oak_leggings), "xxx", "x x", "x x", 'x', new ItemStack(Blocks.log2, 1, 1));
		GameRegistry.addRecipe(new ItemStack(big_oak_boots), "x x", "x x", 'x', new ItemStack(Blocks.log2, 1, 1));

		GameRegistry.addRecipe(new ItemStack(cactus_helmet), "xxx", "x x", 'x', new ItemStack(Blocks.cactus));
		GameRegistry.addRecipe(new ItemStack(cactus_chestplate), "x x", "xxx", "xxx", 'x', new ItemStack(Blocks.cactus));
		GameRegistry.addRecipe(new ItemStack(cactus_leggings), "xxx", "x x", "x x", 'x', new ItemStack(Blocks.cactus));
		GameRegistry.addRecipe(new ItemStack(cactus_boots), "x x", "x x", 'x', new ItemStack(Blocks.cactus));
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent e) 
	{
		// Register item renderers.
		proxy.registerItemRenderers();
	}

	/**
	 * Registers a new helmet armor.
	 *
	 * @param material
	 * @return
	 */
	private static final NaturalArmor newHelmet(ArmorMaterial material)
	{
		return newArmor(material, 0);
	}
	
	/**
	 * Registers a new chestplate armor.
	 *
	 * @param material
	 * @return
	 */
	private static final NaturalArmor newChestplate(ArmorMaterial material)
	{
		return newArmor(material, 1);
	}
	
	/**
	 * Registers a new leggings armor.
	 *
	 * @param material
	 * @return
	 */
	private static final NaturalArmor newLeggings(ArmorMaterial material)
	{
		return newArmor(material, 2);
	}
	
	/**
	 * Registers a new boots armor.
	 *
	 * @param material
	 * @return
	 */
	private static final NaturalArmor newBoots(ArmorMaterial material)
	{
		return newArmor(material, 3);
	}
	
	/**
	 * Registers a new armor.
	 *
	 * @param material
	 * @param armorType
	 * @return
	 */
	private static final NaturalArmor newArmor(ArmorMaterial material, int armorType)
	{
		String name = material.name() + "_";
		int renderIndex = 1;
		
		if (armorType == 0)
		{
			name += "helmet";
		}
		else if (armorType == 1)
		{
			name += "chestplate";
		}
		else if (armorType == 2)
		{
			name += "leggings";
			renderIndex = 2;
		}
		else
		{
			name += "boots";
		}
		
		NaturalArmor newArmor = new NaturalArmor(name, material, renderIndex, armorType);
		NaturalArmorList.add(newArmor);
		return newArmor;
	}
	
	/**
	 * Registers an armor material. Considering all armor materials have the same stats, we can
	 * use this one method for all armors.
	 *
	 * @param name
	 * @param textureName
	 * @param durability
	 * @param reductionAmounts
	 * @param enchantability
	 */
	private static final ArmorMaterial addArmorMaterial(String name)
	{
		return EnumHelper.addArmorMaterial(name, MODID + ":" + name, 5, new int[]{1, 3, 2, 1}, 15);
	}
}
