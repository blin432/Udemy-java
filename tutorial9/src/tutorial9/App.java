package tutorial9;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter a command");
		String text = input.nextLine();
		
		switch (text) {
		case "start":
			System.out.println("machine started");
			break;
		case "stop":
			System.out.println("machine stopped");
			break;
		default:
			System.out.println("command not recognized");
		}
		
	}

}
