package com.pwn9.PwnPlantGrowth;

import org.bukkit.Material;
import org.bukkit.block.Block;

public class EvaporateWaterTask implements Runnable 
{
	private Block block;
	
	public EvaporateWaterTask(Block block) 
	{
		this.block = block;
	}
	
	@Override
	public void run()
	{
		if(this.block.getType() == Material.STATIONARY_WATER)
		{
			// setData is now deprecated, try setType instead.
			//this.block.setData((byte)1);
			this.block.setType(Material.AIR);
		}
	}	
}
