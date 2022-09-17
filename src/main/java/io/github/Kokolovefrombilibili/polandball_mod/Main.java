package io.github.Kokolovefrombilibili.polandball_mod;

import io.github.Kokolovefrombilibili.polandballItem.PolandballboxDown;
import io.github.Kokolovefrombilibili.polandballItem.PolandballboxUp;
import net.minecraft.Util;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = "polandballmod_kokolove_made")
@Mod.EventBusSubscriber
public class Main {

    public static final String MOD_ID = "polandmballmod_kokolove_made";
    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab(MOD_ID) {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(PolandballboxDown.EXAMPLE_ITEMPolandballboxDown.get());
            new ItemStack(PolandballboxUp.EXAMPLE_ITEMPolandballboxUp.get());
        }
    };

    public Main(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        // 添加物品初始信息
        PolandballboxUp.ITEMS.register(bus);
        PolandballboxDown.ITEMS.register(bus);
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void playerJoinWorld(PlayerEvent.PlayerLoggedInEvent event){
        Player player = event.getPlayer();
        Level level = player.level;
        player.sendMessage(new TextComponent("Hello! "+player.getDisplayName().getString()+".Welcome to play the PolandBall Mod"), Util.NIL_UUID);
    }
}
