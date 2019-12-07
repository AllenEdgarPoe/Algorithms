import java.util.Arrays;
import java.util.Scanner;
 
 
public class MergeSorting {
    static int[] sorted = new int[8];
    public static void merge(int a[], int m, int middle, int n) {
        int i = m;             // 첫 번째 부분집합의 시작 위치 설정
        int j = middle+1;     // 두 번째 부분집합의 시작 위치 설정
        int k = m;             // 배열 sorted에 정렬된 원소를 저장할 위치 설정
        
        while(i<=middle && j<=n) {
            if(a[i]<=a[j]) {
                sorted[k] = a[i];
                i++;
            }else {
                sorted[k] = a[j];
                j++;
            }
            k++;
        }
        if(i>middle) {
            for(int t=j;t<=n;t++,k++) {
                sorted[k] = a[t];
            }
        }else {
            for(int t=i;t<=middle;t++,k++) {
                sorted[k] = a[t];
            }
        }
        
        for(int t=m;t<=n;t++) {
            a[t] = sorted[t];
        }
        System.out.println("병합 정렬 후: "+Arrays.toString(a));
    }
        
    
    public static void mergeSort(int a[], int m, int n) {
    	System.out.println(m+" "+n);
        int middle;
        if(m<n) {
            middle = (m+n)/2;
            mergeSort(a, m, middle);    // 앞 부분에 대한 분할 작업 수행
            System.out.println("1st: "+Arrays.toString(a));
            System.out.println(m+" "+n+" "+middle);
            mergeSort(a, middle+1, n);    // 뒷 부분에 대한 분할 작업 수행
            System.out.println("2nd: "+Arrays.toString(a));
            System.out.println(m+" "+n+" "+middle);
            merge(a, m, middle, n);        // 부분집합에 대하여 정렬과 병합 작업 수행
            System.out.println("3rd: "+Arrays.toString(a));
            System.out.println(m+" "+n+" "+middle);
        }
    }
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
        int size = data.length;
        System.out.println("정렬 수행 전: "+Arrays.toString(data));
        System.out.println("-----------------병합 정렬 수행 시작------------------");
        mergeSort(data, 0, size-1);
    }
 
}

