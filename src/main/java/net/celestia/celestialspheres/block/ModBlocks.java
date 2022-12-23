package net.celestia.celestialspheres.block;

import net.celestia.celestialspheres.CelestialSpheres;
import net.celestia.celestialspheres.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.GravelBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block ANORTHOSITE = registerBlock("anorthosite", new Block(FabricBlockSettings.of(Material.STONE, MapColor.LIGHT_GRAY).hardness(1.5f).resistance(6.0f).requiresTool()), ModItemGroup.CELESTIA_MISC_BLOCKS);
    public static final Block ANORTHOSITE_SLAB = registerBlock("anorthosite_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE, MapColor.LIGHT_GRAY).hardness(2.0f).resistance(6.0f).requiresTool()), ModItemGroup.CELESTIA_MISC_BLOCKS);
    public static final Block ANORTHOSITE_STAIRS = registerBlock("anorthosite_stairs", new StairsBlock(ANORTHOSITE.getDefaultState(), FabricBlockSettings.copyOf(ANORTHOSITE)), ModItemGroup.CELESTIA_MISC_BLOCKS);
    public static final Block POLISHED_ANORTHOSITE = registerBlock("polished_anorthosite", new Block(FabricBlockSettings.of(Material.STONE, MapColor.LIGHT_GRAY).hardness(1.5f).resistance(6.0f).requiresTool()), ModItemGroup.CELESTIA_MISC_BLOCKS);
    public static final Block POLISHED_ANORTHOSITE_BRICKS = registerBlock("polished_anorthosite_bricks", new Block(FabricBlockSettings.of(Material.STONE, MapColor.LIGHT_GRAY).hardness(1.5f).resistance(6.0f).requiresTool()), ModItemGroup.CELESTIA_MISC_BLOCKS);   
    public static final Block ANORTHOSITE_IRON_ORE = registerBlock("anorthosite_iron_ore", new Block(FabricBlockSettings.of(Material.STONE, MapColor.LIGHT_GRAY).strength(3.0f).requiresTool()), ModItemGroup.CELESTIA_MISC_BLOCKS);
    public static final Block ANORTHOSITE_PERIDOT_ORE = registerBlock("anorthosite_peridot_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE, MapColor.LIGHT_GRAY).strength(3.0f).requiresTool(), UniformIntProvider.create(2, 5)), ModItemGroup.CELESTIA_MISC_BLOCKS);
    public static final Block ILMENITE = registerBlock("ilmenite", new Block(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_GRAY).hardness(1.5f).resistance(6.0f).requiresTool()), ModItemGroup.CELESTIA_MISC_BLOCKS);
    public static final Block DUNITE = registerBlock("dunite", new Block(FabricBlockSettings.of(Material.STONE, MapColor.GREEN).hardness(1.5f).resistance(6.0f).requiresTool()), ModItemGroup.CELESTIA_MISC_BLOCKS);
    public static final Block POLISHED_DUNITE = registerBlock("polished_dunite", new Block(FabricBlockSettings.of(Material.STONE, MapColor.GREEN).hardness(1.5f).resistance(6.0f).requiresTool()), ModItemGroup.CELESTIA_MISC_BLOCKS);
    public static final Block PERIDOT_BLOCK = registerBlock("peridot_block", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.METAL, MapColor.EMERALD_GREEN).hardness(5.0f).resistance(6.0f).sounds(BlockSoundGroup.METAL).requiresTool()), ModItemGroup.CELESTIA_MISC_BLOCKS);
    public static final Block DARK_LUNAR_REGOLITH = registerBlock("dark_lunar_regolith", new GravelBlock(FabricBlockSettings.of(Material.AGGREGATE, MapColor.GRAY).sounds(BlockSoundGroup.GRAVEL).strength(0.6f)), ModItemGroup.CELESTIA_MOON_BLOCKS);
    public static final Block LIGHT_LUNAR_REGOLITH = registerBlock("light_lunar_regolith", new GravelBlock(FabricBlockSettings.of(Material.AGGREGATE, MapColor.STONE_GRAY).sounds(BlockSoundGroup.GRAVEL).strength(0.6f)), ModItemGroup.CELESTIA_MOON_BLOCKS);
    public static final Block DARK_LUNAR_BRECCIA = registerBlock("dark_lunar_breccia", new Block(FabricBlockSettings.of(Material.STONE, MapColor.GRAY).sounds(BlockSoundGroup.BASALT).strength(0.8f).requiresTool()), ModItemGroup.CELESTIA_MOON_BLOCKS);
    public static final Block LIGHT_LUNAR_BRECCIA = registerBlock("light_lunar_breccia", new Block(FabricBlockSettings.of(Material.STONE, MapColor.STONE_GRAY).sounds(BlockSoundGroup.BASALT).strength(0.8f).requiresTool()), ModItemGroup.CELESTIA_MOON_BLOCKS);
    public static final Block DARK_LUNARCRETE = registerBlock("dark_lunarcrete", new Block(FabricBlockSettings.of(Material.STONE, MapColor.GRAY).strength(1.8f).requiresTool()), ModItemGroup.CELESTIA_MOON_BLOCKS);
    public static final Block LIGHT_LUNARCRETE = registerBlock("light_lunarcrete", new Block(FabricBlockSettings.of(Material.STONE, MapColor.STONE_GRAY).strength(1.8f).requiresTool()), ModItemGroup.CELESTIA_MOON_BLOCKS);
    public static final Block DARK_LUNARCRETE_BRICKS = registerBlock("dark_lunarcrete_bricks", new Block(FabricBlockSettings.of(Material.STONE, MapColor.GRAY).strength(1.8f).requiresTool()), ModItemGroup.CELESTIA_MOON_BLOCKS);
    public static final Block LIGHT_LUNARCRETE_BRICKS = registerBlock("light_lunarcrete_bricks", new Block(FabricBlockSettings.of(Material.STONE, MapColor.STONE_GRAY).strength(1.8f).requiresTool()), ModItemGroup.CELESTIA_MOON_BLOCKS);
    public static final Block POLISHED_DARK_LUNARCRETE = registerBlock("polished_dark_lunarcrete", new Block(FabricBlockSettings.of(Material.STONE, MapColor.GRAY).strength(1.8f).requiresTool()), ModItemGroup.CELESTIA_MOON_BLOCKS);
    public static final Block POLISHED_LIGHT_LUNARCRETE = registerBlock("polished_light_lunarcrete", new Block(FabricBlockSettings.of(Material.STONE, MapColor.STONE_GRAY).strength(1.8f).requiresTool()), ModItemGroup.CELESTIA_MOON_BLOCKS);
    public static final Block CHEESE_BLOCK = registerBlock("cheese_block", new Block(FabricBlockSettings.of(Material.SOLID_ORGANIC, MapColor.PALE_YELLOW).sounds(BlockSoundGroup.WART_BLOCK).strength(0.5f)), ModItemGroup.CELESTIA_MOON_BLOCKS);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(CelestialSpheres.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(Entries -> Entries.add(block));
        return Registry.register(Registries.ITEM, new Identifier(CelestialSpheres.MOD_ID, name),
        new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        CelestialSpheres.LOGGER.debug("Registering Mod Blocks for " + CelestialSpheres.MOD_ID);
    }
}
