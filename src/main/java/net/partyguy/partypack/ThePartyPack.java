package net.partyguy.partypack;

import net.fabricmc.api.ModInitializer;

import net.partyguy.partypack.block.ModBlocks;
import net.partyguy.partypack.item.ModItemGroups;
import net.partyguy.partypack.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThePartyPack implements ModInitializer {
	public static final String MOD_ID = "party-pack";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}