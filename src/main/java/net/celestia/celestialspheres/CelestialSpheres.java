package net.celestia.celestialspheres;

import net.celestia.celestialspheres.block.ModBlocks;
import net.celestia.celestialspheres.fluid.ModFluids;
import net.celestia.celestialspheres.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CelestialSpheres implements ModInitializer {
	public static final String MOD_ID = "celestialspheres";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModFluids.register();
	}
}
