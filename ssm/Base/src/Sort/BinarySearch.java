package Sort;

import java.util.Scanner;
//二分查找
public class BinarySearch {
	
	public static void sort(int []arr) {
		int len = arr.length;
		for(int i = 0;i < len;i++) {
			int left = 0;
			int right = i-1;
			int mid = 0;
			int temp = arr[i];
			while(right >= left) {
				mid = (left + right)/2;
				if(arr[mid] > temp) {  //要排序元素在已经排过序的左边
					right = right - 1;
				}else {
					left = mid + 1;
				}
			}
			for(int j = i -1;j > right;j--) {  //找到插入位置
				arr[j+1] = arr[j];
			}
			arr[right+1] = temp;
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
