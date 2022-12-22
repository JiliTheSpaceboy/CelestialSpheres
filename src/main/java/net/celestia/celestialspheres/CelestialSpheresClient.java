package net.celestia.celestialspheres;

import net.celestia.celestialspheres.fluid.ModFluids;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

public class CelestialSpheresClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MOLTEN_CHEESE, ModFluids.FLOWING_MOLTEN_CHEESE,
        new SimpleFluidRenderHandler(
            new Identifier("celestialspheres:block/molten_cheese_still"), 
            new Identifier("celestialspheres:block/molten_cheese_flow")
            ));
        
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_MOLTEN_CHEESE, ModFluids.FLOWING_MOLTEN_CHEESE);
    }
}