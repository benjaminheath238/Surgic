package com.bjmh.surgic.gui;

import com.bjmh.surgic.Surgic;
import com.bjmh.surgic.blocks.ModBlocks;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ItemGroups {
    public static final ItemGroup SURGIC_TAB_GENERAL = FabricItemGroupBuilder.build(new Identifier(Surgic.MODID, "surgic_tab_general"), () -> new ItemStack(ModBlocks.TEST));
}
