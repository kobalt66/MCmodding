package kobalt66.mod.objects.items;

import kobalt66.mod.Main;
import kobalt66.mod.init.ItemInit;
import kobalt66.mod.util.IHasModel;
import kobalt66.mod.util.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	
	public ItemBase(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		//Main.proxy.registerItemRenderer(this, 0, "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(this, 0,new ModelResourceLocation(Reference.MODID+"Crystal", "inventory"));
	}
}
