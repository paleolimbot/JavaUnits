package ca.fwe.units;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * A class representing a rational unit (i.e. ones that apply to values where 0 is meaningfully nothing, such as Kelvins, but not to
 * ones where it is not, such as degrees Celcius. A Unit object is made up of a numerator and denominator of BaseUnit objects. Names
 * and abbreviations are included as a convenience, and can be obtained from the Units library using the Units.getUnitAlias() method.
 * Intended to be immutable and use independent backing ArrayLists.
 * 
 * @author Dewey Dunnington
 *
 */
/**
 * @author dewey
 *
 */
/**
 * @author dewey
 *
 */
public class Unit extends UnitAlias {

	private static final String UNIT_SEPARATOR = "&" ;
	private static final String FRACTION_SEPARATOR = "/" ;

	private ArrayList<BaseUnit> numerator ;
	private ArrayList<BaseUnit> denominator ;


	/**
	 * Creates a new, empty unit, serving as a ratio and conversion value of 1.
	 */
	public Unit() {
		numerator = new ArrayList<BaseUnit>() ;
		denominator = new ArrayList<BaseUnit>() ;
	}

	/**
	 * Creates a new unit based on an existing unit and a conversion value. Useful for creating multiple versions
	 * of the same unit (e.g. ohms and milliohms).
	 * 
	 * @param name
	 * @param shortName
	 * @param baseUnit original Unit
	 * @param conversion conversion value for this unit (kilo = 1000, etc.)
	 */
	public Unit(String name, String shortName, Unit baseUnit, double conversion) {
		this() ;
		numerator.addAll(baseUnit.getNumerator()) ;
		denominator.addAll(baseUnit.getDenominator()) ;
		numerator.add(new BaseUnit(conversion)) ;
		this.setName(name) ;
		this.setShort(shortName) ;
	}

	/**
	 * Creates a new unit with a single BaseUnit in the numerator.
	 * 
	 * @param unit
	 */
	public Unit(BaseUnit unit) {
		this() ;
		numerator.add(unit) ;
		this.setName(unit.getName()) ;
	}

	/**
	 * Creates a new unit based on two ArrayLists of units. The ArrayLists are copied, not modified.
	 * 
	 * @param numeratorUnits
	 * @param denominatorUnits
	 */
	public Unit(ArrayList<BaseUnit> numeratorUnits, ArrayList<BaseUnit> denominatorUnits) {
		this() ;
		numerator.addAll(numeratorUnits) ;
		denominator.addAll(denominatorUnits) ;
		this.simplify() ;
	}


	//below used to define in Units
	/**
	 * Creates a new unit based on two arrays of BaseUnit objects. Used in the Units class to define units.
	 * 
	 * @param numeratorUnits
	 * @param denomUnits
	 */
	public Unit(BaseUnit[] numeratorUnits, BaseUnit[] denomUnits) {
		this() ;
		for(int i=0; i<numeratorUnits.length; i++) {
			numerator.add(numeratorUnits[i]) ;
		}
		for(int i=0; i<denomUnits.length; i++) {
			denominator.add(denomUnits[i]) ;
		}
		this.simplify() ;
	}


	/**
	 * Creates a new unit with a list of numerator units
	 * 
	 * @param numeratorUnits
	 */
	public Unit(BaseUnit[] numeratorUnits) {
		this(numeratorUnits, new BaseUnit[] {}) ;
	}

	public Unit(String name, String shortName, BaseUnit unit) {
		this(unit) ;
		this.setName(name) ;
		this.setShort(shortName) ;
	}

	public Unit(String name, String shortName, BaseUnit[] numeratorUnits, BaseUnit[] denomUnits) {
		this(numeratorUnits, denomUnits) ;
		this.setName(name) ;
		this.setShort(shortName) ;
	}

	public Unit(String name, String shortName, BaseUnit[] numeratorUnits) {
		this(numeratorUnits) ;
		this.setName(name) ;
		this.setShort(shortName) ;
	}

	/**
	 * Used to add name and abbreviation information to an existing Unit object. Useful for defining complicated units through
	 * multiplication and division operations.
	 * 
	 * @param name
	 * @param shortName
	 * @param unit the existing unit to copy
	 */
	public Unit(String name, String shortName, Unit unit) {
		this(unit.getNumerator(), unit.getDenominator()) ;
		this.setName(name) ;
		this.setShort(shortName) ;
	}

	/**
	 * @return A copy of the numerator units
	 */
	public ArrayList<BaseUnit> getNumerator() {
		return new ArrayList<BaseUnit>(numerator) ;
	}

	/**
	 * @return A copy of the denominator units
	 */
	public ArrayList<BaseUnit> getDenominator() {
		return new ArrayList<BaseUnit>(denominator) ;
	}

	/**
	 * @return the value needed to return a number in this unit to SI units
	 */
	public double getConversionValue() {
		double value = 1 ;
		for(int i=0; i<numerator.size(); i++) {
			value *= numerator.get(i).getBaseUnitRatio() ;
		}
		for(int i=0; i<denominator.size(); i++) {
			value /= denominator.get(i).getBaseUnitRatio() ;
		}

		return value ;
	}

	/**
	 * @return the double value unique to a unit with this combination of dimensions.
	 */
	public double getUnitType() {
		double value = 1.0 ;
		for(int i=0; i<numerator.size(); i++) {
			value *= (double)numerator.get(i).getUnitType() ;
		}
		for(int i=0; i<denominator.size(); i++) {
			value /= (double)denominator.get(i).getUnitType() ;
		}

		return value ;
	}

	/**
	 * Called on any constructor with numerator and denominator units. Cancels units that are the same in numerator and denominator.
	 */
	private void simplify() {
		double ratio = this.getRatio() ;
		this.stripRatiosInSitu() ;
		if(ratio != 1) {
			numerator.add(new BaseUnit(ratio)) ;
		}
		this.simplifyUnits() ;
	}


	/**
	 *  Recursive element of simplify(). For all BaseUnits in the numerator, check to see if there is an identical BaseUnit in the denominator.
	 *  if so, delete both, simplify again.
	 */
	private void simplifyUnits() {

		for(int i=0; i<numerator.size(); i++) {
			if(denominator.contains(numerator.get(i))) {
				denominator.remove(numerator.get(i)) ;
				numerator.remove(i) ;
				this.simplifyUnits() ;
			}
		}
	}

	/**
	 * @return true if the Unit contains a dimensionless ratio, false if it does not.
	 */
	public boolean containsRatio() {
		if(this.stripRatios().equals(this)) {
			return false ;
		} else {
			return true ;
		}
	}


	/**
	 * @return the dimensionless ratio associated with this unit.
	 */
	public double getRatio() {
		double ratioValue = 1 ;
		for(int i=0; i<numerator.size(); i++) {
			if(numerator.get(i).getUnitType() == BaseUnit.RATIO.getUnitType()) {
				ratioValue *= numerator.get(i).getBaseUnitRatio() ;
			}
		}
		for(int i=0; i<denominator.size(); i++) {
			if(denominator.get(i).getUnitType() == BaseUnit.RATIO.getUnitType()) {
				ratioValue /= denominator.get(i).getBaseUnitRatio() ;
			}
		}
		return ratioValue ;
	}


	/**
	 * @return true if the unit contains a single ratio in the numerator that is not 1. false otherwise.
	 */
	public boolean isRatio() {
		if(numerator.size() == 1 && numerator.get(0).getUnitType() == BaseUnit.RATIO.getUnitType()) {
			return true ;
		} else {
			return false ;
		}
	}

	/**
	 * @return a unit identical to the current unit without any dimensionless ratios.
	 */
	public Unit stripRatios() {
		ArrayList<BaseUnit> newNum = new ArrayList<BaseUnit>() ;
		ArrayList<BaseUnit> newDen = new ArrayList<BaseUnit>() ;

		for(int i=0; i<numerator.size(); i++) {
			if(numerator.get(i).getUnitType() != BaseUnit.RATIO.getUnitType()) {
				newNum.add(numerator.get(i)) ;
			}
		}
		for(int i=0; i<denominator.size(); i++) {
			if(denominator.get(i).getUnitType() != BaseUnit.RATIO.getUnitType()) {
				newDen.add(denominator.get(i)) ;
			}
		}
		return new Unit(newNum, newDen) ;
	}

	/**
	 * Strips any dimensionles ratios from the numerator and denominator. Used in simplify() in conjunction with getRatio() to
	 * simplify any ratios into a single ratio in the numerator.
	 */
	private void stripRatiosInSitu() {
		ArrayList<BaseUnit> newNum = new ArrayList<BaseUnit>() ;
		ArrayList<BaseUnit> newDen = new ArrayList<BaseUnit>() ;
		for(int i=0; i<numerator.size(); i++) {
			if(numerator.get(i).getUnitType() != BaseUnit.RATIO.getUnitType()) {
				newNum.add(numerator.get(i)) ;
			}
		}
		for(int i=0; i<denominator.size(); i++) {
			if(denominator.get(i).getUnitType() != BaseUnit.RATIO.getUnitType()) {
				newDen.add(denominator.get(i)) ;
			}
		}
		numerator = newNum ;
		denominator = newDen ;
	}

	public boolean equals(Object otherObject) {
		if(otherObject instanceof Unit) {
			Unit otherUnit = (Unit)otherObject ;
			if(otherUnit.getConversionValue() == this.getConversionValue() &&
					this.getUnitType() == otherUnit.getUnitType()) {
				return true ;
			} else {
				return false ;
			}
		} else {
			return false ;
		}
	}


	/**
	 * @return a unit of equivalent dimensions to the current unit, using only SI BaseUnits.
	 */
	public Unit getSI() {
		ArrayList<BaseUnit> newNum = new ArrayList<BaseUnit>() ;
		ArrayList<BaseUnit> newDen = new ArrayList<BaseUnit>() ;
		for(int i=0; i<numerator.size(); i++) {
			newNum.add(getSIUnit(numerator.get(i).getUnitType())) ;
		}
		for(int i=0; i<denominator.size(); i++) {
			newDen.add(getSIUnit(denominator.get(i).getUnitType())) ;
		}
		return new Unit(newNum, newDen) ;
	}

	/**
	 * @return a unit with the denominator of this unit in the numerator, and the numerator of this unit in the denominator.
	 */
	public Unit invert() {
		return new Unit(denominator, numerator) ;
	}

	/**
	 * Multiplies this unit by another one. Combines the numerators of the two objects and the denominators of the two objects.
	 * Order does not matter.
	 * 
	 * @param otherUnit the Unit to mulitply this one by
	 * @return the resulting Unit.
	 */
	public Unit multiplyBy(Unit otherUnit) {
		ArrayList<BaseUnit> newNumerator = new ArrayList<BaseUnit>(numerator) ;
		ArrayList<BaseUnit> newDenominator = new ArrayList<BaseUnit>(denominator) ;

		newNumerator.addAll(otherUnit.getNumerator()) ;
		newDenominator.addAll(otherUnit.getDenominator()) ;

		Unit newUnit = new Unit(newNumerator, newDenominator) ;

		return newUnit ;
	}

	/**
	 * Divides this unit by another one by multiplying it by the inverse of the otherUnit.
	 * 
	 * @param otherUnit the unit to divide the current unit by.
	 * @return the resulting unit.
	 */
	public Unit divideBy(Unit otherUnit) {
		return multiplyBy(otherUnit.invert()) ;
	}

	/**
	 * Multiply this unit by itself (number) times and invert if (number) is less than 0. A (number) value of 0 will return a
	 * dimensionless unit.
	 * 
	 * @param number the power to raise the unit to.
	 * @return the resulting unit.
	 */
	public Unit raiseToPower(int number) {
		if(number != 0) {
			ArrayList<BaseUnit> newNumerator = new ArrayList<BaseUnit>(numerator) ;
			ArrayList<BaseUnit> newDenominator = new ArrayList<BaseUnit>(denominator) ;
			for(int i=1; i<=number; i++) {
				newNumerator.addAll(newNumerator) ;
				newDenominator.addAll(newDenominator) ;
			}

			if(number > 0) {
				return new Unit(newNumerator, newDenominator) ;
			} else {
				return new Unit(newDenominator, newNumerator) ;
			}
		} else { //number == 0
			return new Unit() ;
		}
	}



	/**
	 * Take the root-th root of this unit (e.g. m^2/s^2 becomes m/s when root=2). Will work best on SI units.
	 * @param root the root to take of this Unit
	 * @return the resulting unit
	 * @throws UnitException if there is not an even multiple of each type of unit, even if there is an even multiple of each type of dimension.
	 */
	public Unit root(int root) throws UnitException {
		if(this.isRatio()) {
			return new Unit(new BaseUnit(Math.pow(getConversionValue(), 1.0/root))) ;
		} else {
			Map<BaseUnit, Integer> countsNum = new HashMap<BaseUnit, Integer>() ;
			Map<BaseUnit, Integer> countsDen = new HashMap<BaseUnit, Integer>() ;

			for(BaseUnit b: numerator) {
				if(countsNum.containsKey(b)) {
					int currentCount = countsNum.get(b) ;
					countsNum.put(b, currentCount + 1) ;
				} else {
					countsNum.put(b, 1) ;
				}
			}

			for(BaseUnit b: denominator) {
				if(countsDen.containsKey(b)) {
					int currentCount = countsNum.get(b) ;
					countsNum.put(b, currentCount + 1) ;
				} else {
					countsNum.put(b, 1) ;
				}
			}

			Iterator<Entry<BaseUnit, Integer>> numI = countsNum.entrySet().iterator() ;
			Iterator<Entry<BaseUnit, Integer>> denI = countsDen.entrySet().iterator() ;

			ArrayList<BaseUnit> newNumerator = new ArrayList<BaseUnit>() ;
			ArrayList<BaseUnit> newDenominator = new ArrayList<BaseUnit>() ;

			while(numI.hasNext()) {
				Entry<BaseUnit, Integer> counts = numI.next() ;
				double ratio = (double)counts.getValue() / (double)root ;
				int intRatio = (int)Math.round(ratio) ;
				if(ratio == intRatio) {
					for(int i=0; i<intRatio; i++)
						newNumerator.add(counts.getKey()) ;
				} else {
					throw new UnitException(this) ;
				}
			}

			while(denI.hasNext()) {
				Entry<BaseUnit, Integer> counts = denI.next() ;
				double ratio = (double)counts.getValue() / (double)root ;
				int intRatio = (int)Math.round(ratio) ;
				if(ratio == intRatio) {
					for(int i=0; i<intRatio; i++)
						newDenominator.add(counts.getKey()) ;
				} else {
					throw new UnitException(this) ;
				}
			}

			return new Unit(newNumerator, newDenominator) ;
		}
	}

	public String toString() {
		return this.toString(true) ;
	}
	
	public String toString(boolean fullText) {
		return getUnitText(this, fullText) ;
	}

	public String getHtml() {
		if(numerator.size() > 0 || denominator.size() > 0) {
			ArrayList<BaseUnit> numUnits = new ArrayList<BaseUnit>() ;
			ArrayList<Integer>numCounts = new ArrayList<Integer>() ;

			for(int i=0; i<numerator.size(); i++) {
				int index = numUnits.indexOf(numerator.get(i)) ;
				if(index != -1) {
					numCounts.set(index, numCounts.get(index) + 1) ;
				} else {
					numUnits.add(numerator.get(i)) ;
					numCounts.add(1) ;
				}
			}

			ArrayList<BaseUnit> denUnits = new ArrayList<BaseUnit>() ;
			ArrayList<Integer>denCounts = new ArrayList<Integer>() ;

			for(int i=0; i<denominator.size(); i++) {
				int index = denUnits.indexOf(denominator.get(i)) ;
				if(index != -1) {
					denCounts.set(index, denCounts.get(index) - 1) ;
				} else {
					denUnits.add(denominator.get(i)) ;
					denCounts.add(-1) ;
				}
			}

			String outString = "" ;

			for(int i=0; i<numUnits.size(); i++) {
				String exponent ;
				if(numCounts.get(i) == 1) {
					exponent = " " ;
					if(i == numUnits.size() - 1 && denUnits.size() == 0)
						exponent = "" ;
				} else {
					exponent = supString(numCounts.get(i).toString()) ;
				}

				outString += numUnits.get(i).getAbbreviation() + exponent ;
			}

			for(int i=0; i<denUnits.size(); i++) {
				outString += denUnits.get(i).getAbbreviation() + supString(denCounts.get(i).toString()) ;
			}

			return outString ;
		} else {
			return "" ;
		}
	}

	private static String supString(String text) {
		return "<sup>" + text + "</sup>" ;
	}

	/**
	 * Reduces this object to a String such that a copy of this object can be obtained by Unit.valueOf().
	 * 
	 * @return a string representation of this object that can be read by Unit.valueOf() to return a copy of this unit.
	 */
	public String encode() {
		String numeratorString = UNIT_SEPARATOR ;
		String denominatorString = UNIT_SEPARATOR ;
		String times = "" ;
		for(int i=0; i<numerator.size(); i++) {
			numeratorString += times + numerator.get(i).getAbbreviation() ;
			times = UNIT_SEPARATOR ;
		}
		times = "" ;
		for(int i=0; i<denominator.size(); i++) {
			denominatorString += times + denominator.get(i).getAbbreviation() ;
			times = UNIT_SEPARATOR ;
		}

		return numeratorString + FRACTION_SEPARATOR + denominatorString ;

	}

	/**
	 * Identical to valueOf(String, BaseUnit[]), using BaseUnit.ALL as the list of BaseUnits to search.
	 */
	public static Unit valueOf(String value) {
		return valueOf(value, BaseUnit.ALL) ;
	}

	/**
	 * Gets a Unit object from a string generated by Unit.encode().
	 * 
	 * @param value string value generated by Unit.encode().
	 * @param listOfUnits the list of BaseUnits to search when transforming each abbreviation into
	 * @return the Unit object represented by this String, null if it cannot be decoded.
	 */
	public static Unit valueOf(String value, BaseUnit[] listOfUnits) {
		String trimmed = value.trim() ;
		String[] parts = trimmed.split(FRACTION_SEPARATOR) ;
		if(parts.length >= 2) {
			ArrayList<BaseUnit> num = new ArrayList<BaseUnit>() ;
			ArrayList<BaseUnit> den = new ArrayList<BaseUnit>() ;

			String[] partsNumerator = parts[0].trim().split(UNIT_SEPARATOR) ;

			for(int i=0; i<partsNumerator.length; i++) {
				BaseUnit unit = getUnitFromArray(partsNumerator[i].trim(), listOfUnits) ;
				if(unit != null) {
					num.add(unit) ;
				}
			}

			String[] partsDenominator = parts[1].substring(1).trim().split(UNIT_SEPARATOR) ;

			for(int i=0; i<partsDenominator.length; i++) {
				BaseUnit unit = getUnitFromArray(partsDenominator[i].trim(), listOfUnits) ;
				if(unit != null) {
					den.add(unit) ;
				}
			}
			return new Unit(num, den) ;

		} else {
			return null ;
		}
	}

	private static BaseUnit getUnitFromArray(String abbreviation, BaseUnit[] array) {
		for(int i=0; i<array.length; i++) {
			if(array[i].getAbbreviation().equals(abbreviation))
				return array[i] ;
		}

		try {
			double ratioValue = new Double(abbreviation)  ;
			return new BaseUnit(ratioValue) ;
		} catch(NumberFormatException e) {

		}
		return null ;
	}

	/** 
	 * @param unitType the unique prime number associated with the BaseUnit's dimension.
	 * @return a BaseUnit of type unitType that is SI.
	 */
	public static BaseUnit getSIUnit(int unitType) {
		return getSIUnit(unitType, BaseUnit.ALL) ;
	}

	private static BaseUnit getSIUnit(int unitType, BaseUnit[] array) {
		for(int i=0; i<array.length; i++) {
			if(array[i].getUnitType() == unitType)
				return array[i] ;
		}
		return null ;
	}

	public static String getUnitText(Unit value, boolean longName) {
		if(value != null) {
			String name = value.getName() ;
			String shortName = value.getShortName() ;
			String rawUnit = value.getHtml() ;
			String outString = "" ;

			UnitAlias alias = Units.getAlias(value) ;
			if(alias != null) {
				name = alias.getName() ;
				shortName = alias.getShortName() ;
			}

			if(longName) {
				if(name != null) {
					outString = name ;
					if(shortName != null) {
						outString += " (" + shortName + ")" ;
					} else {
						if(rawUnit != null)
							if(rawUnit.length() > 0)
								outString += " (" + rawUnit + ")" ;
					}
					return outString ;
				} else {
					if(rawUnit != null) {
						return rawUnit ;
					} else {
						return "unitless" ;
					}
				}
			} else { //short name
				if(shortName != null) {
					return shortName ;
				} else {
					if(rawUnit != null) {
						return rawUnit ;
					} else {
						return "" ;
					}
				}
			}
		} else {
			return null ;
		}
	}
	
}
