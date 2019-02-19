package Sort;

import java.util.Scanner;

//插入排序   时间复杂度O(n^2) 稳定排序
public class InsertSort {
	
	public static void sort(int []arr) {
		int len = arr.length;
		for(int i = 0;i < len;i++) {
			int key = arr[i];
			int j = i-1;
		while(j >= 0 && arr[j] > key) { //新拿到的数与已经排好序的数做比较
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = key;
		
		}
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
