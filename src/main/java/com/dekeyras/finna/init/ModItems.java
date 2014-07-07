package com.dekeyras.finna.init;

import com.dekeyras.finna.item.ItemChalk;
import com.dekeyras.finna.item.ItemF;
import com.dekeyras.finna.item.ItemMapleLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Keith on 07/07/2014.
 */
public class ModItems {
    public static final ItemF mapleLeaf = new ItemMapleLeaf();
    public static final ItemF chalk = new ItemChalk();

    public static void Init() {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
        GameRegistry.registerItem(chalk, "chalk");
    }
}
