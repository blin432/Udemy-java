package tutorial14;




class Person{
	String name;
	int age;
	void speak() {
		System.out.println(age);
	}
}



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		Person person1 = new Person();
		person1.name= "joe";
		person1.age = 2;
		person1.speak();
		//
		Person person2 = new Person();
		person2.name= "alice";
		person2.age = 3;
		System.out.println(person1.name);
	}

}
