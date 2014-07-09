package com.dekeyras.finna.recipe;

import com.dekeyras.finna.init.ModBlocks;
import com.dekeyras.finna.init.ModItems;
import com.dekeyras.finna.utility.Logger;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

/**
 * Created by Keith on 07/07/2014.
 */
public class ModRecipes {
    public static void Init() {
        ItemStack chalkItem = new ItemStack(ModItems.chalk);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.chalkBlock, 2), "xx", "xx", 'x', chalkItem);
    }
}
