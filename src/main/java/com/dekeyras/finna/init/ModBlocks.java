package com.dekeyras.finna.init;

import com.dekeyras.finna.block.BlockChalk;
import com.dekeyras.finna.block.BlockF;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Keith on 07/07/2014.
 */
public class ModBlocks {

    public static BlockF chalkBlock = new BlockChalk();

    public static void Init() {
        GameRegistry.registerBlock(chalkBlock, "chalkBlock");
    }
}
