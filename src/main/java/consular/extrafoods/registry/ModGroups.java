package consular.extrafoods.registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import consular.extrafoods.ExtraFoods;

public class ModGroups {

    private static final String MODID = ExtraFoods.MODID;

    public static final ItemGroup EXTRA_FOODS_GROUP = FabricItemGroupBuilder.build(new Identifier(MODID, "extrafoods"), () -> new ItemStack(ModItems.COOKED_BAT));
    
}
