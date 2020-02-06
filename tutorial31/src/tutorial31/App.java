package tutorial31;
//Generics and Wildcards
import java.util.ArrayList;

class Machine{
	
	public void start() {
		System.out.println("machine running");
	}
	
	
}


class Camera extends Machine {
	public String toString() {
		return "i am a camera";
	}
}


public class App {

	public static void main(String[] args) {
		
		Machine mach1 = new Machine();
		Camera camera1 = new Camera();
		
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("one");
		list.add("two");
		
		
		ArrayList<Camera> list2 = new ArrayList<Camera>();
		
		list2.add(new Camera());
		list2.add(new Camera());
		
		
		showList(list2);

	}
	
public static void showList(ArrayList<?>list2) {
		
		for (Object value:list2) {
			System.out.println(value);
		}
		
	

	}
	
	

}
