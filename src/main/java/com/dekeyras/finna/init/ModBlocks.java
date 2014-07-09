package com.dekeyras.finna.init;

import com.dekeyras.finna.block.BlockChalk;
import com.dekeyras.finna.block.BlockF;
import com.dekeyras.finna.block.BlockFallingF;
import com.dekeyras.finna.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Keith on 07/07/2014.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    public static BlockFallingF chalkBlock = new BlockChalk();

    public static void Init() {
        GameRegistry.registerBlock(chalkBlock, "chalkBlock");
    }
}
