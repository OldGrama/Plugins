/*
 * Copyright (c) 2018, Seth <Sethtroll3@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.poh;

import com.google.common.collect.ImmutableMap;
import java.awt.image.BufferedImage;
import java.util.Map;
import lombok.AccessLevel;
import lombok.Getter;
import static net.runelite.api.NullObjectID.*;
import static net.runelite.api.ObjectID.*;
import net.runelite.client.util.ImageUtil;

public enum PohIcons
{
	EXITPORTAL("exitportal", PORTAL_4525),
	VARROCK("varrock", NULL_13615, NULL_13622, NULL_13629),
	FALADOR("falador", FALADOR_PORTAL, FALADOR_PORTAL_13624, FALADOR_PORTAL_13631),
	LUMBRIDGE("lumbridge", LUMBRIDGE_PORTAL, LUMBRIDGE_PORTAL_13623, LUMBRIDGE_PORTAL_13630),
	ARDOUGNE("ardougne", ARDOUGNE_PORTAL, ARDOUGNE_PORTAL_13626, ARDOUGNE_PORTAL_13633),
	YANILLE("yanille", NULL_13620, NULL_13627, NULL_13634),
	CAMELOT("camelot", NULL_13618, NULL_13625, NULL_13632),
	LUNARISLE("lunarisle", LUNAR_ISLE_PORTAL, LUNAR_ISLE_PORTAL_29347, LUNAR_ISLE_PORTAL_29355),
	WATERBIRTH("waterbirth", WATERBIRTH_ISLAND_PORTAL, WATERBIRTH_ISLAND_PORTAL_29350, WATERBIRTH_ISLAND_PORTAL_29358),
	FISHINGGUILD("fishingguild", FISHING_GUILD_PORTAL, FISHING_GUILD_PORTAL_29351, FISHING_GUILD_PORTAL_29359),
	SENNTISTEN("senntisten", SENNTISTEN_PORTAL, SENNTISTEN_PORTAL_29348, SENNTISTEN_PORTAL_29356),
	KHARYLL("kharyll", KHARYRLL_PORTAL, KHARYRLL_PORTAL_29346, KHARYRLL_PORTAL_29354),
	ANNAKARL("annakarl", ANNAKARL_PORTAL, ANNAKARL_PORTAL_29349, ANNAKARL_PORTAL_29357),
	KOUREND("kourend", KOUREND_PORTAL, KOUREND_PORTAL_29353, KOUREND_PORTAL_29361),
	MARIM("marim", MARIM_PORTAL, MARIM_PORTAL_29352, MARIM_PORTAL_29360),
	TROLLSTRONGHOLD("trollstronghold", TROLL_STRONGHOLD_PORTAL, TROLL_STRONGHOLD_PORTAL_33180, TROLL_STRONGHOLD_PORTAL_33181),
	GHORROCK("ghorrock", GHORROCK_PORTAL, GHORROCK_PORTAL_33436, GHORROCK_PORTAL_33439),
	CARRALLANGAR("carrallangar", CARRALLANGAR_PORTAL, CARRALLANGAR_PORTAL_33437, CARRALLANGAR_PORTAL_33440),
	CATHERBY("catherby", CATHERBY_PORTAL, CATHERBY_PORTAL_33435, CATHERBY_PORTAL_33438),
	WEISS("weiss", WEISS_PORTAL, WEISS_PORTAL_37593, WEISS_PORTAL_37605),
	APEATOLLDUNGEON("apeatolldungeon", APE_ATOLL_DUNGEON_PORTAL, APE_ATOLL_DUNGEON_PORTAL_37604, APE_ATOLL_DUNGEON_PORTAL_37616),
	BARROWS("barrows", BARROWS_PORTAL, BARROWS_PORTAL_37603, BARROWS_PORTAL_37615),
	BATTLEFRONT("battlefront", BATTLEFRONT_PORTAL, BATTLEFRONT_PORTAL_37596, BATTLEFRONT_PORTAL_37608),
	CEMETERY("cemetery", CEMETERY_PORTAL, CEMETERY_PORTAL_37602, CEMETERY_PORTAL_37614),
	DRAYNORMANOR("draynormanor", DRAYNOR_MANOR_PORTAL, DRAYNOR_MANOR_PORTAL_37595, DRAYNOR_MANOR_PORTAL_37607),
	FENKENSTRAINSCASTLE("fenkenstrainscastle", FENKENSTRAINS_CASTLE_PORTAL, FENKENSTRAINS_CASTLE_PORTAL_37599, FENKENSTRAINS_CASTLE_PORTAL_37611),
	HARMONYISLAND("harmonyisland", HARMONY_ISLAND_PORTAL, HARMONY_ISLAND_PORTAL_37601, HARMONY_ISLAND_PORTAL_37613),
	LUMBRIDGEGRAVEYARD("lumbridgegraveyard", LUMBRIDGE_GRAVEYARD_PORTAL, LUMBRIDGE_GRAVEYARD_PORTAL_37594, LUMBRIDGE_GRAVEYARD_PORTAL_37606),
	MINDALTAR("mindaltar", MIND_ALTAR_PORTAL, MIND_ALTAR_PORTAL_37597, MIND_ALTAR_PORTAL_37609),
	SALVEGRAVEYARD("salvegraveyard", SALVE_GRAVEYARD_PORTAL, SALVE_GRAVEYARD_PORTAL_37598, SALVE_GRAVEYARD_PORTAL_37610),
	WESTARDOUGNE("westardougne", WEST_ARDOUGNE_PORTAL, WEST_ARDOUGNE_PORTAL_37600, WEST_ARDOUGNE_PORTAL_37612),
	ALTAR("altar",
		ALTAR_13179, ALTAR_13180, ALTAR_13181, ALTAR_13182, ALTAR_13183, ALTAR_13184, ALTAR_13185, ALTAR_13186,
		ALTAR_13187, ALTAR_13188, ALTAR_13189, ALTAR_13190, ALTAR_13191, ALTAR_13192, ALTAR_13193, ALTAR_13194,
		ALTAR_13196, ALTAR_13197, ALTAR_13198, ALTAR_13199
	),
	POOLS("pool", POOL_OF_RESTORATION, POOL_OF_REVITALISATION, POOL_OF_REJUVENATION, FANCY_REJUVENATION_POOL, ORNATE_REJUVENATION_POOL),
	GLORY("glory", AMULET_OF_GLORY),
	REPAIR("repair", ARMOUR_REPAIR_STAND),
	SPELLBOOKALTAR("spellbook", ANCIENT_ALTAR, LUNAR_ALTAR, DARK_ALTAR, ALTAR_OF_THE_OCCULT),
	JEWELLERYBOX("jewellery", NULL_29154, NULL_29155, NULL_29156),
	MAGICTRAVEL("transportation", SPIRIT_TREE_29227, NULL_29228, NULL_29229, OBELISK_31554),
	PORTALNEXUS("portalnexus",
		PORTAL_NEXUS, PORTAL_NEXUS_33355, PORTAL_NEXUS_33356, PORTAL_NEXUS_33357, PORTAL_NEXUS_33358, PORTAL_NEXUS_33359, PORTAL_NEXUS_33360,
		PORTAL_NEXUS_33361, PORTAL_NEXUS_33362, PORTAL_NEXUS_33363, PORTAL_NEXUS_33364, PORTAL_NEXUS_33365, PORTAL_NEXUS_33366, PORTAL_NEXUS_33367,
		PORTAL_NEXUS_33368, PORTAL_NEXUS_33369, PORTAL_NEXUS_33370, PORTAL_NEXUS_33371, PORTAL_NEXUS_33372, PORTAL_NEXUS_33373, PORTAL_NEXUS_33374,
		PORTAL_NEXUS_33375, PORTAL_NEXUS_33376, PORTAL_NEXUS_33377, PORTAL_NEXUS_33378, PORTAL_NEXUS_33379, PORTAL_NEXUS_33380, PORTAL_NEXUS_33381,
		PORTAL_NEXUS_33382, PORTAL_NEXUS_33383, PORTAL_NEXUS_33384, PORTAL_NEXUS_33385, PORTAL_NEXUS_33386, PORTAL_NEXUS_33387, PORTAL_NEXUS_33388,
		PORTAL_NEXUS_33389, PORTAL_NEXUS_33390, PORTAL_NEXUS_33391, PORTAL_NEXUS_33392, PORTAL_NEXUS_33393, PORTAL_NEXUS_33394, PORTAL_NEXUS_33395,
		PORTAL_NEXUS_33396, PORTAL_NEXUS_33397, PORTAL_NEXUS_33398, PORTAL_NEXUS_33399, PORTAL_NEXUS_33400, PORTAL_NEXUS_33401, PORTAL_NEXUS_33402,
		PORTAL_NEXUS_33403, PORTAL_NEXUS_33404, PORTAL_NEXUS_33405, PORTAL_NEXUS_33406, PORTAL_NEXUS_33407, PORTAL_NEXUS_33408, PORTAL_NEXUS_33409,
		PORTAL_NEXUS_33410, PORTAL_NEXUS_33423, PORTAL_NEXUS_33424, PORTAL_NEXUS_33425, PORTAL_NEXUS_33426, PORTAL_NEXUS_33427, PORTAL_NEXUS_33428,
		PORTAL_NEXUS_33429, PORTAL_NEXUS_33430, PORTAL_NEXUS_33431, PORTAL_NEXUS_37547, PORTAL_NEXUS_37548, PORTAL_NEXUS_37549, PORTAL_NEXUS_37550,
		PORTAL_NEXUS_37551, PORTAL_NEXUS_37552, PORTAL_NEXUS_37553, PORTAL_NEXUS_37554, PORTAL_NEXUS_37555, PORTAL_NEXUS_37556, PORTAL_NEXUS_37557,
		PORTAL_NEXUS_37558, PORTAL_NEXUS_37559, PORTAL_NEXUS_37560, PORTAL_NEXUS_37561, PORTAL_NEXUS_37562, PORTAL_NEXUS_37563, PORTAL_NEXUS_37564,
		PORTAL_NEXUS_37565, PORTAL_NEXUS_37566, PORTAL_NEXUS_37567, PORTAL_NEXUS_37568, PORTAL_NEXUS_37569, PORTAL_NEXUS_37570, PORTAL_NEXUS_37571,
		PORTAL_NEXUS_37572, PORTAL_NEXUS_37573, PORTAL_NEXUS_37574, PORTAL_NEXUS_37575, PORTAL_NEXUS_37576, PORTAL_NEXUS_37577, PORTAL_NEXUS_37578,
		PORTAL_NEXUS_37579, PORTAL_NEXUS_37580
	),
	XERICSTALISMAN("xericstalisman",
		XERICS_TALISMAN, XERICS_TALISMAN_33412, XERICS_TALISMAN_33413, XERICS_TALISMAN_33414, XERICS_TALISMAN_33415, XERICS_TALISMAN_33419
	),
	DIGSITEPENDANT("digsitependant",
		DIGSITE_PENDANT, DIGSITE_PENDANT_33417, DIGSITE_PENDANT_33418, DIGSITE_PENDANT_33420
	),
	MYTHICALCAPE("mythicalcape", MYTHICAL_CAPE, MOUNTED_MYTHICAL_CAPE);

	private static final Map<Integer, PohIcons> minimapIcons;

	@Getter(AccessLevel.PACKAGE)
	private final String imageResource;
	@Getter(AccessLevel.PACKAGE)
	private final int[] Ids;

	private BufferedImage image;

	static
	{
		ImmutableMap.Builder<Integer, PohIcons> builder = new ImmutableMap.Builder<>();

		for (PohIcons icon : values())
		{
			for (Integer spotId : icon.getIds())
			{
				builder.put(spotId, icon);
			}
		}

		minimapIcons = builder.build();
	}

	PohIcons(String imageResource, int... ids)
	{
		this.imageResource = imageResource;
		this.Ids = ids;
	}

	public static PohIcons getIcon(int id)
	{
		return minimapIcons.get(id);
	}

	public BufferedImage getImage()
	{
		if (image != null)
		{
			return image;
		}

		image = ImageUtil.getResourceStreamFromClass(getClass(), getImageResource() + ".png");

		return image;
	}
}
