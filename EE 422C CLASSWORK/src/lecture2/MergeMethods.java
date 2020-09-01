package lecture2;

public class MergeMethods {
	
	public static int [] merge(int [] a, int [] b) {
		int al = a.length; //instance method not a static method, then I will call it object(dot) 
							//if it where a method it would be a.length() with the parentheses
							//it is a field 
		//a.length = 10;
		//a.length = 11; //error in both of these lines, because you cannot resize an array 
							//because length is defined as final in the Arrays class
		
		int bl = b.length;
		int merged [] = new int [al + bl];
		
		for(int i = 0; i < al; i++) 
			merged[i] = a[i];
		for(int i = al; i < al+bl; i++)
			merged[i] = b[i-al];
		
		
		return merged;
	}
	
	
	public static int [] merge3(int [] a, int [] b, int [] c) {
		return merge(a, merge(b, c));
	}

}
