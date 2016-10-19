package ca.fwe.units;

/**
 * Stores name and type information about a given combination of dimensions.
 * 
 * @author Dewey Dunnington
 *
 */
public class UnitCategory {

	private String name ;
	private double unitType ;
	
	public UnitCategory(String typeName, double typeValue) {
		this.name = typeName ;
		this.unitType = typeValue ;
	}
	
	public UnitCategory(String typeName, Unit unit) {
		this.name = typeName ;
		this.unitType = unit.getUnitType() ;
	}

	/**
	 * @return the category name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the unique double associated with the given combination of dimensions.
	 */
	public double getUnitType() {
		return unitType;
	}
	
	public String toString() {
		return this.getName() ;
	}
	
}
