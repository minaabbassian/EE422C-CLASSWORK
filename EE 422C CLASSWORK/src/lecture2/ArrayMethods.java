package lecture2;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		int [] a1 = {2, 1, 3, 4};
		int [] a2 = {2, 1, 3,  4};
		
		System.out.println(a1); //get garbage, refers to the address of the array 
		System.out.println(a2);
		int [] a3 = a2;
	
		System.out.println((a2 == a1) + " " + (a2 == a3));
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.equals(a1, a2));
		Arrays.sort(a1);
		System.out.println(Arrays.equals(a1, a2));
		System.out.println(Arrays.toString(MergeMethods.merge(a1, a2)));
		System.out.println(Arrays.toString(MergeMethods.merge3(a1, a2, a3)));
		
	}
}
