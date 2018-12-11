package one1127;

import java.util.Scanner;

public class Main {
	
	public static void isture(int n,int[]arr) {
		int sum = 0;
		for(int i = 0;i < n;i++) {
			sum +=arr[i];
		}
		if(sum%2 !=0) {
			System.out.print("false");
		}else {
			System.out.print("true");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		isture(n,arr);

	}

}
