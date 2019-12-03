import java.util.Scanner;

public class Code01 {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		long startTime = System.currentTimeMillis();
		int count = 0;
		for (int i=0;i<num;i++) {
			if(i%2==0) count+=1;
		}

		System.out.println(count);
		long endTime = System.currentTimeMillis();
		double time = (endTime-startTime);
		System.out.println("Total Time: "+ String.format("%.3f", time));
	}
	
	

}
