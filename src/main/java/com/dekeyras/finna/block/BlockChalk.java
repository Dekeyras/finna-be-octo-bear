package com.dekeyras.finna.block;

import com.dekeyras.finna.init.ModItems;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Keith on 07/07/2014.
 */
public class BlockChalk extends BlockFallingF {
    public BlockChalk() {
        super();

        this.setBlockName("chalk");
        this.setHardness(0.2f);
        this.setStepSound(soundTypeStone);
    }

    @Override
    public Item getItemDropped(int p1, Random random, int p2) {
        return ModItems.chalk;
    }

    @Override
    public int quantityDropped(Random random) {
        return random.nextInt(4) + 1;
    }
}
