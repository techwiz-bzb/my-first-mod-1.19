package net.billy.myfirstmod.item;

import net.billy.myfirstmod.MyFirstMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup TANZANITE = FabricItemGroupBuilder.build(
            new Identifier(MyFirstMod.MOD_ID, "tanzanite"), () -> new ItemStack(ModItems.TANZANITE));
}
