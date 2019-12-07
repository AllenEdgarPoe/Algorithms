import java.util.Scanner;

public class InsertionSorting {

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
		
		for(int i=1;i<num;i++) {
			for(int j=i;j>0;j--) {
				if(data[j]<data[j-1]) {
					int tmp = data[j];
					data[j] = data[j-1];
					data[j-1]=tmp;
				}
			}
		}
		
		for(int i=0;i<num;i++) {
			System.out.println(data[i]);
		}

	}

}
