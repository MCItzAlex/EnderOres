package com.alexbalsillie.enderores;

import com.alexbalsillie.enderores.registry.ModBlocks;
import com.alexbalsillie.enderores.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class Enderores implements ModInitializer {

    private static ConfiguredFeature<?, ?> END_EMERALD_ORE = Feature.ORE
            .configure(new OreFeatureConfig(
                    new BlockMatchRuleTest(Blocks.END_STONE), // base block is endstone in the end biomes
                    ModBlocks.END_EMERALD_ORE.getDefaultState(),
                    1))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    64)))
            .spreadHorizontally()
            .repeat(11);

    private static ConfiguredFeature<?, ?> END_DIAMOND_ORE = Feature.ORE
            .configure(new OreFeatureConfig(
                    new BlockMatchRuleTest(Blocks.END_STONE), // base block is endstone in the end biomes
                    ModBlocks.END_DIAMOND_ORE.getDefaultState(),
                    10))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    64)))
            .spreadHorizontally()
            .repeat(1);

    private static ConfiguredFeature<?, ?> END_LAPIS_ORE = Feature.ORE
            .configure(new OreFeatureConfig(
                    new BlockMatchRuleTest(Blocks.END_STONE), // base block is endstone in the end biomes
                    ModBlocks.END_LAPIS_ORE.getDefaultState(),
                    8))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    64)))
            .spreadHorizontally()
            .repeat(4);

    private static ConfiguredFeature<?, ?> END_GOLD_ORE = Feature.ORE
            .configure(new OreFeatureConfig(
                    new BlockMatchRuleTest(Blocks.END_STONE), // base block is endstone in the end biomes
                    ModBlocks.END_GOLD_ORE.getDefaultState(),
                    9))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    64)))
            .spreadHorizontally()
            .repeat(2);

    private static ConfiguredFeature<?, ?> END_REDSTONE_ORE = Feature.ORE
            .configure(new OreFeatureConfig(
                    new BlockMatchRuleTest(Blocks.END_STONE), // base block is endstone in the end biomes
                    ModBlocks.END_REDSTONE_ORE.getDefaultState(),
                    8))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    64)))
            .spreadHorizontally()
            .repeat(8);

    private static ConfiguredFeature<?, ?> END_IRON_ORE = Feature.ORE
            .configure(new OreFeatureConfig(
                    new BlockMatchRuleTest(Blocks.END_STONE), // base block is endstone in the end biomes
                    ModBlocks.END_IRON_ORE.getDefaultState(),
                    14))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    64)))
            .spreadHorizontally()
            .repeat(20);

    private static ConfiguredFeature<?, ?> END_COAL_ORE = Feature.ORE
            .configure(new OreFeatureConfig(
                    new BlockMatchRuleTest(Blocks.END_STONE), // base block is endstone in the end biomes
                    ModBlocks.END_COAL_ORE.getDefaultState(),
                    17))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    64)))
            .spreadHorizontally()
            .repeat(20);




    public static final String MOD_ID = "enderores";

    @Override
    public void  onInitialize() {
        ModBlocks.registerBlocks();
        ModItems.registerItems();
        RegistryKey<ConfiguredFeature<?, ?>> endEmeraldOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("enderoresl", "end_emerald_ore"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, endEmeraldOre.getValue(), END_EMERALD_ORE);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, endEmeraldOre);

        RegistryKey<ConfiguredFeature<?, ?>> endDiamondOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("enderores", "end_diamond_ore"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, endDiamondOre.getValue(), END_DIAMOND_ORE);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, endDiamondOre);

        RegistryKey<ConfiguredFeature<?, ?>> endLapisOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("enderores", "end_lapis_ore"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, endLapisOre.getValue(), END_LAPIS_ORE);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, endLapisOre);

        RegistryKey<ConfiguredFeature<?, ?>> endGoldOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("enderores", "end_gold_ore"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, endGoldOre.getValue(), END_GOLD_ORE);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, endGoldOre);

        RegistryKey<ConfiguredFeature<?, ?>> endRedstoneOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("enderores", "end_redstone_ore"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, endRedstoneOre.getValue(), END_REDSTONE_ORE);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, endRedstoneOre);

        RegistryKey<ConfiguredFeature<?, ?>> endIronOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("enderores", "end_iron_ore"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, endIronOre.getValue(), END_IRON_ORE);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, endIronOre);

        RegistryKey<ConfiguredFeature<?, ?>> endCoalOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("enderores", "end_coal_ore"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, endCoalOre.getValue(), END_COAL_ORE);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, endCoalOre);



    }



}