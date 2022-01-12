package consular.extrafoods.registry;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTables {

    private static final Identifier BAT_LOOT_TABLE_ID = new Identifier("minecraft", "entities/bat");
    private static final Identifier HORSE_LOOT_TABLE_ID = new Identifier("minecraft", "entities/horse");
    private static final Identifier SQUID_LOOT_TABLE_ID = new Identifier("minecraft", "entities/squid");

    public static void registerLootTables() {
        LootTableLoadingCallback.EVENT.register((ResourceManager, LootManager, id, Supplier, Setter) -> {
            // Checks for bat loot table
            if (BAT_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .with(ItemEntry.builder(ModItems.RAW_BAT));
                    Supplier.withPool(poolBuilder.build());
            }
            //Horse time
            if (HORSE_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(2))
                    .with(ItemEntry.builder(ModItems.RAW_HORSE));
                    Supplier.withPool(poolBuilder.build());
            }
            //Squid time
            if (SQUID_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .with(ItemEntry.builder(ModItems.RAW_SQUID));
                    Supplier.withPool(poolBuilder.build());
            }
        });
    }
}
