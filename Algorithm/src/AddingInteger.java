/*
 *  리스트 안에 연속된 수를 더했을때 언제 max가 되는지 알고리즘
 */
import java.util.Scanner;

public class AddingInteger {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("배열의 사이즈를 입력하시오: ");
		int num = scn.nextInt();
		int[] data = new int[num];
		for (int i=0;i<num;i++) {
			System.out.println("{"+i+"}번째 수: ");
			data[i] = scn.nextInt();		
		}
		scn.close();
		
		int max = data[0];
		for(int i=0;i<num;i++) {
			int sum=0;
			for(int j=i;j<num;j++) {
				int tmp = sum+data[j];
				if (tmp<sum) break;
				sum = tmp;
				if(sum>max) max = sum;
				System.out.println("tmp: "+tmp+", max: "+max);
			}
		}
		System.out.println("가장 큰 연속된 합은: "+max);

	}

}
