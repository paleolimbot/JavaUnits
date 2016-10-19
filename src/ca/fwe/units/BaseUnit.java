package ca.fwe.units;

/**
 * @author Dewey Dunnington
 * 
 * A class containing units of the 7 base unit types (as defined by SI), defining them in terms of their SI unit and Dimension.
 * These units are not used on their own, but should be used as components in a Unit.
 *
 */
public class BaseUnit {
	private Dimension baseUnit ;
	private String unitName ;
	private String unitAbbreviation ;
	private double baseUnitOffset ;
	private double baseUnitRatio ;

	//Common Units
	public static final BaseUnit RATIO = new BaseUnit(1.0) ;
	public static final BaseUnit PI = new BaseUnit(Math.PI) ;

	//Distance
	public static final BaseUnit METRE = new BaseUnit(Dimension.LENGTH, "metre", "m", 1.0) ;
	public static final BaseUnit DECIMETRE = new BaseUnit(Dimension.LENGTH, "decimetre", "dm", 0.1) ;
	public static final BaseUnit HECTOMETRE = new BaseUnit(Dimension.LENGTH, "hectometre", "hm", 100) ;
	public static final BaseUnit KILOMETRE = new BaseUnit(Dimension.LENGTH, "kilometre", "km", 1000) ;
	public static final BaseUnit CENTIMETRE = new BaseUnit(Dimension.LENGTH, "centimetre", "cm", 0.01) ;
	public static final BaseUnit MILLIMETRE = new BaseUnit(Dimension.LENGTH, "millimetre", "mm", 0.001) ;
	public static final BaseUnit MICROMETRE = new BaseUnit(Dimension.LENGTH, "micrometer", "um", 1e-6) ;
	public static final BaseUnit MILE = new BaseUnit(Dimension.LENGTH, "mile", "mi", 1609.34) ;
	public static final BaseUnit FOOT = new BaseUnit(Dimension.LENGTH, "foot", "ft", 0.3048) ;
	public static final BaseUnit CHAIN = new BaseUnit(Dimension.LENGTH, "chain", "chain", 20.1168) ;
	public static final BaseUnit FURLONG = new BaseUnit(Dimension.LENGTH, "furlong", "furlong", 201.168) ;
	public static final BaseUnit INCH = new BaseUnit(Dimension.LENGTH, "inch", "in", 0.0254) ;
	public static final BaseUnit YARD = new BaseUnit(Dimension.LENGTH, "yard", "yd", 0.9144) ;

	//Mass
	public static final BaseUnit KILOGRAM = new BaseUnit(Dimension.MASS, "kilogram", "kg", 1.0) ;
	public static final BaseUnit MILLIGRAM = new BaseUnit(Dimension.MASS, "milligram", "mg", 1e-6) ;
	public static final BaseUnit GRAM = new BaseUnit(Dimension.MASS, "gram", "g", 0.001) ;
	public static final BaseUnit SLUG = new BaseUnit(Dimension.MASS, "slug", "slug", 14.5939029) ;
	public static final BaseUnit TONNES = new BaseUnit(Dimension.MASS, "metric tonne", "tonne", 1000) ;

	public static final BaseUnit POUND_EARTH = new BaseUnit(Dimension.MASS, "pound (earth)", "lb_mass", 0.45359237) ;
	public static final BaseUnit SHORT_TON_EARTH = new BaseUnit(Dimension.MASS, "short ton (earth)", "ton_mass", 907.18474) ;

	//Time
	public static final BaseUnit SECOND = new BaseUnit(Dimension.TIME, "second", "s", 1.0) ;
	public static final BaseUnit MINUTE = new BaseUnit(Dimension.TIME, "minute", "min", 60) ;
	public static final BaseUnit HOUR = new BaseUnit(Dimension.TIME, "hour", "hr", 3600) ;
	public static final BaseUnit DAY = new BaseUnit(Dimension.TIME, "day", "day", 86400) ;
	public static final BaseUnit WEEK = new BaseUnit(Dimension.TIME, "week", "wk", 604800) ;
	public static final BaseUnit YEAR = new BaseUnit(Dimension.TIME, "year", "yr", 3.15569e7) ;

	//Current
	public static final BaseUnit AMPERE = new BaseUnit(Dimension.ELECTRIC_CURRENT, "ampere", "A", 1.0) ;
	public static final BaseUnit MILLIAMP = new BaseUnit(Dimension.ELECTRIC_CURRENT, "milliamp", "ma", 0.001) ;

	//Temperature
	public static final BaseUnit KELVIN = new BaseUnit(Dimension.TEMPERATURE, "kelvin", "K", 1.0) ;
	public static final BaseUnit DEGREES_CELCIUS = new BaseUnit(Dimension.TEMPERATURE, "degrees Celcius", "deg_C", 1, 273.15) ;
	public static final BaseUnit DEGREES_FARENHEIGHT = new BaseUnit(Dimension.TEMPERATURE, "degrees Farenheight", "deg_F", 1.8, 459.67) ;

	//luminous intensity
	public static final BaseUnit CANDELA = new BaseUnit(Dimension.LUMINOUS_INTENSITY, "candella", "can", 1.0) ;

	//Amount
	public static final BaseUnit MOLE = new BaseUnit(Dimension.AMMOUNT_OF_SUBSTANCE, "mole", "mol", 1.0) ;
	public static final BaseUnit MILLIMOLE = new BaseUnit(Dimension.AMMOUNT_OF_SUBSTANCE, "millimole", "mmol", 0.001) ;

	//Angles
	public static final BaseUnit RADIAN = new BaseUnit(Dimension.ANGLE, "radian", "rad", 1.0) ;
	public static final BaseUnit REVOLUTION = new BaseUnit(Dimension.ANGLE, "revolution", "rev", 2 * Math.PI) ;
	public static final BaseUnit DEGREE = new BaseUnit(Dimension.ANGLE, "degree", "deg", 0.0174532925) ;
	public static final BaseUnit GRADIAN = new BaseUnit(Dimension.ANGLE, "gradian", "grad", 15.707963e-3) ;

	//Currency
	public static final BaseUnit DOLLAR = new BaseUnit(Dimension.CURRENCY, "dollar", "$", 1.0) ;

	//Data storage
	public static final BaseUnit BYTE = new BaseUnit(Dimension.DATA_STORAGE, "byte", "b", 1.0) ;
	public static final BaseUnit BIT = new BaseUnit(Dimension.DATA_STORAGE, "bit", "bit", 0.125) ;
	public static final BaseUnit KILOBYTE = new BaseUnit(Dimension.DATA_STORAGE, "kilobyte", "kiB", 1024) ;
	public static final BaseUnit MEGABYTE = new BaseUnit(Dimension.DATA_STORAGE, "megabyte", "MiB", 1e6) ;
	public static final BaseUnit GIGABYTE = new BaseUnit(Dimension.DATA_STORAGE, "gigabyte", "GiB", 1e9) ;



	/**
	 * A list of all BaseUnit objects contained in this library.
	 */
	public static final BaseUnit[] ALL = {METRE, DECIMETRE, HECTOMETRE, KILOMETRE, CENTIMETRE, MILLIMETRE, MICROMETRE,
		MILE, FOOT, CHAIN, FURLONG, INCH, YARD, KILOGRAM, MILLIGRAM, GRAM, SLUG, TONNES, POUND_EARTH, SHORT_TON_EARTH,
		SECOND, MINUTE, HOUR, DAY, WEEK, YEAR, AMPERE, KELVIN,
		DEGREES_CELCIUS, DEGREES_FARENHEIGHT, CANDELA, MOLE, MILLIMOLE, RADIAN, REVOLUTION, DEGREE, GRADIAN, 
		DOLLAR, BYTE, BIT, KILOBYTE, MEGABYTE, GIGABYTE} ;

	/**
	 * @param base dimension associated with this BaseUnit
	 * @param name long form name
	 * @param abbreviation unique abbreviation for the BaseUnit. Must be unique, as it is used to store units.
	 * @param ratio ratio between the SI unit and this unit (i.e. what you would multiply a value in this unit to get the value in SI units)
	 * @param offset used to accommodate degrees celcius and farenheight, but not implemented in the Unit class.
	 */
	public BaseUnit(Dimension base, String name, String abbreviation, double ratio, double offset) {
		baseUnit = base ;
		unitName = name ;
		unitAbbreviation = abbreviation ;
		baseUnitOffset = offset ;
		baseUnitRatio = ratio ;
	}

	/**
	 * @param base dimension associated with this BaseUnit
	 * @param name long form name
	 * @param abbreviation unique abbreviation for the BaseUnit. Must be unique, as it is used to store units.
	 * @param ratio ratio between the SI unit and this unit (i.e. what you would multiply a value in this unit to get the value in SI units)
	 */
	public BaseUnit(Dimension base, String name, String abbreviation, double ratio) {
		this(base, name, abbreviation, ratio, 0) ;
	}


	/**
	 * Creates a unitless, nameless dimension, with ratio specified.
	 * 
	 * @param ratio the ratio.
	 */
	public BaseUnit(double ratio) {
		this(Dimension.UNITLESS, "", "", ratio, 0) ;
	}

	public boolean equals(Object otherObject) {
		if(otherObject instanceof BaseUnit) {
			BaseUnit otherUnit = (BaseUnit)otherObject ;
			if(this.baseUnitRatio == otherUnit.getBaseUnitRatio() && this.getUnitType() == otherUnit.getUnitType()) {
				return true ;
			} else {
				return false ;
			}
		} else {
			return false ;
		}
	}

	/**
	 * @return the BaseUnit long name.
	 */
	public String getName() {
		return unitName ;
	}

	/**
	 * @return the BaseUnit short name.
	 */
	public String getAbbreviation() {
		if(unitAbbreviation.length() > 0) {
			return unitAbbreviation ;
		} else {
			return new Double(baseUnitRatio).toString() ;
		}
	}

	/**
	 * @return offset from base unit.
	 */
	public double getBaseUnitOffset() {
		return baseUnitOffset ;
	}

	/**
	 * @return the ratio between this unit and the SI form of the unit in the same dimension.
	 */
	public double getBaseUnitRatio() {
		return baseUnitRatio ;
	}

	/**
	 * @return the unique prime number associated with a unit of this dimension.
	 */
	public int getUnitType() {
		return baseUnit.getDimensionType() ;
	}

	/**
	 * @author Dewey Dunnington
	 * 
	 * Stores SI units for dimensions. A prime number is assigned to each dimension, so that when multiplied/divided in a more complex
	 * unit, a unique double is created for that combination of dimensions.
	 *
	 */
	public static class Dimension {
		public static final int TYPE_NO_UNIT = 1 ;
		public static final int TYPE_LENGTH = 2 ;
		public static final int TYPE_MASS = 3 ;
		public static final int TYPE_TIME = 5 ;
		public static final int TYPE_ELECTRIC_CURRENT = 7 ;
		public static final int TYPE_TEMPERATURE = 11 ;
		public static final int TYPE_LUMINOUS_INTENSITY = 13 ;
		public static final int TYPE_AMOUNT_OF_SUBSTANCE = 17 ;
		public static final int TYPE_ANGLE = 19 ;
		public static final int TYPE_CURRENCY = 23 ;
		public static final int TYPE_DATA_STORAGE = 29 ;

		public static final int TYPE_USER1 = 101 ;
		public static final int TYPE_USER2 = 103 ;
		public static final int TYPE_USER3 = 107 ;
		public static final int TYPE_USER4 = 109 ;
		public static final int TYPE_USER5 = 113 ;
		public static final int TYPE_USER6 = 127 ;

		public static final Dimension UNITLESS = new Dimension(TYPE_NO_UNIT) ;
		public static final Dimension LENGTH = new Dimension(TYPE_LENGTH) ;
		public static final Dimension MASS = new Dimension(TYPE_MASS) ;
		public static final Dimension TIME = new Dimension(TYPE_TIME) ;
		public static final Dimension ELECTRIC_CURRENT = new Dimension(TYPE_ELECTRIC_CURRENT) ;
		public static final Dimension TEMPERATURE = new Dimension(TYPE_TEMPERATURE) ;
		public static final Dimension LUMINOUS_INTENSITY = new Dimension(TYPE_LUMINOUS_INTENSITY) ;
		public static final Dimension AMMOUNT_OF_SUBSTANCE = new Dimension(TYPE_AMOUNT_OF_SUBSTANCE) ;
		public static final Dimension ANGLE = new Dimension(TYPE_ANGLE) ;
		public static final Dimension CURRENCY = new Dimension(TYPE_CURRENCY) ;
		public static final Dimension DATA_STORAGE = new Dimension(TYPE_DATA_STORAGE) ;


		private int unitType ;

		public Dimension(int type) {
			this.unitType = type ;
		}

		/**
		 * @return the unique prime number assigned to this dimension.
		 */
		public int getDimensionType() {
			return unitType;
		}
	}

}
