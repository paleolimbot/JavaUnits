package ca.fwe.units;

public class UnitException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Unit firstUnit ;
	private Unit secondUnit ;
	
	public UnitException(Unit unit) {
		this.fillInStackTrace() ;
		firstUnit = unit ;
	}
	
	public UnitException(Unit unit1, Unit unit2) {
		this.fillInStackTrace() ;
		firstUnit = unit1 ;
		secondUnit = unit2 ;
	}

	public Unit getFirstUnit() {
		return firstUnit;
	}

	public Unit getSecondUnit() {
		return secondUnit;
	}

	@Override
	public String getMessage() {
		if(firstUnit != null && secondUnit != null)
			return "Unit " + firstUnit.toString() + " is not in the same dimension as " + secondUnit.toString() ;
		else if(firstUnit != null)
			return "Error procesessing operation with unit " + firstUnit.toString() ;
		else
			return super.getMessage() ;
	}
	
	
	
}
