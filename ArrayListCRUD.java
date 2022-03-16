import java.util.*;
public class ArrayListCRUD {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {   
            System.out.println(list.get(i) + " ");
        }
		
		list.set(0, "Four");
		list.set(1, "Five");
		list.set(2, "Six");
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
		
	}

}
