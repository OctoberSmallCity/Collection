package Sort;

import java.util.Scanner;
//ð������ ʱ�临�Ӷ�O(n^2) �ռ临�Ӷ�O(1) �ȶ����� ԭ������
public class BubbleSort {
	
	public static void sort(int []arr) {
		int len = arr.length;
		for(int i = 0;i < len -1 ;i++) {
			for(int j = 0;j < len - i -1;j++) { //ÿ���ҵ������е����Ԫ��
				if(arr[j] > arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
		}
		
	}

	public static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []arr = new int[5];
		for(int i = 0;i < 5;i++) {
			arr[i] = sc.nextInt();
		}
		sort(arr);
		for(int i = 0;i < arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
