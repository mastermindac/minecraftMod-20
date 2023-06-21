package ac.mastermind.pacomod.Tab;

import ac.mastermind.pacomod.Block.DeportesBlocks;
import ac.mastermind.pacomod.Item.DeportesItems;
import ac.mastermind.pacomod.Item.OtrosItems;
import ac.mastermind.pacomod.PacoMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = PacoMod.MODID,bus= Mod.EventBusSubscriber.Bus.MOD)
public class DeportesTab {

    public static final DeferredRegister<CreativeModeTab> DEPORTES_TABS = DeferredRegister.create(
            Registries.CREATIVE_MODE_TAB,PacoMod.MODID);

    public static RegistryObject<CreativeModeTab> DEPORTE_TAB = DEPORTES_TABS.register("deportes_tab",
            ()-> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(OtrosItems.DEPORTE_TAB_ITEM.get()))
                    .title(Component.translatable("item_group." + PacoMod.MODID + ".deportes_tab"))
                    .build());

    /*
    @SubscribeEvent
    public static void buildContents(CreativeModeTabEvent.Register event) {
        event.registerCreativeModeTab(new ResourceLocation(PacoMod.MODID, "deportes_tab"),
                builder ->
                    // Set name of tab to display
                    builder
                        .title(Component.translatable("item_group." + PacoMod.MODID + ".deportes_tab"))
                        // Set icon of creative tab
                        .icon(() -> new ItemStack(OtrosItems.DEPORTE_TAB_ITEM.get()))
                        // Add default items to tab
                        .displayItems((params, output) -> {
                            for(RegistryObject<Item> item:DeportesItems.DEPORTES_ITEMS.getEntries()){
                                output.accept(item.get());
                            }
                            for(RegistryObject<Item> item:DeportesItems.DEPORTES_ARMAS_ITEMS.getEntries()){
                                output.accept(item.get());
                            }
                            for(RegistryObject<Item> item:DeportesItems.DEPORTES_HERRAMIENTAS_ITEMS.getEntries()){
                                output.accept(item.get());
                            }
                            for(RegistryObject<Block> block:DeportesBlocks.DEPORTES_BLOCK.getEntries()){
                                output.accept(block.get());
                            }
                            //output.accept(DeportesBlocks.GRADAS_BLOCK.get());
                            output.accept(OtrosItems.LIQUIDO_ITEM.get());
                        })
        );
    }*/
}
