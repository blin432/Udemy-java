package world;

public class Plant {

	
	
	//bad practice
	public String name;
	
	//making id constant (acceptable practice)
	public final static int ID = 8;
	
	private String type;
	
	
	//can be accessed with subclass and same packages
	protected String size;
	
	
	//not modifier (package level access)
	int height;
	
	
	//private -- only within same class
	//public -- from anywhere
	//protected -- same class, subclass, and same package
	//no modifier -- same package only
	
	public Plant() {
		this.name = "freddy";
		
		this.size = "large";
		
		this.type = "plant";
		this.height= 11;
	}
	
}
