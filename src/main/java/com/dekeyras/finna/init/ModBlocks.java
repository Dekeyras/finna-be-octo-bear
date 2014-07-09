package com.dekeyras.finna.init;

import com.dekeyras.finna.block.BlockF;
import com.dekeyras.finna.block.BlockFlag;
import com.dekeyras.finna.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Keith on 07/07/2014.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    public static BlockF flagBlock = new BlockFlag();

    public static void Init() {
        GameRegistry.registerBlock(flagBlock, "flag");
    }
}
