package net.celestia.celestialspheres.block;

import net.celestia.celestialspheres.CelestialSpheres;
import net.celestia.celestialspheres.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block DARK_LUNAR_REGOLITH = registerBlock("dark_lunar_regolith",
        new Block(FabricBlockSettings.of(Material.SOIL).strength(0.6f)),
        ModItemGroup.CELESTIA_MOON);
    public static final Block LIGHT_LUNAR_REGOLITH = registerBlock("light_lunar_regolith",
        new Block(FabricBlockSettings.of(Material.SOIL).strength(0.6f)),
        ModItemGroup.CELESTIA_MOON);
    public static final Block DARK_LUNAR_BRECCIA = registerBlock("dark_lunar_breccia",
        new Block(FabricBlockSettings.of(Material.STONE).strength(0.8f).requiresTool()),
        ModItemGroup.CELESTIA_MOON);
    public static final Block LIGHT_LUNAR_BRECCIA = registerBlock("light_lunar_breccia",
        new Block(FabricBlockSettings.of(Material.STONE).strength(0.8f).requiresTool()),
        ModItemGroup.CELESTIA_MOON);
    public static final Block ANORTHOSITE = registerBlock("anorthosite",
        new Block(FabricBlockSettings.of(Material.STONE).hardness(1.5f).resistance((6.0f)).requiresTool()),
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
