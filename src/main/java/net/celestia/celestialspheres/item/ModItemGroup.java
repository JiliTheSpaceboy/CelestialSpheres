package net.celestia.celestialspheres.item;

import net.celestia.celestialspheres.CelestialSpheres;
import net.celestia.celestialspheres.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup CELESTIA_MISC_BLOCKS = FabricItemGroup.builder(
        new Identifier(CelestialSpheres.MOD_ID, "celestia-misc-blocks"))
        .icon(() -> new ItemStack(ModBlocks.ANORTHOSITE))
        .build();
    public static final ItemGroup CELESTIA_MISC_ITEMS = FabricItemGroup.builder(
        new Identifier(CelestialSpheres.MOD_ID, "celestia-misc-items"))
        .icon(() -> new ItemStack(ModItems.PERIDOT))
        .build();
    public static final ItemGroup CELESTIA_MOON_BLOCKS = FabricItemGroup.builder(
        new Identifier(CelestialSpheres.MOD_ID, "celestia-moon-blocks"))
        .icon(() -> new ItemStack(ModBlocks.LIGHT_LUNAR_REGOLITH))
        .build();
    public static final ItemGroup CELESTIA_MOON_ITEMS = FabricItemGroup.builder(
        new Identifier(CelestialSpheres.MOD_ID, "celestia-moon-items"))
        .icon(() -> new ItemStack(ModItems.MOCHI))
        .build();
    public static final ItemGroup CELESTIA_MARS_BLOCKS = FabricItemGroup.builder(
        new Identifier(CelestialSpheres.MOD_ID, "celestia-mars-blocks"))
        .icon(() -> new ItemStack(Blocks.RED_SAND))
        .build();
    public static final ItemGroup CELESTIA_MARS_ITEMS = FabricItemGroup.builder(
        new Identifier(CelestialSpheres.MOD_ID, "celestia-mars-items"))
        .icon(() -> new ItemStack(ModItems.DRY_ICE_SNOWBALL))
        .build();
}
