package io.github.Kokolovefrombilibili.polandballItem;

import com.google.common.base.Supplier;
import io.github.Kokolovefrombilibili.polandball_mod.Main;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PolandballboxDown {
    // 注册机
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);
    // 定义自己的物品
    public static final RegistryObject<Item> EXAMPLE_ITEMPolandballboxDown = register("PolandballboxDown",
            () -> new Item(new Item.Properties().tab(Main.TUTORIAL_TAB)));

    private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item){
        return ITEMS.register(name, item);
    }

}

