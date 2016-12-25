package com.rdsguild.extrathings;

import com.rdsguild.extrathings.etproxies.CommonProxy;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = Ref.MODID, version = Ref.VERSION, name = Ref.NAME, useMetadata = true)
public class ExtraThings
{
    @SidedProxy(clientSide = Ref.CLIENT_PROXY, serverSide = Ref.COMMON_PROXY)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }


    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }

}
