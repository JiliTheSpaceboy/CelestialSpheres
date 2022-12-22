package net.celestia.celestialspheres.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent CHEESE_WEDGE = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build();
    public static final FoodComponent MOCHI = new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build();
}
