
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package amethystia.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import amethystia.block.PolishedamethystBlock;
import amethystia.block.MossyamethysttilesBlock;
import amethystia.block.MossyamethystbricksBlock;
import amethystia.block.CrackedpolishedamethystBlock;
import amethystia.block.CrackedamethysttilesBlock;
import amethystia.block.AmethysttilesBlock;
import amethystia.block.AmethystpillarBlock;
import amethystia.block.AmethystlampBlock;
import amethystia.block.AmethystglassBlock;
import amethystia.block.AmethystbricksBlock;

import amethystia.AmethystiaMod;

public class AmethystiaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AmethystiaMod.MODID);
	public static final RegistryObject<Block> AMETHYSTGLASS = REGISTRY.register("amethystglass", () -> new AmethystglassBlock());
	public static final RegistryObject<Block> AMETHYST_BRICKS = REGISTRY.register("amethyst_bricks", () -> new AmethystbricksBlock());
	public static final RegistryObject<Block> AMETHYSTLAMP = REGISTRY.register("amethystlamp", () -> new AmethystlampBlock());
	public static final RegistryObject<Block> AMETHYSTPILLAR = REGISTRY.register("amethystpillar", () -> new AmethystpillarBlock());
	public static final RegistryObject<Block> AMETHYSTTILES = REGISTRY.register("amethysttiles", () -> new AmethysttilesBlock());
	public static final RegistryObject<Block> CRACKEDAMETHYSTTILES = REGISTRY.register("crackedamethysttiles", () -> new CrackedamethysttilesBlock());
	public static final RegistryObject<Block> POLISHEDAMETHYST = REGISTRY.register("polishedamethyst", () -> new PolishedamethystBlock());
	public static final RegistryObject<Block> CRACKEDPOLISHEDAMETHYST = REGISTRY.register("crackedpolishedamethyst", () -> new CrackedpolishedamethystBlock());
	public static final RegistryObject<Block> MOSSYAMETHYSTBRICKS = REGISTRY.register("mossyamethystbricks", () -> new MossyamethystbricksBlock());
	public static final RegistryObject<Block> MOSSYAMETHYSTTILES = REGISTRY.register("mossyamethysttiles", () -> new MossyamethysttilesBlock());
}
