package net.partyguy.partypack.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.partyguy.partypack.ThePartyPack;

public class ModBlocks {
    public static final Block PARTIUM_BLOCK = registerBlock("partium_block", new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).strength(1.5F, 20.0F)));
    public static final Block MUTATED_AMETHYST_BLOCK = registerBlock("mutated_amethyst_block", new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ThePartyPack.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(ThePartyPack.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        ThePartyPack.LOGGER.info("Registering Mod Blocks for "+ThePartyPack.MOD_ID);
    }
}
