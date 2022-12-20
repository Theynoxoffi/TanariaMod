package theynox.mod.objects.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import theynox.mod.Main;
import theynox.mod.init.ItemInit;
import theynox.mod.proxy.ClientProxy;
import theynox.mod.util.IHasModel;

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
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
