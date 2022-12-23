package net.celestia.celestialspheres.fluid;

import net.celestia.celestialspheres.CelestialSpheres;
import net.celestia.celestialspheres.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.FluidBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModFluids {
    public static FlowableFluid STILL_MOLTEN_CHEESE;
    public static FlowableFluid FLOWING_MOLTEN_CHEESE;
    public static Block MOLTEN_CHEESE_BLOCK;
    public static Item MOLTEN_CHEESE_BUCKET;

    public static void register() {
        STILL_MOLTEN_CHEESE = Registry.register(Registries.FLUID, new Identifier(CelestialSpheres.MOD_ID, "still_molten_cheese"), new MoltenCheeseFluid.Still());
        FLOWING_MOLTEN_CHEESE = Registry.register(Registries.FLUID, new Identifier(CelestialSpheres.MOD_ID, "flowing_molten_cheese"), new MoltenCheeseFluid.Flowing());
        MOLTEN_CHEESE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CelestialSpheres.MOD_ID, "molten_cheese"), new FluidBlock(ModFluids.STILL_MOLTEN_CHEESE, FabricBlockSettings.of(Material.LAVA, MapColor.YELLOW).noCollision().strength(100.0f).dropsNothing()));
        MOLTEN_CHEESE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CelestialSpheres.MOD_ID, "molten_cheese_bucket"), new BucketItem(ModFluids.STILL_MOLTEN_CHEESE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        ItemGroupEvents.modifyEntriesEvent(ModItemGroup.CELESTIA_MOON_ITEMS).register(Entries -> Entries.add(MOLTEN_CHEESE_BUCKET));
    }
}
