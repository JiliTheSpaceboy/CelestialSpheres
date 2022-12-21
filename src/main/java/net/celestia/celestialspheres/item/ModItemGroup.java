package net.celestia.celestialspheres.item;

import net.celestia.celestialspheres.CelestialSpheres;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup CELESTIA_MOON = FabricItemGroup.builder(
        new Identifier(CelestialSpheres.MOD_ID, "celestia-moon"))
        .icon(() -> new ItemStack(ModItems.TELESCOPE))
        .build();
    public static final ItemGroup CELESTIA_MISC = FabricItemGroup.builder(
        new Identifier(CelestialSpheres.MOD_ID, "celestia-misc"))
        .icon(() -> new ItemStack(ModItems.TELESCOPE))
        .build();
}
