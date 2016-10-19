package ca.fwe.units;

public class Constant extends Number {

	private static final String SEPARATOR = "|" ;

	private String name ;
	private int cat ;

	public Constant(String name, int cat, Number value) {
		super(value.getSIValue(), value.getUnit(), true) ;
		this.name = name ;
		this.cat = cat ;
	}

	public Constant(String constantName, int category, double value, Unit valueUnit) {
		super(value, valueUnit);
		name = constantName ;
		cat = category ;
	}

	public Constant(String constantName, int category, double value) {
		super(value);
		name = constantName ;
		cat = category ;
	}

	public String getName() {
		return name ;
	}

	public int getCategory() {
		return cat ;
	}

	public String toString() {
		return this.getName() + " " + super.toString() + " " + this.getUnit().toString(false) ;
	}

	public String encodeConstant() {
		return this.getName() + SEPARATOR + this.getCategory() + SEPARATOR + this.encode() ;
	}
	
	public static Constant constantFrom(String encoded) {
		if(encoded != null) {
			String[] split = encoded.split("\\" + SEPARATOR) ;
			if(split.length == 3) {
				String name = split[0] ;
				int cat = 0 ;
				try {
					cat = Integer.valueOf(split[1]) ;
				} catch(NumberFormatException e) {
					//do nothing, default cat
				}
				Number n = Number.valueOf(split[2]) ;
				if(n != null) {
					return new Constant(name, cat, n) ;
				} else {
					return null ;
				}
			} else {
				return null ;
			}
		} else {
			return null ;
		}
	}

}
