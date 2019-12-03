import java.util.Scanner;

/*
 * 배열을 한 칸씩 오른쪽으로 이동시키고 마지막 수는 맨 앞으로 보내라
 */
public class Code09 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Type the size of array: ");
		int size = scn.nextInt();
		
		int[] array = new int[size];
		System.out.println("Type numbers in array");
		
		for(int i=0;i<array.length;i++) {
			array[i] = scn.nextInt();
		}
		scn.close();
		
		System.out.println("Done");
		
		int tmp = array[size-1];
		for (int i=size-2; i>=0;i--) {
			array[i+1] = array[i];
		}
		array[0] = tmp;
		
		for(int i=0;i<size;i++) {
			System.out.println(array[i]);
		}
		

	}

}
