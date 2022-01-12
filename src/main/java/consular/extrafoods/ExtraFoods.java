package consular.extrafoods;

import consular.extrafoods.registry.ModItems;
import consular.extrafoods.registry.ModLootTables;
import net.fabricmc.api.ModInitializer;

public class ExtraFoods implements ModInitializer {

	public static final String MODID = "extrafoods";

	@Override
	public void onInitialize() {
		
		ModItems.registerItems();
		ModLootTables.registerLootTables();
	}
}
