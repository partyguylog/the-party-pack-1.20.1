package net.partyguy.partypack.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.partyguy.partypack.ThePartyPack;

public class ModItems {
    public static final Item PARTIUM = registerItem("partium", new Item(new FabricItemSettings()));
    public static final Item IGNITED_PARTIUM = registerItem("ignited_partium", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(PARTIUM);
        entries.add(IGNITED_PARTIUM);
    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ThePartyPack.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ThePartyPack.LOGGER.info("Registering Mod Items for " + ThePartyPack.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
