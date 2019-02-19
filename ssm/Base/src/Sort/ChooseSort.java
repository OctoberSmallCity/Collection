package Sort;

import java.util.Scanner;
//选择排序 时间复杂度O(n^2) 空间复杂度O(1) 非稳定排序  原地排序
public class ChooseSort {
	
	public static void sort(int []arr) {
		int len = arr.length;
		for(int i = 0;i < len;i++) {   //依次选择需要排序的元素
			for(int j = i+1;j < len;j++) { //与其后的元素进行比较
				if(arr[i] > arr[j]) {  //交换位置(每次都选择比较中最小的元素)
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
