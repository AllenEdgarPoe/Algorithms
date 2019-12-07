/*
 * 배열 안에 숫자를 str로 전환해 붙였을때 가장 큰 소수가 되게 하는 것. 예를 들어 [1,2,3] 일때 123 or 23 or 12 중 가장 큰 소수는?
 */
import java.util.Scanner;

public class AddingInteger2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("배열 사이즈 입력하시오: ");
		int num = scn.nextInt();
		int[] data = new int[num];
		for(int i=0;i<num;i++) {
			System.out.println("{"+i+"}번째 수: ");
			data[i] = scn.nextInt();
		}
		scn.close();
		
		int val = 0;
		int max = 0;
		for(int i=0;i<num;i++) {
			for(int j=i+1;j<num;j++) {
				val = val*10+data[j];
				
				//소수인지 판별
				boolean isPrime = true;
				for(int k=2;k*k<=val && isPrime;k++) {
					if(val%k ==0) isPrime = false;
				}
				
				if (isPrime && val > max) max=val;
			}
		}
		
		if (max>0) System.out.println("최댓값은: "+max);
		else System.out.println("소수 없음");

	}

}
