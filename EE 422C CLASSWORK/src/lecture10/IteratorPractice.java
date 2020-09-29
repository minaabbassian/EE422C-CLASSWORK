package lecture10;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorPractice {
	public static ArrayList<String> myList = new ArrayList<String>();

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Jan");
		names.add("Levi");
		names.add("Thomas");
		names.add("Jose");
		names.add("Tom");
		
		Iterator<String> it = names.iterator();
		int i = 0;
		
		while(it.hasNext()) {
			i++;
			//System.out.println(i);
			System.out.println(it.next());
		}
		
		myList.add("dog");
		myList.add("catan");
		myList.add("hat");
		myList.add("satan");
		
		
		removeWordsOfLength(3);
		System.out.println(myList);
		
		printAllOfLength(names, 3);
	}
	
	
	//remove words of length len from the list
	public static void removeWordsOfLength(int len) {
		Iterator<String> it = myList.iterator();
		while(it.hasNext()) {
			String temp = it.next();
			if(temp.length() == len)
				it.remove();
		}
	}
	
	public static void printAllOfLength(ArrayList<String> names, int len) {
		//pre: names != null, names only contain Strings
		//post: print out all elements of names equal in length to len
		for(String s : names) {
			if(s.length() == len)
				System.out.println(s);
		}
	}
}
