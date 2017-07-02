package techreborn.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import techreborn.init.ModBlocks;

public class BlockFusionCoil extends Block {



    @SideOnly(Side.CLIENT)
    private IIcon iconFront;

    @SideOnly(Side.CLIENT)
    private IIcon iconTop;

    @SideOnly(Side.CLIENT)
    private IIcon iconBottom;

    public BlockFusionCoil(Material material) {
        super(material);
        setBlockName("techreborn.fusioncoil");
        setHardness(2.0F);
        ModBlocks.blocksToCut.add(this);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister icon) {
        this.blockIcon = icon.registerIcon("techreborn:machine/fusion_coil");
        this.iconFront = icon.registerIcon("techreborn:machine/fusion_coil");
        this.iconTop = icon.registerIcon("techreborn:machine/fusion_coil");
        this.iconBottom = icon.registerIcon("techreborn:machine/fusion_coil");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(IBlockAccess blockAccess, int x, int y, int z, int side) {
        return blockIcon;
    }

}
