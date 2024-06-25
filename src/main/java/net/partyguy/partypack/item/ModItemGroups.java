package net.partyguy.partypack.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.partyguy.partypack.ThePartyPack;
import net.partyguy.partypack.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup PARTYPACKGROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ThePartyPack.MOD_ID, "partypack"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.partypack"))
                    .icon(() -> new ItemStack(ModItems.IGNITED_PARTIUM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.PARTIUM);
                        entries.add(ModItems.IGNITED_PARTIUM);

                        entries.add(ModBlocks.PARTIUM_BLOCK);
                        entries.add(ModBlocks.MUTATED_AMETHYST_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        ThePartyPack.LOGGER.info("Registering Item Groups for "+ThePartyPack.MOD_ID);
    }
}
