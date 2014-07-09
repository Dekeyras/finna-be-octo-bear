package com.dekeyras.finna.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by Keith on 09/07/2014.
 */
public class BlockFlag extends BlockF {
    public BlockFlag() {
        super(Material.cloth);
        this.setBlockName("flag");
        this.setStepSound(Block.soundTypeCloth);
    }
}
