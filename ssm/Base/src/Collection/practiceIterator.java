package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class practiceIterator {
	
	public static void display(Iterator<Integer> p) {
		while(p.hasNext()) {
			System.out.print(p.next());
		}
		for(int i = 0;i < 3;i++) {
			p.next();
			p.remove();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList();
		HashSet<Integer> hashSet = new HashSet();
		LinkedList<Integer> link = new LinkedList();
		TreeSet<Integer> tree = new TreeSet();
		display(list.iterator());
		display(hashSet.iterator());
		display(link.iterator());
		display(tree.iterator());
		}

}
