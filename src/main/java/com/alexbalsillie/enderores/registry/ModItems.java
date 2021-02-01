package com.alexbalsillie.enderores.registry;

import com.alexbalsillie.enderores.Enderores;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    //block items
    public static final BlockItem END_COAL_ORE = new BlockItem(ModBlocks.END_COAL_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem END_IRON_ORE = new BlockItem(ModBlocks.END_IRON_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem END_GOLD_ORE = new BlockItem(ModBlocks.END_GOLD_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem END_LAPIS_ORE = new BlockItem(ModBlocks.END_LAPIS_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem END_DIAMOND_ORE = new BlockItem(ModBlocks.END_DIAMOND_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem END_EMERALD_ORE = new BlockItem(ModBlocks.END_EMERALD_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem END_REDSTONE_ORE = new BlockItem(ModBlocks.END_REDSTONE_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Enderores.MOD_ID, "end_coal_ore"), END_COAL_ORE);
        Registry.register(Registry.ITEM, new Identifier(Enderores.MOD_ID, "end_iron_ore"), END_IRON_ORE);
        Registry.register(Registry.ITEM, new Identifier(Enderores.MOD_ID, "end_gold_ore"), END_GOLD_ORE);
        Registry.register(Registry.ITEM, new Identifier(Enderores.MOD_ID, "end_lapis_ore"), END_LAPIS_ORE);
        Registry.register(Registry.ITEM, new Identifier(Enderores.MOD_ID, "end_diamond_ore"), END_DIAMOND_ORE);
        Registry.register(Registry.ITEM, new Identifier(Enderores.MOD_ID, "end_emerald_ore"), END_EMERALD_ORE);
        Registry.register(Registry.ITEM, new Identifier(Enderores.MOD_ID, "end_redstone_ore"), END_REDSTONE_ORE);
    }
}
