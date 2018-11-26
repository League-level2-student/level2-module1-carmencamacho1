package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> strings = new ArrayList<String>();
		//2. Add five Strings to your list
		strings.add("Emmanuel");
		strings.add("Kayla");
		strings.add("Emmery");
		strings.add("Suad");
		strings.add("Katelyn");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < strings.size(); i++) {
			String x = strings.get(i);
			System.out.println(x);
		}
		System.out.println("\n");
		//4. Print all the Strings using a for-each loop
		for(String y: strings) {
			System.out.println(y);
			
		}
		System.out.println("\n");
		//5. Print only the even numbered elements in the list.
		for(int f = 0; f < strings.size();f++) {
			if(f%2 == 0) {
				String a = strings.get(f);
				System.out.println(a);
			}
		}
		System.out.println("\n");
		//6. Print all the Strings in reverse order.
		for(int c = strings.size()-1; c >= 0; c-- ) {
			String b = strings.get(c);
			System.out.println(b);
		}
		System.out.println("\n");
		//7. Print only the Strings that have the letter 'e' in them.
		for(int d = 0; d < strings.size(); d++) {
			String e = strings.get(d);
			if(e.contains("e")){
				System.out.println(e);
			}
		}
	}
}
