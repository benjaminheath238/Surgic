package com.bjmh.surgic.blocks;

import com.bjmh.surgic.Surgic;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;

public class BaseBlock extends Block {

    private String id;
    private FabricItemSettings itemSettings;

    public BaseBlock(FabricBlockSettings blockSettings, FabricItemSettings itemSettings, String id) {
        super(blockSettings);
        this.id = id;
        this.itemSettings = itemSettings;
        ModBlocks.BLOCKS.add(this);
    }

    public String getID() {
        return id;
    }

    public Identifier getIdentifier() {
        return new Identifier(Surgic.MODID, id);
    }

    public FabricItemSettings getItemSettings() {
        return itemSettings;
    }
    
}
