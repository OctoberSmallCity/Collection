package one;

import java.util.Scanner;

public class Main {
	
	public static void sort(int []nums,int left,int right) {
		if(left >=right || nums.length <=0) {
			return;
		}
		int i = left;
		int j = right;
		int key = nums[left];
		
		while (true) {
			while (j > i) {
				if (nums[j] < key) { 
					int temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
					break;
				} else {
					j--;
				}
			}
			
			while (j > i) {
				if (nums[i] > key) { 
					int temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
					break;
				} else {
					i++;
				}
			}
 
			if (i == j) {
				break;
			}
		}

		sort(nums, left, i - 1);
		
		sort(nums, i + 1, right);

        
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []nums = new int[n];
		for(int i = 0;i < n;i++) {
			nums[i] = sc.nextInt();
		}
		sort(nums,0,n-1);
		
		for(int k = 0; k < n;k++) {
        	System.out.print(nums[k]);
        	System.out.print(" ");
        }

	}

}
