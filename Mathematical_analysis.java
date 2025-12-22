package com.mathematical_analysis.jaymartin;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.LoggerFactory;
import com.mathematical_analysis.jaymartin.registry.ItemsRegistry;
import org.slf4j.Logger;

public class Mathematical_analysis implements ModInitializer {
	public static final String MOD_ID ="mathematical_analysis";
	public static final Logger LOGGER= LoggerFactory.getLogger("mathematical_analysis");

	public static final Item PROOF = new Item(new FabricItemSettings().maxCount(1));
	public static final Item SET = new Item((new FabricItemSettings().maxCount(64)));
	public static final Item BELONG_TO =new Item(new FabricItemSettings().maxCount(64));
	public static final Item EMPTY_SET = new Item((new FabricItemSettings().maxCount(1)));

	public static final Item INJECTION=new Item(new FabricItemSettings().maxCount(1));

	public static final Item BIJECTION=new Item(new FabricItemSettings().maxCount(1));

	public static final Item UNIVERSAL_QUANTIFIER=new Item(new FabricItemSettings().maxCount(1));

	public static final Item EXISTENTIAL_QUANTIFIER=new Item(new FabricItemSettings().maxCount(1));

	public static final ItemGroup END_ITEM_GROUP= FabricItemGroupBuilder
			.build(new Identifier(MOD_ID, "main"),
					() -> new ItemStack(ItemsRegistry.PROOF.get())



			);

	public static void registerAll() {
		Mathematical_analysis.LOGGER.debug("Registering Mod Items for " + Mathematical_analysis.MOD_ID);
	}

	@Override
	public void onInitialize() {

		ItemsRegistry.registerAll();
         /*这里为什么不用modid作为命名空间？
           答：与物品组冲突。
          */


		Registry.register(Registry.ITEM, new Identifier("tutorial_mod2","proof"),PROOF);
		Registry.register(Registry.ITEM, new Identifier("tutorial_mod2","set"), SET);
		Registry.register(Registry.ITEM,new Identifier("tutorial_mod2","belong_to"), BELONG_TO);
		Registry.register(Registry.ITEM, new Identifier("tutorial_mod2","empty_set"), EMPTY_SET);
		Registry.register(Registry.ITEM,new Identifier("tutorial_mod2","injection"),INJECTION);
		Registry.register(Registry.ITEM,new Identifier("tutorial_mod2","bijection"),BIJECTION);
		Registry.register(Registry.ITEM,new Identifier("tutorial_mod2","universal_quantifier"),UNIVERSAL_QUANTIFIER);
		Registry.register(Registry.ITEM,new Identifier("tutorial_mod2","existential_quantifier"),EXISTENTIAL_QUANTIFIER);

		FuelRegistry.INSTANCE.add(PROOF,300);


	}


}