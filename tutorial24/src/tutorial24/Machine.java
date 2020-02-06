package tutorial24;

public class Machine implements Info {

	private int id = 1;
	
	public void start() {
		System.out.println("machine started");
	}
	
	
	public void showInfo() {
		System.out.println("prson " +id);
	}
	
}
