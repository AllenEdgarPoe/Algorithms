import java.util.Scanner;

public class SelectionSorting {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Put the number of integer: ");
		int num = scn.nextInt();
		int[] data = new int[num];
		for(int i=0;i<num;i++) {
			System.out.println("{"+i+"}th integer: ");
			data[i] = scn.nextInt();
		}
		scn.close();
		
		for(int i=0;i<num;i++) {
			for(int j=i+1;j<num;j++) {
				if(data[i]>data[j]) {
					int tmp = data[j];
					data[j] = data[i];
					data[i] = tmp;
				}
			}
		}
		
		for(int i=0;i<num;i++) {
			System.out.println(data[i]);
		}

	}

}
