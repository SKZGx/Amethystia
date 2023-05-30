
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package amethystia.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import amethystia.AmethystiaMod;

public class AmethystiaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AmethystiaMod.MODID);
	public static final RegistryObject<Item> AMETHYSTGLASS = block(AmethystiaModBlocks.AMETHYSTGLASS, AmethystiaModTabs.TAB_AMETHYSTIA);
	public static final RegistryObject<Item> AMETHYST_BRICKS = block(AmethystiaModBlocks.AMETHYST_BRICKS, AmethystiaModTabs.TAB_AMETHYSTIA);
	public static final RegistryObject<Item> AMETHYSTLAMP = block(AmethystiaModBlocks.AMETHYSTLAMP, AmethystiaModTabs.TAB_AMETHYSTIA);
	public static final RegistryObject<Item> AMETHYSTPILLAR = block(AmethystiaModBlocks.AMETHYSTPILLAR, AmethystiaModTabs.TAB_AMETHYSTIA);
	public static final RegistryObject<Item> AMETHYSTTILES = block(AmethystiaModBlocks.AMETHYSTTILES, AmethystiaModTabs.TAB_AMETHYSTIA);
	public static final RegistryObject<Item> CRACKEDAMETHYSTTILES = block(AmethystiaModBlocks.CRACKEDAMETHYSTTILES, AmethystiaModTabs.TAB_AMETHYSTIA);
	public static final RegistryObject<Item> POLISHEDAMETHYST = block(AmethystiaModBlocks.POLISHEDAMETHYST, AmethystiaModTabs.TAB_AMETHYSTIA);
	public static final RegistryObject<Item> CRACKEDPOLISHEDAMETHYST = block(AmethystiaModBlocks.CRACKEDPOLISHEDAMETHYST, AmethystiaModTabs.TAB_AMETHYSTIA);
	public static final RegistryObject<Item> MOSSYAMETHYSTBRICKS = block(AmethystiaModBlocks.MOSSYAMETHYSTBRICKS, AmethystiaModTabs.TAB_AMETHYSTIA);
	public static final RegistryObject<Item> MOSSYAMETHYSTTILES = block(AmethystiaModBlocks.MOSSYAMETHYSTTILES, AmethystiaModTabs.TAB_AMETHYSTIA);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
