import java.util.*;
public class LinkedListCRUD {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("One");
		list.add("Two");
		list.add(0, "Zero");
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {   
            System.out.println(list.get(i) + " ");
        }
		
		list.set(0, "Three");
		list.set(1, "Four");
		list.set(2, "Five");
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		list.remove("Three");
		System.out.println(list);
	}

}
