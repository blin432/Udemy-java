package tutorial7;
import java.util.Scanner;


public class Application {
	public static void main(String[] args) {
		//create scanner object
		Scanner input = new Scanner(System.in);
		//output the prompt
		System.out.println("enter a line of text");
		//wait for the user input
		String line = input.nextLine();
		//tell them what they entered
		System.out.println("you eneter:" +line);
	}
}
