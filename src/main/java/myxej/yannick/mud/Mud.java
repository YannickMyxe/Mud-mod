package myxej.yannick.mud;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class Mud implements ModInitializer {

	public static final Item mud_ball = new Item(new Item.Settings().group(ItemGroup.MISC));

	@Override
	public void onInitialize() {
		// Leaving this as a debug message
		System.out.println("Hello Fabric world!");
		System.out.println("Mud mod setting up");
	}
}
