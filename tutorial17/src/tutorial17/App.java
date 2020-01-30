package tutorial17;

class Frog{
	private String name;
	private int age;
	
	public void setName(String newname) {
		this.name =newname;
	}
	
	public void setAge(int newAge) {
		this.age = newAge;
	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
public class App {

	public static void main(String[] args) {
		
		Frog frog1 = new Frog();
//		frog1.name = "john";
//		frog1.age = 12;
		
		frog1.setName("bertie");
		frog1.setAge(12);
	}

}
