package Sort;

import java.util.Scanner;
//冒泡排序 时间复杂度O(n^2) 空间复杂度O(1) 稳定排序 原地排序
public class BubbleSort {
	
	public static void sort(int []arr) {
		int len = arr.length;
		for(int i = 0;i < len -1 ;i++) {
			for(int j = 0;j < len - i -1;j++) { //每次找到排序中的最大元素
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
