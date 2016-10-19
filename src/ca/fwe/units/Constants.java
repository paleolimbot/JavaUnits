package ca.fwe.units;

import java.util.ArrayList;

public class Constants {
		public static final int CATEGORY_RATIO = 1 ;
		public static final int CATEGORY_PHYSICAL_CONSTANTS = 2 ;
		public static final int CATEGORY_DENSITY = 3 ;
		public static final int CATEGORY_CHEMISTRY = 4 ;
	
	
		//Ratio
		public static final Constant PI = new Constant("Pi", CATEGORY_RATIO, Math.PI) ;
		public static final Constant TWO_PI = new Constant ("2*Pi", CATEGORY_RATIO, 2 * Math.PI) ;
	
		public static final Constant[] RATIO = {PI, TWO_PI} ;
		
		//Physical constants
		public static final Constant SPEED_OF_LIGHT = new Constant("Speed of light", CATEGORY_PHYSICAL_CONSTANTS, 299792458, Units.velocity.METRES_PER_SECOND) ;
		
		public static final Constant[] PCONST = {SPEED_OF_LIGHT} ;

		//Auto-generated density
		
		public static final Constant DENSITY1 = new Constant("Alfalfa, ground", CATEGORY_DENSITY, 256.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY2 = new Constant("Alum, lumpy", CATEGORY_DENSITY, 881.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY3 = new Constant("Alum, pulverized", CATEGORY_DENSITY, 753.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY4 = new Constant("Alumina", CATEGORY_DENSITY, 961.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY5 = new Constant("Aluminum, oxide", CATEGORY_DENSITY, 1522.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY6 = new Constant("Ammonia gas", CATEGORY_DENSITY, 0.77, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY7 = new Constant("Ammonium Nitrate", CATEGORY_DENSITY, 730.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY8 = new Constant("Ammonium Sulphate - dry", CATEGORY_DENSITY, 1130.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY9 = new Constant("Ammonium Sulphate - wet", CATEGORY_DENSITY, 1290.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY10 = new Constant("Andesite, solid", CATEGORY_DENSITY, 2771.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY11 = new Constant("Antimony, cast", CATEGORY_DENSITY, 6696.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY12 = new Constant("Apples", CATEGORY_DENSITY, 641.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY13 = new Constant("Arsenic", CATEGORY_DENSITY, 5671.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY14 = new Constant("Asbestos - shredded", CATEGORY_DENSITY, 360.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY15 = new Constant("Asbestos rock", CATEGORY_DENSITY, 1600.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY16 = new Constant("Ashes - wet", CATEGORY_DENSITY, 810.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY17 = new Constant("Ashes - dry", CATEGORY_DENSITY, 610.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY18 = new Constant("Asphalt, crushed", CATEGORY_DENSITY, 721.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY19 = new Constant("Babbitt", CATEGORY_DENSITY, 7272.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY20 = new Constant("Bagasse", CATEGORY_DENSITY, 120.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY21 = new Constant("Bakelite, solid", CATEGORY_DENSITY, 1362.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY22 = new Constant("Baking powder", CATEGORY_DENSITY, 721.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY23 = new Constant("Barium", CATEGORY_DENSITY, 3780.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY24 = new Constant("Bark, wood refuse", CATEGORY_DENSITY, 240.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY25 = new Constant("Barley", CATEGORY_DENSITY, 609.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY26 = new Constant("Barite, crushed", CATEGORY_DENSITY, 2883.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY27 = new Constant("Basalt, broken", CATEGORY_DENSITY, 1954.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY28 = new Constant("Basalt, solid", CATEGORY_DENSITY, 3011.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY29 = new Constant("Bauxite, crushed", CATEGORY_DENSITY, 1281.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY30 = new Constant("Beans, castor", CATEGORY_DENSITY, 577.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY31 = new Constant("Beans, cocoa", CATEGORY_DENSITY, 593.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY32 = new Constant("Beans, navy", CATEGORY_DENSITY, 801.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY33 = new Constant("Beans, soy", CATEGORY_DENSITY, 721.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY34 = new Constant("Beeswax", CATEGORY_DENSITY, 961.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY35 = new Constant("Beets", CATEGORY_DENSITY, 721.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY36 = new Constant("Bentonite", CATEGORY_DENSITY, 593.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY37 = new Constant("Bicarbonate of soda", CATEGORY_DENSITY, 689.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY38 = new Constant("Bismuth", CATEGORY_DENSITY, 9787.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY39 = new Constant("Bones, pulverized", CATEGORY_DENSITY, 881.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY40 = new Constant("Borax, fine", CATEGORY_DENSITY, 849.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY41 = new Constant("Bran", CATEGORY_DENSITY, 256.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY42 = new Constant("Brewers grain", CATEGORY_DENSITY, 432.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY43 = new Constant("Brick, common red", CATEGORY_DENSITY, 1922.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY44 = new Constant("Brick, fire clay", CATEGORY_DENSITY, 2403.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY45 = new Constant("Brick, silica", CATEGORY_DENSITY, 2050.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY46 = new Constant("Brick, chrome", CATEGORY_DENSITY, 2803.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY47 = new Constant("Brick, magnesia", CATEGORY_DENSITY, 2563.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY48 = new Constant("Buckwheat", CATEGORY_DENSITY, 657.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY49 = new Constant("Butter", CATEGORY_DENSITY, 865.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY50 = new Constant("Cadmium", CATEGORY_DENSITY, 8650.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY51 = new Constant("Calcium carbide", CATEGORY_DENSITY, 1201.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY52 = new Constant("Caliche", CATEGORY_DENSITY, 1442.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY53 = new Constant("Carbon, solid", CATEGORY_DENSITY, 2146.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY54 = new Constant("Carbon, powdered", CATEGORY_DENSITY, 80.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY55 = new Constant("Carbon dioxide", CATEGORY_DENSITY, 1.98, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY56 = new Constant("Carbon monoxide", CATEGORY_DENSITY, 1.25, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY57 = new Constant("Cardboard", CATEGORY_DENSITY, 689.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY58 = new Constant("Cement - clinker", CATEGORY_DENSITY, 1440.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY59 = new Constant("Cement, Portland", CATEGORY_DENSITY, 1506.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY60 = new Constant("Cement, mortar", CATEGORY_DENSITY, 2162.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY61 = new Constant("Cement, slurry", CATEGORY_DENSITY, 1442.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY62 = new Constant("Chalk, solid", CATEGORY_DENSITY, 2499.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY63 = new Constant("Chalk, lumpy", CATEGORY_DENSITY, 1442.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY64 = new Constant("Chalk, fine", CATEGORY_DENSITY, 1121.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY65 = new Constant("Charcoal", CATEGORY_DENSITY, 208.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY66 = new Constant("Chloroform", CATEGORY_DENSITY, 1522.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY67 = new Constant("Chocolate, powder", CATEGORY_DENSITY, 641.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY68 = new Constant("Chromic acid, flake", CATEGORY_DENSITY, 1201.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY69 = new Constant("Chromium", CATEGORY_DENSITY, 6856.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY70 = new Constant("Chromium ore", CATEGORY_DENSITY, 2162.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY71 = new Constant("Cinders, furnace", CATEGORY_DENSITY, 913.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY72 = new Constant("Cinders, Coal, ash", CATEGORY_DENSITY, 641.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY73 = new Constant("Clay, dry excavated", CATEGORY_DENSITY, 1089.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY74 = new Constant("Clay, wet excavated", CATEGORY_DENSITY, 1826.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY75 = new Constant("Clay, dry lump", CATEGORY_DENSITY, 1073.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY76 = new Constant("Clay, fire", CATEGORY_DENSITY, 1362.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY77 = new Constant("Clay, wet lump", CATEGORY_DENSITY, 1602.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY78 = new Constant("Clay, compacted", CATEGORY_DENSITY, 1746.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY79 = new Constant("Clover seed", CATEGORY_DENSITY, 769.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY80 = new Constant("Coal, Anthracite, solid", CATEGORY_DENSITY, 1506.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY81 = new Constant("Coal, Anthracite, broken", CATEGORY_DENSITY, 1105.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY82 = new Constant("Coal, Bituminous, solid", CATEGORY_DENSITY, 1346.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY83 = new Constant("Coal, Bituminous, broken", CATEGORY_DENSITY, 833.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY84 = new Constant("Cobaltite ( cobolt ore )", CATEGORY_DENSITY, 6295.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY85 = new Constant("Coconut, meal", CATEGORY_DENSITY, 513.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY86 = new Constant("Coconut, shredded", CATEGORY_DENSITY, 352.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY87 = new Constant("Coffee, fresh beans", CATEGORY_DENSITY, 561.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY88 = new Constant("Coffee, roast beans", CATEGORY_DENSITY, 432.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY89 = new Constant("Coke", CATEGORY_DENSITY, 610.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY90 = new Constant("Concrete, Asphalt", CATEGORY_DENSITY, 2243.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY91 = new Constant("Concrete, Gravel", CATEGORY_DENSITY, 2403.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY92 = new Constant("Concrete, Limestone with Portland", CATEGORY_DENSITY, 2371.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY93 = new Constant("Copper ore", CATEGORY_DENSITY, 2250.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY94 = new Constant("Copper sulfate, ground", CATEGORY_DENSITY, 3604.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY95 = new Constant("Copra, medium size", CATEGORY_DENSITY, 529.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY96 = new Constant("Copra, meal, ground", CATEGORY_DENSITY, 641.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY97 = new Constant("Copra, expeller cake ground", CATEGORY_DENSITY, 513.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY98 = new Constant("Copra, expeller cake chopped", CATEGORY_DENSITY, 465.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY99 = new Constant("Cork, solid", CATEGORY_DENSITY, 240.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY100 = new Constant("Cork, ground", CATEGORY_DENSITY, 160.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY101 = new Constant("Corn, on the cob", CATEGORY_DENSITY, 721.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY102 = new Constant("Corn, shelled", CATEGORY_DENSITY, 721.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY103 = new Constant("Corn, grits", CATEGORY_DENSITY, 673.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY104 = new Constant("Cottonseed, dry, de-linted", CATEGORY_DENSITY, 561.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY105 = new Constant("Cottonseed, dry, not de-linted", CATEGORY_DENSITY, 320.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY106 = new Constant("Cottonseed, cake, lumpy", CATEGORY_DENSITY, 673.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY107 = new Constant("Cottonseed, hulls", CATEGORY_DENSITY, 192.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY108 = new Constant("Cottonseed, meal", CATEGORY_DENSITY, 593.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY109 = new Constant("Cottonseed, meats", CATEGORY_DENSITY, 641.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY110 = new Constant("Cottonwood", CATEGORY_DENSITY, 416.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY111 = new Constant("Cryolite", CATEGORY_DENSITY, 1602.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY112 = new Constant("Cullet", CATEGORY_DENSITY, 1602.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY113 = new Constant("Culm", CATEGORY_DENSITY, 753.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY114 = new Constant("Dolomite, solid", CATEGORY_DENSITY, 2899.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY115 = new Constant("Dolomite, pulverized", CATEGORY_DENSITY, 737.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY116 = new Constant("Dolomite, lumpy", CATEGORY_DENSITY, 1522.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY117 = new Constant("Earth, loam, dry, excavated", CATEGORY_DENSITY, 1249.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY118 = new Constant("Earth, moist, excavated", CATEGORY_DENSITY, 1442.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY119 = new Constant("Earth, wet, excavated", CATEGORY_DENSITY, 1602.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY120 = new Constant("Earth, dense", CATEGORY_DENSITY, 2002.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY121 = new Constant("Earth, soft loose mud", CATEGORY_DENSITY, 1730.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY122 = new Constant("Earth, packed", CATEGORY_DENSITY, 1522.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY123 = new Constant("Earth, Fullers, raw", CATEGORY_DENSITY, 673.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY124 = new Constant("Emery", CATEGORY_DENSITY, 4005.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY125 = new Constant("Ether", CATEGORY_DENSITY, 737.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY126 = new Constant("Feldspar, solid", CATEGORY_DENSITY, 2563.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY127 = new Constant("Feldspar, pulverized", CATEGORY_DENSITY, 1233.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY128 = new Constant("Fertilizer, acid phosphate", CATEGORY_DENSITY, 961.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY129 = new Constant("Fish, scrap", CATEGORY_DENSITY, 721.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY130 = new Constant("Fish, meal", CATEGORY_DENSITY, 593.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY131 = new Constant("Flaxseed, whole", CATEGORY_DENSITY, 721.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY132 = new Constant("Flint - silica", CATEGORY_DENSITY, 1390.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY133 = new Constant("Flour, wheat", CATEGORY_DENSITY, 593.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY134 = new Constant("Flue dust", CATEGORY_DENSITY, 1700.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY135 = new Constant("Fluorspar, solid", CATEGORY_DENSITY, 3204.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY136 = new Constant("Fluorspar, lumps", CATEGORY_DENSITY, 1602.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY137 = new Constant("Fluorspar, pulverized", CATEGORY_DENSITY, 1442.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY138 = new Constant("Fullers Earth - raw or burnt", CATEGORY_DENSITY, 670.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY139 = new Constant("Galena ( lead ore )", CATEGORY_DENSITY, 7500.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY140 = new Constant("Garbage, household rubbish", CATEGORY_DENSITY, 481.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY141 = new Constant("Glass - broken or cullet", CATEGORY_DENSITY, 1500.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY142 = new Constant("Glass, window", CATEGORY_DENSITY, 2579.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY143 = new Constant("Glue, animal, flaked", CATEGORY_DENSITY, 561.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY144 = new Constant("Glue, vegetable, powdered", CATEGORY_DENSITY, 641.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY145 = new Constant("Gluten, meal", CATEGORY_DENSITY, 625.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY146 = new Constant("Gneiss, bed in place", CATEGORY_DENSITY, 2867.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY147 = new Constant("Gneiss, broken", CATEGORY_DENSITY, 1858.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY148 = new Constant("Granite, solid", CATEGORY_DENSITY, 2691.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY149 = new Constant("Granite, broken", CATEGORY_DENSITY, 1650.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY150 = new Constant("Graphite, flake", CATEGORY_DENSITY, 641.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY151 = new Constant("Grain - Maize", CATEGORY_DENSITY, 760.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY152 = new Constant("Grain - Barley", CATEGORY_DENSITY, 600.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY153 = new Constant("Grain - Millet", CATEGORY_DENSITY, 780.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY154 = new Constant("Grain - Wheat", CATEGORY_DENSITY, 790.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY155 = new Constant("Gravel, loose, dry", CATEGORY_DENSITY, 1522.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY156 = new Constant("Gravel, with sand, natural", CATEGORY_DENSITY, 1922.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY157 = new Constant("Gravel, dry 1/4 to 2 inch", CATEGORY_DENSITY, 1682.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY158 = new Constant("Gravel, wet 1/4 to 2 inch", CATEGORY_DENSITY, 2002.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY159 = new Constant("Gypsum, solid", CATEGORY_DENSITY, 2787.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY160 = new Constant("Gypsum, broken", CATEGORY_DENSITY, 1450.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY161 = new Constant("Gypsum, crushed", CATEGORY_DENSITY, 1602.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY162 = new Constant("Gypsum, pulverized", CATEGORY_DENSITY, 1121.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY163 = new Constant("Halite (salt), solid", CATEGORY_DENSITY, 2323.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY164 = new Constant("Halite (salt), broken", CATEGORY_DENSITY, 1506.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY165 = new Constant("Hematite ( iron ore )", CATEGORY_DENSITY, 5150.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY166 = new Constant("Hemimorphite ( zinc ore )", CATEGORY_DENSITY, 3445.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY167 = new Constant("Hydrochloric acid 40%", CATEGORY_DENSITY, 1201.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY168 = new Constant("Ice, solid", CATEGORY_DENSITY, 919.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY169 = new Constant("Ice, crushed", CATEGORY_DENSITY, 593.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY170 = new Constant("Ilmenite", CATEGORY_DENSITY, 2307.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY171 = new Constant("Iridium", CATEGORY_DENSITY, 22154.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY172 = new Constant("Iron ore - crushed - see metals table", CATEGORY_DENSITY, 2500.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY173 = new Constant("Iron oxide pigment", CATEGORY_DENSITY, 400.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY174 = new Constant("Iron Pyrites", CATEGORY_DENSITY, 2400.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY175 = new Constant("Iron sulphate - pickling tank - dry", CATEGORY_DENSITY, 1200.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY176 = new Constant("Iron sulphate - pickling tank - wet", CATEGORY_DENSITY, 1290.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY177 = new Constant("Ivory", CATEGORY_DENSITY, 1842.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY178 = new Constant("Kaolin, green crushed", CATEGORY_DENSITY, 1025.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY179 = new Constant("Kaolin, pulverized", CATEGORY_DENSITY, 352.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY180 = new Constant("Lead, rolled - see metals table", CATEGORY_DENSITY, 11389.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY181 = new Constant("Lead, red", CATEGORY_DENSITY, 3684.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY182 = new Constant("Lead, white pigment", CATEGORY_DENSITY, 4085.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY183 = new Constant("Leather", CATEGORY_DENSITY, 945.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY184 = new Constant("Lignite, dry", CATEGORY_DENSITY, 801.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY185 = new Constant("Lime, quick, lump", CATEGORY_DENSITY, 849.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY186 = new Constant("Lime, quick, fine", CATEGORY_DENSITY, 1201.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY187 = new Constant("Lime, stone, large", CATEGORY_DENSITY, 2691.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY188 = new Constant("Lime, stone, lump", CATEGORY_DENSITY, 1538.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY189 = new Constant("Lime, hydrated", CATEGORY_DENSITY, 481.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY190 = new Constant("Lime, wet or mortar", CATEGORY_DENSITY, 1540.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY191 = new Constant("Limonite, solid", CATEGORY_DENSITY, 3796.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY192 = new Constant("Limonite, broken", CATEGORY_DENSITY, 2467.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY193 = new Constant("Limestone, solid", CATEGORY_DENSITY, 2611.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY194 = new Constant("Limestone, broken", CATEGORY_DENSITY, 1554.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY195 = new Constant("Limestone, pulverized", CATEGORY_DENSITY, 1394.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY196 = new Constant("Linseed, whole", CATEGORY_DENSITY, 753.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY197 = new Constant("Linseed, meal", CATEGORY_DENSITY, 513.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY198 = new Constant("Locust, dry", CATEGORY_DENSITY, 705.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY199 = new Constant("Magnesite, solid", CATEGORY_DENSITY, 3011.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY200 = new Constant("Magnesium oxide", CATEGORY_DENSITY, 1940.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY201 = new Constant("Magnesium sulphate, crystal", CATEGORY_DENSITY, 1121.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY202 = new Constant("Magnetite, solid ( iron ore )", CATEGORY_DENSITY, 5046.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY203 = new Constant("Magnetite, broken", CATEGORY_DENSITY, 3284.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY204 = new Constant("Malachite ( copper ore )", CATEGORY_DENSITY, 3800.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY205 = new Constant("Malt", CATEGORY_DENSITY, 336.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY206 = new Constant("Manganese, solid", CATEGORY_DENSITY, 7609.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY207 = new Constant("Manganese oxide", CATEGORY_DENSITY, 1922.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY208 = new Constant("Manure", CATEGORY_DENSITY, 400.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY209 = new Constant("Marble, solid", CATEGORY_DENSITY, 2563.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY210 = new Constant("Marble, broken", CATEGORY_DENSITY, 1570.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY211 = new Constant("Marl, wet, excavated", CATEGORY_DENSITY, 2243.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY212 = new Constant("Mica, solid", CATEGORY_DENSITY, 2883.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY213 = new Constant("Mica, broken", CATEGORY_DENSITY, 1602.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY214 = new Constant("Mica - flake", CATEGORY_DENSITY, 520.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY215 = new Constant("Mica - powder", CATEGORY_DENSITY, 986.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY216 = new Constant("Milk, powdered", CATEGORY_DENSITY, 449.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY217 = new Constant("Molybdenum ore", CATEGORY_DENSITY, 1600.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY218 = new Constant("Mortar, wet", CATEGORY_DENSITY, 2403.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY219 = new Constant("Mud, packed", CATEGORY_DENSITY, 1906.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY220 = new Constant("Mud, fluid", CATEGORY_DENSITY, 1730.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY221 = new Constant("Nickel ore", CATEGORY_DENSITY, 1600.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY222 = new Constant("Nickel, rolled", CATEGORY_DENSITY, 8666.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY223 = new Constant("Nickel silver", CATEGORY_DENSITY, 8442.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY224 = new Constant("Nitric acid, 91%", CATEGORY_DENSITY, 1506.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY225 = new Constant("Nitrogen", CATEGORY_DENSITY, 1.26, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY226 = new Constant("Oak, red", CATEGORY_DENSITY, 705.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY227 = new Constant("Oats", CATEGORY_DENSITY, 432.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY228 = new Constant("Oats, rolled", CATEGORY_DENSITY, 304.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY229 = new Constant("Oil cake", CATEGORY_DENSITY, 785.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY230 = new Constant("Oil, linseed", CATEGORY_DENSITY, 942.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY231 = new Constant("Oil, petroleum", CATEGORY_DENSITY, 881.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY232 = new Constant("Oxygen", CATEGORY_DENSITY, 1.43, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY233 = new Constant("Oyster shells, ground", CATEGORY_DENSITY, 849.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY234 = new Constant("Paper, standard", CATEGORY_DENSITY, 1201.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY235 = new Constant("Peanuts, shelled", CATEGORY_DENSITY, 641.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY236 = new Constant("Peanuts, not shelled", CATEGORY_DENSITY, 272.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY237 = new Constant("Peat, dry", CATEGORY_DENSITY, 400.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY238 = new Constant("Peat, moist", CATEGORY_DENSITY, 801.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY239 = new Constant("Peat, wet", CATEGORY_DENSITY, 1121.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY240 = new Constant("Pecan wood", CATEGORY_DENSITY, 753.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY241 = new Constant("Phosphate rock, broken", CATEGORY_DENSITY, 1762.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY242 = new Constant("Phosphorus", CATEGORY_DENSITY, 2339.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY243 = new Constant("Pitch", CATEGORY_DENSITY, 1153.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY244 = new Constant("Plaster", CATEGORY_DENSITY, 849.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY245 = new Constant("Platinum ore", CATEGORY_DENSITY, 2600.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY246 = new Constant("Porcelain", CATEGORY_DENSITY, 2403.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY247 = new Constant("Porphyry, solid", CATEGORY_DENSITY, 2547.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY248 = new Constant("Porphyry, broken", CATEGORY_DENSITY, 1650.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY249 = new Constant("Potash", CATEGORY_DENSITY, 1281.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY250 = new Constant("Potassium chloride", CATEGORY_DENSITY, 2002.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY251 = new Constant("Potatoes, white", CATEGORY_DENSITY, 769.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY252 = new Constant("Pumice, stone", CATEGORY_DENSITY, 641.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY253 = new Constant("Quartz, solid", CATEGORY_DENSITY, 2643.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY254 = new Constant("Quartz, lump", CATEGORY_DENSITY, 1554.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY255 = new Constant("Quartz sand", CATEGORY_DENSITY, 1201.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY256 = new Constant("Resin, synthetic, crushed", CATEGORY_DENSITY, 561.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY257 = new Constant("Rice, hulled", CATEGORY_DENSITY, 753.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY258 = new Constant("Rice, rough", CATEGORY_DENSITY, 577.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY259 = new Constant("Rice grits", CATEGORY_DENSITY, 689.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY260 = new Constant("Rip-Rap", CATEGORY_DENSITY, 1602.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY261 = new Constant("Rock - soft - excavated with shovel", CATEGORY_DENSITY, 1700.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY262 = new Constant("Rosin", CATEGORY_DENSITY, 1073.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY263 = new Constant("Rubber, caoutchouc", CATEGORY_DENSITY, 945.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY264 = new Constant("Rubber, manufactured", CATEGORY_DENSITY, 1522.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY265 = new Constant("Rubber, ground scrap", CATEGORY_DENSITY, 481.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY266 = new Constant("Rye", CATEGORY_DENSITY, 705.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY267 = new Constant("Salt cake", CATEGORY_DENSITY, 1442.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY268 = new Constant("Salt, course", CATEGORY_DENSITY, 801.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY269 = new Constant("Salt, fine", CATEGORY_DENSITY, 1201.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY270 = new Constant("Saltpeter", CATEGORY_DENSITY, 1201.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY271 = new Constant("Sand, wet", CATEGORY_DENSITY, 1922.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY272 = new Constant("Sand, wet, packed", CATEGORY_DENSITY, 2082.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY273 = new Constant("Sand, dry", CATEGORY_DENSITY, 1602.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY274 = new Constant("Sand, loose", CATEGORY_DENSITY, 1442.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY275 = new Constant("Sand, rammed", CATEGORY_DENSITY, 1682.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY276 = new Constant("Sand, water filled", CATEGORY_DENSITY, 1922.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY277 = new Constant("Sand with Gravel, dry", CATEGORY_DENSITY, 1650.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY278 = new Constant("Sand with Gravel, wet", CATEGORY_DENSITY, 2020.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY279 = new Constant("Sandstone, solid", CATEGORY_DENSITY, 2323.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY280 = new Constant("Sandstone, broken", CATEGORY_DENSITY, 1400.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY281 = new Constant("Sawdust", CATEGORY_DENSITY, 210.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY282 = new Constant("Sewage, sludge", CATEGORY_DENSITY, 721.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY283 = new Constant("Shale, solid", CATEGORY_DENSITY, 2675.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY284 = new Constant("Shale, broken", CATEGORY_DENSITY, 1586.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY285 = new Constant("Shells - oyster", CATEGORY_DENSITY, 800.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY286 = new Constant("Sinter", CATEGORY_DENSITY, 1800.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY287 = new Constant("Slag, solid", CATEGORY_DENSITY, 2114.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY288 = new Constant("Slag, broken", CATEGORY_DENSITY, 1762.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY289 = new Constant("Slag, crushed, 1/4 inch", CATEGORY_DENSITY, 1185.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY290 = new Constant("Slag, furn. granulated", CATEGORY_DENSITY, 961.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY291 = new Constant("Slate, solid", CATEGORY_DENSITY, 2691.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY292 = new Constant("Slate, broken", CATEGORY_DENSITY, 1350.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY293 = new Constant("Slate, pulverized", CATEGORY_DENSITY, 1362.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY294 = new Constant("Smithsonite ( zinc ore )", CATEGORY_DENSITY, 4300.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY295 = new Constant("Snow, freshly fallen", CATEGORY_DENSITY, 160.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY296 = new Constant("Snow, compacted", CATEGORY_DENSITY, 481.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY297 = new Constant("Soap, solid", CATEGORY_DENSITY, 801.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY298 = new Constant("Soap, chips", CATEGORY_DENSITY, 160.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY299 = new Constant("Soap, flakes", CATEGORY_DENSITY, 160.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY300 = new Constant("Soap, powdered", CATEGORY_DENSITY, 368.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY301 = new Constant("Soapstone talc", CATEGORY_DENSITY, 2400.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY302 = new Constant("Soda Ash, heavy", CATEGORY_DENSITY, 1080.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY303 = new Constant("Soda Ash, light", CATEGORY_DENSITY, 432.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY304 = new Constant("Sodium", CATEGORY_DENSITY, 977.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY305 = new Constant("Sodium Aluminate, ground", CATEGORY_DENSITY, 1153.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY306 = new Constant("Sodium Nitrate, ground", CATEGORY_DENSITY, 1201.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY307 = new Constant("Soy beans, whole", CATEGORY_DENSITY, 753.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY308 = new Constant("Starch, powdered", CATEGORY_DENSITY, 561.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY309 = new Constant("Stone, crushed", CATEGORY_DENSITY, 1602.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY310 = new Constant("Stone (common, generic)", CATEGORY_DENSITY, 2515.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY311 = new Constant("Sugar, brown", CATEGORY_DENSITY, 721.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY312 = new Constant("Sugar, powdered", CATEGORY_DENSITY, 801.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY313 = new Constant("Sugar, granulated", CATEGORY_DENSITY, 849.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY314 = new Constant("Sugar, raw cane", CATEGORY_DENSITY, 961.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY315 = new Constant("Sugarbeet pulp, dry", CATEGORY_DENSITY, 208.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY316 = new Constant("Sugarbeet pulp, wet", CATEGORY_DENSITY, 561.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY317 = new Constant("Sugarcane", CATEGORY_DENSITY, 272.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY318 = new Constant("Sulphur, solid", CATEGORY_DENSITY, 2002.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY319 = new Constant("Sulphur, lump", CATEGORY_DENSITY, 1314.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY320 = new Constant("Sulphur, pulverized", CATEGORY_DENSITY, 961.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY321 = new Constant("Taconite", CATEGORY_DENSITY, 2803.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY322 = new Constant("Talc, solid", CATEGORY_DENSITY, 2691.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY323 = new Constant("Talc, broken", CATEGORY_DENSITY, 1746.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY324 = new Constant("Tanbark, ground", CATEGORY_DENSITY, 881.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY325 = new Constant("Tankage", CATEGORY_DENSITY, 961.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY326 = new Constant("Tar", CATEGORY_DENSITY, 1153.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY327 = new Constant("Tobacco", CATEGORY_DENSITY, 320.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY328 = new Constant("Trap rock, solid", CATEGORY_DENSITY, 2883.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY329 = new Constant("Trap rock, broken", CATEGORY_DENSITY, 1746.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY330 = new Constant("Turf", CATEGORY_DENSITY, 400.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY331 = new Constant("Turpentine", CATEGORY_DENSITY, 865.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY332 = new Constant("Walnut, black, dry", CATEGORY_DENSITY, 609.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY333 = new Constant("Water, pure", CATEGORY_DENSITY, 1000.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY334 = new Constant("Water, sea (see liquids table)", CATEGORY_DENSITY, 1026.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY335 = new Constant("Wheat", CATEGORY_DENSITY, 769.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY336 = new Constant("Wheat, cracked", CATEGORY_DENSITY, 673.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY337 = new Constant("Wood chips - dry - see wood table", CATEGORY_DENSITY, 400.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY338 = new Constant("Wool", CATEGORY_DENSITY, 1314.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant DENSITY339 = new Constant("Zinc oxide", CATEGORY_DENSITY, 400.0, Units.density.KG_PER_CUBIC_METRE) ;
		public static final Constant[] MATERIAL_DENSITY = {DENSITY1, DENSITY2, DENSITY3, DENSITY4, DENSITY5, DENSITY6, DENSITY7, DENSITY8, DENSITY9, DENSITY10, DENSITY11, DENSITY12, DENSITY13, DENSITY14, DENSITY15, DENSITY16, DENSITY17, DENSITY18, DENSITY19, DENSITY20, DENSITY21, DENSITY22, DENSITY23, DENSITY24, DENSITY25, DENSITY26, DENSITY27, DENSITY28, DENSITY29, DENSITY30, DENSITY31, DENSITY32, DENSITY33, DENSITY34, DENSITY35, DENSITY36, DENSITY37, DENSITY38, DENSITY39, DENSITY40, DENSITY41, DENSITY42, DENSITY43, DENSITY44, DENSITY45, DENSITY46, DENSITY47, DENSITY48, DENSITY49, DENSITY50, DENSITY51, DENSITY52, DENSITY53, DENSITY54, DENSITY55, DENSITY56, DENSITY57, DENSITY58, DENSITY59, DENSITY60, DENSITY61, DENSITY62, DENSITY63, DENSITY64, DENSITY65, DENSITY66, DENSITY67, DENSITY68, DENSITY69, DENSITY70, DENSITY71, DENSITY72, DENSITY73, DENSITY74, DENSITY75, DENSITY76, DENSITY77, DENSITY78, DENSITY79, DENSITY80, DENSITY81, DENSITY82, DENSITY83, DENSITY84, DENSITY85, DENSITY86, DENSITY87, DENSITY88, DENSITY89, DENSITY90, DENSITY91, DENSITY92, DENSITY93, DENSITY94, DENSITY95, DENSITY96, DENSITY97, DENSITY98, DENSITY99, DENSITY100, DENSITY101, DENSITY102, DENSITY103, DENSITY104, DENSITY105, DENSITY106, DENSITY107, DENSITY108, DENSITY109, DENSITY110, DENSITY111, DENSITY112, DENSITY113, DENSITY114, DENSITY115, DENSITY116, DENSITY117, DENSITY118, DENSITY119, DENSITY120, DENSITY121, DENSITY122, DENSITY123, DENSITY124, DENSITY125, DENSITY126, DENSITY127, DENSITY128, DENSITY129, DENSITY130, DENSITY131, DENSITY132, DENSITY133, DENSITY134, DENSITY135, DENSITY136, DENSITY137, DENSITY138, DENSITY139, DENSITY140, DENSITY141, DENSITY142, DENSITY143, DENSITY144, DENSITY145, DENSITY146, DENSITY147, DENSITY148, DENSITY149, DENSITY150, DENSITY151, DENSITY152, DENSITY153, DENSITY154, DENSITY155, DENSITY156, DENSITY157, DENSITY158, DENSITY159, DENSITY160, DENSITY161, DENSITY162, DENSITY163, DENSITY164, DENSITY165, DENSITY166, DENSITY167, DENSITY168, DENSITY169, DENSITY170, DENSITY171, DENSITY172, DENSITY173, DENSITY174, DENSITY175, DENSITY176, DENSITY177, DENSITY178, DENSITY179, DENSITY180, DENSITY181, DENSITY182, DENSITY183, DENSITY184, DENSITY185, DENSITY186, DENSITY187, DENSITY188, DENSITY189, DENSITY190, DENSITY191, DENSITY192, DENSITY193, DENSITY194, DENSITY195, DENSITY196, DENSITY197, DENSITY198, DENSITY199, DENSITY200, DENSITY201, DENSITY202, DENSITY203, DENSITY204, DENSITY205, DENSITY206, DENSITY207, DENSITY208, DENSITY209, DENSITY210, DENSITY211, DENSITY212, DENSITY213, DENSITY214, DENSITY215, DENSITY216, DENSITY217, DENSITY218, DENSITY219, DENSITY220, DENSITY221, DENSITY222, DENSITY223, DENSITY224, DENSITY225, DENSITY226, DENSITY227, DENSITY228, DENSITY229, DENSITY230, DENSITY231, DENSITY232, DENSITY233, DENSITY234, DENSITY235, DENSITY236, DENSITY237, DENSITY238, DENSITY239, DENSITY240, DENSITY241, DENSITY242, DENSITY243, DENSITY244, DENSITY245, DENSITY246, DENSITY247, DENSITY248, DENSITY249, DENSITY250, DENSITY251, DENSITY252, DENSITY253, DENSITY254, DENSITY255, DENSITY256, DENSITY257, DENSITY258, DENSITY259, DENSITY260, DENSITY261, DENSITY262, DENSITY263, DENSITY264, DENSITY265, DENSITY266, DENSITY267, DENSITY268, DENSITY269, DENSITY270, DENSITY271, DENSITY272, DENSITY273, DENSITY274, DENSITY275, DENSITY276, DENSITY277, DENSITY278, DENSITY279, DENSITY280, DENSITY281, DENSITY282, DENSITY283, DENSITY284, DENSITY285, DENSITY286, DENSITY287, DENSITY288, DENSITY289, DENSITY290, DENSITY291, DENSITY292, DENSITY293, DENSITY294, DENSITY295, DENSITY296, DENSITY297, DENSITY298, DENSITY299, DENSITY300, DENSITY301, DENSITY302, DENSITY303, DENSITY304, DENSITY305, DENSITY306, DENSITY307, DENSITY308, DENSITY309, DENSITY310, DENSITY311, DENSITY312, DENSITY313, DENSITY314, DENSITY315, DENSITY316, DENSITY317, DENSITY318, DENSITY319, DENSITY320, DENSITY321, DENSITY322, DENSITY323, DENSITY324, DENSITY325, DENSITY326, DENSITY327, DENSITY328, DENSITY329, DENSITY330, DENSITY331, DENSITY332, DENSITY333, DENSITY334, DENSITY335, DENSITY336, DENSITY337, DENSITY338, DENSITY339} ;
		
		
		
		private static ArrayList<ConstantCategory> cat ;
		
		public static ArrayList<ConstantCategory> getCategories() {
			if(cat == null) {
				cat = new ArrayList<ConstantCategory>() ;
				cat.add(new ConstantCategory("Ratios", CATEGORY_RATIO)) ;
				cat.add(new ConstantCategory("Physical constants", CATEGORY_PHYSICAL_CONSTANTS)) ;
				cat.add(new ConstantCategory("Chemistry", CATEGORY_CHEMISTRY)) ;
				cat.add(new ConstantCategory("Approximate densities", CATEGORY_DENSITY)) ;
			}
			return cat ;
		}
		
		private static ArrayList<Constant> all ;
		public static ArrayList<Constant> getAll() {
			if(all == null) {
				all = new ArrayList<Constant>() ;
				addArrayToAll(RATIO) ;
				addArrayToAll(PCONST) ;
				addArrayToAll(MATERIAL_DENSITY) ;
			}
			return all ;
		}
		
		private static void addArrayToAll(Constant[] array) {
			for(int i=0; i<array.length; i++) {
				all.add(array[i]) ;
			}
		}
		
		public static ArrayList<Constant> getConstants(int category)  {
			if(all == null) {
				getAll() ;
			}
			ArrayList<Constant> out = new ArrayList<Constant>() ;
			for(int i=0; i<all.size(); i++) {
				if(all.get(i).getCategory() == category)
					out.add(all.get(i)) ;
			}
			return out ;
		}

	
}
