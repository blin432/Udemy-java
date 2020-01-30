package tutorial18;



class Machine{
	
	private String name;
	
	public Machine() {
		this("something");
		System.out.println("running");
		name = "arnie";
	}
	
	public Machine(String name) {
		System.out.println("second running");
		this.name=name;
	}
	
	
}
public class App {

	public static void main(String[] args) {
		
		Machine machine1= new Machine();
		Machine machine2 = new Machine("bernie");
	}

}