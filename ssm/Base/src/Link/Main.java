package Link;

import java.util.Scanner;

public class Main {
	Node head = null;
	class Node{
		int data;
		Node next = null;
		public Node(int data) {
			this.data = data;
		}
	}
	
	/*public void ListNode(int[] data) {
		for(int i = 0;i < data.length;i++) {
			if(i == 0) {
				Node head = new Node(data[0]);
			}
			Node node = new Node(data[i]);
			node.next = node;
		}	
	}*/
	
	public void add(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			return;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
		}
	public void list() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Main m = new Main();
		int n = sc.nextInt();
		for(int i = 0;i < n;i++) {
		m.add(sc.nextInt());
		}
		m.list();
		

	}

}
