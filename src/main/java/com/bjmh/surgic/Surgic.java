package com.bjmh.surgic;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.BlockItem;
import net.minecraft.util.registry.Registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bjmh.surgic.blocks.BaseBlock;
import com.bjmh.surgic.blocks.ModBlocks;

public class Surgic implements ModInitializer {
	public static final String MODID = "surgic";
	public static final Logger LOGGER = LoggerFactory.getLogger("surgic");

	@Override
	public void onInitialize() {
		LOGGER.info("Registering Blocks Starting.");
		for (BaseBlock block : ModBlocks.BLOCKS) {
			Registry.register(Registry.BLOCK, block.getIdentifier(), block);
			Registry.register(Registry.ITEM, block.getIdentifier(), new BlockItem(block, block.getItemSettings()));
		}
		LOGGER.info("Registering Blocks Complete.");
	}
}
