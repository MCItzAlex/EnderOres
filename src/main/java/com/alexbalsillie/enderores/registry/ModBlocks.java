package com.alexbalsillie.enderores.registry;

import com.alexbalsillie.enderores.Enderores;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block END_COAL_ORE = new Block(FabricBlockSettings.of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(5.0f,45.0f)
            .sounds(BlockSoundGroup.STONE));

    public static final Block END_IRON_ORE = new Block(FabricBlockSettings.of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(5.0f,45.0f)
            .sounds(BlockSoundGroup.STONE));

    public static final Block END_GOLD_ORE = new Block(FabricBlockSettings.of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(5.0f,45.0f)
            .sounds(BlockSoundGroup.STONE));

    public static final Block END_LAPIS_ORE = new Block(FabricBlockSettings.of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(5.0f,45.0f)
            .sounds(BlockSoundGroup.STONE));

    public static final Block END_DIAMOND_ORE = new Block(FabricBlockSettings.of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(5.0f,45.0f)
            .sounds(BlockSoundGroup.STONE));

    public static final Block END_EMERALD_ORE = new Block(FabricBlockSettings.of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(5.0f,45.0f)
            .sounds(BlockSoundGroup.STONE));

    public static final Block END_REDSTONE_ORE = new Block(FabricBlockSettings.of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(5.0f,45.0f)
            .sounds(BlockSoundGroup.STONE));

    public static void registerBlocks() {

        Registry.register(Registry.BLOCK, new Identifier(Enderores.MOD_ID, "end_coal_ore"), END_COAL_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Enderores.MOD_ID, "end_iron_ore"), END_IRON_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Enderores.MOD_ID, "end_gold_ore"), END_GOLD_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Enderores.MOD_ID, "end_lapis_ore"), END_LAPIS_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Enderores.MOD_ID, "end_diamond_ore"), END_DIAMOND_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Enderores.MOD_ID, "end_emerald_ore"), END_EMERALD_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Enderores.MOD_ID, "end_redstone_ore"), END_REDSTONE_ORE);

    }
}
