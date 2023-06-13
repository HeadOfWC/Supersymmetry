package material;

import static material.SuSyMaterials.*;

import gregtech.api.unification.material.Material;
import gregtech.api.GregTechAPI;
import gregtech.api.fluids.fluidType.FluidTypes;
import gregtech.api.unification.material.properties.*

import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtechfoodoption.GTFOMaterialHandler.*;

public class SecondDegreeMaterials {
    public static void register() {

        log.infoMC("Registering Second Degree Materials!");

        NitrateSaltMix = new Material.Builder(13000, 'nitrate_salt_mix')
                .dust()
                .components(AmmoniumChloride, 1, Saltpeter, 1)
                .colorAverage()
                .build();

        AmmoniumChlorideSolution = new Material.Builder(13001, "ammonium_chloride_solution")
                .fluid()
                .components(Water, 1, AmmoniumChloride, 1)
                .colorAverage()
                .build();

        PotassiumChlorideSolution = new Material.Builder(13002, "potassium_chloride_solution")
                .fluid()
                .color(0x3b5eeb)
                .components(Water, 1, RockSalt, 1)
                .colorAverage()
                .build();

        PotassiumBisulfateSolution = new Material.Builder(13003, "potassium_bisulfate_solution")
                .fluid()
                .components(Water, 1, PotassiumBisulfate, 1)
                .colorAverage()
                .build();

        SodiumBisulfateSolution = new Material.Builder(13004, "sodium_bisulfate_solution")
                .fluid()
                .components(Water, 1, SodiumBisulfate, 1)
                .colorAverage()
                .build();

        CalciumChlorideSolution = new Material.Builder(13005, "calcium_chloride_solution")
                .fluid()
                .components(Water, 1, CalciumChloride, 1)
                .colorAverage()
                .build();

        SodaAshSolution = new Material.Builder(13006, "soda_ash_solution")
                .fluid()
                .components(Water, 1, SodaAsh, 1)
                .colorAverage()
                .build();

        SodiumBicarbonateSolution = new Material.Builder(13007, "sodium_bicarbonate_solution")
                .fluid()
                .color(0x252747)
                .build()
                .setFormula("(H2O)(NaHCO3)", true)

        AmmoniumNitrateSolution = new Material.Builder(13008, 'ammonium_nitrate_solution')
                .fluid()
                .components(Water, 1, material('ammonium_nitrate'), 1)
                .colorAverage()
                .build();

        NitrateSolution = new Material.Builder(13009, 'nitrate_solution')
                .fluid()
                .components(Water, 2, AmmoniumChloride, 1, Saltpeter, 1)
                .colorAverage()
                .build();

        SodiumNitrateSolution = new Material.Builder(13010, 'sodium_nitrate_solution')
                .fluid()
                .components(Water, 1, SodiumNitrate, 1)
                .colorAverage()
                .build();

        DilutePotassiumCarbonateSolution = new Material.Builder(13011, "dilute_potassium_carbonate_solution")
                .fluid()
                .components(Water, 3, PotassiumCarbonate, 1)
                .colorAverage()
                .build();

        PotassiumHydroxideSolution = new Material.Builder(13012, "potassium_hydroxide_solution")
                .fluid()
                .components(Water, 1, PotassiumHydroxide, 1)
                .colorAverage()
                .build();

        CalciumHydroxideSolution = new Material.Builder(13013, "calcium_hydroxide_solution")
                .fluid()
                .components(Water, 1, material('calcium_hydroxide'), 1)
                .colorAverage()
                .build();

        SodiumSilicateSolution = new Material.Builder(13014, "sodium_silicate_solution")
                .fluid()
                .components(Water, 4, SodiumSilicate, 1)
                .colorAverage()
                .build();

        SodiumAluminateSolution = new Material.Builder(13015, "sodium_aluminate_solution")
                .fluid()
                .components(SodiumAluminate, 1, Water, 1)
                .color(0x3f71bf)
                .build();

        SodiumFluorideSolution = new Material.Builder(13016, "sodium_fluoride_solution")
                .fluid()
                .components(SodiumFluoride, 1, Water, 1)
                .colorAverage()
                .build();

        PotassiumFluorideSolution = new Material.Builder(13017, "potassium_fluoride_solution")
                .fluid()
                .components(Water, 1, PotassiumFluoride, 1)
                .colorAverage()
                .build();

        PotassiumTetrafluoroborateSolution = new Material.Builder(13018, "potassium_tetrafluoroborate_solution")
                .fluid()
                .components(Water, 7, PotassiumTetrafluoroborate, 2)
                .color(0x8fb5a3)
                .build();

        SodiumBromideSolution = new Material.Builder(13019, "sodium_bromide_solution")
                .fluid()
                .components(SodiumBromide, 1, Water, 1)
                .colorAverage()
                .build();

        WackerCatalyst = new Material.Builder(13020, "wacker_catalyst")
                .dust()
                .components(PalladiumChloride, 1, CopperIIChloride, 1)
                .colorAverage()
                .build();

        PotassiumIodideSolution = new Material.Builder(13021, "potassium_iodide_solution")
                .fluid()
                .components(Water, 1, PotassiumIodide, 1)
                .colorAverage()
                .build();

        SodiumSulfateSolution = new Material.Builder(13022, "sodium_sulfate_solution")
                .fluid()
                .color(0xb0b0bf)
                .build()
                .setFormula("(H2O)(Na2SO4)", true);

        ImpregnatedCopperOxideCatalyst = new Material.Builder(13023, "impregnated_copper_oxide_catalyst")
                .dust()
                .components(CopperIIOxide, 1, Alumina, 1)
                .colorAverage()
                .build()

        PhilipsCatalyst = new Material.Builder(13024, "philips_catalyst")
                .dust()
                .components(SiliconDioxide, 1, ChromiumTrioxide, 1)
                .colorAverage()
                .build()

        ZieglerNattaCatalyst = new Material.Builder(13025, "ziegler_natta_catalyst")
                .dust()
                .components(Triethylaluminium, 1, TitaniumTetrachloride, 1)
                .colorAverage()
                .build()

        HydrogenPeroxideSolution = new Material.Builder(13026, "hydrogen_peroxide_solution")
                .fluid()
                .components(Water, 1, HydrogenPeroxide, 1)
                .colorAverage()
                .build()

        AmmoniumAcetateSolution = new Material.Builder(13027, 'ammonium_acetate_solution')
                .fluid()
                .components(Water, 1, Carbon, 2, Hydrogen, 7, Nitrogen, 1, Oxygen, 2)
                .colorAverage()
                .build()

        TetramethylammoniumHydroxideSolution = new Material.Builder(13028, 'tetramethylammonium_hydroxide_solution')
                .fluid()
                .components(Methanol, 1, TetramethylammoniumHydroxide, 1)
                .colorAverage()
                .build()

        SodiumSulfiteSolution = new Material.Builder(13029, "sodium_sulfite_solution")
                .fluid()
                .components(SodiumSulfite, 1, Water, 1)
                .colorAverage()
                .build()

        PhosphorusSolution = new Material.Builder(13030, 'phosphorus_solution')
                .fluid()
                .components(PhosphorusTrichloride, 1, Phosphorus, 1)
                .colorAverage()
                .build()

        SodiumCyanideSolution = new Material.Builder(13031, 'sodium_cyanide_solution')
                .fluid()
                .components(Water, 2, SodiumCyanide, 1)
                .colorAverage()
                .build()

        BrominatedSulfurDioxide = new Material.Builder(13032, 'brominated_sulfur_dioxide')
                .fluid()
                .components(SulfuricAcid, 1, HydrobromicAcid, 2)
                .colorAverage()
                .build()

        SodiumThiosulfateSolution = new Material.Builder(13033, "sodium_thiosulfate_solution")
                .fluid()
                .components(SodiumThiosulfate, 1, Water, 1)
                .colorAverage()
                .build()

        SodiumPerchlorateSolution = new Material.Builder(13035, 'sodium_perchlorate_solution')
                .fluid()
                .color(0x5880c7)
                .build()

        SodiumPerchlorateSolution.setFormula("(H2O)(NaClO4)", true);

        SodiumChlorateSolution = new Material.Builder(13036, 'sodium_chlorate_solution')
                .fluid()
                .color(0x315fe8)
                .build()

        SodiumChlorateSolution.setFormula("(H2O)(NaClO3)", true);

        DilutedAniline = new Material.Builder(13037, 'diluted_aniline')
                .fluid()
                .color(0x5fb36e)
                .build()

        DilutedAniline.setFormula("(H2O)2(C6H5NH2)", true);

        DilutedIron3ChlorideSolution = new Material.Builder(13038, "diluted_iron_iii_chloride_solution")
                .fluid()
                .components(Iron3Chloride, 1, Water, 3)
                .colorAverage()
                .build()

        ChloroauricAcidSolution = new Material.Builder(13039, "chloroauric_acid_solution")
                .fluid()
                .components(ChloroauricAcid, 3, NitricAcid, 1, Water, 6)
                .color(0xd69129)
                .build();

        ZincChlorideSolution = new Material.Builder(13040, "zinc_chloride_solution")
                .fluid()
                .components(ZincChloride, 1, Water, 1)
                .colorAverage()
                .build();

        WohlwillElectrolyte = new Material.Builder(13041, "wohlwill_electrolyte")
                .fluid()
                .components(ChloroauricAcid, 1, Water, 1, HydrogenChloride, 2)
                .color(0xe8b833)
                .build();

        SpentWohlwilElectrolyte = new Material.Builder(13042, "spent_wohlwill_electrolyte")
                .fluid()
                .components(ChloroauricAcid, 1, Water, 1, HydrogenChloride, 2)
                .color(0xfacd50)
                .build();

        SpentWohlwilElectrolyte.setFormula("(?)(H[AuCl4])(H2O)(HCl)2", true)

        GoldOreSlurry = new Material.Builder(13043, "gold_ore_slurry")
                .fluid()
                .components(GoldConcentrate, 4, Water, 6)
                .colorAverage()
                .build();

        GoldEluent = new Material.Builder(13044, "gold_eluent")
                .fluid()
                .components(SodiumCyanide, 1, SodiumHydroxide, 1, Water, 27)
                .colorAverage()
                .build();

        GoldEluteSolution = new Material.Builder(13045, "gold_elute_solution")
                .fluid()
                .components(SodiumCyanide, 1, SodiumHydroxide, 1, Sodium, 27, Gold, 27, Carbon, 54, Nitrogen, 54, Water, 27)
                .color(0xbbcc64)
                .build();

        GoldEluteSolution.setFormula("(NaCN)(NaOH)(Na[Au(CN)2])27(H2O)27", true)

        PotashSolution = new Material.Builder(13046, "potash_solution")
                .fluid()
                .components(PotassiumCarbonate, 1, Water, 1)
                .colorAverage()
                .build()

        PotassiumSulfateSolution = new Material.Builder(13047, "potassium_sulfate_solution")
                .fluid()
                .components(PotassiumSulfate, 1, Water, 1)
                .colorAverage()
                .build()

        BismanolMagnetic = new Material.Builder(13048, "bismanol_magnetic")
                .ingot()
                .color(0x52704c).iconSet(MAGNETIC)
                .flags(GENERATE_ROD, IS_MAGNETIC)
                .components(Bismanol, 1)
                .ingotSmeltInto(Bismanol)
                .arcSmeltInto(Bismanol)
                .macerateInto(Bismanol)
                .build();

        Bismanol.getProperty(PropertyKey.INGOT).setMagneticMaterial(BismanolMagnetic);

        NeodymiumAlloyMagnetic = new Material.Builder(13049, "neodymium_alloy_magnetic")
                .ingot()
                .color(0x211a1a).iconSet(MAGNETIC)
                .flags(GENERATE_ROD, IS_MAGNETIC)
                .components(NeodymiumAlloy, 1)
                .ingotSmeltInto(NeodymiumAlloy)
                .arcSmeltInto(NeodymiumAlloy)
                .macerateInto(NeodymiumAlloy)
                .build();

        NeodymiumAlloy.getProperty(PropertyKey.INGOT).setMagneticMaterial(NeodymiumAlloyMagnetic);

        SamariumAlloyMagnetic = new Material.Builder(13050, "samarium_alloy_magnetic")
                .ingot()
                .color(0xcadea6).iconSet(MAGNETIC)
                .flags(GENERATE_ROD, IS_MAGNETIC)
                .components(SamariumAlloy, 1)
                .ingotSmeltInto(SamariumAlloy)
                .arcSmeltInto(SamariumAlloy)
                .macerateInto(SamariumAlloy)
                .build();

        SamariumAlloy.getProperty(PropertyKey.INGOT).setMagneticMaterial(SamariumAlloyMagnetic);
    }
}