package Sort;

import java.util.Scanner;
//Ð¡¸ù¶Ñ
public class HeapSort { 
	
	public static void sort(int []arr) {
		int length = arr.length-1;
		for(int i = length/2 - 1;i >= 0;i--) {
			headAdJust(arr,i,length);
		}
		while(length >= 0) {
			swap(arr,0,length--);
			headAdJust(arr,0,length);
		}
	}
	
	public static void headAdJust(int []arr,int i,int len) {
		int left,right;
		int j;
		left = 2*i+1;
		if(left <= len) {
		right = left + 1;
		j = left;
		if(j < len && arr[left] < arr[right]) {
			j++;
		}
		if(arr[i] < arr [j]) {
			swap(arr,i,j);
		}	
		i = j;
		}
	}
	public static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int []arr = new int[7];
		for(int i = 0;i < arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		sort(arr);
		for(int j = 0;j < arr.length;j++) {
			System.out.println(arr[j]);
		}

	}

}
