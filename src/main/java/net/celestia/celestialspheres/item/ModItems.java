package net.celestia.celestialspheres.item;

import net.celestia.celestialspheres.CelestialSpheres;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SnowballItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PERIDOT = registerItem("peridot", new Item(new FabricItemSettings()), ModItemGroup.CELESTIA_MISC_ITEMS);
    public static final Item MOCHI = registerItem("mochi", new Item(new FabricItemSettings().food(ModFoodComponents.MOCHI)), ModItemGroup.CELESTIA_MOON_ITEMS);
    public static final Item CHEESE_WEDGE = registerItem("cheese_wedge", new Item(new FabricItemSettings().food(ModFoodComponents.CHEESE_WEDGE)), ModItemGroup.CELESTIA_MOON_ITEMS);
    public static final Item DRY_ICE_SNOWBALL = registerItem("dry_ice_snowball", new SnowballItem(new FabricItemSettings()), ModItemGroup.CELESTIA_MARS_ITEMS);

    private static Item registerItem(String name, Item item, ItemGroup group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(Entries -> Entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(CelestialSpheres.MOD_ID, name), item);
    }
    public static void registerModItems() {
        CelestialSpheres.LOGGER.debug("Registering Mod Items for " + CelestialSpheres.MOD_ID);
    }
}