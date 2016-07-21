package com.Meelock.BtS.blocks;

import com.Meelock.BtS.BtSReference;

import net.minecraft.block.BlockFence;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockElectric_fence extends BlockFence {

	public BlockElectric_fence(Material mat, MapColor map, BtSReference.BtSBlocks blocktype) {
		super(mat, map);
		this.setDefaultState(this.blockState.getBaseState().withProperty(NORTH, Boolean.valueOf(false))
				.withProperty(EAST, Boolean.valueOf(false)).withProperty(SOUTH, Boolean.valueOf(false))
				.withProperty(WEST, Boolean.valueOf(false)));
		this.setCreativeTab(CreativeTabs.DECORATIONS);

		setUnlocalizedName(blocktype.getUnlocalizedName());
		setRegistryName(blocktype.getRegistryName());
	}

}