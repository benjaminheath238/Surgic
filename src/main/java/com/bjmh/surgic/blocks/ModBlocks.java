package com.bjmh.surgic.blocks;

import java.util.ArrayList;
import java.util.List;

import com.bjmh.surgic.gui.ItemGroups;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;

public class ModBlocks {
    public static final List<BaseBlock> BLOCKS = new ArrayList<>();

    private static final FabricBlockSettings DEFAULT_BLOCK_SETTINGS = FabricBlockSettings.of(Material.STONE).strength(2.5F, 10F).requiresTool().luminance(0);
    private static final FabricItemSettings DEFAULT_ITEM_SETTINGS = new FabricItemSettings().group(ItemGroups.SURGIC_TAB_GENERAL);

    public static final BaseBlock TEST = new BaseBlock(DEFAULT_BLOCK_SETTINGS, DEFAULT_ITEM_SETTINGS, "test");
}
