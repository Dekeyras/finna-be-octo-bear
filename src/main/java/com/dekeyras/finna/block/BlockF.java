package com.dekeyras.finna.block;

import com.dekeyras.finna.reference.Reference;
import com.dekeyras.finna.utility.Logger;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Created by Keith on 07/07/2014.
 */
public class BlockF extends Block {

    public BlockF() {
        super(Material.rock);
    }

    public BlockF(Material material) {
        super(material);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s:%s", Reference.MOD_ID.toLowerCase(), getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon(getUnwrappedUnlocalizedName(this.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
