package net.celestia.celestialspheres.item;

import net.celestia.celestialspheres.CelestialSpheres;
import net.celestia.celestialspheres.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup CELESTIA_GENERIC_BLOCKS = FabricItemGroup.builder(
        new Identifier(CelestialSpheres.MOD_ID, "celestia-generic-blocks"))
        .icon(() -> new ItemStack(ModBlocks.ANORTHOSITE))
        .build();
    public static final ItemGroup CELESTIA_MOON = FabricItemGroup.builder(
        new Identifier(CelestialSpheres.MOD_ID, "celestia-moon"))
        .icon(() -> new ItemStack(ModBlocks.LIGHT_LUNAR_REGOLITH))
        .build();
    public static final ItemGroup CELESTIA_MISC = FabricItemGroup.builder(
        new Identifier(CelestialSpheres.MOD_ID, "celestia-misc"))
        .icon(() -> new ItemStack(ModItems.TELESCOPE))
        .build();
}
