
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package amethystia.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AmethystiaModTabs {
	public static CreativeModeTab TAB_AMETHYSTIA;

	public static void load() {
		TAB_AMETHYSTIA = new CreativeModeTab("tabamethystia") {
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
