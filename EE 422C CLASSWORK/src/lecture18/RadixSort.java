package lecture18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RadixSort {

	public static void main(String[] args) {

		int [] a = {100, 23, 49, 876, 9987, 21, 1, 9, 0, 7, 97, 21};
		sort(a);
		System.out.println(Arrays.toString(a));
		int [] b = {9, 8, 7, 6, 4, 5, 3, 1, 2, 0, 9};
		sort(b);
		System.out.println(Arrays.toString(b));
	}
	
	public static void sort(int[] list){
        ArrayList<Queue<Integer>> queues = new ArrayList<Queue<Integer>>();             
        for(int i = 0; i < 10; i++)
            queues.add( new LinkedList<Integer>() );
        int passes = numDigits(list[0]); 
        for(int i = 1; i < list.length; i++) {
            int temp = numDigits(list[i]);  
            if( temp > passes )
                passes = temp;
        }           
        for(int i = 0; i < passes; i++){
            for(int j = 0; j < list.length; j++)
                queues.get(valueOfDigit(list[j], i)).add(list[j]);
                    
            int pos = 0;
            for(Queue<Integer> q : queues){
                while(!q.isEmpty())
                    list[pos++] = q.remove();
            }           
        }       
    }
	
	private static int valueOfDigit(int i, int i2) {
		int value = 0;
		while (i2 >= 0) {
			value = i%10;
			i /= 10;
			i2--;
		}
		return value;
	}
	
	private static int numDigits(int i) {
		return (int)Math.log10(i) + 1;
	}       
}
