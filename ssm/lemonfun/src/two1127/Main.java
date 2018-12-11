package two1127;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void max(int []arr) {
		int n = arr.length;
		int sum = 0;
		int count = 0;
		int buy = 0;
		int sale = 0;
		List list1 = new ArrayList();
		List list2 = new ArrayList();
		List list3 = new ArrayList();
		for(int i = 0;i < n-1;i++) {
			for(int j = 0;j < n;j++) {
			if(count < arr[j] -arr[i]) {
				count =arr[j] - arr[i];
				sale = j;
				buy = i;
			}
			list1.add(buy);
			list2.add(sale);
			list3.add(count);
		}
		}
		Collections.sort(list3);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int []arr = new int[1000];
		for(int i =0;i<1000;i++) {
			arr[i] = sc.nextInt();
		}
		max(arr);

	}

}
