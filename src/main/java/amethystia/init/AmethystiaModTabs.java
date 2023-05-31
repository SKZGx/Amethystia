
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package amethystia.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AmethystiaModTabs {
	public static CreativeModeTab TAB_AMETHYSTIA_REDSTONE;
	public static CreativeModeTab TAB_AMETHYSTIA_BLOCKS;
	public static CreativeModeTab TAB_AMETHYSTIA_ITEMS;

	public static void load() {
		TAB_AMETHYSTIA_REDSTONE = new CreativeModeTab("tabamethystia_redstone") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AmethystiaModBlocks.AMETHYST_BLOCK_PRESSURE_PLATE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_AMETHYSTIA_BLOCKS = new CreativeModeTab("tabamethystia_blocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AmethystiaModBlocks.AMETHYST_BRICKS.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_AMETHYSTIA_ITEMS = new CreativeModeTab("tabamethystia_items") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.AMETHYST_SHARD);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
