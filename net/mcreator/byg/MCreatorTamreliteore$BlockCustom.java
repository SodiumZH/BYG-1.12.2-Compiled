package net.mcreator.byg;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class MCreatorTamreliteore$BlockCustom extends Block {
	public MCreatorTamreliteore$BlockCustom() {
		super(Material.field_151576_e);
		this.setRegistryName("tamreliteore");
		this.func_149663_c("tamreliteore");
		this.func_149672_a(SoundType.field_185851_d);
		this.setHarvestLevel("pickaxe", 3);
		this.func_149711_c(3.0F);
		this.func_149752_b(15.0F);
		this.func_149715_a(0.0F);
		this.func_149713_g(255);
		this.func_149647_a(MCreatorBYG.tab);
	}

	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state,
			int fortune) {
		// Copied from vanilla minecraft ore
		
		int bonus = 0;
		int amount = 0;
		
		  if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped((IBlockState)this.getBlockState().getValidStates().iterator().next(), random, fortune))
	        {
	            bonus = random.nextInt(fortune + 2) - 1;

	            if (bonus < 0)
	            {
	                bonus = 0;
	            }

	            amount = bonus + 1;
	        }
	        else
	        {
	            amount = 1;
	        }
		
		drops.add(new ItemStack(MCreatorTamrelitegem.block, amount));
	}
}