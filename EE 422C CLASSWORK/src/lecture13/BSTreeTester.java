package lecture13;

import java.util.*;

public class BSTreeTester {

	public static void main(String[] args) {

		BSearchTree<Integer> intTree = new BSearchTree<Integer>();
		//BSearchTree<ArrayList<Integer>> ali = null;
		intTree.add(4);
		intTree.add(3);
		intTree.add(6);
		intTree.add(1);
		intTree.add(7);
		intTree.add(5);
		intTree.print();
		//System.out.println("-------remove 7 below -------------------");
		//intTree.remove(7);
		//intTree.print();
		//System.out.println("-------remove 3 below -------------------");
		//intTree.remove(3);
		// intTree.print();
		System.out.println("-----------------------------------------");
		
		BSearchTree<String> stringTree = new BSearchTree<String>();
		stringTree.add("hi");
		stringTree.add("i");
		stringTree.add("h");
		stringTree.add("ab");
		stringTree.add("zz");
		stringTree.add("cd");
		stringTree.print();
	}

}
