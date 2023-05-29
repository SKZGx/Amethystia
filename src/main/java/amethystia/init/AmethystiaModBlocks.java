
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package amethystia.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import amethystia.block.AmethystglassBlock;
import amethystia.block.AmethystbricksBlock;

import amethystia.AmethystiaMod;

public class AmethystiaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AmethystiaMod.MODID);
	public static final RegistryObject<Block> AMETHYSTGLASS = REGISTRY.register("amethystglass", () -> new AmethystglassBlock());
	public static final RegistryObject<Block> AMETHYSTBRICKS = REGISTRY.register("amethystbricks", () -> new AmethystbricksBlock());
}
