package Sort;

import java.util.Scanner;

//插入排序   时间复杂度O(n^2) 空间复杂度O(1) 稳定排序 原地排序
public class InsertSort {
	
	public static void sort(int []arr) {
		int len = arr.length;
		for(int i = 1;i < len;i++) {  //默认第一个元素已经排好序了,从第二个元素开始排序;
			insertRight(arr,i);
		}
	}
	
	public static void insertRight(int[] arr,int i) {
		int key = arr[i];    //将待排序的元素存入到临时变量中;
		int j = i - 1;
		for(;j >= 0 && arr[j] > key;j--) {
			arr[j+1] = arr[j];  //大于待排序元素的往后移一位;
		}
		arr[j+1] = key;  //找到待排序元素的位置
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
