package two;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void find(int n,int m) {
		List list = new ArrayList();
		int num = 0;
		for(int j = 0;j < n;j++) {
		     num = 2*num; 
		}
		if(m == 0) {
		  for(int i = 0;i < n;i++) {
			  list.add(0);
		  }
		}else {
			
		
				if(m <= n) {
					list.add(0);
					int k = m;
				  if(list.size()!=n-1) {
					
					  m =m/2;
					 if( m !=0 ) {
						 list.add(1);
					 }else {
						 list.add(0);
						 m = k%2;
					 }
					  k = m;
					  
				  }else {
					 if(k==1) {
						 list.add(1);
					 }else {
						 list.add(0);
					 }
				  }
				
				
				}else {
					list.add(1);
					int l = num - m;
					int k = l;
					  if(list.size()!=n-1) {
						
						  l =l/2;
						 if( l !=0 ) {
							 list.add(1);
						 }else {
							 list.add(0);
							 l = k%2;
						 }
						  k = l;
						  
					  }else {
						 if(k==1) {
							 list.add(1);
						 }else {
							 list.add(0);
						 }
					  }
				}
			
		}
		for(int i = 0;i < n;i++) {
			System.out.print(list.get(i));
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
        find(n,m);
	}

}
