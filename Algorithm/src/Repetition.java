//같은 쌍을 같는 모든 조합 찾기. 예를 들어 1, 1, 2, 3, 1 이면 (1,1), (1,1), (1,1) 로 같은 쌍 갖는 element가 3개

import java.util.Scanner;

public class Repetition {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Put in the size: ");
		int size = scn.nextInt();
		
		int[] arr = new int[size];
		
		for (int i=0;i<size;i++) {
			arr[i] = scn.nextInt();
		}
		scn.close();
		
		int rep_num = 0;
		for (int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i] == arr[j]) rep_num+=1;
			}
		}
		System.out.println(rep_num);

	}

}
