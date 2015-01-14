package org.darkstorm.darkbot.minecraftbot.world.block;

import static org.darkstorm.darkbot.minecraftbot.world.block.BlockType.Flag.INDESTRUCTABLE;
import static org.darkstorm.darkbot.minecraftbot.world.block.BlockType.Flag.INTERACTABLE;
import static org.darkstorm.darkbot.minecraftbot.world.block.BlockType.Flag.PLACEABLE;
import static org.darkstorm.darkbot.minecraftbot.world.block.BlockType.Flag.SOLID;
import static org.darkstorm.darkbot.minecraftbot.world.item.ToolType.AXE;
import static org.darkstorm.darkbot.minecraftbot.world.item.ToolType.PICKAXE;
import static org.darkstorm.darkbot.minecraftbot.world.item.ToolType.SHEARS;
import static org.darkstorm.darkbot.minecraftbot.world.item.ToolType.SHOVEL;
import static org.darkstorm.darkbot.minecraftbot.world.item.ToolType.SWORD;

import org.darkstorm.darkbot.minecraftbot.world.BoundingBox;
import org.darkstorm.darkbot.minecraftbot.world.item.ToolType;

public enum BlockType {
	UNKNOWN               (block(-1)),

	AIR                   (block(0).flags(0)),
	STONE                 (block(1).toolType(PICKAXE)),
	GRASS                 (block(2).toolType(SHOVEL)),
	DIRT                  (block(3).toolType(SHOVEL)),
	COBBLESTONE           (block(4).toolType(PICKAXE)),
	WOOD                  (block(5).toolType(AXE)),
	SAPLING               (block(6).flags(INTERACTABLE)),
	BEDROCK               (block(7).flags(SOLID | PLACEABLE | INDESTRUCTABLE)),
	WATER                 (block(8).flags(INDESTRUCTABLE)),
	STATIONARY_WATER      (block(9).flags(INDESTRUCTABLE)),
	LAVA                  (block(10).flags(INDESTRUCTABLE)),
	STATIONARY_LAVA       (block(11).flags(INDESTRUCTABLE)),
	SAND                  (block(12).toolType(SHOVEL)),
	GRAVEL                (block(13).toolType(SHOVEL)),
	GOLD_ORE              (block(14).toolType(PICKAXE)),
	IRON_ORE              (block(15).toolType(PICKAXE)),
	COAL_ORE              (block(16).toolType(PICKAXE)),
	LOG                   (block(17).toolType(AXE)),
	LEAVES                (block(18).toolType(SHEARS)),
	SPONGE                (block(19)),
	GLASS                 (block(20).toolType(PICKAXE)),
	LAPIS_ORE             (block(21).toolType(PICKAXE)),
	LAPIS_BLOCK           (block(22).toolType(PICKAXE)),
	DISPENSER             (block(23).flags(SOLID | INTERACTABLE | PLACEABLE).toolType(PICKAXE)),
	SANDSTONE             (block(24).toolType(PICKAXE)),
	NOTE_BLOCK            (block(25).flags(SOLID | INTERACTABLE | PLACEABLE).toolType(PICKAXE)),
	BED_BLOCK             (block(26).flags(SOLID | INTERACTABLE | PLACEABLE)),
	POWERED_RAIL          (block(27).flags(PLACEABLE).toolType(PICKAXE)),
	DETECTOR_RAIL         (block(28).flags(PLACEABLE).toolType(PICKAXE)),
	PISTON_STICKY_BASE    (block(29).toolType(PICKAXE)),
	WEB                   (block(30).flags(PLACEABLE).toolType(SWORD)),
	LONG_GRASS            (block(31).flags(PLACEABLE)),
	DEAD_BUSH             (block(32).flags(PLACEABLE)),
	PISTON_BASE           (block(33).toolType(PICKAXE)),
	PISTON_EXTENSION      (block(34).toolType(PICKAXE)),
	WOOL                  (block(35).toolType(SWORD)),
	PISTON_MOVING_PIECE   (block(36)),
	YELLOW_FLOWER         (block(37).flags(PLACEABLE)),
	RED_ROSE              (block(38).flags(PLACEABLE)),
	BROWN_MUSHROOM        (block(39).flags(PLACEABLE)),
	RED_MUSHROOM          (block(40).flags(PLACEABLE)),
	GOLD_BLOCK            (block(41).toolType(PICKAXE)),
	IRON_BLOCK            (block(42).toolType(PICKAXE)),
	DOUBLE_STEP           (block(43).toolType(PICKAXE)),
	STEP                  (block(44).toolType(PICKAXE).factory(singleBoundingBox(0, 0, 0, 1, 0.5, 1))),
	BRICK                 (block(45).toolType(PICKAXE)),
	TNT                   (block(46)),
	BOOKSHELF             (block(47).toolType(AXE)),
	MOSSY_COBBLESTONE     (block(48).toolType(PICKAXE)),
	OBSIDIAN              (block(49).toolType(PICKAXE)),
	TORCH                 (block(50).flags(PLACEABLE)),
	FIRE                  (block(51).flags(INDESTRUCTABLE)),
	MOB_SPAWNER           (block(52).toolType(PICKAXE)),
	WOOD_STAIRS           (block(53).toolType(AXE)),
	CHEST                 (block(54).flags(SOLID | INTERACTABLE | PLACEABLE).toolType(AXE)),
	REDSTONE_WIRE         (block(55).flags(PLACEABLE)),
	DIAMOND_ORE           (block(56).toolType(PICKAXE)),
	DIAMOND_BLOCK         (block(57).toolType(PICKAXE)),
	WORKBENCH             (block(58).flags(SOLID | INTERACTABLE | PLACEABLE).toolType(AXE)),
	CROPS                 (block(59).flags(PLACEABLE)),
	SOIL                  (block(60).toolType(SHOVEL)),
	FURNACE               (block(61).flags(SOLID | INTERACTABLE | PLACEABLE).toolType(PICKAXE)),
	BURNING_FURNACE       (block(62).flags(SOLID | INTERACTABLE | PLACEABLE).toolType(PICKAXE)),
	SIGN_POST             (block(63).flags(PLACEABLE).maxStack(16).toolType(AXE)),
	WOODEN_DOOR           (block(64).flags(SOLID | INTERACTABLE | PLACEABLE).toolType(AXE)),
	LADDER                (block(65).flags(PLACEABLE)),
	RAILS                 (block(66).flags(PLACEABLE).toolType(PICKAXE)),
	COBBLESTONE_STAIRS    (block(67).toolType(PICKAXE)),
	WALL_SIGN             (block(68).flags(PLACEABLE).toolType(AXE)),
	LEVER                 (block(69).flags(INTERACTABLE | PLACEABLE)),
	STONE_PLATE           (block(70).flags(PLACEABLE).toolType(PICKAXE)),
	IRON_DOOR_BLOCK       (block(71).toolType(PICKAXE)),
	WOOD_PLATE            (block(72).flags(PLACEABLE).toolType(AXE)),
	REDSTONE_ORE          (block(73).toolType(PICKAXE)),
	GLOWING_REDSTONE_ORE  (block(74).toolType(PICKAXE)),
	REDSTONE_TORCH_OFF    (block(75).flags(PLACEABLE)),
	REDSTONE_TORCH_ON     (block(76).flags(PLACEABLE)),
	STONE_BUTTON          (block(77).flags(INTERACTABLE | PLACEABLE).toolType(PICKAXE)),
	SNOW                  (block(78).flags(PLACEABLE).toolType(SHOVEL)),
	ICE                   (block(79).toolType(PICKAXE)),
	SNOW_BLOCK            (block(80).toolType(SHOVEL)),
	CACTUS                (block(81)),
	CLAY                  (block(82).toolType(SHOVEL)),
	SUGAR_CANE_BLOCK      (block(83).flags(PLACEABLE)),
	JUKEBOX               (block(84).toolType(PICKAXE)),
	FENCE                 (block(85).toolType(AXE)),
	PUMPKIN               (block(86).toolType(AXE)),
	NETHERRACK            (block(87).toolType(PICKAXE)),
	SOUL_SAND             (block(88).toolType(SHOVEL)),
	GLOWSTONE             (block(89).toolType(PICKAXE)),
	PORTAL                (block(90).flags(PLACEABLE | INDESTRUCTABLE)),
	JACK_O_LANTERN        (block(91).toolType(AXE)),
	CAKE_BLOCK            (block(92)),
	DIODE_BLOCK_OFF       (block(93).flags(INTERACTABLE | PLACEABLE)),
	DIODE_BLOCK_ON        (block(94).flags(INTERACTABLE | PLACEABLE)),
	LOCKED_CHEST          (block(95).toolType(AXE)),
	TRAP_DOOR             (block(96).toolType(AXE)),
	MONSTER_EGGS          (block(97)),
	SMOOTH_BRICK          (block(98).toolType(PICKAXE)),
	HUGE_MUSHROOM_1       (block(99).toolType(AXE)),
	HUGE_MUSHROOM_2       (block(100).toolType(AXE)),
	IRON_FENCE            (block(101).toolType(PICKAXE)),
	THIN_GLASS            (block(102).toolType(PICKAXE)),
	MELON_BLOCK           (block(103).toolType(AXE)),
	PUMPKIN_STEM          (block(104).flags(PLACEABLE)),
	MELON_STEM            (block(105).flags(PLACEABLE)),
	VINE                  (block(106).flags(PLACEABLE)),
	FENCE_GATE            (block(107).toolType(AXE)),
	BRICK_STAIRS          (block(108).toolType(PICKAXE)),
	SMOOTH_STAIRS         (block(109).toolType(PICKAXE)),
	MYCEL                 (block(110).toolType(SHOVEL)),
	WATER_LILY            (block(111)),
	NETHER_BRICK          (block(112).toolType(PICKAXE)),
	NETHER_FENCE          (block(113).toolType(PICKAXE)),
	NETHER_BRICK_STAIRS   (block(114).toolType(PICKAXE)),
	NETHER_WARTS          (block(115).flags(PLACEABLE)),
	ENCHANTMENT_TABLE     (block(116).toolType(PICKAXE)),
	BREWING_STAND         (block(117).toolType(PICKAXE)),
	CAULDRON              (block(118).toolType(PICKAXE)),
	ENDER_PORTAL          (block(119).flags(INDESTRUCTABLE)),
	ENDER_PORTAL_FRAME    (block(120).flags(INDESTRUCTABLE | SOLID | PLACEABLE)),
	ENDER_STONE           (block(121).toolType(PICKAXE)),
	DRAGON_EGG            (block(122).flags(SOLID | INTERACTABLE)),
	REDSTONE_LAMP_OFF     (block(123).toolType(PICKAXE)),
	REDSTONE_LAMP_ON      (block(124).toolType(PICKAXE)),
	WOOD_DOUBLE_STEP      (block(125).toolType(AXE)),
	WOOD_STEP             (block(126).toolType(AXE).factory(singleBoundingBox(0, 0, 0, 1, 0.5, 1))),
	COCOA                 (block(127)),
	SANDSTONE_STAIRS      (block(128).toolType(PICKAXE)),
	EMERALD_ORE           (block(129).toolType(PICKAXE)),
	ENDER_CHEST           (block(130).flags(INDESTRUCTABLE | INTERACTABLE | SOLID | PLACEABLE)),
	TRIPWIRE_HOOK         (block(131).flags(INTERACTABLE | PLACEABLE)),
	TRIPWIRE              (block(132).flags(PLACEABLE)),
	EMERALD_BLOCK         (block(133).toolType(PICKAXE)),
	SPRUCE_WOOD_STAIRS    (block(134).toolType(AXE)),
	BIRCH_WOOD_STAIRS     (block(135).toolType(AXE)),
	JUNGLE_WOOD_STAIRS    (block(136).toolType(AXE)),
	COMMAND               (block(137)),
	BEACON                (block(138)),
	COBBLE_WALL           (block(139).toolType(PICKAXE)),
	FLOWER_POT            (block(140)),
	CARROT                (block(141).flags(PLACEABLE)),
	POTATO                (block(142).flags(PLACEABLE)),
	WOOD_BUTTON           (block(143).flags(INTERACTABLE | PLACEABLE).toolType(AXE)),
	SKULL                 (block(144)),
	ANVIL                 (block(145).toolType(PICKAXE)),
	TRAPPED_CHEST         (block(146).flags(SOLID | INTERACTABLE | PLACEABLE).toolType(AXE)),
	GOLD_PRESSURE_PLATE   (block(147).flags(PLACEABLE).toolType(PICKAXE)),
	IRON_PRESSURE_PLATE   (block(148).flags(PLACEABLE).toolType(PICKAXE)),
	LIGHT_SENSOR          (block(151).toolType(PICKAXE)),
	REDSTONE_BLOCK        (block(152).toolType(PICKAXE)),
	NETHER_QUARTZ_ORE     (block(153).toolType(PICKAXE)),
	HOPPER                (block(154).flags(SOLID | INTERACTABLE | PLACEABLE).toolType(PICKAXE)),
	QUARTZ_BLOCK          (block(155).toolType(PICKAXE)),
	QUARTZ_STAIRS         (block(156).toolType(PICKAXE)),
	ACTIVATOR_RAIL        (block(157).flags(PLACEABLE).toolType(PICKAXE)),
	DROPPER               (block(158).flags(SOLID | INTERACTABLE | PLACEABLE).toolType(PICKAXE)),
	STAINED_CLAY          (block(159).toolType(PICKAXE)),
	CARPET                (block(171).flags(PLACEABLE).toolType(SWORD)),
	HARDENED_CLAY         (block(172).toolType(PICKAXE)),
	COAL_BLOCK            (block(173).toolType(PICKAXE)),
	PACKED_ICE            (block(174).toolType(PICKAXE));
	
	private final int id, maxStack, flags;
	private final float frictionCoefficient;
	private final ToolType toolType;
	private final BlockFactory blockFactory;
	
	private BlockType(Builder builder) {
		this.id = builder.id;
		this.flags = builder.flags;
		this.maxStack = builder.maxStack;
		this.frictionCoefficient = builder.friction;
		this.toolType = builder.toolType;
		this.blockFactory = builder.factory.provide(this);
		
		if(id >= 0 && id < 256)
			Registry.registry[id] = this;
	}

	public int getId() {
		return id;
	}

	public int getMaxStack() {
		return maxStack;
	}

	public boolean isSolid() {
		return (flags & SOLID) == SOLID;
	}

	public boolean isInteractable() {
		return (flags & INTERACTABLE) == INTERACTABLE;
	}

	public boolean isPlaceable() {
		return (flags & PLACEABLE) == PLACEABLE;
	}

	public boolean isIndestructable() {
		return (flags & INDESTRUCTABLE) == INDESTRUCTABLE;
	}
	
	public float getFrictionCoefficient() {
		return frictionCoefficient;
	}

	public ToolType getToolType() {
		return toolType;
	}
	
	public BlockFactory getBlockFactory() {
		return blockFactory;
	}

	public static BlockType getById(int id) {
		if(id < 0 || id >= 256)
			return UNKNOWN;
		BlockType type = Registry.registry[id];
		return type != null ? type : UNKNOWN;
	}

	protected static final class Flag {
		public static final int SOLID = 1, INTERACTABLE = 2, PLACEABLE = 4, INDESTRUCTABLE = 8;
	}
	
	protected static final class Registry {
		public static final BlockType[] registry = new BlockType[256];
	}
	
	private static Builder block(int id) {
		return new Builder(id);
	}
	
	protected static final class Builder {
		private final int id;
		private int maxStack = 64;
		private int flags = SOLID | PLACEABLE;
		private float friction = 1.0F;
		private ToolType toolType = null;
		private BlockFactoryProvider factory = BlockFactoryProvider.DEFAULT;
		
		public Builder(int id) {
			this.id = id;
		}
		
		public Builder maxStack(int maxStack) {
			this.maxStack = maxStack;
			return this;
		}
		
		public Builder flags(int flags) {
			this.flags = flags;
			if((flags & SOLID) != SOLID)
				factory = BlockFactoryProvider.TRANSPARENT;
			return this;
		}
		
		public Builder toolType(ToolType toolType) {
			this.toolType = toolType;
			return this;
		}
		
		public Builder friction(float friction) {
			this.friction = friction;
			return this;
		}
		
		public Builder factory(BlockFactoryProvider factory) {
			this.factory = factory;
			return this;
		}
	}
	
	private static BlockFactoryProvider singleBoundingBox(double minX, double minY, double minZ, double maxX, double maxY, double maxZ) {
		final BoundingBox bounds = BoundingBox.getBoundingBox(minX, minY, minZ, maxX, maxY, maxZ);
		return new BlockFactoryProvider() {
			@Override public BlockFactory provide(BlockType type) {
				return RectangularBlockFactory.getInstance(type, bounds);
			}
		};
	}
	
	protected static interface BlockFactoryProvider {
		BlockFactoryProvider DEFAULT = new BlockFactoryProvider() {
			@Override public BlockFactory provide(BlockType type) {
				return RectangularBlockFactory.getInstance(type);
			}
		};
		BlockFactoryProvider TRANSPARENT = new BlockFactoryProvider() {
			@Override public BlockFactory provide(BlockType type) {
				return TransparentBlockFactory.getInstance(type);
			}
		};
		public BlockFactory provide(BlockType type);
	}
}
