package Link;

import java.util.Scanner;

import Link.Node;

public class LinkList {
	
	Node head = null;
	
	public  void set(int data) {    //构造链表
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
	public void list() {  //打印链表
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data);
			temp = temp.next;
		}
	}
	
	public void add(int data,int position) {  //根据位置添加节点
		int index = 0;
		Node target = new Node(data);
		 if(head == null && position == 0) {
			 head = target;
			 return;
		 }
		 if(position == 0) {
			 target.next = head;
			 head = target;
			 return;
		 }
		 Node temp = head;
		 while(temp.next != null){
			 index++;
			 if(position == index) {
				 target.next = temp.next;
				 temp.next = target;
			 }
			 temp = temp.next;
		 }
		 
	}
	
	public void delete(int position) { //删除节点
		if(head == null) {
			System.out.println("链表为空！");
			return;
		}
		if(position == 0) {
			head = head.next;
			return;
		}
		Node temp = head;
		int index = 0;
		while(temp.next != null) {
			index ++;
			if(position == index) {
				Node target = temp.next;
				temp.next = target.next;
				break;
			}
			temp = temp.next;
			
		}
	}
	
	public void reverse() {   //反转链表
		if (head == null) {
			return ;
		}
		Node pre = null;
		Node temp = head;
		while(temp!= null) {
			Node next = temp.next;
			temp.next = pre;
			pre = temp;
			temp = next;
		}
		while(pre != null) {
			System.out.println(pre.data);
			pre = pre.next;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int position = sc.nextInt();
		LinkList list = new LinkList();
		for(int i = 0; i < n;i++) {
			list.set(sc.nextInt());
		}
		list.add(4, position);
		list.list();
		list.reverse();

	}

}
