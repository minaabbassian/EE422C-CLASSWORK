package lecture18;

import java.util.Arrays;

public class PriorityQueue_template<E extends Comparable<E>> {
	private int size;
	E[] container;

	public PriorityQueue_template () {
		// TODO
		size = 0;
		container = getArray(2);
		
	}

	public boolean isEmpty () {
		// TODO
		return size == 0;
	}

	@SuppressWarnings("unchecked")
	//tells the compiler that the programmer believes the code to be safe
	//	and won't cause unexpected exceptions
	private E[] getArray(int conSize) {
		// TODO
		return (E[]) (new Comparable[conSize]);
	}

	public void enqueue(E val) {
		//Increase container's size if required
		//Add value to end of the array. Note that first value is at index 1, not 0.
		//Swap value with parent, if value is smaller.
		//Repeat until index is 1.
		
		if(size >= container.length - 1)
			enlargeArray(container.length*2 + 1);
		size++;
		
		int indexToPlace = size;
		while(indexToPlace > 1 && val.compareTo(container[indexToPlace / 2]) < 0) {
			container[indexToPlace] = container[indexToPlace / 2]; //swap
			indexToPlace /= 2; //change indexToPlace to parent's index
		}
		container[indexToPlace] = val;
	}
	    
	private void enlargeArray(int newSize) {
		// TODO
		E[] temp = getArray(newSize);
		System.arraycopy(container, 1, temp, 1, size);
		container = temp;

	}


	public E dequeue( ) {
		//Move last value of array to top (index 1 of array). Reduce size parameter by 1.
		//Current = 1
		//Swap Current with smaller of two children, as long as children are smaller.
		//Keep going until children are both smaller than value.
		//Return root value.
		
		E top = container[1]; //root
		int hole = 1;
		boolean done = false;
		while(hole*2 < size && !done) {
			int child = hole*2; //left child
			//see which child is smaller
			if(child + 1 <= size) { //if there is a right child
				if(container[child].compareTo(container[child + 1]) > 0)
					child++; //child now points to smaller
			}
			
			//is replacement value bigger than child?
			if(container[size].compareTo(container[child]) > 0) {
				container[hole] = container[child];
				hole = child;
			}
			else 
				done = true;
		}
		container[hole] = container[size];
		size--;
		return top;
		
	}


}
