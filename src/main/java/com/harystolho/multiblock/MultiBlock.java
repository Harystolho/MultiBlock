package com.harystolho.multiblock;

import com.harystolho.multiblock.common.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MultiBlock.MULTIBLOCK_ID, version = "0.0.1")
public class MultiBlock {

	public static final String MULTIBLOCK_ID = "multiblock";

	@SidedProxy(clientSide = "com.harystolho.multiblock.client.ClientProxy", serverSide = "com.harystolho.multiblock.common.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		proxy.preInit();

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

	}

}
