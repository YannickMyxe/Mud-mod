package myxej.yannick.mud;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Mud implements ModInitializer {

	public static final Item MUD_BALL = new Item(new Item.Settings().group(ItemGroup.MISC));

	@Override
	public void onInitialize() {
		// Leaving this as a debug message
		System.out.println("Hello Fabric world!");
		System.out.println("Mud mod setting up");

		Registry.register(Registry.ITEM, new Identifier("mud", "mud_ball"), MUD_BALL);

	}
}
