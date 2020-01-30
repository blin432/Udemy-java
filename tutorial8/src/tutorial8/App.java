package tutorial8;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		/*
		System.out.println("enter a number");
		int value= scanner.nextInt();
		while(value !=5 ) {
			System.out.println("enter a number");
			value=scanner.nextInt();
		}
		System.out.print("got 5");
		*/
		
		int value = 0;
		do {
			System.out.println("enter a number");
			value= scanner.nextInt();
		}
		while(value != 5);
		System.out.print("got 5");
		
	}

}
