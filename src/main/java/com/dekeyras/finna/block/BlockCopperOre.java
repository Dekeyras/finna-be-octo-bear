package com.dekeyras.finna.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Keith on 09/07/2014.
 */
public class BlockCopperOre extends BlockF {
    public BlockCopperOre() {
        super(Material.rock);

        this.setBlockName("copperOre");
        this.setHardness(3.0f);
        this.setResistance(15.0f);
        this.setStepSound(Block.soundTypeStone);
        this.setHarvestLevel("pickaxe", 2);
    }


    @Override
    public Item getItemDropped(int p1, Random random, int p2) {
        return Item.getItemFromBlock(this);
    }

    @Override
    public int quantityDropped(Random random) {
        return 1;
    }
}
