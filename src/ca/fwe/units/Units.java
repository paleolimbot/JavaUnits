package ca.fwe.units;

import java.util.ArrayList;


/**
 * @author Dewey Dunnington
 * 
 * A library of units, providing units plus a method of getting labels for units, as well as filtering units by type.
 *
 */
public class Units {


	public static class ratio {
		public static final Unit RATIO = new Unit("Unitless", null, new Unit()) ;
		public static final Unit PI = new Unit("Pi", "pi", new BaseUnit(Math.PI)) ;
		public static final Unit PERCENT = new Unit("Percent", "%", new BaseUnit(0.01)) ;
		public static final Unit PARTS_PER_THOUSAND = new Unit("Parts per thousand", "ppt", new BaseUnit(0.001)) ;
		public static final Unit PARTS_PER_MILLION = new Unit("Parts per million", "ppm", new BaseUnit(1e-6)) ;
		public static final Unit PARTS_PER_BILLION = new Unit("Parts per billion", "ppb", new BaseUnit(1e-9)) ;
		public static final Unit PARTS_PER_TRILLION = new Unit("Parts per trillion", "ppt", new BaseUnit(1e-12)) ;

		public static final Unit[] ALL = {RATIO, PI, PERCENT, PARTS_PER_THOUSAND,
											PARTS_PER_MILLION, PARTS_PER_BILLION, PARTS_PER_TRILLION} ;
	}

	public static class length {
		public static final Unit METRES = new Unit(BaseUnit.METRE) ;
		public static final Unit KILOMETRES = new Unit(BaseUnit.KILOMETRE) ;
		public static final Unit CENTIMETRES = new Unit(BaseUnit.CENTIMETRE) ;
		public static final Unit MILLIMETRES = new Unit(BaseUnit.MILLIMETRE) ;
		public static final Unit MICROMETRES = new Unit(BaseUnit.MICROMETRE) ;

		public static final Unit MILES = new Unit(BaseUnit.MILE) ;
		public static final Unit YARDS = new Unit(BaseUnit.YARD) ;
		public static final Unit FEET = new Unit(BaseUnit.FOOT) ;
		public static final Unit INCHES = new Unit(BaseUnit.INCH) ;
		public static final Unit CHAINS = new Unit(BaseUnit.CHAIN) ;
		public static final Unit FURLONGS = new Unit(BaseUnit.FURLONG) ;

		public static final Unit[] ALL = {METRES, KILOMETRES, CENTIMETRES, MILLIMETRES, MICROMETRES,
			MILES, YARDS, FEET, INCHES, CHAINS, FURLONGS} ;
	}

	public static class area {
		public static final Unit SQUARE_METRES = new Unit(new BaseUnit[] {BaseUnit.METRE, BaseUnit.METRE}) ;
		public static final Unit SQUARE_KILOMETRES = new Unit(new BaseUnit[] {BaseUnit.KILOMETRE, BaseUnit.KILOMETRE}) ;
		public static final Unit SQUARE_CENTIMETRES = new Unit(new BaseUnit[] {BaseUnit.CENTIMETRE, BaseUnit.CENTIMETRE}) ;
		public static final Unit SQUARE_MILES = new Unit(new BaseUnit[] {BaseUnit.MILE, BaseUnit.MILE}) ;
		public static final Unit SQUARE_FEET = new Unit(new BaseUnit[] {BaseUnit.FOOT, BaseUnit.FOOT}) ;
		public static final Unit SQUARE_INCHES = new Unit(new BaseUnit[] {BaseUnit.INCH, BaseUnit.INCH}) ;
		public static final Unit SQUARE_YARDS = new Unit(new BaseUnit[] {BaseUnit.YARD, BaseUnit.YARD}) ;
		public static final Unit HECTARES = new Unit("Hectares", "ha", new BaseUnit[] {BaseUnit.HECTOMETRE, BaseUnit.HECTOMETRE}) ;
		public static final Unit ACRES = new Unit("Acres", "acre", new BaseUnit[] {BaseUnit.CHAIN, BaseUnit.FURLONG}) ;

		public static final Unit[] ALL = {SQUARE_METRES, SQUARE_KILOMETRES, SQUARE_CENTIMETRES, SQUARE_MILES,
			SQUARE_FEET, SQUARE_INCHES, SQUARE_YARDS, HECTARES, ACRES} ;
	}

	public static class volume {
		public static final Unit CUBIC_METRES = new Unit(new BaseUnit[] {BaseUnit.METRE, BaseUnit.METRE, BaseUnit.METRE}) ;

		public static final Unit LITRES = new Unit("Litres", "L", new BaseUnit[] {BaseUnit.DECIMETRE, BaseUnit.DECIMETRE, BaseUnit.DECIMETRE}) ;
		public static final Unit CUBIC_FEET = new Unit(new BaseUnit[] {BaseUnit.FOOT, BaseUnit.FOOT, BaseUnit.FOOT}) ;
		public static final Unit CUBIC_YARDS = new Unit(new BaseUnit[] {BaseUnit.YARD, BaseUnit.YARD, BaseUnit.YARD}) ;

		public static final Unit[] ALL = {LITRES, CUBIC_METRES, CUBIC_FEET, CUBIC_YARDS} ;
	}

	public static class time {
		public static final Unit SECONDS = new Unit("Seconds", null, BaseUnit.SECOND) ;
		public static final Unit MINUTES = new Unit("Minutes", null, BaseUnit.MINUTE) ;
		public static final Unit HOURS = new Unit("Hours", null, BaseUnit.HOUR) ;
		public static final Unit DAYS = new Unit("Days", null, BaseUnit.DAY) ;
		public static final Unit WEEKS = new Unit("Weeks", null, BaseUnit.WEEK) ;
		public static final Unit YEARS = new Unit("Years", null, BaseUnit.YEAR) ;

		public static final Unit[] ALL = {SECONDS, MINUTES, HOURS, DAYS, WEEKS, YEARS} ;
	}

	public static class velocity {
		public static final Unit METRES_PER_SECOND = new Unit("Metres per second", null, new BaseUnit[] {BaseUnit.METRE}, new BaseUnit[] {BaseUnit.SECOND}) ;
		public static final Unit KILOMETRES_PER_HOUR = new Unit("Kilometres per hour", null, new BaseUnit[] {BaseUnit.KILOMETRE}, new BaseUnit[] {BaseUnit.HOUR}) ;
		public static final Unit MILES_PER_HOUR = new Unit("Miles per hour", null, new BaseUnit[] {BaseUnit.MILE}, new BaseUnit[] {BaseUnit.HOUR}) ;
		public static final Unit FEET_PER_SECOND = new Unit("Feet per second", null, new BaseUnit[] {BaseUnit.FOOT}, new BaseUnit[] {BaseUnit.SECOND}) ;
		public static final Unit METRES_PER_YEAR = new Unit("Metres per year", null, new BaseUnit[] {BaseUnit.METRE}, new BaseUnit[] {BaseUnit.YEAR}) ;

		public static final Unit[] ALL = {METRES_PER_SECOND, KILOMETRES_PER_HOUR, MILES_PER_HOUR, FEET_PER_SECOND, METRES_PER_YEAR} ;
	}

	public static class accelleration {
		public static final Unit METRES_PER_SECOND_SQUARED = new Unit("Metres per second squared", null, new BaseUnit[] {BaseUnit.METRE}, new BaseUnit[] {BaseUnit.SECOND, BaseUnit.SECOND}) ;
		public static final Unit FEET_PER_SECOND_SQUARED = new Unit("Feet per second squared", null, new BaseUnit[] {BaseUnit.FOOT}, new BaseUnit[] {BaseUnit.SECOND, BaseUnit.SECOND}) ;

		public static final Unit[] ALL = {METRES_PER_SECOND_SQUARED, FEET_PER_SECOND_SQUARED} ;
	}

	public static class mass {
		public static final Unit KILOGRAMS = new Unit(BaseUnit.KILOGRAM) ;
		public static final Unit GRAM = new Unit(BaseUnit.GRAM) ;
		public static final Unit MILLIGRAM = new Unit(BaseUnit.MILLIGRAM) ;
		public static final Unit METRIC_TON = new Unit(BaseUnit.TONNES) ;
		
		public static final Unit POUND_EARTH = new Unit(BaseUnit.POUND_EARTH) ;
		public static final Unit SHORT_TON = new Unit(BaseUnit.SHORT_TON_EARTH) ;
		
		public static final Unit SLUG = new Unit(BaseUnit.SLUG) ;

		public static final Unit[] ALL = {KILOGRAMS, GRAM, MILLIGRAM, METRIC_TON, POUND_EARTH, SHORT_TON, SLUG} ;
	}
	
	public static class density {
		public static final Unit KG_PER_CUBIC_METRE = new Unit(new BaseUnit[] {BaseUnit.KILOGRAM}, new BaseUnit[] {BaseUnit.METRE, BaseUnit.METRE, BaseUnit.METRE}) ;
		
		public static final Unit[] ALL = {KG_PER_CUBIC_METRE} ;
	}

	public static class force {
		public static final Unit NEWTON = new Unit("Newton", "N", new BaseUnit[] {BaseUnit.KILOGRAM, BaseUnit.METRE}, new BaseUnit[] {BaseUnit.SECOND, BaseUnit.SECOND}) ;

		public static final Unit POUND = new Unit("Pound", "lb", new BaseUnit[] {BaseUnit.SLUG, BaseUnit.FOOT}, new BaseUnit[] {BaseUnit.SECOND, BaseUnit.SECOND}) ;

		public static final Unit[] ALL = {NEWTON, POUND} ;
	}
	
	public static class volume_flux {
		public static final Unit CUBIC_FEET_PER_SECOND = new Unit("Cubic feet per second", "CFS", new BaseUnit[] {BaseUnit.FOOT, BaseUnit.FOOT, BaseUnit.FOOT}, new BaseUnit[] {BaseUnit.SECOND}) ;
		public static final Unit CUBIC_METRES_PER_SECOND = new Unit("Cubic metres per second", null, new BaseUnit[] {BaseUnit.METRE, BaseUnit.METRE, BaseUnit.METRE}, new BaseUnit[] {BaseUnit.SECOND}) ;
		public static final Unit LITRES_PER_SECOND = new Unit("Litres per second", "L/s", new BaseUnit[] {BaseUnit.DECIMETRE, BaseUnit.DECIMETRE, BaseUnit.DECIMETRE}, new BaseUnit[] {BaseUnit.SECOND}) ;
		public static final Unit LITRES_PER_DAY = new Unit("Litres per day", "L/day", new BaseUnit[] {BaseUnit.DECIMETRE, BaseUnit.DECIMETRE, BaseUnit.DECIMETRE}, new BaseUnit[] {BaseUnit.DAY}) ;
		public static final Unit CUBIC_METRES_PER_DAY = new Unit("Cubic metres per day", null, new BaseUnit[] {BaseUnit.METRE, BaseUnit.METRE, BaseUnit.METRE}, new BaseUnit[] {BaseUnit.DAY}) ;
		public static final Unit CUBIC_FEET_PER_DAY = new Unit("Cubic feet per day", null, new BaseUnit[] {BaseUnit.FOOT, BaseUnit.FOOT, BaseUnit.FOOT}, new BaseUnit[] {BaseUnit.DAY}) ;


		public static final Unit[] ALL = {CUBIC_METRES_PER_SECOND, LITRES_PER_SECOND, CUBIC_FEET_PER_SECOND,
			CUBIC_METRES_PER_DAY, LITRES_PER_DAY, CUBIC_FEET_PER_DAY} ;
	}
	
	public static class pressure {
		public static final Unit PASCAL = new Unit("Pascal", "Pa", new BaseUnit[]{BaseUnit.KILOGRAM}, new BaseUnit[]{BaseUnit.METRE, BaseUnit.SECOND, BaseUnit.SECOND}) ;
		public static final Unit KILOPASCAL = new Unit("Kilopascal", "kPa", PASCAL, 1000) ;
		public static final Unit ATMOSPHERE = new Unit("Atmosphere", "atm", PASCAL, 101325) ;
		public static final Unit IN_HG = new Unit("Inches Mercury", "in_hg", PASCAL, 3.386389e3) ;
		public static final Unit PSI = new Unit("Pounds per square inch", "psi", PASCAL, 6.894757e3) ;
		
		public static final Unit[] ALL = {PASCAL, KILOPASCAL, ATMOSPHERE, IN_HG, PSI} ;
	}
	
	public static class currency {
		public static final Unit DOLLAR = new Unit("Dollar", "$", BaseUnit.DOLLAR) ;
	}

	public static class angle {
		public static final Unit RADIANS = new Unit(BaseUnit.RADIAN) ;
		public static final Unit DEGREES = new Unit(BaseUnit.DEGREE) ;
		public static final Unit REVOLUTIONS = new Unit(BaseUnit.REVOLUTION) ;

		public static final Unit[] ALL = {RADIANS, DEGREES, REVOLUTIONS} ;
	}

	public static class angular_velocity {
		public static final Unit RADIANS_PER_SECOND = new Unit(new BaseUnit[]{BaseUnit.RADIAN}, new BaseUnit[]{BaseUnit.SECOND}) ;
		public static final Unit RPM = new Unit("Revolutions per minute", "rpm", new BaseUnit[]{BaseUnit.REVOLUTION}, new BaseUnit[]{BaseUnit.MINUTE}) ;

		public static final Unit[] ALL = {RADIANS_PER_SECOND, RPM} ;
	}

	public static class molecular_weight {
		public static final Unit KILOGRAMS_PER_MOLE = new Unit(new BaseUnit[] {BaseUnit.KILOGRAM}, new BaseUnit[] {BaseUnit.MOLE}) ;
		public static final Unit GRAMS_PER_MOLE = new Unit(new BaseUnit[] {BaseUnit.GRAM}, new BaseUnit[] {BaseUnit.MOLE}) ;
		
		public static final Unit[] ALL = {KILOGRAMS_PER_MOLE, GRAMS_PER_MOLE} ;
	}
	
	public static class frequency {
		public static final Unit HERTZ = new Unit("Hertz", "Hz", new BaseUnit[] {}, new BaseUnit[] {BaseUnit.SECOND}) ;
		public static final Unit KILOHERTZ = new Unit("Kilohertz", "KHz", HERTZ, 1000) ;
		public static final Unit MEGAHERTZ = new Unit("Megahertz", "MHz", HERTZ, 1000000) ;
		public static final Unit GIGAHERTZ = new Unit("Gigahertz", "GHz", HERTZ, 1000000000) ;
		
		public static final Unit[] ALL = {HERTZ, KILOHERTZ, MEGAHERTZ, GIGAHERTZ} ;
	}
	
	public static class energy {
		public static final Unit JOULE = new Unit("Joule", "J", force.NEWTON.multiplyBy(length.METRES)) ;
		public static final Unit KILOJOULE = new Unit("Kilojoule", "kJ", JOULE, 1000) ;
		public static final Unit KILOWATT_HOUR = new Unit("Kilowatt-hour", "kWh", power.KILOWATT.multiplyBy(time.HOURS)) ;
		public static final Unit ELECTRON_VOLTS = new Unit("Electron-volt", "eV", JOULE, 1.60217646e-19) ;
		
		public static final Unit[] ALL = {JOULE, KILOJOULE, KILOWATT_HOUR, ELECTRON_VOLTS} ;
	}
	
	public static class power {
		public static final Unit WATT = new Unit("Watt", "W", energy.JOULE.divideBy(time.SECONDS)) ;
		public static final Unit KILOWATT = new Unit("Kilowatt", "kW", WATT, 1000) ;
		public static final Unit MEGAWATT = new Unit("Megawatt", "MW", WATT, 1000000) ;
		public static final Unit GIGAWATT = new Unit("Gigawatt", "GW", WATT, 1000000000) ;
		
		public static final Unit[] ALL = {WATT, KILOWATT, MEGAWATT, GIGAWATT} ;
	}
	
	public static class potential {
		public static final Unit VOLT = new Unit("Volt", "V", power.WATT.divideBy(current.AMPERE)) ;
		public static final Unit KILOVOLT = new Unit("Kilovolt", "kV", VOLT, 1000) ;
		public static final Unit MILLIVOLT = new Unit("Millivolt", "mV", VOLT, 0.001) ;
		
		public static final Unit[] ALL = {VOLT, KILOVOLT, MILLIVOLT} ;
	}
	
	public static class current {
		public static final Unit AMPERE = new Unit("Ampere", "A", BaseUnit.AMPERE) ;
		public static final Unit MILLIAMP = new Unit("Milliamp", "mA", AMPERE, 0.001) ;
		
		public static final Unit[] ALL = {AMPERE, MILLIAMP} ;
	}
	
	public static class resistance {
		public static final Unit OHM = new Unit("Ohm", "O", potential.VOLT.divideBy(current.AMPERE)) ;
		public static final Unit MILLIOHM = new Unit("Milliohm", "mO", OHM, 0.001) ;
		public static final Unit KILOOHM = new Unit("Kiloohm", "kO", OHM, 1000) ;
		
		public static final Unit[] ALL = {OHM, MILLIOHM, KILOOHM} ;
	}
	
	public static class absolute_conductivity {
		public static final Unit SIEMENS = new Unit("Siemens", "S", new Unit().divideBy(resistance.OHM)) ;
		public static final Unit MILLISIEMENS = new Unit("Millisiemen", "mS", SIEMENS, 0.001) ;
		public static final Unit MICROSIEMENS = new Unit("Microsiemen", "uS", SIEMENS, 0.000001) ;
		
		public static final Unit[] ALL = {SIEMENS, MILLISIEMENS, MICROSIEMENS} ;
	}
	
	public static class conductivity {
		public static final Unit SIEMENS_PER_METRE = new Unit("Siemens per metre", null, absolute_conductivity.SIEMENS.divideBy(length.METRES)) ;
		public static final Unit MICROSIEMENS_PER_CENTIMETRE = new Unit("Microsiemens per centimetre", null, absolute_conductivity.MILLISIEMENS.divideBy(length.CENTIMETRES)) ;
		public static final Unit MILLISIEMENS_PER_CENTIMETRE = new Unit("Millisiemens per centimetre", null, absolute_conductivity.MICROSIEMENS.divideBy(length.CENTIMETRES)) ;
		
		public static final Unit[] ALL = {SIEMENS_PER_METRE, MICROSIEMENS_PER_CENTIMETRE, MILLISIEMENS_PER_CENTIMETRE} ;
	}
	
	public static class charge {
		public static final Unit COULOMB = new Unit("Coulomb", "C", current.AMPERE.multiplyBy(time.SECONDS)) ;
		
		public static final Unit[] ALL = {COULOMB} ;
	}
	
	private static ArrayList<Unit> ALL ;
	private static ArrayList<UnitCategory> cat ;

	/**
	 * @return a list of all UnitCategory objects contained in this library.
	 */
	public static ArrayList<UnitCategory> getCategories() {
		if(cat == null) {
			cat = new ArrayList<UnitCategory>() ;

			cat.add(new UnitCategory("Length", length.METRES)) ;
			cat.add(new UnitCategory("Area", area.SQUARE_METRES)) ;
			cat.add(new UnitCategory("Volume", volume.CUBIC_METRES)) ;
			cat.add(new UnitCategory("Time", time.SECONDS)) ;
			cat.add(new UnitCategory("Ratio", ratio.RATIO)) ;
			cat.add(new UnitCategory("Velocity", velocity.METRES_PER_SECOND)) ;
			cat.add(new UnitCategory("Accelleration", accelleration.METRES_PER_SECOND_SQUARED)) ;
			cat.add(new UnitCategory("Mass", mass.KILOGRAMS)) ;
			cat.add(new UnitCategory("Density", density.KG_PER_CUBIC_METRE)) ;
			cat.add(new UnitCategory("Force", force.NEWTON)) ;
			cat.add(new UnitCategory("Volume Flux (Discharge)", volume_flux.CUBIC_METRES_PER_SECOND)) ;
			cat.add(new UnitCategory("Pressure", pressure.PASCAL)) ;
			cat.add(new UnitCategory("Angle", angle.RADIANS)) ;
			cat.add(new UnitCategory("Angular Velocity", angular_velocity.RADIANS_PER_SECOND)) ;
			cat.add(new UnitCategory("Molecular Weight", molecular_weight.KILOGRAMS_PER_MOLE)) ;
			cat.add(new UnitCategory("Frequency", frequency.HERTZ)) ;
			cat.add(new UnitCategory("Energy", energy.JOULE)) ;
			cat.add(new UnitCategory("Power", power.WATT)) ;
			cat.add(new UnitCategory("Potential", potential.VOLT)) ;
			cat.add(new UnitCategory("Current", current.AMPERE)) ;
			cat.add(new UnitCategory("Resistance", resistance.OHM)) ;
			cat.add(new UnitCategory("Conductivity (absolute)", absolute_conductivity.SIEMENS)) ;
			cat.add(new UnitCategory("Conductivity", conductivity.SIEMENS_PER_METRE)) ;
			cat.add(new UnitCategory("Charge", charge.COULOMB)) ;
		}
		return cat ;
	}

	/**
	 * @param type a unique double indicating unit dimensions from Unit.getUnitType() or UnitCategory.getUnitType()
	 * @return a UnitCategory object of matching type, null if no category is found.
	 */
	public static UnitCategory getCategory(double type) {
		if(cat == null)
			getCategories() ;
		for(int i=0; i<cat.size(); i++) {
			if(cat.get(i).getUnitType() == type)
				return cat.get(i) ;
		}
		return null ;
	}

	/**
	 * @return an ArrayList of all units contained in this library.
	 */
	public static final ArrayList<Unit> getAll() {
		if(ALL == null) {
			ALL = new ArrayList<Unit>() ;
			
			addArrayToAll(ratio.ALL) ;
			addArrayToAll(length.ALL) ;
			addArrayToAll(area.ALL) ;
			addArrayToAll(volume.ALL) ;
			addArrayToAll(time.ALL) ;
			addArrayToAll(velocity.ALL) ;
			addArrayToAll(accelleration.ALL) ;
			addArrayToAll(mass.ALL) ;
			addArrayToAll(density.ALL) ;
			addArrayToAll(force.ALL) ;
			addArrayToAll(volume_flux.ALL) ;
			addArrayToAll(pressure.ALL) ;
			addArrayToAll(angle.ALL) ;
			addArrayToAll(angular_velocity.ALL) ;
			addArrayToAll(molecular_weight.ALL) ;
			addArrayToAll(frequency.ALL) ;
			addArrayToAll(energy.ALL) ;
			addArrayToAll(power.ALL) ;
			addArrayToAll(potential.ALL) ;
			addArrayToAll(current.ALL) ;
			addArrayToAll(resistance.ALL) ;
			addArrayToAll(absolute_conductivity.ALL) ;
			addArrayToAll(conductivity.ALL) ;
			addArrayToAll(charge.ALL) ;
			
		}
		return ALL ;
	}

	private static void addArrayToAll(Unit[] array) {
		for(int i=0; i<array.length; i++) {
			ALL.add(array[i]) ;
		}
	}

	/**
	 * @param type a unique double indicating unit dimensions from Unit.getUnitType() or UnitCategory.getUnitType()
	 * @return a list of comparable units, an empty list if no units are found.
	 */
	public static final ArrayList<Unit> filter(double type) {
		if(ALL == null)
			getAll() ;
		ArrayList<Unit> out = new ArrayList<Unit>() ;
		for(int i=0; i<ALL.size(); i++) {
			if(ALL.get(i).getUnitType() == type)
				out.add(ALL.get(i)) ;
		}
		return out ;

	}
	
	public static final ArrayList<Unit> filter(String text) {
		if(ALL == null)
			getAll() ;
		ArrayList<Unit> out = new ArrayList<Unit>() ;
		for(Unit u: ALL) {
			if(u.toString().toLowerCase().contains(text))
				out.add(u) ;
		}
		return out ;
	}

	/**
	 * @param unit the Unit a name is requested for.
	 * @return a UnitAlias object containing the unit name and short form.
	 */
	public static final UnitAlias getAlias(Unit unit) {
		if(ALL == null)
			getAll() ;
		for(int i=0; i<ALL.size(); i++) {
			if(ALL.get(i).equals(unit))
				return ALL.get(i) ;
		}
		return null ;
	}
	
}
