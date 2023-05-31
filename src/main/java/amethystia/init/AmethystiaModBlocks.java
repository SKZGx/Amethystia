
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package amethystia.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import amethystia.block.PolishedamethystBlock;
import amethystia.block.PolishedAmethystWallBlock;
import amethystia.block.PolishedAmethystStairsBlock;
import amethystia.block.PolishedAmethystSlabBlock;
import amethystia.block.PolishedAmethystPressurePlateBlock;
import amethystia.block.PolishedAmethystButtonBlock;
import amethystia.block.MossyamethysttilesBlock;
import amethystia.block.MossyamethystbricksBlock;
import amethystia.block.MossyAmethystTilesWallBlock;
import amethystia.block.MossyAmethystTilesStairsBlock;
import amethystia.block.MossyAmethystTilesSlabBlock;
import amethystia.block.MossyAmethystBricksWallBlock;
import amethystia.block.MossyAmethystBricksStairsBlock;
import amethystia.block.MossyAmethystBricksSlabBlock;
import amethystia.block.CrackedpolishedamethystBlock;
import amethystia.block.CrackedamethysttilesBlock;
import amethystia.block.CrackedPolishedAmethystWallBlock;
import amethystia.block.CrackedPolishedAmethystStairsBlock;
import amethystia.block.CrackedPolishedAmethystSlabBlock;
import amethystia.block.CrackedAmethystTilesWallBlock;
import amethystia.block.CrackedAmethystTilesStairsBlock;
import amethystia.block.CrackedAmethystTilesSlabBlock;
import amethystia.block.AmethysttilesBlock;
import amethystia.block.AmethystpillarBlock;
import amethystia.block.AmethystlampBlock;
import amethystia.block.AmethystglassBlock;
import amethystia.block.AmethystbricksBlock;
import amethystia.block.AmethystTilesWallBlock;
import amethystia.block.AmethystTilesStairsBlock;
import amethystia.block.AmethystTilesSlabBlock;
import amethystia.block.AmethystTilesPressurePlateBlock;
import amethystia.block.AmethystTilesButtonBlock;
import amethystia.block.AmethystPillarWallBlock;
import amethystia.block.AmethystPillarStairsBlock;
import amethystia.block.AmethystPillarSlabBlock;
import amethystia.block.AmethystPillarPressurePlateBlock;
import amethystia.block.AmethystPillarButtonBlock;
import amethystia.block.AmethystGlassPaneBlock;
import amethystia.block.AmethystBricksWallBlock;
import amethystia.block.AmethystBricksStairsBlock;
import amethystia.block.AmethystBricksSlabBlock;
import amethystia.block.AmethystBricksPressurePlateBlock;
import amethystia.block.AmethystBricksButtonBlock;
import amethystia.block.AmethystBlockWallBlock;
import amethystia.block.AmethystBlockStairsBlock;
import amethystia.block.AmethystBlockSlabBlock;
import amethystia.block.AmethystBlockPressurePlateBlock;
import amethystia.block.AmethystBlockButtonBlock;

import amethystia.AmethystiaMod;

public class AmethystiaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AmethystiaMod.MODID);
	public static final RegistryObject<Block> AMETHYST_GLASS = REGISTRY.register("amethyst_glass", () -> new AmethystglassBlock());
	public static final RegistryObject<Block> AMETHYST_BRICKS = REGISTRY.register("amethyst_bricks", () -> new AmethystbricksBlock());
	public static final RegistryObject<Block> AMETHYST_LAMP = REGISTRY.register("amethyst_lamp", () -> new AmethystlampBlock());
	public static final RegistryObject<Block> AMETHYST_PILLAR = REGISTRY.register("amethyst_pillar", () -> new AmethystpillarBlock());
	public static final RegistryObject<Block> AMETHYST_TILES = REGISTRY.register("amethyst_tiles", () -> new AmethysttilesBlock());
	public static final RegistryObject<Block> CRACKED_AMETHYST_TILES = REGISTRY.register("cracked_amethyst_tiles", () -> new CrackedamethysttilesBlock());
	public static final RegistryObject<Block> POLISHED_AMETHYST = REGISTRY.register("polished_amethyst", () -> new PolishedamethystBlock());
	public static final RegistryObject<Block> CRACKED_POLISHED_AMETHYST = REGISTRY.register("cracked_polished_amethyst", () -> new CrackedpolishedamethystBlock());
	public static final RegistryObject<Block> MOSSY_AMETHYST_BRICKS = REGISTRY.register("mossy_amethyst_bricks", () -> new MossyamethystbricksBlock());
	public static final RegistryObject<Block> MOSSY_AMETHYST_TILES = REGISTRY.register("mossy_amethyst_tiles", () -> new MossyamethysttilesBlock());
	public static final RegistryObject<Block> AMETHYST_BRICKS_STAIRS = REGISTRY.register("amethyst_bricks_stairs", () -> new AmethystBricksStairsBlock());
	public static final RegistryObject<Block> AMETHYST_BRICKS_SLAB = REGISTRY.register("amethyst_bricks_slab", () -> new AmethystBricksSlabBlock());
	public static final RegistryObject<Block> AMETHYST_BRICKS_WALL = REGISTRY.register("amethyst_bricks_wall", () -> new AmethystBricksWallBlock());
	public static final RegistryObject<Block> AMETHYST_TILES_STAIRS = REGISTRY.register("amethyst_tiles_stairs", () -> new AmethystTilesStairsBlock());
	public static final RegistryObject<Block> AMETHYST_TILES_SLAB = REGISTRY.register("amethyst_tiles_slab", () -> new AmethystTilesSlabBlock());
	public static final RegistryObject<Block> AMETHYST_TILES_WALL = REGISTRY.register("amethyst_tiles_wall", () -> new AmethystTilesWallBlock());
	public static final RegistryObject<Block> AMETHYST_PILLAR_STAIRS = REGISTRY.register("amethyst_pillar_stairs", () -> new AmethystPillarStairsBlock());
	public static final RegistryObject<Block> AMETHYST_PILLAR_SLAB = REGISTRY.register("amethyst_pillar_slab", () -> new AmethystPillarSlabBlock());
	public static final RegistryObject<Block> CRACKED_AMETHYST_TILES_STAIRS = REGISTRY.register("cracked_amethyst_tiles_stairs", () -> new CrackedAmethystTilesStairsBlock());
	public static final RegistryObject<Block> CRACKED_AMETHYST_TILES_SLAB = REGISTRY.register("cracked_amethyst_tiles_slab", () -> new CrackedAmethystTilesSlabBlock());
	public static final RegistryObject<Block> CRACKED_AMETHYST_TILES_WALL = REGISTRY.register("cracked_amethyst_tiles_wall", () -> new CrackedAmethystTilesWallBlock());
	public static final RegistryObject<Block> CRACKED_POLISHED_AMETHYST_STAIRS = REGISTRY.register("cracked_polished_amethyst_stairs", () -> new CrackedPolishedAmethystStairsBlock());
	public static final RegistryObject<Block> CRACKED_POLISHED_AMETHYST_SLAB = REGISTRY.register("cracked_polished_amethyst_slab", () -> new CrackedPolishedAmethystSlabBlock());
	public static final RegistryObject<Block> CRACKED_POLISHED_AMETHYST_WALL = REGISTRY.register("cracked_polished_amethyst_wall", () -> new CrackedPolishedAmethystWallBlock());
	public static final RegistryObject<Block> MOSSY_AMETHYST_BRICKS_STAIRS = REGISTRY.register("mossy_amethyst_bricks_stairs", () -> new MossyAmethystBricksStairsBlock());
	public static final RegistryObject<Block> MOSSY_AMETHYST_BRICKS_SLAB = REGISTRY.register("mossy_amethyst_bricks_slab", () -> new MossyAmethystBricksSlabBlock());
	public static final RegistryObject<Block> MOSSY_AMETHYST_BRICKS_WALL = REGISTRY.register("mossy_amethyst_bricks_wall", () -> new MossyAmethystBricksWallBlock());
	public static final RegistryObject<Block> MOSSY_AMETHYST_TILES_STAIRS = REGISTRY.register("mossy_amethyst_tiles_stairs", () -> new MossyAmethystTilesStairsBlock());
	public static final RegistryObject<Block> MOSSY_AMETHYST_TILES_SLAB = REGISTRY.register("mossy_amethyst_tiles_slab", () -> new MossyAmethystTilesSlabBlock());
	public static final RegistryObject<Block> MOSSY_AMETHYST_TILES_WALL = REGISTRY.register("mossy_amethyst_tiles_wall", () -> new MossyAmethystTilesWallBlock());
	public static final RegistryObject<Block> POLISHED_AMETHYST_STAIRS = REGISTRY.register("polished_amethyst_stairs", () -> new PolishedAmethystStairsBlock());
	public static final RegistryObject<Block> POLISHED_AMETHYST_SLAB = REGISTRY.register("polished_amethyst_slab", () -> new PolishedAmethystSlabBlock());
	public static final RegistryObject<Block> POLISHED_AMETHYST_WALL = REGISTRY.register("polished_amethyst_wall", () -> new PolishedAmethystWallBlock());
	public static final RegistryObject<Block> AMETHYST_PILLAR_WALL = REGISTRY.register("amethyst_pillar_wall", () -> new AmethystPillarWallBlock());
	public static final RegistryObject<Block> AMETHYST_BLOCK_STAIRS = REGISTRY.register("amethyst_block_stairs", () -> new AmethystBlockStairsBlock());
	public static final RegistryObject<Block> AMETHYST_BLOCK_SLAB = REGISTRY.register("amethyst_block_slab", () -> new AmethystBlockSlabBlock());
	public static final RegistryObject<Block> AMETHYST_BLOCK_WALL = REGISTRY.register("amethyst_block_wall", () -> new AmethystBlockWallBlock());
	public static final RegistryObject<Block> AMETHYST_GLASS_PANE = REGISTRY.register("amethyst_glass_pane", () -> new AmethystGlassPaneBlock());
	public static final RegistryObject<Block> AMETHYST_BLOCK_BUTTON = REGISTRY.register("amethyst_block_button", () -> new AmethystBlockButtonBlock());
	public static final RegistryObject<Block> AMETHYST_BLOCK_PRESSURE_PLATE = REGISTRY.register("amethyst_block_pressure_plate", () -> new AmethystBlockPressurePlateBlock());
	public static final RegistryObject<Block> AMETHYST_BRICKS_BUTTON = REGISTRY.register("amethyst_bricks_button", () -> new AmethystBricksButtonBlock());
	public static final RegistryObject<Block> AMETHYST_BRICKS_PRESSURE_PLATE = REGISTRY.register("amethyst_bricks_pressure_plate", () -> new AmethystBricksPressurePlateBlock());
	public static final RegistryObject<Block> AMETHYST_PILLAR_BUTTON = REGISTRY.register("amethyst_pillar_button", () -> new AmethystPillarButtonBlock());
	public static final RegistryObject<Block> AMETHYST_PILLAR_PRESSURE_PLATE = REGISTRY.register("amethyst_pillar_pressure_plate", () -> new AmethystPillarPressurePlateBlock());
	public static final RegistryObject<Block> AMETHYST_TILES_BUTTON = REGISTRY.register("amethyst_tiles_button", () -> new AmethystTilesButtonBlock());
	public static final RegistryObject<Block> AMETHYST_TILES_PRESSURE_PLATE = REGISTRY.register("amethyst_tiles_pressure_plate", () -> new AmethystTilesPressurePlateBlock());
	public static final RegistryObject<Block> POLISHED_AMETHYST_BUTTON = REGISTRY.register("polished_amethyst_button", () -> new PolishedAmethystButtonBlock());
	public static final RegistryObject<Block> POLISHED_AMETHYST_PRESSURE_PLATE = REGISTRY.register("polished_amethyst_pressure_plate", () -> new PolishedAmethystPressurePlateBlock());
}
