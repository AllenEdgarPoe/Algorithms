import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


//범위 내 소수 찾기
public class FindingPrimeNumber {
	
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("이 프로그램은 입력한 수보다 작은 소수를 찾는 프로그램입니다.");
		System.out.println("소수를 입력하시오: ");
		int num = scn.nextInt();
		
		long startTime = System.currentTimeMillis();
		ArrayList<Boolean> prime_list = new ArrayList<Boolean>(num+1);
		for (int i=0;i<=num;i++) prime_list.add(true);
		//prime_list안에 0과 1은 false입력 
		prime_list.set(0, false);
		prime_list.set(1, false);
		
		if(num==1) System.out.println("이 수보다 적은 소수가 없습니다.");
		
		for(int i=2;i*i<=num;i++) {
			if(prime_list.get(i)==true) {
				for(int j=2*i;j<=num;j+=i) {
					prime_list.set(j, false);
				}
			}
			
		}
	
		int count = 0;
		for(int i=0;i<=num;i++) {
			if(prime_list.get(i)==true) {
				count+=1;
//				System.out.println(i);
			}
		}
		
		System.out.println("소수의 갯수는 "+count+"개 입니다.");
		
		long endTime = System.currentTimeMillis();
		double time = (endTime-startTime)/1000;
		System.out.println("걸린 시간: "+String.format("%.3f", time)+"s.");
		
	}
	

}
