package tutorial15;



class Person{
	String name;
	int age;
	int speak() {
		int yearsLeft = 65-age;
		return yearsLeft;
	}
	int getAge() {
		return age;
	}
}



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		Person person1 = new Person();
		person1.name= "joe";
		person1.age = 2;
		int years = person1.speak();
		System.out.println(years);
		//
		Person person2 = new Person();
		person2.name= "alice";
		person2.age = 3;
		System.out.println(person1.name);
		int age = person1.getAge();
		System.out.println(age);
	}

}
