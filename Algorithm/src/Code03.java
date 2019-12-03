import java.util.Scanner;

public class Code03 {
	public static void main(String[] args) {
		String str = "Hello World";
		String input = null; 
		
		System.out.print("Put any words: ");
		
		Scanner kb = new Scanner(System.in);
		input = kb.next(); //String 변수에 대하여
		
		System.out.println(str==input); //string은 프리미티브 변수가 아니기 때문에 ==로 비교할 수 없다.
		System.out.println(input);
		System.out.println(str.equals(input));
		
		kb.close();
	}
}
