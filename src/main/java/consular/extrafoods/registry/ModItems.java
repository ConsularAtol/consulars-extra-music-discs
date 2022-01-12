package consular.extrafoods.registry;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    
    public static final Item RAW_BAT = new Item(new Item.Settings().group(ModGroups.EXTRA_FOODS_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(1.2f).meat().statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 20*3), 0.25f).build()));
    public static final Item COOKED_BAT = new Item(new Item.Settings().group(ModGroups.EXTRA_FOODS_GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(7.2f).meat().build()));
    public static final Item RAW_HORSE = new Item(new Item.Settings().group(ModGroups.EXTRA_FOODS_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(1.2f).meat().statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 20*3), 0.25f).build()));
    public static final Item COOKED_HORSE = new Item(new Item.Settings().group(ModGroups.EXTRA_FOODS_GROUP).food(new FoodComponent.Builder().hunger(12).saturationModifier(9.2f).meat().build()));
    public static final Item RAW_SQUID = new Item(new Item.Settings().group(ModGroups.EXTRA_FOODS_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(1.2f).meat().statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 20*3), 0.25f).build()));
    public static final Item COOKED_SQUID = new Item(new Item.Settings().group(ModGroups.EXTRA_FOODS_GROUP).food(new FoodComponent.Builder().hunger(8).saturationModifier(6.2f).meat().build()));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier("extrafoods", "raw_bat"), RAW_BAT);
        Registry.register(Registry.ITEM, new Identifier("extrafoods", "cooked_bat"), COOKED_BAT);
        Registry.register(Registry.ITEM, new Identifier("extrafoods", "raw_horse"), RAW_HORSE);
        Registry.register(Registry.ITEM, new Identifier("extrafoods", "cooked_horse"), COOKED_HORSE);
        Registry.register(Registry.ITEM, new Identifier("extrafoods", "raw_squid"), RAW_SQUID);
        Registry.register(Registry.ITEM, new Identifier("extrafoods", "cooked_squid"), COOKED_SQUID);
    }

}
