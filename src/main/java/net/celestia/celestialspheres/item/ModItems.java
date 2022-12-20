package net.celestia.celestialspheres.item;

import net.celestia.celestialspheres.CelestialSpheres;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TELESCOPE = registerItem("telescope",
        new Item(new FabricItemSettings()),
        ModItemGroup.CELESTIA_MISC);
    public static final Item ORRERY = registerItem("orrery",
        new Item(new FabricItemSettings()),
        ModItemGroup.CELESTIA_MISC);

    private static Item registerItem(String name, Item item, ItemGroup group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(Entries -> Entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(CelestialSpheres.MOD_ID, name), item);
    }
    public static void registerModItems() {
        CelestialSpheres.LOGGER.debug("Registering Mod Items for " + CelestialSpheres.MOD_ID);
    }
}