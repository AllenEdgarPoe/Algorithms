
public class Code05 {
	public static void main(String[] args) {
		//in C, int grades[5];
		int [] grades; //정수형 배열 변수
		grades = new int[5]; //자바에선 변수 이름을 먼저 만들고 그 다음 크기를 지정
		
		char [] word;
		word = new char[20];
		
		double [] array = new double[10]; //이렇게 두 개를 같이 하는 방법도 있다.
		
		
		for (int i = 0;i<grades.length;i++) {
			grades[i] = i+1;
			System.out.println(grades[i]);
		}
		
		
	}
}
