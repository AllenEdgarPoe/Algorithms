import java.util.Arrays;
import java.util.Scanner;

/* 
 pivot; QuickSort 
 */
public class QuickSort {

	public static int partition(int[] array, int p, int r) {
		int i = p-1;
		int pivot = array[r];
		for (int j=p;j<=r;j++) {
			if(array[j]<pivot) {
				i++;
				int tmp = array[j];
				array[j] = array[i];
				array[i] = tmp;
			}
		}
		array[r] = array[i+1];
		array[i+1] = pivot;
		
		System.out.println("정렬 후: "+Arrays.toString(array));
		return i+1;
	}
	
	public static void quickSort(int[] array, int p, int r) {
		if(p<r) {
			int pivot = partition(array, p, r);
			quickSort(array,p,pivot-1);
			quickSort(array,pivot+1,r);
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
        quickSort(data, 0, size-1);
	}

}
