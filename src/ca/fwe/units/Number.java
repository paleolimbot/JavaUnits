package ca.fwe.units;


/**
 * A class representing a value with associated Unit. The value of the Number is stored in SI units and converted whenever the
 * user requests the value in a different unit.
 * 
 * @author Dewey Dunnington
 *
 */
public class Number {
	private static final String SEPARATOR = "," ;

	private double SIvalue ;
	private Unit unit ;

	
	/**
	 * @param value
	 * @param unitToBeDescribedIn
	 * @param isSI if value is the SI value, false if it is a value described in units of unitToBeDescribedIn.
	 */
	public Number(double value, Unit unitToBeDescribedIn, boolean isSI) {
		this.unit = unitToBeDescribedIn ;
		if(isSI) {
			this.SIvalue = value ;
		} else {
			this.setValue(value) ;
		}
	}
	
	/**
	 * Creates a new number with value described in units valueUnit.
	 * 
	 * @param value
	 * @param valueUnit
	 */
	public Number(double value, Unit valueUnit) {
		this.unit = valueUnit ;
		this.setValue(value) ;
	}


	/**
	 * Creates a dimensionless number of value value.
	 * 
	 * @param value
	 */
	public Number(double value) {
		this.unit = new Unit() ;
		this.setValue(value) ;
	}


	/**
	 * Creates a dimensionless number with an NaN value.
	 */
	public Number() {
		this(Double.NaN) ;
	}


	/**
	 * Creates a number with unit valueUnit and value of NaN.
	 * @param valueUnit
	 */
	public Number(Unit valueUnit) {
		this.unit = valueUnit ;
		this.SIvalue = Double.NaN ;
	}


	/**
	 * Forces a unit upon this number without converting the SI value. Used in math operations.
	 * 
	 * @param newUnit
	 */
//	private void forceUnit(Unit newUnit) {
//		this.unit = newUnit ;
//	}


	/**
	 * Sets the unit associated with this Number. Must be of same dimensions as previous unit.
	 * 
	 * @param newUnit non-null unit to convert to.
	 * @throws UnitException if units are of different dimensions.
	 */
	public void setUnit(Unit newUnit) throws UnitException {
		if(newUnit.getUnitType() == this.getUnit().getUnitType()) {
			this.unit = newUnit ;
		} else {
			throw new UnitException(this.unit, newUnit) ;
		}
	}

	/**
	 * Sets the value of this number taking into account the unit. Only done from constructor.
	 * 
	 * @param newValue
	 */
	private void setValue(double newValue) {
		this.SIvalue = newValue * this.getUnit().getConversionValue() ;
	}

	/**
	 * @return the value of this Number, in units described by getUnit().
	 */
	public double getValue() {
		return SIvalue / this.getUnit().getConversionValue() ;
	}

	/**
	 * @return a String version of the float value of this, in units specified by getUnit(). Blank if value is Double.NaN.
	 */
	public String toString() {
		if(!Double.isNaN(this.getValue())) {
			if(this.isInteger()) {
				return new Long(Math.round(this.getValue())).toString() ;
			} else {
				return new Float(this.getValue()).toString() ;
			}
		} else {
			return "" ;
		}
	}

	
	/**
	 * @return true if Math.round(getValue()) is equal to getValue() (as judged by rounding to float), false otherwise.
	 */
	public boolean isInteger() {
		Float value = new Float(this.getValue()) ;
		long intValue = Math.round(value) ;
		if(value == intValue) {
			return true ;
		} else {
			return false ;
		}
	}

	/**
	 * @param otherUnit
	 * @return the value of this Number described in units of otherUnit
	 * @throws UnitException if units are of different dimensions
	 */
	public double getValue(Unit otherUnit) throws UnitException {
		if(otherUnit.getUnitType() == this.unit.getUnitType()) {
			return this.getSIValue() / otherUnit.getConversionValue() ;
		} else {
			throw new UnitException(this.unit, otherUnit) ;
		}
	}

	/**
	 * @return the value of this Number described in SI units of the same dimension.
	 */
	public double getSIValue() {
		return SIvalue ;
	}

	/**
	 * @return the unit describing the value of this Number
	 */
	public Unit getUnit() {
		return unit ;
	}

	/**
	 * @return the SI version of this number
	 */
	public Number getSINumber() {
		double value = this.getSIValue() ;
		Unit unit = this.getUnit().getSI() ;
		return new Number(value, unit, true) ;
	}

	/**
	 * Multiply this number by another number.
	 * 
	 * @param otherNumber the number to multiply this one by.
	 * @return the product of these two numbers.
	 */
	public Number multiplyBy(Number otherNumber) {
		return new Number(this.getSIValue() * otherNumber.getSIValue(), this.getUnit().multiplyBy(otherNumber.getUnit()), true) ;
	}

	/**
	 * Divide this number by another number.
	 * 
	 * @param otherNumber the number that this number will be divided by.
	 * @return the quotient of these two numbers.
	 */
	public Number divideBy(Number otherNumber) {
		return new Number(this.getSIValue() / otherNumber.getSIValue(), this.getUnit().divideBy(otherNumber.getUnit()), true) ;
	}

	/**
	 * Add another number to this number.
	 * 
	 * @param otherNumber the number to add.
	 * @return the sum of these two numbers, expressed in the Unit of this number.
	 * @throws UnitException if the units are in different dimensions.
	 */
	public Number add(Number otherNumber) throws UnitException {
		if(otherNumber.getUnit().getUnitType() == this.unit.getUnitType()) {
			return new Number(this.getSIValue() + otherNumber.getSIValue(), this.getUnit(), true) ;
		} else {
			throw new UnitException(this.unit, otherNumber.getUnit()) ;
		}
	}

	/**
	 * Subtract a number from this number
	 * 
	 * @param otherNumber the number to subtract.
	 * @return the difference between these two numbers, expressed in the Unit of this number.
	 * @throws UnitException if the units are in different dimensions.
	 */
	
	public Number subtract(Number otherNumber) throws UnitException {
		if(otherNumber.getUnit().getUnitType() == this.unit.getUnitType()) {
			return new Number(this.getSIValue() - otherNumber.getSIValue(), this.getUnit(), true) ;
		} else {
			throw new UnitException(this.unit, otherNumber.getUnit()) ;
		}
	}

	/**
	 * @return the reciprocal of this number.
	 */
	public Number invert() {
		return new Number(1.0 / this.getSIValue(), this.getUnit().invert(), true) ;
	}


	/**
	 * @return a string that can be decoded by Number.ValueOf()
	 */
	public String encode() {
		String encodedUnit = this.getUnit().encode() ;
		String value = new Double(this.getValue()).toString() ;
		return value + SEPARATOR + encodedUnit ;
	}
	
	
	public boolean equals(Object otherObject) {
		if(otherObject instanceof Number) {
			Number otherNumber = (Number) otherObject ;
			if(this.getSIValue() == otherNumber.getSIValue() && this.getUnit().getUnitType() == otherNumber.getUnit().getUnitType()) {
				return true ;
			} else {
				return false ;
			}
		} else {
			return false ;
		}
	}
	
	
	/**
	 * @param encoded the String generated by Number.encode()
	 * @return the Number object encoded in the String.
	 */
	public static Number valueOf(String encoded) {
		String[] parts = encoded.split(SEPARATOR) ;
		if(parts.length >= 2) {
			try {
				double value = new Double(parts[0]) ;
				Unit unit = Unit.valueOf(parts[1]) ;
				if(unit != null) {
					return new Number(value, unit) ;
				} else {
					return new Number(value) ;
				}
			} catch(NumberFormatException e) {
				return null ;
			}
		} else {
			return null ;
		}
	}

}
