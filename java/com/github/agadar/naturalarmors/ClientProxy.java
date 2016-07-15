package com.github.agadar.naturalarmors;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

/** The proxy that is used client-side. */
public class ClientProxy extends CommonProxy 
{
	@Override
	public void registerItemRenderers()
	{
		// Register all armors' renderers
		ItemModelMesher itemModelMesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
		
		for (Item item : NaturalArmors.NaturalArmorList)
		{
			itemModelMesher.register(item, 0, new ModelResourceLocation(NaturalArmors.MODID + ":" 
					+ item.getUnlocalizedName().substring(5), "inventory"));
		}
	}
}
