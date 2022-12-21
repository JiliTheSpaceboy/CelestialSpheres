package net.celestia.celestialspheres.block;

import net.celestia.celestialspheres.CelestialSpheres;
import net.celestia.celestialspheres.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.GravelBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block ANORTHOSITE = registerBlock("anorthosite",
        new Block(FabricBlockSettings.of(Material.STONE, MapColor.STONE_GRAY).hardness(1.5f).resistance((6.0f)).requiresTool()),
        ModItemGroup.CELESTIA_GENERIC_BLOCKS);
    public static final Block POLISHED_ANORTHOSITE = registerBlock("polished_anorthosite",
        new Block(FabricBlockSettings.of(Material.STONE, MapColor.STONE_GRAY).hardness(1.5f).resistance((6.0f)).requiresTool()),
        ModItemGroup.CELESTIA_GENERIC_BLOCKS);
    public static final Block POLISHED_ANORTHOSITE_BRICKS = registerBlock("polished_anorthosite_bricks",
        new Block(FabricBlockSettings.of(Material.STONE, MapColor.STONE_GRAY).hardness(1.5f).resistance((6.0f)).requiresTool()),
        ModItemGroup.CELESTIA_GENERIC_BLOCKS);
        
    public static final Block ANORTHOSITE_IRON_ORE = registerBlock("anorthosite_iron_ore",
        new Block(FabricBlockSettings.of(Material.STONE, MapColor.STONE_GRAY).strength(3.0f).requiresTool()),
        ModItemGroup.CELESTIA_GENERIC_BLOCKS);

    public static final Block DARK_LUNAR_REGOLITH = registerBlock("dark_lunar_regolith",
        new GravelBlock(FabricBlockSettings.of(Material.AGGREGATE, MapColor.GRAY).sounds(BlockSoundGroup.GRAVEL).strength(0.6f)),
        ModItemGroup.CELESTIA_MOON);
    public static final Block LIGHT_LUNAR_REGOLITH = registerBlock("light_lunar_regolith",
        new GravelBlock(FabricBlockSettings.of(Material.AGGREGATE, MapColor.LIGHT_GRAY).sounds(BlockSoundGroup.GRAVEL).strength(0.6f)),
        ModItemGroup.CELESTIA_MOON);

    public static final Block DARK_LUNAR_BRECCIA = registerBlock("dark_lunar_breccia",
        new Block(FabricBlockSettings.of(Material.STONE, MapColor.GRAY).sounds(BlockSoundGroup.BASALT).strength(0.8f).requiresTool()),
        ModItemGroup.CELESTIA_MOON);
    public static final Block LIGHT_LUNAR_BRECCIA = registerBlock("light_lunar_breccia",
        new Block(FabricBlockSettings.of(Material.STONE, MapColor.LIGHT_GRAY).sounds(BlockSoundGroup.BASALT).strength(0.8f).requiresTool()),
        ModItemGroup.CELESTIA_MOON);

    public static final Block DARK_LUNARCRETE = registerBlock("dark_lunarcrete",
        new Block(FabricBlockSettings.of(Material.STONE, MapColor.GRAY).strength(1.8f).requiresTool()),
        ModItemGroup.CELESTIA_MOON);
    public static final Block LIGHT_LUNARCRETE = registerBlock("light_lunarcrete",
        new Block(FabricBlockSettings.of(Material.STONE, MapColor.LIGHT_GRAY).strength(1.8f).requiresTool()),
        ModItemGroup.CELESTIA_MOON);

    public static final Block DARK_LUNARCRETE_BRICKS = registerBlock("dark_lunarcrete_bricks",
        new Block(FabricBlockSettings.of(Material.STONE, MapColor.GRAY).strength(1.8f).requiresTool()),
        ModItemGroup.CELESTIA_MOON);
    public static final Block LIGHT_LUNARCRETE_BRICKS = registerBlock("light_lunarcrete_bricks",
        new Block(FabricBlockSettings.of(Material.STONE, MapColor.LIGHT_GRAY).strength(1.8f).requiresTool()),
        ModItemGroup.CELESTIA_MOON);

    public static final Block POLISHED_DARK_LUNARCRETE = registerBlock("polished_dark_lunarcrete",
        new Block(FabricBlockSettings.of(Material.STONE, MapColor.GRAY).strength(1.8f).requiresTool()),
        ModItemGroup.CELESTIA_MOON);
    public static final Block POLISHED_LIGHT_LUNARCRETE = registerBlock("polished_light_lunarcrete",
        new Block(FabricBlockSettings.of(Material.STONE, MapColor.LIGHT_GRAY).strength(1.8f).requiresTool()),
        ModItemGroup.CELESTIA_MOON);

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
