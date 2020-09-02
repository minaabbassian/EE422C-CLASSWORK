package classwork3_complexity;

import java.util.*;

public class DemoStopWatch 
{  /* here is a test driver program for the Stopwatch so that you can see
       how it is supposed to work  */
	public static final double NANOS_PER_SEC = 1000000000.0;

	public static void main(String[] args)
	{
		StopWatch s = new StopWatch();
		int i;
		long mytime;
		s.start( );
		int a[ ]=new int [1000000];
		for (i=0; i < 1000000; i++)
			a[i] = i;
		s.stop();
		mytime=s.getElapsedTime();
		System.out.println("Time elapsed in nanoseconds is: "+ mytime);
		System.out.println("Time elapsed in seconds is: "+ mytime/ NANOS_PER_SEC);
		
		initializeAndSort(SortType.ARRAYS_SORT, 10000);
		initializeAndSort(SortType.INSERTION_SORT, 10000);

		initializeAndSort(SortType.ARRAYS_SORT, 20000);
		initializeAndSort(SortType.INSERTION_SORT, 20000);
		
		initializeAndSort(SortType.ARRAYS_SORT, 40000);
		initializeAndSort(SortType.INSERTION_SORT, 40000);
		
		initializeAndSort(SortType.ARRAYS_SORT, 80000);
		initializeAndSort(SortType.INSERTION_SORT, 80000);

	}
	
	public static void insertionSort(int [] a) {
		for (int i = 0; i < a.length-1; i ++) {
			int j = i+1;
			int tmp = a[j];
			while ((j > 0) && (a[j-1] > tmp)) {
				a[j] = a[j-1];
				j--;
			}
			a[j] = tmp;
		}
	}
	
	public static void  initializeAndSort(SortType sort, int size) {
		StopWatch s = new StopWatch();
		int [] data = new int[size];
		Random rand = new Random(1);
		for (int k = 0; k < size; k++) {
			data[k] = rand.nextInt();
		}
		s.reset();
		s.start();
		if (sort == SortType.ARRAYS_SORT) 
			Arrays.sort(data); // uses mergesort or quicksort
		else
			insertionSort(data);
		s.stop();
		System.out.println("Time elapsed for " + sort + " is: " + 
				s.getElapsedTime()/ NANOS_PER_SEC + "s.");
		
	}
}

enum SortType {
	ARRAYS_SORT, INSERTION_SORT;
}
