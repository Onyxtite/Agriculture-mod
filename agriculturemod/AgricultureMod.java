package agriculturemod;

import com.example.examplemod.ExampleMod;

import net.minecraft.block.BlockCake;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
@Mod(modid = "AgricultureMod", version = "0.01")
//DIAMONDS FOR DIRT OPI
public class AgricultureMod 
{
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";


    
    @EventHandler 
    public void PreInit(FMLPreInitializationEvent preEvent){
    	
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    GameRegistry.addSmelting(Blocks.dirt, new ItemStack(Items.diamond, 5), 0.5f);
    
    }
    
    @EventHandler
    public void PostInit(FMLPostInitializationEvent postEvent){
    	
    }
}

