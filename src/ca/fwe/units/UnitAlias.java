package ca.fwe.units;

/**
 * Stores name and short form of a Unit.
 * 
 * @author Dewey Dunnington
 *
 */
public class UnitAlias {

	private String name ;
	private String shortName ;
	
	public UnitAlias() {}
	
	public UnitAlias(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String getShortName() {
		return shortName ;
	}
	public String getHtml() {
		return null ;
	}

	public String toString() {
		return this.getHtml() ;
	}

	protected void setName(String name) {
		this.name = name;
	}
	
	public void setShort(String shortNm) {
		this.shortName = shortNm ;
	}

	
	
}
