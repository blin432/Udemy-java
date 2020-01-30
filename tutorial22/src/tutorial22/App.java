package tutorial22;

public class App {

	public static void main(String[] args) {
		Machine mach = new Machine();
		
		mach.start();
		mach.stop();
		
		Car car1 = new Car();
		
		car1.start();
		car1.stop();
		car1.wipeWind();
	}

}
