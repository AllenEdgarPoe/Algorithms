import java.util.Scanner;

public class Code02 {
	public static void main(String[] args) {
		int number = 123;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter: ");
		int input = keyboard.nextInt();
		
		System.out.println(number==input);
	}
}
