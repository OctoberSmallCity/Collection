package Sort;

import java.util.Scanner;
//选择排序 时间复杂度O(n^2)
public class ChooseSort {
	
	public static void sort(int []arr) {
		int len = arr.length;
		for(int i = 0;i < len;i++) {
			for(int j = i+1;j < len;j++) {
				if(arr[i] > arr[j]) {
				swap(arr,i,j);	
				}
			}
		}
	}
	
	public static void swap(int []arr,int i ,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int []arr = new int[5];
		for(int i = 0;i < 5;i++) {
			arr[i] = sc.nextInt();
		}
		sort(arr);
		for(int j = 0;j < 5;j++) {
			System.out.println(arr[j]);
		}

	}

}
