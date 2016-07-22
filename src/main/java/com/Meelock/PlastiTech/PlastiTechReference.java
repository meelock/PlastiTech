package com.Meelock.PlastiTech;

public class PlastiTechReference {
	public static final String MOD_ID = "PlastiTech";
	public static final String NAME = "PlastiTech";
	public static final String VERSION = "0.0.1-alpha";
	public static final String ACCEPTED_VERSIONS = "[1.10.2]";

	public static final String CLIENT_PROXY_CLASS = "com.Meelock.PlastiTech.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.Meelock.PlastiTech.proxy.ServerProxy";

	public static enum PlastiTechItems {
		PLASTIC_INGOT("plastic_ingot",
				"ItemPlastic_ingot"),
		HOT_STICKY_LIGHTLY_REINFORCED_PLASTIC_BAR("hot_sticky_lightly_reinforced_plastic_bar",
				"ItemHot_sticky_lightly_reinforced_plastic_bar"),
		GOLD_DUST("gold_dust",
				"ItemGold_dust"),
		BUCKET_UNBOILED_POLYMER_FLUID("bucket_unboiled_polymer_fluid",
				"ItemBucket_unboiled_polymer_fluid"),
		BUCKET_BOILED_POLYMER_FLUID("bucket_boiled_polymer_fluid",
				"ItemBucket_boiled_polymer_fluid"),
		HOT_STICKY_PLASTIC_BAR("hot_sticky_plastic_bar",
				"ItemHot_sticky_plastic_bar"),
		LIGHTLY_REINFORCED_PLASTIC_INGOT("lightly_reinforced_plastic_ingot",
				"ItemLightly_reinforced_plastic_ingot"),
		MORTAR_AND_PESTAL("mortar_and_pestal",
				"ItemMortar_and_pestal"),
		TOOTH("tooth",
				"ItemTooth"), 
		INGOT_MOLD("ingot_mold", "ItemIngot_mold");

		private String unlocalizedName;
		private String registryName;

		BtSItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}

		public String getUnlocalizedName() {
			return unlocalizedName;
		}

		public String getRegistryName() {
			return registryName;
		}
	}

	public static enum PlastiTechBlocks {
		TENTACLE("Tentacle", "BlockTentacle"), TENTACLE_SUCKER("Tentacle_sucker", "BlockTentacleSucker"), ELECTRIC_FENCE("electric_fence", "BlockElectric_fence");

		private String unlocalizedName;
		private String registryName;

		BtSBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}

		public String getUnlocalizedName() {
			return unlocalizedName;
		}

		public String getRegistryName() {
			return registryName;
		}
	}

}