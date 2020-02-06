package tutorial30;
//using generics classes

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		
		
		////////// before java5 ////
		ArrayList list = new ArrayList();
		
		list.add("apple");
		list.add("pear");
		list.add("mango");
		
		String fruit = (String)list.get(1);
		
		System.out.println(fruit);
		
		/////////Modern style////
		
		ArrayList<String> strings = new ArrayList<String>();
		
		strings.add("cat");
		strings.add("dog");
		strings.add("rat");
		
		String animal = strings.get(1);
		
		System.out.println(animal);
		
		
		
	}

}
