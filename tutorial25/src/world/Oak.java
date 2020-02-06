package world;

public class Oak extends Plant {

	public Oak() {
		//won't work
		//type = "tree";
		
		
		//this works because size is protected and Oak is a subclass of plant
		this.size="small";
		
	}
	
}
