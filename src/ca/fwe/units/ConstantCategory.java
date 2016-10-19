package ca.fwe.units;

public class ConstantCategory {
	private String name ;
	private int categoryId ;
	
	public ConstantCategory(String name, int categoryId) {
		super();
		this.name = name;
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public int getCategoryId() {
		return categoryId;
	}
	
	public String toString() {
		return getName() ;
	}
}
