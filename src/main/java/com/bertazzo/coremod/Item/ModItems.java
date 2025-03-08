package com.bertazzo.coremod.Item;

import com.bertazzo.coremod.BertazzosCore;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public  static  final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BertazzosCore.MOD_ID);

    public static  final DeferredItem<Item> DARK_BRICK_ITEM = ITEMS.register("dark_brick", () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
