package tutorial25;

import world.Plant;

public class Grass extends Plant {
	
	public Grass() {
		
		// won't work -- Grass not in same package as plant, even though it's a subclass
		//System.out.println(this.height);
	}
	

}
